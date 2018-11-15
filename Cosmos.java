import java.util.Scanner;
public class Cosmos 
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);

  System.out.println("Enter The Cosmos, enter your name to continue");

  String name = sc.nextLine();

  System.out.println("Welcome " + name + ".\n Which planet first, Venus, Mars, or Saturn");

  String planetw = sc.next(); 
  if (planetw.equals ("Venus")) {
     System.out.print("Course mapped for Venus"); }
     else if (planetw.equals ("Mars")) {
       System.out.print("Course mapped for Mars"); } 
      else if (planetw.equals ("Saturn")) {
        System.out.print("Course mapped for Saturn"); }
        else {
          System.out.println("Have not disovered " + planetw + " yet");}

  
      }
     }