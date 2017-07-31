package basics;

public class Compare {

	public Compare(String a,String b) {
		// TODO Auto-generated constructor stub
		int count=0;
		if(a.length()==b.length())
		{
			for(int i=0;i<a.length();i++)
			{
				if(a.charAt(i)==b.charAt(i))
				{
					count++;
				}
				else
				{
					break;
				}
			}
			if(count==a.length())
			{
				System.out.println("Given String is equal");
			}
			else
			{
				System.out.println("Given String is not equal");
			}
		}
		else
		{
			System.out.println("Given String is not equal");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Compare("Ram","Pooja");
	}

}
