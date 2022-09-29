//importing
import java.text.DecimalFormat;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        //declare and initialize variables
        int people = 0;
        double currentItem = 0;
        double totalBeforeTip = 0;
        int tipPercent = 0;
        double totalTip = 0;
        double totalWithTip = 0;
        double singleBeforeTip = 0;
        double tipPerPerson = 0;
        double totalPerPerson = 0;

        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        //welcome
        System.out.println("Welcome to the Tip Calculator!");

        //gathering info
        System.out.println("How many people are in your group? ");
        people = scan.nextInt();
        System.out.println("What's the tip percentage (0 - 100): ");
        tipPercent = scan.nextInt();

        while (currentItem != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            currentItem = scan.nextDouble();
            totalBeforeTip += currentItem;
        }

        //undoing the addition of -1
        totalBeforeTip ++;

        //calculating tips
        totalTip = (tipPercent / 100.0) * totalBeforeTip;
        totalWithTip = totalBeforeTip + totalTip;
        singleBeforeTip = totalBeforeTip / people;
        tipPerPerson = totalTip/people;
        totalPerPerson = totalWithTip / people;

        //formatting variables
        String formattedTotalTip = formatter.format(totalTip);
        String formattedTotalWithTip = formatter.format(totalWithTip);
        String formattedSingleBeforeTip = formatter.format(singleBeforeTip);
        String formattedTipPerPerson = formatter.format(tipPerPerson);
        String formattedTotalPerPerson = formatter.format(totalPerPerson);

        //printing information
        System.out.println("--------------------");
        System.out.println("Total Bill Before Tip: " + totalBeforeTip);
        System.out.println("Tip Percentage: " + tipPercent);
        System.out.println("Total Tip: " + formattedTotalTip);
        System.out.println("Total Bill With Tip: " + formattedTotalWithTip);
        System.out.println("Per Person Cost Before Tip: " + formattedSingleBeforeTip);
        System.out.println("Tip Per Person: " + formattedTipPerPerson);
        System.out.println("Total Cost Per Person: " + formattedTotalPerPerson);

        scan.close();
    }
}
