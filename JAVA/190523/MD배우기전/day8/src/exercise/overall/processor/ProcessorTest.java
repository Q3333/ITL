package exercise.overall.processor;

public class ProcessorTest {

	public static void main(String[] args) {
		
		String s = "i`m so sorry, but i love you. �� ������~~";
		
		Processor process[] = new Processor[] {
				new LowerCase (),new UpperCase(),new Splitter()
		};
		
		for(int i=0;i<process.length;i++) {
			System.out.println(process[i].name());
			System.out.println("��� ��� : "+process[i].process(s));
			System.out.println();
		}
		
		
		
	}

}
