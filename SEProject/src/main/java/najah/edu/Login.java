package najah.edu;
import java.util.*;

public class Login {
	static ArrayList<String> users=new ArrayList<String>();
	static ArrayList<String> passwords=new ArrayList<String>();
	public Login(ArrayList<String> u,ArrayList<String> p)
	{
		for(int i=0;i<u.size();i++)
			users.add(u.get(i));
		for(int i=0;i<p.size();i++)
			passwords.add(p.get(i));
	}
	public int checkLoginStatus(String u,String p)
	{
		int one=1;
		int minusone=-1;
		for(int i=0;i<users.size();i++)
		{
			if(u.equals(users.get(i))&&p.equals(passwords.get(i)))
			{	
				System.out.println("Checking "+users.get(i)+" "+p);
				return one;
			}
		}
		return minusone;
	}
}
