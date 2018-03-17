import java.util.ArrayList;

public class ClosestString {
    private ArrayList<String> closestStrings;

    public ClosestString() {
        this.closestStrings = new ArrayList<>();
    }

    public void addString(String str) {
        if (this.closestStrings.isEmpty()){
            this.closestStrings.add(str);
        } else if (this.closestStrings.get(0).length() == str.length()){
            this.closestStrings.add(str);
        }
    }

    public void displayList(){
        System.out.println("------------------------------");
        System.out.println("Displaying the list of strings");
        for (String s : closestStrings){
            System.out.println(s);
        }
    }


    public String hammingDistance() {
        String bestString = null;
        int lastScore = 0;

        for (int i = 0; i < closestStrings.size(); i++) {
            int stringScore = 0;

            for (int j = 0; j < closestStrings.get(0).length(); j++) {
                Character charBuffor = closestStrings.get(i).charAt(j);

                for (int k = 0; k < closestStrings.size(); k++) {
                    Character charCompared = closestStrings.get(k).charAt(j);

                    if ((charBuffor.compareTo(charCompared) == 0) && (k != i)) {
                        stringScore++;
                    }
                }
            }

            if (stringScore > lastScore){
                bestString = closestStrings.get(i);
                lastScore = stringScore;
            }
        }

        return bestString;
    }
}
