/*
Find character case
Write a program to determine whether the entered character is in uppercase or lowercase, or is an invalid character.
Print
 1 for uppercase
 0 for lowercase 
-1 for any other character (special characters or others)
Input format :
Single Character
Output format :
1 or 0 or -1
Sample Input 1 :
v
Sample Output 1 :
0
Sample Input 2 :
V
Sample Output 2 :
1
Sample Input 3 :
#
Sample Output 3 :
-1
*/

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// Write your code here
Scanner s = new Scanner(System.in);
		char c = s.next().charAt(0);

        if (c >= 'a' && c <= 'z') {
        System.out.println(0);}
        else if (c >= 'A' && c <= 'Z') {
               System.out.println(1);
        }
        else {
        	System.out.println(-1);
        }
	}
}
