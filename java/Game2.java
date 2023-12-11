import java.util.Scanner;

public class Game2 {
    public int ChooseElements()
    {
        int elementschoose = (int) (Math.random()*40)+40;
        return elementschoose;
    }

//    public int FetchComputerTurn()
//    {
//        int computerTurn = (int) (Math.random()*3)+1;
//        return computerTurn;
//    }

    public static void main(String[] args) {
        Game2 n1 = new Game2();
        char ch ;
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int SC = 0;
        int nextNumber = 1;
        int num=3;

        char conti = 'y';
        while (conti == 'y') {
            int elementsLeft = n1.ChooseElements();
            if (nextNumber == 1)
            {  System.out.println("You are playing StickPLayGame");
                nextNumber++;
            }
            System.out.println("Do you want to start the game:\npress y or n");
            char ch2;
            ch2 = sc.next().charAt(0);

            if (ch2 == 'y' || ch2 == 'Y') {
                System.out.println("number of elements are =" + elementsLeft);

                while (elementsLeft > 0)
                {
                    System.out.println("It's your turn now: Enter (1-"+num+") ");
                    int personMove = sc.nextInt();
                    while (personMove <1 || personMove>num || personMove>elementsLeft)
                    {
                        System.out.println("Please choose (1-"+num+")");
                        personMove = sc.nextInt();
                    }
                    elementsLeft = elementsLeft - personMove;
                    System.out.println("After your move!! the number of elements left: " + elementsLeft);
                    System.out.println("");
                    if (elementsLeft <= 0)
                    {
                        System.out.println("***");
                        System.out.println("You win the game!");
                        System.out.println("***");
                        score = score + 5;
                        SC = SC-5;
                        System.out.println("Your  score is = " + score);
                        System.out.println("Computer  Score is " + SC);
                        //return ;
                    } else
                    {
                        int computerMove = (int) (Math.random()*num)+1;
                        System.out.println("Computer moves " + computerMove);
                        elementsLeft = elementsLeft - computerMove;
                        System.out.println("Now only " + elementsLeft + " elementsLeft");
                        System.out.println("");
                        if (elementsLeft <= 0) {
                            System.out.println("***");
                            System.out.println("Computer wins the game!");
                            System.out.println("***");
                            score -= 5;
                            SC += 5;
                            System.out.println("Your  score is = " + score);
                            System.out.println("Computer  Score is " + SC);
                            //return ;
                        }
                    }
                    num++;
                    if(num>7){
                        num=3;
                    }
                }
            } else {
                while (elementsLeft > 0) {
                    int computerMove = (int) (Math.random()*num)+1;
                    System.out.println("Computer moves " + computerMove);
                    elementsLeft = elementsLeft - computerMove;
                    System.out.println("Now only " + elementsLeft + " elementsLeft");
                    System.out.println("");
                    if (elementsLeft <= 0) {
                        System.out.println("***");
                        System.out.println("Computer wins the game!");
                        System.out.println("***");
                        score = score - 5;
                        SC += SC;
                        System.out.println("Your  score is = " + score);
                        System.out.println("Computer  Score is " + SC);
                        //return ;
                    } else {
                        System.out.println("It's your turn now: Enter (1-"+num+") ");
                        int personMove = sc.nextInt();
                        while (personMove <1 || personMove>num || personMove>elementsLeft) {
                            System.out.println("Please choose (1-"+num+")");
                            personMove = sc.nextInt();
                        }
                        num++;
                        elementsLeft = elementsLeft - personMove;
                        System.out.println("After your move!! the number of elements left: " + elementsLeft);
                        System.out.println("");
                        if (elementsLeft <= 0) {
                            System.out.println("***");
                            System.out.println("You win the game!");
                            System.out.println("***");
                            score = score + 5;
                            SC -= SC;
                            System.out.println("Your  score is = " + score);
                            System.out.println("Computer  Score is " + SC);

                            //return ;
                        }
                    }
                    num++;
                    if(num>7){
                        num=3;
                    }
                }
            }

            System.out.println("Do You want to continue....   press y or n");
            conti = sc.next().charAt(0);
            if (conti != 'y' && conti != 'Y') {
                System.out.println("GAME OVER!");
                System.out.println("Your final score is = " + score);
                System.out.println("Computer final Score is " + SC);
            }
        }

    }
}
