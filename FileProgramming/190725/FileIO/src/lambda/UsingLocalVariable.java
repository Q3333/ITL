package lambda;

public class UsingLocalVariable {
    void method(int  arg) {
        int localVar = 40;
 
//        arg = 31; // final Ư�� ������ ���� �Ұ�
//        localVar = 41; // final Ư�� ������ ���� �Ұ�
 
        MyFunctionalInterface fi = () -> {
            System.out.println("arg: " + arg);
            System.out.println("localVar: " + localVar);
        };
 
        fi.method();
    }
}
