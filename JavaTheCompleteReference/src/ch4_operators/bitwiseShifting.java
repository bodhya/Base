package ch4_operators;

public class bitwiseShifting {

	public static void main(String[] args) {
		
		/*
	     * 64 is 0100 0000
	     * Left shifting it twice results in 1 0000 0000 which is 256
	     * Dropping out the top 3 bytes gives 00 0000 which is 0  
	    */
		byte a = 64, b;
	    int i;
	    
	    i = a << 2;
	    b = (byte) (a << 2);
	    
	    System.out.println("Original value of a: " + a);
	    System.out.println("i and b: " + i + " " + b);
	    
	    
	    
	    /*
	     * Left shifting as a shortcut to multiply by 2
	     * However, if you set the higher order bit, the value becomes -ve
	    */
	    int j;
	    int num = 0xFFFFFFE;
	    
	    for(j=0; j<4; j++) {
	      num = num << 1;
	      System.out.println(num);
	    }
	    
	    /*
	     * Right shifting as a shortcut to divide by 2, and discarding the remainder
	     */
	    int p = 32;
	    p = p >> 2;
	    System.out.println("p : " + p);
	    
	    
	    /*
	     * Sign-extension during right shifts of negative numbers
	     */
	    int q = -9;
	    q = q >> 1;
	    System.out.println("q : " + q);
	    
	    
	    /*
	     * Unsigned Right Shift
	     * r is -1 or 11111111 11111111 11111111 11111111
	     * shifted 24 times, with 0s being brought in on the higher order bits
	     * results in r being 00000000 00000000 00000000 11111111, which is 255
	     */
	    int r = -1;
	    r = r >>> 24;
	    System.out.println("r : " + r);

	    
	    /*
	     * Unsigned right shift of byte values - Unexpected behavior
	     */
	    char hex[] = {
	             '0', '1', '2', '3', '4', '5', '6', '7',
	             '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
	           };
	    byte m = (byte) 0xf1;
	    byte n = (byte) (m >> 4);
	    byte o = (byte) (m >>> 4);
	    byte s = (byte) ((m & 0xff) >> 4);
	    
	    System.out.println("              m = 0x" + hex[(m >> 4) & 0x0f] + hex[m & 0x0f]);
	    System.out.println("         m >> 4 = 0x" + hex[(n >> 4) & 0x0f] + hex[n & 0x0f]);
	    System.out.println("        m >>> 4 = 0x" + hex[(o >> 4) & 0x0f] + hex[o & 0x0f]);
	    System.out.println("(m & 0xff) >> 4 = 0x" + hex[(s >> 4) & 0x0f] + hex[s & 0x0f]);
	
	}

}
