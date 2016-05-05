package whileLoopExamples;

public class WhileLoopExample2 {

	public static void main(String[] args) {

		int r = (int) (Math.random() * 11);

		while (r != 5) {
			System.out.print(r + ", ");
			r = (int) (Math.random() * 11);
		}

		System.out.println(r);

	}
}
