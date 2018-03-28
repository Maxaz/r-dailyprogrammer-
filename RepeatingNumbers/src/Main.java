import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String source = "11111011110111011";
        solver(source);
    }

    private static HashMap<String, Integer> solver(String source) {
        if (source.isEmpty()) return new HashMap<>();
        HashMap<String, Integer> output = new HashMap<>();

        for (int i = 2; i < source.length(); i++) {
            for (int j = 0; j < (source.length() - (i + 1)); j++) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(source,j,(j+i));
                String temp = stringBuilder.toString();
                Integer tempOccurrences = 0;
                for (int k = 0; k < (source.length() - (i - 1)); k++){
                    StringBuilder stringBuilderFinder = new StringBuilder();
                    stringBuilderFinder.append(source,k,(k+i));
                    String stringFinder = stringBuilderFinder.toString();
                    if (temp.equals(stringFinder)) tempOccurrences++;
                }
                if (tempOccurrences > 1) output.put(temp, tempOccurrences);
            }
        }

        if (output.isEmpty()){
            System.out.println("0");
        } else {
            for (String s : output.keySet()){
                System.out.println(s + ":" + output.get(s));
            }
        }
        return output;
    }

}
