package lab.board.model;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

public class BbsDAO {
	public Connection dbCon() {
		Connection con = null;
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream("C:/workspace2/BBS/WebContent/WEB-INF/db.properties"));
			Class.forName(prop.getProperty("driver"));
			con = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("user"),
					prop.getProperty("pwd"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public void dbClose(Connection con, Statement stat, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
			if (stat != null)
				stat.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getPageCount(int numPerPage) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select count(*) from bbs ";
		int max = 0;
		try {
			con = dbCon();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				
				max = rs.getInt(1);
				
			}System.out.println(max);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose(con, stmt, rs);
		}
		int pageCount = (int) Math.ceil(max / (double) numPerPage);
		pageCount = Math.max(pageCount, 1);
		return pageCount;

	}

	public int insertBbs(BbsVO form) {
		StringBuffer sql = null;
		int cnt = -1;
		Connection con = null;
		PreparedStatement stat = null;
		System.out.println(form);
		sql = new StringBuffer();
		sql.append("insert into bbs (bid, subject, writer,")
		.append(" password, idate, fileYN, contents, email, ip)")
		.append(" values ( bbs_seq.nextval, ?, ?, ?, sysdate, ")
		.append(" ?, ?, ?, ? )");

		try {
			con = dbCon();
			stat = con.prepareStatement(sql.toString());
			stat.setString(1, form.getSubject());
			stat.setString(2, form.getWriter());
			stat.setString(3, form.getPassword());
			stat.setString(4, form.getFileYN());
			stat.setString(5, form.getContents());
			stat.setString(6, form.getEmail());
			stat.setString(7, form.getIp());
			cnt = stat.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose(con, stat, null);
		}
		return cnt;

	}

