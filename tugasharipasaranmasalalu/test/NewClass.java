/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maeby
 */
import java.util.Scanner;

public class NewClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println("Hello world");
        //System.out.print("Masukkan input: ");
       // Scanner input = new Scanner(System.in);
        
       // String in = input.nextLine();
       // System.out.println(in);
        
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        int myInt = scanner.nextInt();
        scanner.close();

        //System.out.println("myString is: " + myString);
        //System.out.println("myInt is: " + myInt);
        System.out.println(myInt);
    
        //for(int i=0; i < 5; i++) {
         //   System.out.println(i);
        }
    }

