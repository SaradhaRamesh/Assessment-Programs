package Sep_10;

public class Stringrotation {
public static boolean check(String str1, String str2) {
	if (str1.length()!=str2.length())
		return false;
	String str3=str1+str2;
	if(str3.contains(str2))
		return true;
	else
		return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="abcde";
		String str2="deabc";
		if (check(str1,str2))
			System.out.print("yes "+str2+" is rotation of "+str1);
			else
				System.out.print("yes "+str2+" is not a rotation of "+str1);
		
	

}}
