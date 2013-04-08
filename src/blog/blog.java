package blog;
import java.util.ArrayList;
import java.util.List;

public class blog {
	public List <blogginlagg> Lista = new ArrayList<blogginlagg>();
	public String name;
	
	
	public void print()
	{
		System.out.println(name);
	
		for ( int i = 0; i < Lista.size() ;i++ )
		{
			System.out.println(Lista.get(i).aut.name);
		}

	}
		


}
