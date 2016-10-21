package diy;

public class ReverseEachWord {

	
	
	public static void reverseWords(){
		
		String str = "Java is easy";
		
		StringBuilder sb = new StringBuilder();
		
		String[] word = str.split("  ");
		
		
		for(String words :word){
			
			
			for(int i = words.length()-1; i>=0; i--){
				
				
				sb.append(words.charAt(i));
				
				
			}
			
			System.out.println(sb.toString());
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		ReverseEachWord.reverseWords();

	}

}
