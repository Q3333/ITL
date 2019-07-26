package NIO;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

public class Buffer_3 {

	public static void main(String[] args) {
		///��  ���̷�Ʈ ���� �뷮 Ȯ�� ����

		ByteBuffer byteBuffer = ByteBuffer.allocateDirect(100);
		System.out.println("byte ���� �뷮: " + byteBuffer.capacity());
		 
		CharBuffer charBuffer = ByteBuffer.allocateDirect(100).asCharBuffer();
		System.out.println("char ���� �뷮: " + charBuffer.capacity());
		        
		IntBuffer intBuffer = ByteBuffer.allocateDirect(100).asIntBuffer();
		System.out.println("int ���� �뷮: " + intBuffer.capacity());
		
		
		///	��  ��ǻ���� �⺻ ����Ʈ �ؼ� ���� ����
		
		System.out.println("�ü��: " + System.getProperty("os.name"));
        System.out.println("����Ƽ���� ����Ʈ �ؼ� ����: " + ByteOrder.nativeOrder());
        
        
        
        ///��  Buffer�� ��ġ �Ӽ��� ����
        System.out.println("[7����Ʈ ũ��� ���� ����]"); 
        ByteBuffer buffer = ByteBuffer.allocateDirect(7);
        printState(buffer);
        buffer.put((byte) 10);
        buffer.put((byte) 11);
        System.out.println("[2����Ʈ ������]");
        printState(buffer); 
        buffer.put((byte) 12);
        buffer.put((byte) 13);
        buffer.put((byte) 14);
        System.out.println("[3����Ʈ ������]");
        printState(buffer); 
        buffer.flip();
        System.out.println("[filp ������]");
        printState(buffer);

        buffer.get(new byte[3]);
        System.out.println("[3����Ʈ ������]");
        printState(buffer);      
        
        buffer.mark();
        System.out.println("[���� ��ġ mark �س���");
         
        buffer.get(new byte[2]);
        System.out.println("[2����Ʈ ���� ��]");
        printState(buffer);
         
        buffer.reset();
        System.out.println("[position �� ��ũ ��ġ�� �ű�]");
        printState(buffer);
         
        buffer.rewind();
        System.out.println("[rewind ���� ��]");
        printState(buffer);
         
        buffer.clear();
        System.out.println("[clear ���� ��]");
        printState(buffer);
       

	}

	public static void printState(ByteBuffer buffer) {
		
		 System.out.print("\tposition: " + buffer.position() + ", ");
		 System.out.print("\tlimit: " + buffer.limit() + ", ");
		 System.out.println("\tcapacity: " + buffer.capacity());
    } 
	



}
