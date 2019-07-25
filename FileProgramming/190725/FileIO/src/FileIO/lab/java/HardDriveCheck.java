package FileIO.lab.java;
import java.io.File;

public class HardDriveCheck {
	public static void main(String arg[]){        
        String drive;
        double totalSpace, usedSpace, freeSpace, usableSpace;        
        File[] roots = File.listRoots();    // �ϵ��ũ�� ��Ʈ ����̹����� �迭�� ��ȯ�Ѵ�
        for(File root : roots){            
	drive = root.getAbsolutePath();     // ��Ʈ ����̹��� ���� ���       
	totalSpace = root.getTotalSpace() / Math.pow(1024, 3);   // �ϵ��ũ ��ü �뷮
	usableSpace = root.getUsableSpace() / Math.pow(1024,3);   // ��밡���� ��ũ �뷮
             freeSpace = root.getFreeSpace() / Math.pow(1024,3);  // ���� ��ũ �뷮            
            usedSpace = totalSpace - usableSpace;         // ����� ��ũ �뷮
            System.out.println("�ϵ� ��ũ ����̹� : " + drive);
            System.out.println("�� ��ũ �뷮 : " + totalSpace + "GB");
            System.out.println("��� ������ ��ũ �뷮 : " + usableSpace + "GB");
            System.out.println("���� ��ũ �뷮 : " + freeSpace + "GB");
            System.out.println("����� ��ũ �뷮 : " + usedSpace+"GB");
            System.out.println();            
        }
    } 

}
