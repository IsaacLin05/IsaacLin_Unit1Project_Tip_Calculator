import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;
public class main {
    public static void main(String[] args)
    {
        double BillperPerson;
        double TotalTip;
        double TipPerPerson;

        System.out.println("What is the total Bill? ");
        Scanner input= new Scanner(System. in);
        double value = input.nextDouble();
        System.out.println("The total Bill is : " + value + "$");

        System.out.println("What is the tip here?"); //this is not in percentages, so you can say 5 for 5% tax
        Scanner tip = new Scanner(System. in);
        double Tip = input.nextDouble();
        System.out.println("The tip here is : " + Tip + "%");

        System.out.println("How many people are here?");
        Scanner people = new Scanner(System. in);
        int Person = input.nextInt();
        System.out.println("There are " + Person + " here");

        BillperPerson=(value*(1+(Tip/100)))/Person;
        TotalTip=(value*(1+(Tip/100)));
        TipPerPerson=(value*(Tip/100));

        System.out.println("Each person will pay " + BillperPerson + "$ total");
        System.out.println("The total tip is " + TotalTip + " $");
        System.out.println("The tip per person is " + TipPerPerson + " $");
    }
}
