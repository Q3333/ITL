package lambda;


//���� �Ʒ����� �����ؼ� CMD���� ������Ѿ���.
import java.io.Console;

public class UsingConsoleReader {

	public static void main(String[] args) {
		  Console console = null;
		  String inputName = null;
		char[] inputPasswd = null;
		  try  {
		     //  �ܼ� ��ü ����
		     console = System.console();
		     // if console is not null
		     System.out.println(console);
		     if (console != null)     {
		        // ����ڷκ��� �̸� �Է� ����
		        inputName = console.readLine("Name: ");
		        System.out.println("Name entered : " + inputName);
		        
		        inputPasswd = console.readPassword("Password : ");
		        // prints
		        System.out.println("Name entered : " + inputPasswd);
		     }
		  } catch (Exception ex)  {
		     ex.printStackTrace();
		  }


	}

}
