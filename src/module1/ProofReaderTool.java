package module1;

public class ProofReaderTool {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println("------Executing main method in ContinueKeywordMain--------");

		String aLargeSentenceBucket = "Elephant are one of the largest animals. I like looking at elephants. The two elephant are grey in color. I saw two elephant in the forest. ";

		String correctedSentence = aLargeSentenceBucket.replaceAll("elephant", "elephants");
		String correctedSentence2 = correctedSentence.replaceAll("Elephant", "Elephants");

		System.out.println("The corrected string is:" + correctedSentence2);

		String[] splittedResult = aLargeSentenceBucket.split(" ");

		int i = -1;
		// String[] correctedWords = new String[splittedResult.length];
		while (i < splittedResult.length - 1) {
			i++;
			String elementFromTheArray = splittedResult[i];
			if ((elementFromTheArray.equals("elephant")) && !(elementFromTheArray.equals("elephants"))) {
				splittedResult[i] = "elephants";
			} else if ((elementFromTheArray.equals("Elephant")) && !(elementFromTheArray.equals("Elephants"))) {
				splittedResult[i] = "Elephants";
			}

			else {
				continue;
			}

		}
		// End of while loop.

		String joinedWords = "";
		for (int index = 0; index < splittedResult.length; index++) {
			String elementFromArray = splittedResult[index];
			joinedWords = joinedWords.concat(elementFromArray).concat(" ");
		}
		System.out.println("Did the concatenation using the String class " + joinedWords);

	}

}
