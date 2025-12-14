package loops;

public class AmongstrongNumber {

	public static void main(String[] args) {
		int a = 153 ;
		int sum = 0;// 27, 125,153
		int temp = a;// 153,15,1,0
		int noOfDigits = 0;// 1 ,2 , 3
		while(temp>0) { // 153>0 , 15>0 , 1>0 , 0>0 F
			noOfDigits++; 
			temp=temp/10; // 153/10 = 15.3 = 15 , 15/10 = 1.5 = 1, 1/10 = 0.1 = 0
		}
		temp = a; // 153 >0 ,15>0;
		while(temp>0) {
			int r = temp%10;// r = 153 % 10 = 3,15%10 = 5 , 1%10 = 1 , 0>0F
			sum += Math.powExact(r, noOfDigits);// 0+(3 power 3) = 27 , 27 +(5 power 3) = 152, 125+(1 power 3 ) = 153 
			temp/=10; //153/10 = 15.3 = 15, 15/10 = 1.5=1, 1/10 = 0 
		}
			System.out.println("sum is : " + sum);
			
			if(a==sum) {
				System.out.println( a + " is a amongstorng number  ");
			}
			else {
				System.out.println( a + " is not amongstrorng number");
			}
		
		

	}

}
