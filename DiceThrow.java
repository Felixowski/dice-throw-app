import java.util.Scanner;

public class DiceThrow {
    Scanner scanner = new Scanner(System.in);

    public void diceTose() {

        while (true) {
            System.out.print("Czy rzucić kostką?: ");
            String text = scanner.next();

            if (text.equalsIgnoreCase("koniec") || text.equalsIgnoreCase("nie")) break; // Zatrzymanie programu
            if (text.equalsIgnoreCase("tak") || text.equalsIgnoreCase("rzuc")) { // Rzut kostką

                switch (Kostka.count()) { // Sprawdzanie która liczba oczek została wylosowana
                    case 1:
                        for (int i = 0; i < Kostka.dice1.length; i++) { // Wyświetlenie odpowiedniej wylosowanej wartośćci
                            System.out.println(Kostka.dice1[i]);
                        }
                        break;
                    case 2:
                        for (int i = 0; i < Kostka.dice2.length; i++) {
                            System.out.println(Kostka.dice2[i]);
                        }
                        break;
                    case 3:
                        for (int i = 0; i < Kostka.dice3.length; i++) {
                            System.out.println(Kostka.dice3[i]);
                        }
                        break;
                    case 4:
                        for (int i = 0; i < Kostka.dice4.length; i++) {
                            System.out.println(Kostka.dice4[i]);
                        }
                        break;
                    case 5:
                        for (int i = 0; i < Kostka.dice5.length; i++) {
                            System.out.println(Kostka.dice5[i]);
                        }
                        break;
                    case 6:
                        for (int i = 0; i < Kostka.dice6.length; i++) {
                            System.out.println(Kostka.dice6[i]);
                        }
                        break;
                    default:
                        System.out.println("Kostka spadła ze stołu xD");
                }
            }else {
                System.out.println("Napisz \"tak\" lub \"rzuc\" aby kontynuowac");
                System.out.println("lub \"koniec\" ablo \"nie\" aby zakończyć program");
            }

        }

    }

}
