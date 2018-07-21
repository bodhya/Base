package ch3_dataTypes_Variables_Arrays;

public class arrays {

	public static void main(String[] args) {

		int month_days[];
	    month_days = new int[12];
	    month_days[0] = 31;
	    month_days[1] = 28;
	    month_days[2] = 31;
	    month_days[3] = 30;
	    month_days[4] = 31;
	    month_days[5] = 30;
	    month_days[6] = 31;
	    month_days[7] = 31;
	    month_days[8] = 30;
	    month_days[9] = 31;
	    month_days[10] = 30;
	    month_days[11] = 31;
	    
	    System.out.println("April has " + month_days[3] + " days.");
	    
	    
	    //Using Array Initializer
	    double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
	    double result = 0;
	    int i;
	    
	    for(i=0; i<5; i++)
	        result = result + nums[i];
	    System.out.println("Average is " + result / 5);
	    
	    //Multi-Dimesional Arrays
	    int twoD[][] = new int[4][5];		//This allocates a 4 by 5 array and assigns it to twoD 
	    int p, q, r = 0;
	    for(p=0; p<4; p++)
	    	for(q=0; q<5; q++) {
	    		twoD[p][q] = r;
	    		r++; 
	    	}
	    
	    for(p=0; p<4; p++) {
	    	for(q=0; q<5; q++)
	    		System.out.print(twoD[p][q] + " ");
	    	System.out.println();
	    }
	    
	      
	}

}
