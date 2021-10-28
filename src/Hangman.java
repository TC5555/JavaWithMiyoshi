import java.util.Scanner;

public class Hangman {


    public static void main(String[] args) {
        boolean win = false, valid, correctinput, rightletter, alphabetE;
        String word;
        StringBuilder Cword = new StringBuilder(), alphabet = new StringBuilder();
        int points, lives = 6;
        char input;
        Scanner console = new Scanner(System.in);

        for(int i = 97; i <= 122; i++) {
            alphabet.append((char)i);
        }


        do {
            valid = true;
            System.out.print("enter word to guess: ");
            word = console.next();
            for (int i = 0; i < word.length(); i++) {
                if ((int) word.charAt(i) < 97 || (int) word.charAt(i) > 122) {
                    System.out.println("Invalid input");
                    valid = false;
                }
            }
        } while (!valid);

        System.out.println();

        while (!win) {
            switch(lives)
            {
                case 6:
                    System.out.println(
                                    "    /-----------     \n" +
                                    "   | |         |     \n" +
                                    "   | |         |     \n" +
                                    "   | |               \n" +
                                    "   | |               \n" +
                                    "   | |               \n" +
                                    "  /| |\\              ");
                   break;
                case 5:
                    System.out.println(
                            "    /-----------     \n" +
                                    "   | |         |     \n" +
                                    "   | |         |     \n" +
                                    "   | |         O     \n" +
                                    "   | |               \n" +
                                    "   | |               \n" +
                                    "  /| |\\              ");
                    break;
                case 4:
                    System.out.println(
                            "    /-----------     \n" +
                                    "   | |         |     \n" +
                                    "   | |         |     \n" +
                                    "   | |         O     \n" +
                                    "   | |         I     \n" +
                                    "   | |               \n" +
                                    "  /| |\\              ");
                    break;
                case 3:
                    System.out.println(
                            "    /-----------     \n" +
                                    "   | |         |     \n" +
                                    "   | |         |     \n" +
                                    "   | |         O     \n" +
                                    "   | |        /I     \n" +
                                    "   | |               \n" +
                                    "  /| |\\              ");
                    break;
                case 2:
                    System.out.println(
                            "    /-----------     \n" +
                                    "   | |         |     \n" +
                                    "   | |         |     \n" +
                                    "   | |         O     \n" +
                                    "   | |        /I\\     \n" +
                                    "   | |               \n" +
                                    "  /| |\\              ");
                    break;
                case 1:
                    System.out.println(
                            "    /-----------     \n" +
                                    "   | |         |     \n" +
                                    "   | |         |     \n" +
                                    "   | |         O     \n" +
                                    "   | |        /I\\     \n" +
                                    "   | |        /      \n" +
                                    "  /| |\\              ");
                    break;
            }
            for (int i = 0; i < word.length(); i++) {
                rightletter = false;
                for (int j = 0; j < Cword.length(); j++) {
                if (Cword.charAt(j) == word.charAt(i)) {
                    System.out.print(Cword.charAt(j));
                    rightletter = true;
                    break;
                }
                }
                if(!rightletter) { System.out.print("_"); }
            }

            System.out.println();

            for(int i = 0; i < alphabet.length(); i++) {
                alphabetE = false;
                for (int j = 0; j < Cword.length(); j++) {
                    if (Cword.charAt(j) == alphabet.charAt(i)) {
                        alphabet.delete(i, i);
                        alphabetE = true;
                        break;
                    }
                }
                if (alphabetE) {
                    continue;
                }
                System.out.print(alphabet.charAt(i) + " ");
            }

            System.out.println();

            System.out.print("Enter guess: ");
            input = console.next().charAt(0);
           Cword.append(input);

            correctinput = false;

            for(int i = 0; i < word.length(); i++) {
                for (int j = 0; j < Cword.length(); j++) {
                    if (Cword.charAt(j) == word.charAt(i)) {
                        correctinput = true;
                        break;
                    }
                }
            }

            if(!correctinput) {
                lives--;
            }

            points = 0;

            for (int i = 0; i < word.length(); i++) {
                for (int j = 0; j < Cword.length(); j++) {
                    if (Cword.charAt(j) == word.charAt(i)) {
                        points++;
                        break;
                    }
                }}
            if(points == 5) {win = true;}
            if(lives == 0) {
                System.out.println("you lose\n" +
                        "    /-----------     \n" +
                                "   | |         |     \n" +
                                "   | |         |     \n" +
                                "   | |         O     \n" +
                                "   | |        /I\\     \n" +
                                "   | |        / \\     \n" +
                                "  /| |\\              ");
                break;
            }

        if(win) System.out.println("you win!");
    }
}}