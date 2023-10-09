//SAMPLE INPUT/OUTPUT

//EXAMPLE-1 :-
//input = "eight double three  two four eight five six";
//output = "83324856"

//EXAMPLE - 2 :-
//input = "eight four five double six triple one seven two"
//outout = "8456611172"

//----------------------------------------------------------
//                      SOURCE CODE
//----------------------------------------------------------
import java.util.*;

public class PhoneNumber {
    public static void main(String[] args) {
        String input = "eight double three  two four eight five six";
        int output = convertPhoneNumber(input);
        System.out.println(output);
    }

    public static int convertPhoneNumber(String input) {
        Map<String, String> wordToDigit = new HashMap<>();
        wordToDigit.put("zero", "0");
        wordToDigit.put("one", "1");
        wordToDigit.put("two", "2");
        wordToDigit.put("three", "3");
        wordToDigit.put("four", "4");
        wordToDigit.put("five", "5");
        wordToDigit.put("six", "6");
        wordToDigit.put("seven", "7");
        wordToDigit.put("eight", "8");
        wordToDigit.put("nine", "9");
        wordToDigit.put("double", "2");
        wordToDigit.put("triple", "3");

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < words.length) {
            String currentWord = words[i];
            String nextWord = "";
            if(i+1 < words.length)
                nextWord = words[i+1];
            
            if (wordToDigit.containsKey(currentWord)) {
                if (currentWord.equals( "double") ) {
                    result.append(wordToDigit.get(nextWord));
                } 
                else if (currentWord.equals("triple")) {
                    result.append(wordToDigit.get(nextWord));
                    result.append(wordToDigit.get(nextWord));
                } else {
                    result.append(wordToDigit.get(currentWord));
                }
            }

            i++;
        }
        return result.toString();
        
    }
}