	public ArrayList<BbsVO> getBbsList(int page, int numPerPage) {

		ArrayList<BbsVO> articles = new ArrayList<BbsVO>();
		Connection con = null;
		PreparedStatement stat = null;
		ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		int start = (page - 1) * numPerPage;
		int end = page * numPerPage;

//		sql.append("select num, bid, subject, writer, idate, rcount ");
//		sql.append(" from (select rownum num, bid, subject, writer, idate, rcount ");
//		sql.append(" from bbs) ");
//		sql.append(" where num > ? and num <= ?");
//		sql.append(" order by num desc " );
		
		sql.append("select num, bid, subject, writer, idate, rcount ");
		sql.append(" from (select rownum num, bid, subject, writer, idate, rcount ");
		sql.append(" from (select bid, subject, writer, idate, rcount");
		sql.append(" from bbs ");
		sql.append(" order by bid desc) ");
		sql.append(" order by num desc) ");
		sql.append(" where num > ? and num <= ?");


		try {
			con = dbCon();
			stat = con.prepareStatement(sql.toString());
			stat.setInt(1, start);
			stat.setInt(2, end);
			rs = stat.executeQuery();
			while (rs.next()) {
				BbsVO bbs = new BbsVO();
				bbs.setBid(rs.getInt("bid"));
				bbs.setSubject(rs.getString("subject"));
				bbs.setWriter(rs.getString("writer"));
				bbs.setRcount(rs.getInt("rcount"));
				bbs.setIdate(rs.getDate("idate"));
				articles.add(bbs);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose(con, stat, rs);
		}
		return articles;

	}
	
	public BbsVO getArticle (int bid) {

		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		StringBuffer sql = new StringBuffer();
		BbsVO bbs = new BbsVO();
				
		sql.append("select bid, subject, writer, password, idate, ")
		.append(" contents, email, ip, fileyn, rcount, vcount ")
		.append(" from bbs ")
		.append(" where bid = ?");

		try {
			con = dbCon();
			stmt = con.prepareStatement(sql.toString(),
			ResultSet.TYPE_FORWARD_ONLY,
			ResultSet.CONCUR_UPDATABLE);
			stmt.setInt(1, bid);
			rs = stmt.executeQuery();
			while(rs.next()) {
				bbs = new BbsVO();
				bbs.setBid(rs.getInt("bid"));
				bbs.setSubject(rs.getString("subject"));
				bbs.setWriter(rs.getString("writer"));
				bbs.setPassword(rs.getString("password"));
				bbs.setIdate(rs.getDate("idate"));
				
				bbs.setFileYN(rs.getString("fileyn"));
				bbs.setContents(rs.getString("contents"));
				bbs.setEmail(rs.getString("email"));
				bbs.setIp(rs.getString("ip"));
				
				int rcount = rs.getInt("rcount");
				rs.updateLong("rcount", rcount+1);
				rs.updateRow();
				bbs.setRcount(rcount+1);
				bbs.setVcount(rs.getInt("vcount"));					
			}// while end
			
			StringBuffer sql2 = new StringBuffer();
			sql2.append("select cmid,writer,idate,contents, ")
			.append("password, ip from bbs_comment ")
			.append(" where rbid = ?");
			stmt = con.prepareStatement(sql2.toString());
			stmt.setInt(1, bid);
			rs = stmt.executeQuery();
			while(rs.next()) {
				CommentVO ba = new CommentVO();
				ba.setCmid(rs.getInt("cmid"));
				ba.setRbid(bid);
				ba.setWriter(rs.getString("writer"));
				ba.setIdate(rs.getDate("idate"));
				ba.setContents(rs.getString("contents"));
				ba.setPassword(rs.getString("password"));
				ba.setIp(rs.getString("ip"));
				bbs.addComment(ba);
					
			}// while2 end
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(con,stmt,rs);
		}
		
		return bbs;
	}
	
	public int updateBbs(BbsVO bbs) {
		//�۹�ȣ �������� ����� ������ ���� , ������ 1���� 
		// �μ�Ʈ�� ���� ���
		
		String sql = null;
		int cnt = -1; 
		Connection con = null;
		PreparedStatement stat = null;
		sql = "update bbs set SUBJECT = ? , CONTENTS = ? where bid= ? ";	
		try {
			con = dbCon();
			stat = con.prepareStatement(sql);
			stat.setString(1, bbs.getSubject());
			stat.setString(2, bbs.getContents());
			stat.setInt(3, bbs.getBid());
			cnt = stat.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose(con, stat, null);
		}
		return cnt;

	}
	
	public int deleteBbs(int bid) {
		//�۹�ȣ �������� ����� ������ ���� , ������ 1���� 
		// �μ�Ʈ�� ���� ���
		
		String sql = null;
		String sql2 = null;
		int cnt = 0; 
		Connection con = null;
		PreparedStatement stat = null;
		sql = "delete from bbs where bid= ? ";		
		sql2 = "delete from BBS_COMMENT where rbid= ? ";
		try {
			con = dbCon();
			stat = con.prepareStatement(sql2);
			stat.setInt(1, bid);
			cnt += stat.executeUpdate();
			
			stat = con.prepareStatement(sql);
			stat.setInt(1, bid);
			cnt += stat.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose(con, stat, null);
		}
		return cnt;

	}
	
	public String getBbsPassword(int bid) {
		//�۹�ȣ PK�� �Խñ� �н����� ��ȸ ����
		
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		BbsVO bbs = null;
		String pwd = null;
		String sql = "select password from bbs where bid = ? "; 
		try {
			con = dbCon();
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, bid);
			rs = stmt.executeQuery();
			if(rs.next()) {
				pwd = rs.getString("password");
			}//if end
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			dbClose(con, stmt, null);
		}
		
		return pwd;
		
	}
	
	public int insertComment(CommentVO form) {
		StringBuffer sql = null;
		int cnt = -1;
		Connection con = null;
		PreparedStatement stat = null;
		sql = new StringBuffer();
		sql.append("insert into BBS_COMMENT (cmid, rbid, writer,")
		.append("idate, contents, password, IP)")
		.append(" values ( bbscmt_seq.nextval, ?, ?, sysdate, ")
		.append(" ?, ?, ? )");
		//request.getRemoteAddr
		try {
			con = dbCon();
			stat = con.prepareStatement(sql.toString());
			stat.setInt(1, form.getRbid());
			stat.setString(2, form.getWriter());
			stat.setString(3, form.getContents());
			stat.setString(4, form.getPassword());
			stat.setString(5, form.getIp());
			cnt = stat.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose(con, stat, null);
		}
		return cnt;

	}
	
	
}
