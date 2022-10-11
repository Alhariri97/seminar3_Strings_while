/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seminar3stringsandwhile;

import java.util.Scanner;

/**
 *
 * @author hariri
 */
public class Seminar3StringsAndWhile {

    /**
     * @param args the command line arguments
     */
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
//      1   
//    exercisesOutputs();
//      2
//    checkLength();
//      3
//    inputSting();
//      4
    middleNames();
//      5
//    validateSizeInput();
//      6
//    staffNumber();
//      7
//    fileExtension();
//      8
//     contentsPage();
    }

    public static void exercisesOutputs() {
        //1
        // Expected Output One
        String redHerring = "Baa, baa, black sheep";
        int a = redHerring.length();
        System.out.println(a); // 21
        // Expected Output Two
        String festival = "Christmas";
        System.out.println(festival.indexOf('s')); //4
        System.out.println(festival.lastIndexOf('s')); //8
        //Expected Output Three
        String fastfood = "pepperoni and mushroom pizza";
        System.out.println(fastfood.substring(0, 6)); //pepper
        System.out.println(fastfood.substring(14, 18)); //much
        // Expected Output Four
        String first = "Java is great!";
        String second = "Java is ";
        String third = "great!";
        second = second.concat(third);
        boolean result = first.equals(second);
        System.out.println(result); //true
        //Name the Method
        String name = "Kristin Scott Thomas";
        int firstSpace = name.indexOf(" ");
        int lastSpace = name.lastIndexOf(" ");
        String middelName = name.substring(firstSpace + 1, lastSpace);
        System.out.println(middelName); //Scott
    }

    public static void checkLength() {
        System.out.println("Write between 7 and 15 charecter :)");
        String input = keyboard.nextLine();
        if (input.length() <= 7 || input.length() >= 15) {
            System.out.println("Nohhh you have writtin " + input.length() + " charecter" + (input.length() == 1 ? "" : "s") + " :( ");
        } else {
            System.out.println("Well done! you are in the save range :)");
        }

    }

    public static void inputSting() {
        System.out.println("Enter the first name");
        String firstName = keyboard.next();  // 3.a
        System.out.println("your first word's length is " + firstName.length());
        System.out.println("Enter the second name");
        String secondName = keyboard.next(); // 3.a
        System.out.println("your second word's length is " + secondName.length());
        System.out.println(firstName.length() > secondName.length() ? secondName
                + // 3.4b
                " < " + firstName : firstName.length() == secondName.length()
                ? "They are the same length" : firstName + " < " + secondName);// 3.c
        System.out.println(firstName.toUpperCase()); // 3.d
        System.out.println(firstName); // 3.e No it does NOT effect the original it takes.
    }

    public static void middleNames() {
        System.out.println("Enter the full name e.i: 'Marcy ann Holby' ");
        String name = keyboard.nextLine();
//        int firstSpace = name.indexOf(" "); // 4.a
//        int lastSpace = name.lastIndexOf(" "); //4.b
//        String middelName = name.substring(firstSpace + 1, lastSpace); // 4.c
//        System.out.println(middelName); 
        System.out.println(name.substring(name.indexOf(" ") + 1, name.lastIndexOf(" ")));

    }

    public static void validateSizeInput() {
        System.out.println("Enter the size l for Large and s for Smal ");
        String letter = keyboard.next();
        if (letter.equalsIgnoreCase("l")) {
            System.out.println("You have chosen: Large");
        } else if (letter.equalsIgnoreCase("s")) {
            System.out.println("You have chosen: Small");
        } else {
            System.out.println("Invalid input :(");
        }
    }

    public static void staffNumber() {
        System.out.println("Enter the staff number! ");
        String number = keyboard.next();
        if (number.matches("^\\w\\d\\d$")) {
            System.out.println("Yes, that's a correct staff number :)");
        } else {
            System.out.println("Noh, it's invalid staff number");
        }
    }

    public static void fileExtension() {
        System.out.println("Enter the file name ! ");
        String name = keyboard.next();
        if (name.contains(".")) {
            if (name.contains("/")) {
                String fileName = name.substring(name.lastIndexOf("/") + 1, name.length());
                System.out.println(fileName);
                if (fileName.contains(".")) {
                    String extension = name.substring(name.lastIndexOf(".") + 1, name.length());
                    System.out.println("The file extension is: " + extension);
                } else {
                    System.out.println("The file has no extension");
                }
            } else {
                String extension = name.substring(name.lastIndexOf(".") + 1, name.length());
                System.out.println("The file extension is: " + extension);
            }
        } else {
            System.out.println("The file has no extension");

        }

    }

    public static void contentsPage() {
        Integer k = 9000;
        System.out.println(k.toString().length());
        System.out.println("Enter page width (not more than 50)! ");
        int width = keyboard.nextInt();

        System.out.println("Enter the chpter title ! ");
        String chpter = keyboard.nextLine();        
        System.out.println("Enter the page number ! ");
        int pageNumber = keyboard.nextInt();
        
        int numberOfRepeated = width - chpter.length();
        
        System.out.println(chpter+ "*".repeat(numberOfRepeated -4) + pageNumber);
    }
}
