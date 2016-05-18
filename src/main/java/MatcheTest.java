
public class MatcheTest {
	
	public boolean testMsg() {
		String str="12346578";
		
		return str.matches("[0-9]{8}");
	}
	public static void main(String[] args) {
		MatcheTest t = new MatcheTest();
		System.out.println(t.testMsg());
	}
	

}
