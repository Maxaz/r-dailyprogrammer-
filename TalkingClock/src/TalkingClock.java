import java.util.Date;
import java.util.Scanner;

public class TalkingClock {

    public static void main(String[] args) {

        boolean quit = false;
        Scanner scan = new Scanner(System.in);
        Date d = new Date();
        String[] partime;
        while (!quit) {
            System.out.println("Enter the time (24h) or type 'quit' to end");
            String sTime = scan.nextLine();
            if (sTime.equals("quit")) {
                quit = true;
                continue;
            }
            partime = sTime.split(":");
            try {
                System.out.println("It's " + getHourName(partime[0], partime[1]));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("You must use the ':' separator. Try again.");
                continue;
            } catch (NumberFormatException e1){
                System.out.println("It's not valid, try again!");
                continue;
            }

        }

    }

    public static String getHourName(String hour, String minute) {

        int hours = Integer.parseInt(hour);
        int minutes = Integer.parseInt(minute);
        String hourName = null;
        String hour_mint[] = {"oh", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
                "twenty", "thirty", "forty", "fifty"};

        if (((hours >= 0) && (hours < 24)) && ((minutes >= 0) && (minutes <= 59))) {
            // adding minutes to string
            if (minutes > 0 && minutes < 10) {
                hourName = hour_mint[0] + " " + hour_mint[minutes];
            } else if (minutes > 10 && minutes <20){
                hourName = hour_mint[minutes];
            } else if (minutes > 20 && minutes < 30) {
                hourName = hour_mint[20] + " " + hour_mint[minutes - 20];
            } else if (minutes > 30 && minutes < 40) {
                hourName = hour_mint[21] + " " + hour_mint[minutes - 30];
            } else if (minutes > 40 && minutes < 50) {
                hourName = hour_mint[22] + " " + hour_mint[minutes - 40];
            } else if (minutes > 50) {
                hourName = hour_mint[23] + " " + hour_mint[minutes - 50];
            } else if (minutes % 10 == 0) {
                hourName = hour_mint[18 + (minutes / 10)];
            }

            // adding hours to string
            if ((hours == 0)){
                hourName = hour_mint[12]+ " " + hourName + " am";
            } else if (hours < 12){
                hourName = hour_mint[hours]+ " " + hourName + " am";
            } else if (hours == 12){
                hourName = hour_mint[12] + " " + hourName + " pm";
            } else {
                hourName = hour_mint[hours-12] + " " + hourName + " pm";
            }

        } else {
            hourName = "invalid time format";
        }
        return hourName;
    }

}
