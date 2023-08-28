package Interview;

import org.testng.annotations.Test;

public class findoccurence {
@Test
	public void test() {
		String s="tester";
	  char[] ch = s.toCharArray();
	  for (int i = 0; i < ch.length; i++) {
		  int count=1;
		for (int j = i+1; j < ch.length; j++) {
			if (ch[i]==ch[j]) {
				ch[j]='@';
				count++;
			}
		}
	    if (ch[i]!='@'  && count==1) {
			System.out.println(ch[i]+"    "+count);
		}
	}
	}
}
