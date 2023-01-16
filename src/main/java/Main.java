import logic.CompareInputWithWord;
import logic.UserInput;
import logic.WordGenerator;

public class Main {

    public static void main(String[] args) {
        CompareInputWithWord.compareInputWithWord(UserInput.userInput(), WordGenerator.pickRandomWord());
    }

}
