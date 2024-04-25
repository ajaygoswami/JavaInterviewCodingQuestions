package coding.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class ReverseWordsOfTheSrings {

	public static void main(String[] args) {
		String string = "Ajay Sen Goswami";
		{

			String stringWithReversedWords = "";
			for (final String word : string.split(" ")) {
				stringWithReversedWords += reverseWord(word) + " ";
			}
			System.out.println(stringWithReversedWords);
		}
		{
			String stringWithReversedWords = Arrays.stream(string.split(" "))
					.map(word -> reverseWord(word))
					.collect(Collectors.joining(" "));
			System.out.println(stringWithReversedWords);

			// using StringBuilder for reverse
			String stringWithReversedWords2 = Arrays.stream(string.split(" "))
					.map(word -> new StringBuilder(word).reverse())
					.collect(Collectors.joining(" "));
			System.out.println(stringWithReversedWords2);

		}
		{
			// reverse word and sentence also
			List<String> stringWithReversedWordsAndWholeSentence = Arrays.stream(string.split(" "))
					.map(word -> new StringBuilder(word).reverse())
					.map(String::new)
					.collect(Collectors.toList());
			Collections.reverse(stringWithReversedWordsAndWholeSentence);
			System.out.println(stringWithReversedWordsAndWholeSentence);
		}

	}

	private static String reverseWord(String word) {

		if (word.isEmpty() || word.length() == 1) {
			return word;
		}
		String reverseWord = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverseWord += word.charAt(i);
		}
		return reverseWord;
	}

}
