package third;

public class LetterP {

	public static void main(String[] args) {
		String text = "I love my pap a new pap";
		String correctText = text.replaceAll("pa", "po");
		System.out.println(correctText);
	}
}
