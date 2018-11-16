import java.util.Scanner;
public class Main 
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);

  System.out.println("The Cosmos, enter your name to continue");

  String name = sc.nextLine();

  System.out.println("Welcome " + name + ".\n Which planet first, Venus, Mars, or Saturn");

  String planetw = sc.next(); 
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
  System.out.println("You have found a lab"); 
} else if (decision1.equals("leave")) {
  System.out.println("Can not leave Venus until propulsion system is fixed");
}

}
      }
