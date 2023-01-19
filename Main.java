import java.util.*;
public class Main
{
    static int grades[] = {95,93,96,92,92,98,91,97};
    
	public static void main(String[] args) {
	    Scanner output = new Scanner(System.in);
	    
	    String Line = "----------------------------------------";
		System.out.print("Name : ");
		String name = output.nextLine();
		System.out.print("Section : ");
		String section = output.nextLine();
		System.out.println(Line);
		System.out.println("Subjects:                          Grades :");
		
		String subject[] = {"Computer programming               ", "Introduction to computing          ", "National Service Training Program  ","Understanding The self             ","The Contemporary World             ","Physical Education                 ","The Entreprenurial Mind            ","Euthenics                          "};
		for (int i = 0; i < subject.length;i++){
		    System.out.println(subject[i]+""+grades[i]);
		}
		gwa();
	}
	static void gwa(){
	    String Line = "----------------------------------------";
	    int sum = 0;
	    int i;
	    
	    for (i = 0; i < grades.length; i++){
	    sum += grades[i];
	        
	    }
	    double gwa = sum/grades.length;
	    System.out.println(Line);
	    System.out.println("GWA: "+gwa);
	    if (gwa > 75){
	        System.out.print("Remarks: ");
	        System.out.println("You pasado.");
	    } else if (gwa > 0 && gwa < 75){
	        System.out.println("You bagsak.");
	        
	    } else if (gwa < 0) {
	        System.out.println("Please retry again.");
	    } 
	}
	
}

