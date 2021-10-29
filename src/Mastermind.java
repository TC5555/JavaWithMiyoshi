import java.util.Scanner;
public class Mastermind {
    public static void main(String[] args) {
        String combo = "6684";
        int amountexact, amountclose;
        StringBuilder guess = new StringBuilder();
        boolean win = false, correct;
        Scanner console = new Scanner(System.in);
        int lives = 20;
        while(!win) {
            System.out.println();
            System.out.print("Guess combination: ");
            guess.delete(0, 4);
            guess.append(console.nextInt());
            guess.setLength(4);
            amountclose = 0;
            amountexact = 0;
            correct = true;

            if(guess.toString().equals(combo)) { win = true; }
            else {
                for(int i = 0; i < combo.length(); i++) {
                    if(guess.charAt(i) == combo.charAt(i)) {
                        amountexact++;
                    }
                    else for(int j = 0; j < guess.length(); j++) {
                        correct = true;
                        if (guess.charAt(i) == combo.charAt(j)) {
                            amountclose++;
                            break;
                        }
                        else{ correct = false; }
                    }
                }
                if(!correct) lives--;
                System.out.print(amountclose + " close\n" + amountexact + " exact\n" + lives + " lives left ");

            }
            if(lives == 0) { break; }
        }
        if(win) System.out.println("you win");
        else System.out.println("you lose");
    }
}
