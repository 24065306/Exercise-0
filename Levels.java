
import java.util.Scanner;

public class Levels{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the marks for your student: ");
    int marks = scanner.nextInt();

    if (marks >= 90) {
      System.out.println("Out-standing!");
    } else if (marks >= 70) {
      System.out.println("Excellent!");
    } else if (marks >= 50) {
      System.out.println("Pass!");
    } else {
      System.out.println("Fail!");
    }
  }}