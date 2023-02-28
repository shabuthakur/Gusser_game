import java.util.Scanner;

class Guesser{
    int guessNum;
    int guessNum(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Guesser Kindly guess the number");
        guessNum=scan.nextInt();
        return guessNum;
    }

}
class Player{
    int guessNum;
    int guessNum(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Player kindly guess the number");
        guessNum=scan.nextInt();
        return guessNum;
    }
}

class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    void collectFromGuesserNum(){
        Guesser g= new Guesser();
        numFromGuesser=g.guessNum();

    }
    void collectFromPlayerNum(){
        Player player1= new Player();
        Player player2=  new Player();
        Player player3=new Player();
        numFromPlayer1=player1.guessNum();
        numFromPlayer2=player2.guessNum();
        numFromPlayer3=player3.guessNum();
    }
    void CompareNum(){
        if(numFromGuesser==numFromPlayer1){
            System.out.println("Player 1 won the game");
        }
        if(numFromGuesser==numFromPlayer2){
            System.out.println("Player 2 won the game");
        }
        if (numFromGuesser==numFromPlayer3){
            System.out.println("Player 3 won the game");
        }

    }
}



public class Game {
    public static void main(String[] args) {
        Umpire umpire=new Umpire();
        umpire.collectFromGuesserNum();
        umpire.collectFromPlayerNum();
        umpire.CompareNum();


    }

}
