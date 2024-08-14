package Interview;

public class countonlysucessive {
	
public static void main(String[] args) {
		String s="wwwwtroopswwh";  //w4 t1 r1 o2 p1 s1 w2 h1
		char[] ch = s.toCharArray();
		
			try {
				for (int i = 0; i < ch.length; i++) {
					int count=1;
					for (int j = 0; j < ch.length; j++) {
					if (ch[i]==ch[++i]) {
						count++;
					} else {
				    System.out.println(ch[--i]+"  "+count);
				    break;
					}
					}
				}
			} catch (Exception e) {
			int count=1;
			if (ch[ch.length-1]==ch[ch.length-2]) {
				count++;
				System.out.println(ch[ch.length-1]+"  "+count);
			} else {
	            System.out.println(ch[ch.length-1]+"  "+count);
			}
			}
	}
	}
