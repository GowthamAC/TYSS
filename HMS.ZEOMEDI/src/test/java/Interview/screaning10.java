package Interview;

public class screaning10 {
	public static void main(String[] args) {
		String s="ab10c10d20ef3";
		String[] num = s.split("[^\\d]+");
		int prod=1;
		for (int i = 1; i < num.length; i++) {
			prod=prod*Integer.parseInt(num[i]);
		}
		System.out.print(prod);
	}
}
