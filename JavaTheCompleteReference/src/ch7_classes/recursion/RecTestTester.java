package ch7_classes.recursion;

public class RecTestTester {

	public static void main(String[] args) {

		RecTest ob = new RecTest(10);
		        
        for(int i=0; i<10; i++) 
        	ob.values[i] = i;
        
        ob.printArray(2);
        
	}

}
