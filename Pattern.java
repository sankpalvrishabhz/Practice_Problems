import java.util.*;
class Pattern
{
	public static boolean isValid(String s)
	{
		Deque<Character> ss=new ArrayDeque<Character>();
		for(int i=0;i<s.length();i++)
		{
			char s1=s.charAt(i);
			if (s1=='(' || s1=='[' || s1=='{')
			{
				ss.push(s1);
				continue;
			}
			if(ss.isEmpty())
				return false;
			char check;
			switch(s1)
			{
				case ')': check=ss.pop();
					if(check=='[' || check=='{')
						return false;
				break;
				case ']':check=ss.pop();
					if(check =='(' || check=='{')
						return false;
				break;
				case '}':check =ss.pop();
					if(check=='(' || check=='[')
						return false;
				break;
		        }
		}
		return (ss.isEmpty());
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the series:");
		String str=sc.nextLine();
		if (isValid(str))
			System.out.println("Valid ");
		else
			System.out.println("Not valid ");
	}
}