import java.util.UUID;


public class Unicode {

	private String Unicode2Chinese(String strUnicode)
	{
	    String  splitString = "\\n";
	    System.out.println("\u9664\u51B0\u8F66");
	    System.out.println(strUnicode.split(splitString)[1]);


	

	    return null;
	}
	
	
	public static void main(String[] args) {
		Unicode u = new Unicode();
		System.out.println(u.Unicode2Chinese("\n9664\n51B0\n8F66"));
		UUID uuid = UUID.randomUUID();   
		  System.out.println (uuid.toString());  
		  System.out.println("cc54d63f37534694875e2e887e440b7f".length());
		  
		
	}
}
