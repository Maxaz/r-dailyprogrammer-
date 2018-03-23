import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input: ");
        String input = scan.nextLine();
        // sorting the input
        String[] inputSplit = input.split("==");
        String[] c1 = inputSplit[0].split("\\+");
        ArrayList<String> components = new ArrayList<>();
        ArrayList<char[]> componentsChar = new ArrayList<>();
        for (String s : c1) {
            components.add(s.trim());
        }
        for (String s : components) {
            componentsChar.add(s.toCharArray());
        }
        char[] inputProduct = inputSplit[1].trim().toCharArray();
        componentsChar.add(inputProduct);

//        // finding the unique characters
//        ArrayList<Character> uniqueChars = findingUniqueChars(componentsChar);
//        // generate a hashmap of random numbers for unique chars
//        HashMap<Character, Integer> hashMap = generateUniqueHashMap(uniqueChars);
//        // set numbers basing on hashmap
//        Integer[] equationNumbers = setEquationNumbers(hashMap, componentsChar);
        // check if the equation is correct
        HashMap<Character, Integer> solutionHashMap = solution(componentsChar);
        solutionHashMap.forEach((key, value) -> System.out.println(key + ": " + value));

    }

    private static HashMap<Character, Integer> solution(ArrayList<char[]> componentsChar) {
        ArrayList<Character> uniqueChars = findingUniqueChars(componentsChar);
        HashMap<Character, Integer> solutionHashMap = new HashMap<>();
        boolean solved = false;

        while (!solved) {

            boolean correctNumbers = false;
            String[] equationNumbersString = new String[componentsChar.size()];
            while (!correctNumbers){
                solutionHashMap = generateUniqueHashMap(uniqueChars);
                equationNumbersString = setEquationNumbers(solutionHashMap, componentsChar);
                correctNumbers = true;
                for (String s : equationNumbersString){
                    if (s.charAt(0) == '0'){
                        correctNumbers = false;
                    }
                }
            }
            Integer[] equationNumbers = new Integer[equationNumbersString.length];
            for (int i = 0; i<equationNumbers.length; i++){
                equationNumbers[i] = Integer.parseInt(equationNumbersString[i]);
            }

            int left = 0;
            int right = equationNumbers[equationNumbers.length - 1];
            for (int i = 0; i < equationNumbers.length - 1; i++) {
                left += equationNumbers[i];
            }

            if ((left == right)) {
                solved = true;
            }
        }
        return solutionHashMap;
    }

    private static String[] setEquationNumbers(HashMap<Character, Integer> hashMap, ArrayList<char[]> componentsChar) {
        StringBuilder equationNumberBuilder;
        String[] equationNumbers = new String[componentsChar.size()];

            for (int i = 0; i < equationNumbers.length; i++) {
                equationNumberBuilder = new StringBuilder();
                for (char c : componentsChar.get(i)) {
                    equationNumberBuilder.append(hashMap.get(c));
                }
                equationNumbers[i] = equationNumberBuilder.toString();
            }

        return equationNumbers;
    }

    private static HashMap<Character, Integer> generateUniqueHashMap(ArrayList<Character> uniqueChars) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> numbers = resetNumbers();

        for (char c : uniqueChars) {
            hashMap.put(c, getRandomNotRepeat(numbers));
        }

        return hashMap;
    }

    private static ArrayList<Character> findingUniqueChars(ArrayList<char[]> componentsChar) {
        ArrayList<Character> uniqueChars = new ArrayList<>();

        for (char[] carray : componentsChar) {
            for (char c : carray) {
                if (!uniqueChars.contains(c)) {
                    uniqueChars.add(c);
                }
            }
        }
        return uniqueChars;
    }

    private static ArrayList<Integer> resetNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    private static Integer getRandomNotRepeat(ArrayList<Integer> numbers) {
        if (numbers.size() == 0) {
            return -1;
        }
        Collections.shuffle(numbers);
        Integer n = numbers.get(0);
        numbers.remove(0);

        return n;
    }
}
