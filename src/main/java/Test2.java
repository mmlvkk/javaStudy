import java.io.UnsupportedEncodingException;


public class Test2 {
	public static void main(String[] args) {
		try {
			String transcoding =  new String("鐨�".getBytes("GBK"),"UTF-8");
			String transcoding2 =  new String("的".getBytes("UTF-8"),"GBK");
			System.out.println(transcoding);
			System.out.println(transcoding2);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
