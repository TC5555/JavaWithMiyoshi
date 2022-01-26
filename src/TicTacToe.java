import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {

        int[][] ticb = new int[3][3];
        Scanner console = new Scanner(System.in);
        int uh = 0, uv = 0, udr = 0, udl = 0, TieCount;
        boolean win = false, play, tie = false;
        int input;

        while(!win || !tie) {

            for (int i = 0; i < ticb.length; i++) {
                for (int j = 0; j < ticb[i].length; j++) {
                    System.out.print(ticb[i][j] + " ");
                }
                System.out.println(); }

            play = false;

            while(!play){
            input = console.nextInt();
            switch(input) {
                case 11:
                    if(ticb[0][0] > 0) { break; }
                    ticb[0][0] = 1;
                    play = true;
                    break;
                case 12:
                    if(ticb[0][1] > 0) { break; }
                    ticb[0][1] = 1;
                    play = true;
                    break;
                case 13:
                    if(ticb[0][2] > 0) { break; }
                    ticb[0][2] = 1;
                    play = true;
                    break;
                case 21:
                    if(ticb[1][0] > 0) { break; }
                    ticb[1][0] = 1;
                    play = true;
                    break;
                case 22:
                    if(ticb[1][1] > 0) { break; }
                    ticb[1][1] = 1;
                    play = true;
                    break;
                case 23:
                    if(ticb[1][2] > 0) { break; }
                    ticb[1][2] = 1;
                    play = true;
                    break;
                case 31:
                    if(ticb[2][0] > 0) { break; }
                    ticb[2][0] = 1;
                    play = true;
                    break;
                case 32:
                    if(ticb[2][1] > 0) { break; }
                    ticb[2][1] = 1;
                    play = true;
                    break;
                case 33:
                    if(ticb[2][2] > 0) { break; }
                    ticb[2][2] = 1;
                    play = true;
                    break;
            }}

            TieCount = 0;

            for (int i = 0; i < ticb.length; i++) {
                for (int j = 0; j < ticb[i].length; j++) {
                    if(ticb[i][j] == 1) uh++;
                    if(ticb[j][i] == 1) uv++;
                    if(ticb[i][j] == 1 || ticb[i][j] == 2) TieCount++;
                }
                if(ticb[i][i] == 1) udr++;
                if(ticb[(ticb.length - 1) - i][i] == 1) udl++;
                if (uv == 3 || uh == 3 || udr == 3 || udl == 3) {
                    System.out.println("user 1 win");
                    win = true; }
                else if (TieCount == 9) {
                    System.out.println("tie game");
                    tie = true;
                }
                uv = 0;
                uh = 0;
            }
            udr = 0;
            udl = 0;

            if(win || tie) break;

            for (int i = 0; i < ticb.length; i++) {
                for (int j = 0; j < ticb[i].length; j++) {
                    System.out.print(ticb[i][j] + " ");
                }
                System.out.println();
            }

            play = false;

            while(!play) {

                input = console.nextInt();

            switch(input) {
                case 11:
                    if(ticb[0][0] > 0) { break; }
                    ticb[0][0] = 2;
                    play = true;
                    break;
                case 12:
                    if(ticb[0][1] > 0) { break; }
                    ticb[0][1] = 2;
                    play = true;
                    break;
                case 13:
                    if(ticb[0][2] > 0) { break; }
                    ticb[0][2] = 2;
                    play = true;
                    break;
                case 21:
                    if(ticb[1][0] > 0) { break; }
                    ticb[1][0] = 2;
                    play = true;
                    break;
                case 22:
                    if(ticb[1][1] > 0) { break; }
                    ticb[1][1] = 2;
                    play = true;
                    break;
                case 23:
                    if(ticb[1][2] > 0) { break; }
                    ticb[1][2] = 2;
                    play = true;
                    break;
                case 31:
                    if(ticb[2][0] > 0) { break; }
                    ticb[2][0] = 2;
                    play = true;
                    break;
                case 32:
                    if(ticb[2][1] > 0) { break; }
                    ticb[2][1] = 2;
                    play = true;
                    break;
                case 33:
                    if(ticb[2][2] > 0) { break; }
                    ticb[2][2] = 2;
                    play = true;
                    break;
            }}

            for (int i = 0; i < ticb.length; i++) {
                for (int j = 0; j < ticb[i].length; j++) {
                    if(ticb[i][j] == 2) uh++;
                    if(ticb[j][i] == 2) uv++;
                }
                if(ticb[i][i] == 2) udr++;
                if(ticb[(ticb.length - 1) - i][i] == 2) udl++;
                if (uv == 3 || uh == 3 || udr == 3 || udl == 3) {
                    System.out.println("user 2 win");
                    win = true; }
                uv = 0;
                uh = 0;
            }
            udr = 0;
            udl = 0;

        }
        for (int i = 0; i < ticb.length; i++) {
            for (int j = 0; j < ticb[i].length; j++) {
                System.out.print(ticb[i][j] + " ");
            }
            System.out.println(); }
    }
}
