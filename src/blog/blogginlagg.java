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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public kategory getKat() {
		return kat;
	}

	public void setKat(kategory kat) {
		this.kat = kat;
	}

	public author getAut() {
		return aut;
	}

	public void setAut(author aut) {
		this.aut = aut;
	}

}
