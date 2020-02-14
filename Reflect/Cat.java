package less08;

public class Cat {
	int[][] arr=new int[1000][100000];
	
	@MyAnno2
	public String name = "Susleg";
	private String bread = "Krevedko";
	
	public Cat(String name) {
		this.name=name;
		System.out.println(name + " created");
	}
	public Cat(String name, String bread) {
		super();
		this.name = name;
		this.bread = bread;
	}
	public void methodPublicVoid() {
		System.out.println("methodPublicVoid");
	}
	public String methodPublicString() {
		System.out.println("methodPublicString");
		return "methodPublicString";
	}
	public String methodPublicString2(String name) {
		System.out.println("methodPublicString : "+name);
		return "methodPublicString";
	}
	
	private String methodPrivateString(String name,int age) {
		System.out.println(name+" : "+age);
		return "methodPublicString";
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", bread=" + bread + "]";
	}
	/*
	@Override
	protected void finalize() throws Throwable {
		System.out.println(name + " кря");
	}
	*/
}
