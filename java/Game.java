import java.util.Scanner;

public class Game {
        public int ChooseElements()
        {
            return (int) (Math.random()*40)+40;
        }

        public int FetchComputerTurn()
        {
            int computerTurn = (int) (Math.random()*3)+1;
            return computerTurn;
        }

        public static void main(String[] args) {
            Game n1 = new Game();
            Scanner sc = new Scanner(System.in);
            int score = 0;
            int SC = 0;
            int nextNumber = 1;
            char conti = 'y';

            while (conti == 'y') {
                int elementsLeft = n1.ChooseElements();
                if (nextNumber == 1) {
                    System.out.println("You are playing StickPickGame");
                    nextNumber++;
                }

                System.out.println("number of Sticks are =" + elementsLeft);

                while (elementsLeft > 0) {
                    System.out.println("It's your turn now: Enter (1 ,2 or 3) ");
                    int personMove = sc.nextInt();
                    while (personMove != 1 && personMove != 2 && personMove != 3) {
                        System.out.println("Please choose 1,2 or 3 only");
                        personMove = sc.nextInt();
                    }
                    elementsLeft = elementsLeft - personMove;
                    System.out.println("After your move!! the number of elements left: " + elementsLeft);
                    System.out.println("");
                    if (elementsLeft <= 0) {
                        System.out.println("***");
                        System.out.println("You win the game!");
                        System.out.println("***");
                        score = score + 5;
                        SC = SC - 5;
                        System.out.println("Your score is = " + score);
                        System.out.println("Computer Score is = " + SC);
                        //return ;
                    } else {
                        int computerMove = n1.FetchComputerTurn();
                        System.out.println("Computer moves " + computerMove);
                        elementsLeft = elementsLeft - computerMove;
                        System.out.println("Now only " + elementsLeft + " elementsLeft");
                        System.out.println("");
                        if (elementsLeft <= 0) {
                            System.out.println("***");
                            System.out.println("Computer wins the game!");
                            System.out.println("***");
                            score -= 5;
                            SC = SC + 5;
                            System.out.println("Your score is = " + score);
                            System.out.println("Computer Score is = " + SC);
                        }

                    }
                }
                while (elementsLeft > 0) {
                    int computerMove = n1.FetchComputerTurn();
                    System.out.println("Computer moves " + computerMove);
                    elementsLeft = elementsLeft - computerMove;
                    System.out.println("Now only " + elementsLeft + " elementsLeft");
                    System.out.println("");
                    if (elementsLeft <= 0)
                    {
                        System.out.println("***");
                        System.out.println("Computer wins the game!");
                        System.out.println("***");
                        score = score - 5;
                        SC = SC + 5;
                        System.out.println("Your score is = " + score);
                        System.out.println("Computer Score is = " + SC);
                    }
                    else
                    {
                        System.out.println("It's your turn now: Enter (1, 2 or 3) ");
                        int personMove = sc.nextInt();
                        while (personMove != 1 && personMove != 2 && personMove != 3) {
                            System.out.println("Please choose 1,2 or 3 only");
                            personMove = sc.nextInt();
                        }
                        elementsLeft = elementsLeft - personMove;
                        System.out.println("After your move!! the number of elements left: " + elementsLeft);
                        System.out.println("");
                        if (elementsLeft <= 0) {
                            System.out.println("***");
                            System.out.println("You win the game!");
                            System.out.println("***");
                            score = score + 5;
                            SC = SC - 5;
                            System.out.println("Your score is = " + score);
                            System.out.println("Computer Score is = " + SC);
                        }
                    }

                }
                System.out.println("Do You want to continue....   press y or n");
                conti = sc.next().charAt(0);
                if (conti != 'y' && conti != 'Y') {
                    System.out.println("GAME OVER!");
                    System.out.println("Your final score is = " + score);
                    System.out.println("Computer final Score is = " + SC);
                }

            }
        }

        }

