 package Interview;

class a1{
	
public static void main(String[] args){
String s="aabbaacc";
char[] ch = s.toCharArray();
boolean[] b=new boolean [ch.length];
for (int i = 0; i < ch.length; i++) {
	int count=0;
	if(b[i]==false) {
	for (int j = i; j < ch.length; j++) {
		if(ch[i]==ch[j]) {
			count++;
			b[j]=true;
		}else {
			break;
		}
	}
	System.out.print(ch[i]);
	System.out.print(count+" ");
	}
}
}
}