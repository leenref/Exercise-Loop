import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
     /*   1.Write a program that prints the numbers from 1 to 100 such that:
        If the number is a multiple of 3, you need to print "Fizz" instead of that
        number.
                If the number is a multiple of 5, you need to print "Buzz" instead of that
        number.
                If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
        instead of that number.*/
        System.out.println("#Q 1");

        for ( i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        System.out.println("------------------------------");



        /*2.Write a Java program to reverse a string.
        Test Data: Input a string: The quick brown fox Expected Output: Reverse
        string: xof nworb kciuq ehT*/
         System.out.println("#Q 2");

        System.out.println("#Enter a sentence to reverse: ");
        String sentence= scan.nextLine();
        String reversed="";

        //Using for loop
        for( i=sentence.length()-1; i>=0; i--){
            reversed += sentence.charAt(i);
        }

        System.out.println("The reversed sentence is: "+reversed);


        //Using StringBuilder class reverse method
        String reversedMethod=new StringBuilder(sentence).reverse().toString();
        System.out.println("The reversed sentence is: "+reversedMethod);
        System.out.println("------------------------------");


        /*3.Write a program to find the factorial value of any number entered
        through the keyboard.*/
         System.out.println("#Q 3");

        System.out.println("Enter a number to find the factorial value: ");
        int number=scan.nextInt();
        long factorialNum=1;
        if(number < 0){
            System.out.println("You can't enter a negative number");
        }else if(number == 0){
            System.out.println("The factorial of 0 is 0");
        }else{
            for ( i = 1; i <= number; i++) {
                factorialNum *= i;
            }
            System.out.println("The factorial is: "+factorialNum);
        }
        System.out.println("------------------------------");



        /*4.Two numbers are entered through the keyboard. Write a program to find
        the value of one number raised to the power of another. (Do not use Java
        built-in method)*/
        System.out.println("#Q 4");

        System.out.println("Enter the base number: ");
        int base = scan.nextInt();

        System.out.println("Enter the exponent number to the base: ");
        int exponent = scan.nextInt();

        long powerNum = 1;

        for ( i = 0; i < exponent; i++) {
            powerNum *= base;
        }

        System.out.println(base + "^" + exponent + " = " + powerNum);
        System.out.println("------------------------------");






        /*5.Write a program that reads a set of integers, and then prints the sum of
        the even and odd integers.*/
        System.out.println("#Q 5");

        int inputNum = 0, OddNums = 0, EvenNums = 0 ;

        System.out.print("How many numbers you want to input for the sum: ");
         int numbersAmount = scan.nextInt();

         i=0;
        while(i <= numbersAmount)
        {
            i++;
            System.out.print("Enter a number: ");
            inputNum = scan.nextInt();

            if (inputNum % 2 == 0)
            {
                EvenNums += inputNum;
            }

            if(inputNum % 2 == 1)
            {
                OddNums += inputNum;
            } if(i == numbersAmount)
            {
                break;
            }
        }
            System.out.println("Sum of even numbers is: " + EvenNums);
            System.out.println("Sum of odd numbers is: " + OddNums);
            System.out.println("------------------------------");



        /*6.Write a program that prompts the user to input a positive integer. It
        should then output a message indicating whether the number is a prime
        number.*/
         System.out.println("#Q 6");

        System.out.println("Enter a positive number to chick if it is prime: ");
        int posNumber = scan.nextInt();
        scan.nextLine();

        if (posNumber <= 1) {
            System.out.println("Number " + posNumber + " is not a prime number");
        } else {
            boolean isPrime = true;
            for ( i = 2; i <= Math.sqrt(posNumber); i++) {
                if (posNumber % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Number " + posNumber + " is a prime number");
            } else {
                System.out.println("Number " + posNumber + " is not a prime number");
            }
        }
        System.out.println("------------------------------");


        /*7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
        another for loop to print the days (Days 1 -7) for each week....*/
        System.out.println("#Q 7");

        for (int week = 1; week <= 4; week++) {
            System.out.println("Week " + week);
            // Inner loop for days
            for (int day = 1; day <= 7; day++) {
                System.out.println("Day " + day);
            }
        }
        System.out.println("------------------------------");


        /*8.Write a program that check if the word is a palindrome or not. hint: A
        string is said to be a palindrome if it is the same if we start reading it from
        left to right or right to left.*/
        System.out.println("#Q 8");

        System.out.println("Enter a word to chick if it is palindrome:");
        String word = scan.nextLine();

        String cleanedWord = word.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;
        for ( i = 0; i < cleanedWord.length() / 2; i++) {
            if (cleanedWord.charAt(i) != cleanedWord.charAt(cleanedWord.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a palindrome");
        } else {
            System.out.println("The word \"" + word + "\" is not a palindrome");
        }
        System.out.println("------------------------------");
    }

}