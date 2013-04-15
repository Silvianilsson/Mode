package blog;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class blog {
	public List <blogginlagg> Lista = new ArrayList<blogginlagg>();
	public String name;
	
	public List <author> authorLista = new ArrayList<author>();

	
	
	public void print()
	{
		System.out.println(name);
	
		for ( int i = 0; i < Lista.size() ;i++ )
		{
			System.out.println(Lista.get(i).name);
		}

	}
		
	public void file()
	{

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		String url = "jdbc:mysql://localhost:8889/Blogg";
		String user = "root";
		String password = "root";
		
		try {
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM blogginlag");

			while (rs.next()) {
				blogginlagg blo = new blogginlagg();
				blo.setName(rs.getString("name"));
				blo.setContent(rs.getString("content"));
				
				kategory a = new kategory();
				a.setName(rs.getString("kat"));
				blo.setKat(a);
				
				author o = new author();
				o.setName(rs.getString("Aut"));
				blo.setAut(o);

				Lista.add(blo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}
	
	public void authorfile()
	{

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		String url = "jdbc:mysql://localhost:8889/Blogg";
		String user = "root";
		String password = "root";
		
		try {
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM author");

			while (rs.next()) {
				author o = new author();
				o.setName(rs.getString("name"));
				o.setAge(rs.getString("age"));
				o.setEmail(rs.getString("email"));
			

				authorLista.add(o);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	


	}
}