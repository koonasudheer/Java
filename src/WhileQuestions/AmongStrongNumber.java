package WhileQuestions;

public class AmongStrongNumber {

	public static void main(String[] args) {
		int n  = 1634 ;
		int sum = 0;                                            // 256 , 337, 1633 , 1634  
		int noOfDigits = 0;                                     // 1 , 2 , 3 ,4
		
		int temp = n;                                          //1634 , 163, 16 , 1 , 0 
		while(temp>0) {                                       // 1634>0, 163 >0 ,16>0, 1>0 , 0>0 F
			noOfDigits++;
			temp = temp/10;                                  // 1634/10 = 163.4 = 163, 163/10 = 16.3 = 16, 16/10 = 1.6 = 1, 1/10 = 0.1 =0
			
		}
		 temp = n;                                         // 1634 , 163 , 16 , 1
		 while(temp>0) {                                  // 1634>0 ,  163>0 , 16 > 0 , 1 >0 , 0>0 Fail.
			 int r=temp%10;                              // 1634%10 = 4 , 163%10 = 3 , 16%10 = 6 , 1%10 = 1
 			 sum+=Math.powExact(r, noOfDigits);         // 0+( 4 power 4 ) = 256, 256+( 3 power 4 ) = 337 , 337+( 6 power 4) = 1,633, 1,633 + (1 power 4 ) = 1634
			 temp/=10;                                 // 1634/10 = 163.4 = 163, 163 /10 = 16.3 = 16  , 16/10 = 1.6 = 1, 1/10 = 0.1 = 0, 
		 }
		 System.out.println(sum + " is ");            // sum = 1634
		 
		 if (n==sum) {                               // 1634 == 1634
			 System.out.println(n + " is a AmongStrong nummber");
		 }
		 else {
			 System.out.println( n+ " is not a AmongStrong number ");
		 }

	}

}
