package Interview;

import org.testng.annotations.Test;

class b1{
	@Test
public void withoutBDD() {
String s="my name is   gowtham";

String[] string = s.split("\\s+");
for (int i = 0; i < string.length; i++) {
	if (string[i]!=" ") {
		System.out.println(string[i]);
	}
	
}

}
}