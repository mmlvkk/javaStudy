package test.parameters;

public class Abean {
	private String name ="f";
	private String password;
	private Aperson person;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Aperson getPerson() {
		return person;
	}
	public void setPerson(Aperson personf) {
		personf = new Aperson();
		personf.setCard("123131321");
		this.person = personf;

	}
	
	
	public static void main(String[] args) {
		
		Aperson p = new Aperson();
		p.setCard("130682198601140037");
		p.setChild("nnn");
		p.setWife("mm");
		
		Abean a = new Abean();
		String str = "wk";
		a.setName(str);
		a.setPassword("pass");
		a.setPerson(p);
		
		System.out.println(a.getName());
		a.setName("wangkang");
		System.out.println(a.getName());
		
		a.name= "wkk";
		System.out.println(a.getName() + "|||" + a.name);
		
		System.out.println(a.getPerson().getCard());
		p.setCard("wdfs");
		
		System.out.println(a.getPerson().getCard());
		System.out.println(a.getPerson().getChild());
		
		
		
		String aa = "lll";
		String bb =aa;
		System.out.println(aa + "   " + bb);
		aa = "kkkk";
		System.out.println(aa + "   " + bb);
		
	}
	
	

}
