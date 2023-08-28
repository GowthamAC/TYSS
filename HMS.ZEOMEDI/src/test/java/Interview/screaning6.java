package Interview;

public class screaning6 {
static public  void main(String[] args) {
	String s="aa11bb22cc33dd";
	String s1="0";
	int prod=1;
	char []ch=s.toCharArray();
	for(int i=0;i<ch.length;i++){
	if(ch[i]>='0' && ch[i]<='9'){
	s1=s1+ch[i];
	}else{
		//System.out.println(s1);
	prod=prod*Integer.parseInt(s1.substring(1,s1.length()-1));
	s1="0";
	}
	}
	System.out.println(prod);
}
}