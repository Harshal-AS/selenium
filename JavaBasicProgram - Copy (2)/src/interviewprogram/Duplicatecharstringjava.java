package interviewprogram;

public class Duplicatecharstringjava {

	public static void main(String[] args) {
		String string1="Better Butter";
		int count;
		//convert given string into charcter array
		char string[]=string1.toCharArray();
		System.out.println("DUPLICATE ARRAY GIVEN STRING");
		//count each character present in the string
		for(int i=0;i<string.length;i++) {
			count=1;
			for(int j=i+1;j<string.length;j++) {
				if(string[i]==string[j]&&string[i]!='') { 
					count++;
				
					//set string[j] to 0 to avoid printing visitedcharacter 				}
				string[j]='0';
			}
		}
			if(count>1&&string[i]!='0') {
				System.out.println(string[i]);
			}}}
	


