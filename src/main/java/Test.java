
public class Test {
	
	public synchronized  void test() {
		System.out.println("ffffffffffff");
	}
	
	
	       public static void mainss(String[] args)
	      {
	    	   int yy= 0xfe & 0xff ;
	    	  
	    	   System.out.println(Integer.toBinaryString(yy));
	    	   
	    	   int k= -2 & 0xff;
	    	   System.out.println(Integer.toBinaryString(k));
	    	   
	    	   int g= -2%256;
	    	   System.out.println(Integer.toBinaryString(g));
	    	   
	    	   byte f= (byte)(0xFE & 0xff);
	    	   System.out.println(f);
	    	   
	    	   byte aa=-2;
	    	   System.out.println(aa & 0xff);
//	          byte b = 0;
//	         for ( int i = 0; i <= 0xff; ++i )
//	          {
//	             b = (byte)i;
//	             System.out.println(Integer.toBinaryString(i));
//	             System.out.print(" "+i+":"+b+", ");
//	          }
	    	   
	    	   
	    	   char  yyy='a';
	    	   System.out.println((int)(yyy));
	    	   
//	    	   hexTest();
	    	   stringTransferByte();
	      }
	       
	       public static void hexTest() {
	    	   byte c = -2;
	    	   System.out.println(Integer.toHexString(0x23C8 & 0xff));
	    	   System.out.println(Integer.toHexString(c));
	    	   
	       }
	       
	       public static void stringTransferByte() {
	    	   System.out.println(Byte.parseByte("01"));
	    	   
	       }
	       
	       public static void main(String[] args) {
			int i=2-1;
			double k =2;
			System.out.println((double)i);
			System.out.println(k-i);
			
			try {
				int llll = 5/0;
			} catch (Exception e) {
//				e.printStackTrace();
				System.out.println("test 1");
			}
			try {
				Thread.sleep(10000);
				System.out.println("llllllllllll");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				int all = 10/0;
			} catch (Exception e) {
//				e.printStackTrace();
				System.out.println("test 2");
			}
			
			try {
				Thread.sleep(10000);
				System.out.println("fffffffffffffffffffff");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		}


}
