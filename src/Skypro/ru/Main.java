package Skypro.ru;

public class Main {

    public static void main(String[] args) {
	// Zadanie N1
        int horses = 7;
        byte cat = 1;
        short mouse = 3;
        long elefantWeight = 125L;
        double sugarWeight = 4.5;
        float saltWeight = 1.5f;
        boolean horsesIsAdult = horses > 10;
        System.out.println(horsesIsAdult);
        char bar = 35;
        System.out.println(bar);

        // Zadanie N2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOffAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("Obsiy ves bokrserov " + weightOffAllBoxers);
        System.out.println("Raznitsa v vese bokserov " + weightDifference);

        // Zadanie N3
        short bananas = 5 * 80;
        short milk = 2 * 105;
        short iseCream = 2 * 100;
        short eggs = 4 * 70;
        int totalWeightInGram = bananas + milk + iseCream + eggs;
        System.out.println("Obsiy ves zavtraka v grammah " + totalWeightInGram + " gr");
        int grToKilo = 1000;
        float totalWeightInKilo = (float) totalWeightInGram / grToKilo;
        System.out.println("Obsiy ves zavtraka v kilogrammah " + totalWeightInKilo  + " kg");





    }
}
