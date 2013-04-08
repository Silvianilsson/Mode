package blog;
public class blogginlagg {
	public String name;
	public String content;
	public kategory kat;
	public author aut;
	
	public void print()
	{
		System.out.println(name);
		aut.print();
		kat.print();
		
	}

}
