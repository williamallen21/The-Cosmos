import java.util.Scanner;
public class Main 
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);

  System.out.println("The Cosmos, enter your name to continue");

  String name = sc.nextLine();

  System.out.println("Welcome " + name + ".\n Which planet first, Venus, Mars, or Saturn");

  String planetw = sc.nextLine(); 
  if (planetw.equals ("Venus")) {
     System.out.println("Course mapped for Venus \n *** While trying to land your propulsion system was knocked off line *** \n Do you want to (search) (leave) "); }
     else if (planetw.equals ("Mars")) {
       System.out.println("Course mapped for Mars"); } 
      else if (planetw.equals ("Saturn")) {
        System.out.println("Course mapped for Saturn"); }
        else {
           System.out.println("Have not disovered " + planetw + " yet");}

String decision1 = sc.nextLine();
if (decision1.equals("search")) {
  System.out.println("You have found a lab \n Do you want to (fix) (search) "); 
} else if (decision1.equals("leave")) {
  System.out.println("Can not leave Venus until propulsion system is fixed");
}

String decision2 = sc.nextLine();
if (decision2.equals("fix")) {
  System.out.println("Propulsion system repaired \n Do you want to (move) (leave)"); 
} else if (decision2.equals("search")) {
  System.out.println("Nothing new to discover");
}
  String decision3 = sc.nextLine();
if (decision3.equals("move")) {
  System.out.println("You have found a new alien species \n Do you want to (fight) (leave)"); 
} else if (decision3.equals("leave")) {
  System.out.println("Which planet first, Venus, Mars, or Saturn");
}

  String decison4 = sc.nextLine();
  if (decison4.equals("fight")) {
    System.out.println("You have died");
  } else if (decison4.equals("leave")) {
  System.out.println("Which planet first, Venus, Mars, or Saturn");
} 
  }
}
