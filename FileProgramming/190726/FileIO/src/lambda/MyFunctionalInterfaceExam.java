package lambda;

public class MyFunctionalInterfaceExam {
	
	public static void main(String[] args) {
        MyFunctionalInterface fi; 
        fi = () -> {    //�������̽��� Ÿ�� Ÿ������ ���� ���ٽ�
            String str = "method call1";
            System.out.println(str);
        }; 
        fi.method();                 //���ٽ� ȣ��
        fi = () -> {   
            System.out.println("method call2");
        };
        fi.method(); 
        fi = () -> System.out.println("method call3");
        fi.method();
        
        
        System.out.println("�Ű������� ���� ���ٽ� ȣ��");
        fi = () -> {    //�������̽��� Ÿ�� Ÿ������ ���� ���ٽ�
            String str = "method call1";
            System.out.println(str);
        }; 
        fi.method();                 //���ٽ� ȣ��
        fi = () -> {   
            System.out.println("method call2");
        };
        fi.method(); 
        fi = () -> System.out.println("method call3");
        fi.method();

        
    } 
	
	
	
}
