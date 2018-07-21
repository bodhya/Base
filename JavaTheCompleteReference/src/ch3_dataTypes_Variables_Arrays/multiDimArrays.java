package ch3_dataTypes_Variables_Arrays;

public class multiDimArrays {

	public static void main(String[] args) {
		
	    //Allocating second dimension separately (additionally this array is irregular)
		int twoD[][] = new int[4][];
	    twoD[0] = new int[1];
	    twoD[1] = new int[2];
	    twoD[2] = new int[3];
	    twoD[3] = new int[4];
	    
	    int i, j, k = 0;
	    for(i=0; i<4; i++)
	    	for(j=0; j<i+1; j++) {
	    		twoD[i][j] = k;
	    		k++;
	    	}
	    
	    for(i=0; i<4; i++) {
	    	for(j=0; j<i+1; j++)
	    		System.out.print(twoD[i][j] + " ");
	    	System.out.println();
	    }
	    
    	System.out.println("\n\n");

	    //Initializing MultiDim Arrays
	    double m[][] = {
	    		{ 0*0, 1*0, 2*0, 3*0 },
	    		{ 0*1, 1*1, 2*1, 3*1 },
	    		{ 0*2, 1*2, 2*2, 3*2 },
	    		{ 0*3, 1*3, 2*3, 3*3 }
	    };
	    
	    int p, q;
	    for(p=0; p<4; p++) {
	    	for(q=0; q<4; q++)
	    		System.out.print(m[p][q] + " ");
	    	System.out.println();
	    }
	    
	    
	}
}
