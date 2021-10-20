import java.util.*;
public class SciCalculator {
    //test test test
    //october 20th
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
// establishing most variables here just to be a little organized
        boolean mainLoop = true;
        boolean calculation;
        int calcNum = 0;
        double currentNum = 0;
        double firstOp;
        double secondOp;
        double sum = 0;
        double average;

// current result will always be 0.0 at the beginning of program and display menu
        System.out.println("Current Result: " + currentNum);

// first main loop too update values that aren't shown until average is displayed
        while(mainLoop){

            sum += currentNum;

            calcNum +=1;

// first main display
            System.out.println(" ");
            System.out.println("Calculator Menu");
            System.out.println("---------------");
            System.out.println("0. Exit Program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Logarithm");
            System.out.println("7. Display Average");
            System.out.println(" ");

//opens the second loop after it's closed from each case
            calculation = true;

// second loop responisble for taking inputs and completing math tasks
            while(calculation){

                System.out.print("Enter Menu Selection: ");
                int num = scan.nextInt();

// switch statement that separates each input option and corresponding action
// each case is fairly similar with the 7th/default case being the only exception
// each case performs the assigned math input
// at the end of each  case we make this second loop false forcing you to go back into the first loop

                switch(num){
                    case 0:
//making both cases false before breaking ultimately forces the system to skip both cases and end
                        calculation = false;
                        mainLoop = false;
                        System.out.println(" ");
                        break;

                    case 1:
                        System.out.print("Enter first operand: ");
                        firstOp = scan.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondOp = scan.nextDouble();
                        System.out.println(" ");
                        currentNum = firstOp + secondOp;
                        currentNum = Math.round(100*currentNum);
                        System.out.println("Current Result: " + currentNum/100 );
                        calculation = false;
                        break;

                    case 2:
                        System.out.print("Enter first operand: ");
                        firstOp = scan.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondOp = scan.nextDouble();
                        System.out.println(" ");
                        currentNum = firstOp - secondOp;
                        currentNum = Math.round(100*currentNum);
                        System.out.println("Current Result: " + currentNum/100 );
                        calculation = false;
                        break;

                    case 3:
                        System.out.print("Enter first operand: ");
                        firstOp = scan.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondOp = scan.nextDouble();
                        System.out.println(" ");
                        currentNum = firstOp * secondOp;
                        currentNum = Math.round(100*currentNum);
                        System.out.println("Current Result: " + currentNum/100 );
                        calculation = false;
                        break;

                    case 4:
                        System.out.print("Enter first operand: ");
                        firstOp = scan.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondOp = scan.nextDouble();
                        System.out.println(" ");
                        currentNum = firstOp / secondOp;
                        currentNum = Math.round(100*currentNum);
                        System.out.println("Current Result: " + currentNum/100 );
                        calculation = false;
                        break;

                    case 5:
                        System.out.print("Enter first operand: ");
                        firstOp = scan.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondOp = scan.nextDouble();
                        System.out.println(" ");
                        currentNum = Math.pow(firstOp, secondOp);
                        currentNum = Math.round(100*currentNum);
                        System.out.println("Current Result: " + currentNum/100 );
                        calculation = false;
                        break;

                    case 6:
                        System.out.print("Enter first operand: ");
                        firstOp = scan.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondOp = scan.nextDouble();
                        System.out.println(" ");
                        currentNum = Math.log(secondOp) / Math.log(firstOp);
                        currentNum = Math.round(100*currentNum);
                        System.out.println("Current Result: " + currentNum/100 );
                        calculation = false;
                        break;

                    case 7:
//if calcNum ==1 that means 0 calculations have been made resulting in an error message
                        if (calcNum == 1) {
                            System.out.println("Error: No calculations yet to average!");
                            System.out.println(" ");
                            break;
                        }
//subtract one because the # of calculations is ahead by one
                        calcNum-=1;
                        average = sum/calcNum;
//Math.round rounds the numbers to nearest int
//sum has already been multiplied by 100 in cases 1-6 so it isn't repeated here
// as a result average also isn't multipled by 100 since it would essentially be 100*100*average
                        sum = Math.round(sum);
                        calcNum = Math.round(100*calcNum);
                        average = Math.round(average);
                        System.out.println(" ");
                        System.out.println("Sum of calculations: " + (sum/100));
                        System.out.println("Number of calculations: " + (calcNum/100));
                        System.out.println("Average of calculations: " + (average/100));
                        break;
//default incase input doesnt match 0-7
                    default:
                        System.out.println(" ");
                        System.out.println("Error: Invalid selection!");
                        System.out.println(" ");
                        break;

                }


            }

        }

        System.out.println("Thanks for using this calculator. Goodbye! ");


    }
}
