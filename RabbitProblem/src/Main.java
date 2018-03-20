import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input: ");
        long men = scan.nextLong();
        long women = scan.nextLong();
        long neededAlive = scan.nextLong();


        System.out.println(solveRabbitDomination(men, women, neededAlive));

    }

    public static int solveRabbitDomination(long men, long women, long neededAlive) {
        long population =men + women;
        long[] womenPopulation = new long[97];
        long[] menPopulation = new long[97];
        womenPopulation[2] = women;
        menPopulation[2] = men;

        int months = 0;

        while (population < neededAlive) {
            long newBornWomen = 0;
            long newBornMen = 0;
            for (int i = 4; i < 96; i++) {
                newBornWomen += 9 * womenPopulation[i];
                newBornMen += 5 * womenPopulation[i];
            }

            for (int i = 96; i > 0; i--) {
                womenPopulation[i] += womenPopulation[i - 1];
                menPopulation[i] += menPopulation[i - 1];
                womenPopulation[i - 1] = 0;
                menPopulation[i - 1] = 0;
            }
            womenPopulation[0] = newBornWomen;
            menPopulation[0] = newBornMen;

            long currentPopulation = 0;
            for (int i = 0; i < 96; i++){
                currentPopulation += womenPopulation[i] + menPopulation[i];
            }
            population = currentPopulation;
            months++;
        }
        return months;
    }
}
