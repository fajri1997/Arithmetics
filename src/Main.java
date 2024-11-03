//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double amountKWD = 86;
        double  kwdToUsd = 3.25;
        double  kwdToEUR  = 3;
        double amountUSD = 279.5;
        double amountEUR  = 258.0 ;



        System.out.println("Kuwaiti Dinar to US Dollars: Amount in KWD  "  +kwdToUsd);
        System.out.println(amountKWD + " KWD = " + (amountKWD * kwdToUsd) + " USD \n");
        System.out.println( amountKWD  + " KWD = " + (amountKWD * kwdToEUR) + " EUR\n");
        System.out.println( amountUSD  + " USD = " + (amountUSD / kwdToUsd) + " KWD\n");
        System.out.println( amountEUR  + " EUR = " + (amountEUR / kwdToEUR) + " KWD\n");



    }
}