package classwork;
import java.util.Scanner;

public class daro{
	public static void main(String[] args) {
		

       Scanner scanner = new Scanner(System.in);
       String Roll[] = new String[4];
       String[] studentNames = new String[4];
       int[] Mark1 = new int[4];
       int[] Mark2 = new int[4];
       int[] Mark3 = new int[4];
       int[] totals = new int[4];
       char[]Result = new char[4];
       double[] averages = new double[4];
       String[] grades = new String[4];

       

       			
           for (int i = 0; i < 4; i++) {    	   
		   
           System.out.println("Enter details for Student " + (i + 1));
           
           System.out.print("Enter your Roll: ");
           Roll[i] = scanner.nextLine();
           
           System.out.print("Enter your name: ");
           studentNames[i] = scanner.nextLine();
           
           System.out.print("Enter your marks for Mark 1: ");
           Mark1[i] = scanner.nextInt();
           
           System.out.print("Enter your marks for Mark 2: ");
           Mark2[i] = scanner.nextInt();
           
           System.out.print("Enter your marks for Mark 3: ");
           Mark3[i] = scanner.nextInt();
           
           scanner.nextLine();
           
       
           
           totals[i] = Mark1[i] + Mark2[i] + Mark3[i];
           averages[i] = (double) totals[i] / 3;
           if (averages[i] >= 70 && averages[i] <= 100) {
               grades[i] = "A";
           } else if (averages[i] >= 50 && averages[i] < 70) {
               grades[i] = "B";
           } else if (averages[i] >= 0 && averages[i] <50) {
               grades[i] = "C";
           } else {
               grades[i] = "INVALID";
           }
           if (Mark1[i] <= 50 || Mark2[i] <= 50 || Mark3[i] <= 50) {
               Result[i] = 'F';
           } else {
               Result[i] = 'P';
           }
       }

       System.out.println("**************************");
       System.out.println("\t \t \t\tSTUDENT MARKLIST");
       System.out.println("**************************");
       System.out.printf("ROLL:\tSTUDENT NAME:\tMARK1:\tMARK2:\tMARK3:\tTOTAL:\tResult:\tAVERAGE:\tGRADE%n");

       
       for (int i = 0; i < 4; i++) {
           System.out.printf("%s\t%s\t\t%d\t%d\t%d\t%d\t%c\t%.2f\t\t%s%n",
                   Roll[i],studentNames[i], Mark1[i], Mark2[i], Mark3[i], totals[i],Result[i], averages[i], grades[i]);
       }

       scanner.close();}

}