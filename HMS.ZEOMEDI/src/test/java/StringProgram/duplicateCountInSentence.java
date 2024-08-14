package StringProgram;

public class duplicateCountInSentence {
	
	 public static void main(String[] args) {
	        String str ="i love selenium love";
	       String [] string = str.split(" ");
	       for (int i=0; i<string.length; i++){
	           int count =1;
	           for (int j=i+1; j<string.length; j++){
	               if (string[i].equals(string[j])){
	                   count++;
	                   string[j] = "$";
	               }
	           }
	           if (string[i]!="$" && count>1){
//	               System.out.print(string[i]+" ");
	               System.out.println(string[i]+ " Repeating "+count+" times");
	           }
	       }
	    }

}
