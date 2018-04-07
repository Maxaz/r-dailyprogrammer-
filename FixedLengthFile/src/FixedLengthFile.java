import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class FixedLengthFile {

    public static void main(String[] args) throws IOException {
        String url = "https://gist.githubusercontent.com/anonymous/747d5e3bbc57949d8bfe5fd82f359acb/raw/761277a2dcacafb3c06a1e6d0e405ca252098c09/Employee%2520Records.txt";
        System.out.println(solve(url));
    }

    private static String solve(String url) throws IOException {
        Map<String, Integer> employeeSalaryList = new HashMap<>();
        String name = "";
        int biggestSalary = 0;

        Scanner scan = new Scanner(readStringFromURL(url));
        while (scan.hasNext()) {
            String line = scan.nextLine();
            if (line.charAt(0) != ':') {
                name = line.substring(0, 20);
            } else if (line.substring(0, 10).equals("::EXT::SAL")) {
                employeeSalaryList.put(name, Integer.parseInt(line.substring(11)));
            }
        }

        for (String s : employeeSalaryList.keySet()) {
            if (employeeSalaryList.get(s) > biggestSalary) {
                name = s;
                biggestSalary = employeeSalaryList.get(s);
            }
        }

        return prepareOutputSolution(name, biggestSalary);
    }

    private static String prepareOutputSolution(String name, Integer biggestSalary) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name.trim());
        stringBuilder.append(", ");
        String value = NumberFormat.getCurrencyInstance(Locale.US).format(biggestSalary);
        stringBuilder.append(value);
        String output = stringBuilder.toString();
        return output;
    }

    private static String readStringFromURL(String requestURL) throws IOException {
        try (Scanner scanner = new Scanner(new URL(requestURL).openStream(),
                StandardCharsets.UTF_8.toString())) {
            scanner.useDelimiter("\\A");
            return scanner.hasNext() ? scanner.next() : "";
        }
    }
}
