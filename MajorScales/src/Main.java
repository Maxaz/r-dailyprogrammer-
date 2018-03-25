import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the major scale (eg. C#): ");
        String input1 = scan.next();
        System.out.println("Enter the solfège name(Do, Re, Mi, Fa, So, La, and Ti): ");
        String input2 = scan.next();

        System.out.println(majorScalesSolution(input1, input2));
    }

    private static String majorScalesSolution(String majorScaleName, String solfegeName) {
        String[] notes = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
        String[] solfeges = {"Do", "Re", "Mi", "Fa", "So", "La", "Ti"};
        Integer[] solfegesSemitones = {0, 2, 4, 5, 7, 9, 11};

        int noteIndex = 0;
        for (String s : notes) {
            if (s.equals(majorScaleName)) {
                break;
            }
            noteIndex++;
        }
        int solfegeIndex = 0;
        for (String s : solfeges){
            if (s.equals(solfegeName)){
                break;
            }
            solfegeIndex++;
        }

        return  notes[(noteIndex + solfegesSemitones[solfegeIndex])%12];

    }


}
