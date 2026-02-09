//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        //Project 4: Currency & Crypto Converter
        Scanner input = new Scanner(System.in);

        System.out.print("\n\tChoose Conversion: 1: USD-Riel, 2: Riel-USD, 3: USDT-BTC, 4: USD-CNY\n");
        System.out.print("\nAnswer: ");
        String conversion = (input.nextLine());

        System.out.print("\nEnter Amount: ");
        Double amount = (input.nextDouble());

        double USD_Riel;
        double Riel_USD;
        double USD_BTC;
        double USD_CNY;


        switch (conversion) {
            case "1":
                USD_Riel = amount * 4100;
                System.out.print("Result: " + USD_Riel + " ៛");
                break;
            case "2":
                Riel_USD = amount/ 4100;
                System.out.print("Result: $" + Riel_USD);
                break;
            case "3":
                USD_BTC = amount * 0.000015;
                System.out.print("Result: " + USD_BTC+ " ₿");
                break;
            case "4":
                USD_CNY = (amount) * 7.2;
                System.out.print("Result: " + USD_CNY + " ¥");
                break;
            default:
                System.out.print("Invalid Option");
                break;
        }
    }
}
