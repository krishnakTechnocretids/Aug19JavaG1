/*WAP to print as below:
Please enter number of rows needed for pattern:
5

*     
**    
***   
****  
***** 
 */
package DimpleB;
import java.util.Scanner;

public class Patternprogram2 
{
	private void printpattern(int rows) 
	{
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		int k=0;
		System.out.println();
		for(i=0;i<rows;i++)
		{
			for(k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			for(j=0;j<rows-i;j++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number of rows needed for pattern:");
		int num=sc.nextInt();
		Patternprogram2 pp2 = new Patternprogram2();
		pp2.printpattern(num);
		sc.close();
	}
}
