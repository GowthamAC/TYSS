package Interview;

public class screaning7 {
	public static void main(String args[]) {
		String s="abc123def456ghi789";  //capture only numbers in seperate.
		String[] num = s.split("[^\\d]+");   //  ,123,456,789
		String[] alpha = s.split("\\d+");    //abc,def,ghi
		String rev="";
		for (int i = 0; i < alpha.length; i++) {
			for (int j = 0; j < alpha[i].length(); j++) {
				rev=rev+alpha[i].charAt(j);
			}
			for (int k=num[i+1].length()-1; k>=0; k--) {
				rev=rev+num[i+1].charAt(k);
			}
		}
		System.out.println(rev);
		}
}