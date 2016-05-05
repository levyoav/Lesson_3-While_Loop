package whileLoopExamples;

public class DoWhileLoopExample {

	public static void main(String[] args) {

		int r;

		do {
			r = (int) (Math.random() * 11);
			System.out.print(r + ", ");
		} while (r != 5);
	}

}
