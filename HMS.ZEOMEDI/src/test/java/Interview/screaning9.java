package Interview;

class screaning9 {
public static void main(String[] args) throws InterruptedException {
	String s="i am selenium";  //m ui nelesmai
	String rev="";
	for(int i=s.length()-1;i>=0;i--){
		rev=rev+s.charAt(i);			
	}
	
    rev=rev.replace(" ", "");
    String[] st = rev.split("");

int count=0;
for (int i = 0; i < s.length(); i++) {
	if (s.charAt(i)!=' ') {
		System.out.print(st[count]);
		count++;
	}else {
		System.out.print(s.charAt(i));
	}
}
}
}

