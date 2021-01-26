class Main {

public static void main(String[] args) {
int totalNumber;
double numberBlue;
double numberBrown;
double numberGreen;
double numberOrange;
double numberRed;
double numberYellow;
double colorSum;
totalNumber = 55*11;
numberBlue = totalNumber * .24;
numberBrown = totalNumber * .13;
numberGreen = totalNumber * .16;
numberOrange = totalNumber * .20;
numberRed = totalNumber * .13;
numberYellow = totalNumber * .14;
colorSum = numberBlue + numberBrown + numberGreen + numberOrange + numberRed + numberYellow; 
    System.out.println("M&M Color Counts");
    System.out.println("blue: " + numberBlue);
    System.out.println("brown: " + numberBrown);
    System.out.println("green: " + numberGreen);
    System.out.println("orange: " + numberOrange);
    System.out.println("red: " + numberRed);
    System.out.println("yellow: " + numberYellow);
    System.out.println("Sum: " + colorSum);
if ( numberBlue > numberBrown && numberRed > numberOrange)
     System.out.println("Blue over Brown and Red over Orange");
if ( numberBrown <= numberGreen)
     System.out.println("Brown is less than or equal to Green");
if ( colorSum == totalNumber)
     System.out.println( "Numbers match");
  }
}