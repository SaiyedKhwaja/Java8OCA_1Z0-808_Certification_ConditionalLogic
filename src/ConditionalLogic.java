import java.util.Scanner;

public class ConditionalLogic {
    public static void main(String[] args) {

        preAndPostDifference();

        booleanLogicShortCircuitOps();

        booleanBitwiseOps();

        compareStrings();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the film certification (e.g., 18, 12, 15): ");
        int filmCertification = scanner.nextInt();

        System.out.println("Enter the age of the person seeking admittance:");
        int personAge = scanner.nextInt();

        boolean canWatch = admitToFilm(filmCertification,personAge);

        System.out.println("Can the person watch the file? " + canWatch);

        switchVowelOrConsonant();

        ifMonth();

        ifGrade();

        switchMathOperation();

        ifTemperature();

        switchDaysInMonth();
    }

    private static void switchDaysInMonth() {
        Scanner scanner = new Scanner(System.in);
        int numDays = 0;
        final int JAN=1, FEB=2, MAR=3,APR=4,MAY=5,JUN=6,JUL=7,AUG=8,SEP=9,OCT=10,NOV=11,DEC=12;

        System.out.print("Enter a month (1-12): ");
        int month = scanner.nextInt();

        switch (month)
        {
            case JAN:
            case MAR:
            case JUL:
            case AUG:
            case OCT:
            case DEC:
                numDays=31;
                break;
            case APR:
            case JUN:
            case SEP:
            case NOV:
                numDays = 30;
                break;
            case FEB:
                System.out.print("Enter a year: ");
                int year = scanner.nextInt();

                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    numDays = 29; // Leap year
                } else {
                    numDays = 28; // Non-leap year
                }
                break;
            default:
                System.out.println("Invalid month entered.");
                numDays = -1; // Invalid month
        }

        if (numDays != -1) {
            System.out.println("The number of days in the month is: " + numDays);
        }
    }

    private static void ifTemperature() {
        Scanner scanner = new Scanner(System.in);
        int temperature=0;

        System.out.print("Enter a temperature: ");
        temperature = scanner.nextInt();

        if(temperature <=0)
        {
            System.out.println("Cold");
        }
        else if(temperature > 0 && temperature < 15)
        {
            System.out.println("a little cold but ok");
        }
        else if(temperature >= 15 && temperature < 20)
        {
            System.out.println("mild");
        }
        else if(temperature >= 20 && temperature < 25)
        {
            System.out.println("warm");
        }
        else if(temperature >= 25 && temperature < 30)
        {
            System.out.println("very warm");
        }
        else
        {
            System.out.println("hot");
        }

    }

    private static void switchMathOperation() {
        Scanner scanner = new Scanner(System.in);

        double answer = 0.0;
        boolean operationOK = true;

        System.out.print("Enter a number 1: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter a number 2: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter '+','-','*' or '/': ");
        char operation = scanner.next().charAt(0);

        switch (operation)
        {
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num2 - num1;
                break;
            case '*':
                answer = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    answer = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    operationOK = false;
                }
                break;
            default:
                operationOK=false;
                break;
        }
        if(operationOK) {
            System.out.println("The answer is " + answer);
        } else
            System.out.println("Unknown mathematical operator");

    }

    private static void ifGrade() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a mark (0-100): ");
        int mark = scanner.nextInt();

        if (mark < 0 || mark > 100) {
            System.out.println(mark + " is not a valid.");
        } else {
            if(mark >=70 && mark <=100)
            {
                System.out.println("A");
            } else if (mark >=60 && mark < 70) {
                System.out.println("B");
            } else if (mark >= 50 && mark < 60) {
                System.out.println("C");
            } else if (mark >= 40 && mark < 50) {
                System.out.println("D");
            } else {
                System.out.println("Fail");
            }
        }
    }

    private static void ifMonth() {
        Scanner scanner = new Scanner(System.in);
        final int JAN=1, FEB=2, MAR=3,APR=4,MAY=5,JUN=6,JUL=7,AUG=8,SEP=9,OCT=10,NOV=11,DEC=12;

        System.out.print("Enter a month (1-12): ");
        int month = scanner.nextInt();

        if(month==JAN)
            System.out.println("January");
        else if(month==FEB)
            System.out.println("February");
        else if(month==MAR)
            System.out.println("March");
        else if(month==APR)
            System.out.println("April");
        else if(month==MAY)
            System.out.println("May");
        else if(month==JUN)
            System.out.println("June");
        else if(month==JUL)
            System.out.println("July");
        else if(month==AUG)
            System.out.println("August");
        else if(month==SEP)
            System.out.println("September");
        else if(month==OCT)
            System.out.println("October");
        else if(month==NOV)
            System.out.println("November");
        else if(month==DEC)
            System.out.println("December");
        else
            System.out.println(month + " is out of range");

    }

    private static void switchVowelOrConsonant() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char letter = scanner.next().charAt(0);

        if(((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')))
        {
            switch (Character.toLowerCase(letter)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(letter + " is a vowel");
                    break;
                default:
                    System.out.println(letter + " is a consonant");
                    break;
            }
        }
        else
        {
            System.out.println("Error: " + letter + " is not a valid letter.");
        }
    }


    private static boolean admitToFilm(int filmCertification, int personAge) {
        return personAge > filmCertification;
    }

    private static void compareStrings() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string1 : ");
        String s1 = scanner.next();

        System.out.print("Enter string1 : ");
        String s2 = scanner.next();

        System.out.println("Compare s1 & s2 using == operator : " + s1 == s2);

        System.out.println("Compare s1 & s2 using equals() operator : " + s1.equals(s2));

       /* == compares references (memory addresses), and it can give different results depending on whether
                   the strings refer to the same object.
        equals() compares the contents of the strings, so it will return true if the characters are the same,
                regardless of whether the strings are stored in the same memory location.*/
    }

    private static void booleanBitwiseOps() {
        boolean a = false;
        boolean b = false;

        int x = 3;

        if(x < 0 & (b=true)) {}

        // output true;
        System.out.println(b);

        if(x > 0 | (b=true)) {}

        // output true;
        System.out.println(b);

        /*The & and | operators always evaluate both operands, so the assignment (b = true) occurs in both cases.
        Therefore, b is set to true before printing in both statements.*/
    }

    private static void booleanLogicShortCircuitOps() {
        boolean a = false;
        boolean b = false;

        int x = 3;

        if(x < 0 && (b=true)) {}

        // output false; first condition is false; && if both left & right condition must be true. It does not check second part pf the condition!
        System.out.println(b);

        if(x > 0 || (b=true)) {}

        // output false; first condition is satisfied and does not check second part pf the condition!
        System.out.println(b);
    }

    private static void preAndPostDifference() {
        int x = 5;
        int y = 10;

        System.out.println("The value of x is " + x); // output 5
        System.out.println("The value of ++x is " + ++x); // output 6
        System.out.println("The value of x++ is " + x++); //output 6
        System.out.println("The value of x is " + x); // output 7

        System.out.println("The value of y is " + y); // output 10
        System.out.println("The value of --y is " + --y); // output 9
        System.out.println("The value of y-- is " + y--); //output 9
        System.out.println("The value of y is " + y); // output 8

    }
}
