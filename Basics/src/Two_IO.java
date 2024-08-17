import java.util.Scanner;

public static void main(String[] args) {
    //--------------------input methods--------------------
    //1)Using Scanner
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter name:");
    String name = sc.nextLine();
    System.out.println("Name = " + name);

    System.out.println("Enter roll number:");
    int rollNumber = sc.nextInt();
    //similarly you can use it for byte, short, float and double
    System.out.println("Roll number = " + rollNumber);

    //2)using console
    System.out.println("Enter newName");
    String newName = System.console().readLine();
    System.out.println("newName = " + newName);

    System.out.println("Enter phone number:");
    int phoneNumber = Integer.parseInt(System.console().readLine());
    System.out.println("Your phone number is " + phoneNumber);
}