import java.util.Scanner;

class MarksChecker {
    public static void main(String args[])
    {
        System.out.println("Enter the marks of the student: ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks >= 75)
            System.out.println("Grade: A");
        else if (marks >= 65)
            System.out.println("Grade: B");
        else if (marks >= 50)
            System.out.println("Grade: C");
        else if (marks >= 35)
            System.out.println("Grade: S");
        else
            System.out.println("Grade: F");
    }
}