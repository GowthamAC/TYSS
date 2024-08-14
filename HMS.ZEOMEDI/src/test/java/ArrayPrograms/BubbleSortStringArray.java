package ArrayPrograms;

public class BubbleSortStringArray {
	
	public static void main(String[] args) {
        String [] str = {"apple", "banana", "graphs", "mango"};

        String temp = " ";
        for(int i=0; i<str.length; i++){
            for (int j=i+1; j< str.length; j++){
                if (str[i].compareTo(str[j]) > 0){
                    temp=str[j];
                    str[i]=str[j];
                    str[i]=temp;
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }
    }

}
