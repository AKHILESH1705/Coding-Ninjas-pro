/*
Find average Marks
Write a program to input name (as a single character) and marks of three tests of a student (all integers). Then calculate and print the name and average (integer) of best two test marks.
All the test marks are integers and calculate average also as integer. That is, you need to print the integer part of average only, neglect the decimal part.
Input format :
Line 1 : Name (Single character)
Line 2 : 3 Test marks (separated by space)
Output format :
Name Average (separated by space)
Sample Input 1 :
A
3 4 6
Sample Output 1 :
A
4
Sample Input 2 :
T
7 3 8
Sample Output 2 :
T
6 
*/
import java.util.Scanner;
public class Average_Program {
	

public static void main(String[] args) {
			// Write your code here
	 Scanner s = new Scanner(System.in);
	    
	    String str = s.next();
	    char ch = str.charAt(0);
	    int a,b,c;
	    a = s.nextInt();
	    b = s.nextInt();
	    c = s.nextInt();
	    int average = (a+b+c)/3;
	    System.out.println(ch);
	    System.out.println(average);

			
		}
	}
			

