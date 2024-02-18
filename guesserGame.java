import java.util.Scanner;
class Guesser {
    
    int guessNum;
    int guessingNum() {
        Scanner Scan = new Scanner(System.in);
    System.out.println("Guesser please guess the number");
    guessNum = Scan.nextInt();
    return guessNum;
    }
}
class Player {

    int guessNum;
    int guessingNum() {
        Scanner Scan = new Scanner(System.in);
        System.out.println("player please guess the number");
        guessNum = Scan.nextInt();
        return guessNum;
    }
}
class umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

   void collectNumFromGuesser() {
    Guesser G =new Guesser();
    numFromGuesser = G.guessingNum();
    }
    void collectNumFromPlayer() {
        
        Player P1 = new Player();
        Player P2 = new Player();
        Player P3 = new Player();
        numFromPlayer1 = P1.guessingNum();
        numFromPlayer2 = P2.guessingNum();
        numFromPlayer3 = P3.guessingNum();
    }
    void checkWhowillwin() {
        if(numFromGuesser == numFromPlayer1) {
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3) {
                System.out.println("sab jit gaye");
            }
            else if(numFromGuesser==numFromPlayer2) {
                System.out.println("player1 aur 2 jit gaye");
            }
            else if(numFromGuesser==numFromPlayer3) {
                System.out.println("player 1 aur 3 jit gaye");
            }
            else {
                System.out.println("player 1 won");
            }
        }
        else if(numFromGuesser == numFromPlayer2) {
            if(numFromGuesser == numFromPlayer3) {
                System.out.println("player 2 aur 3 jit gaye");
            }
            else {
                System.out.println("player 2 won");
            }
        }
        else if(numFromGuesser == numFromPlayer3) {
            System.out.println("player 3 won");
        }
        else {
            System.out.println("sab har gaye");
        }
    }

}
public class guesserGame {
    public static void main(String[] args) {
    umpire U =new umpire();
    U.collectNumFromGuesser();
    U.collectNumFromPlayer();
    U.checkWhowillwin();
    }


}