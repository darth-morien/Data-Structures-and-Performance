package document;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quiz {
	
	private String text;
	
	protected Quiz(String text)
	{
		this.text = text;
	}
	

	public List<String> quiz(String text){
		List<String> tokens = getTokens("[a-z]+|[()0-9]+");
	    return tokens;

}
	private List<String> getTokens(String pattern) {
		ArrayList<String> tokens = new ArrayList<String>();
		Pattern tokSplitter = Pattern.compile(pattern);
		Matcher m = tokSplitter.matcher(text);
		
		while (m.find()) {
			tokens.add(m.group());
		}
		
		return tokens;
	}
	
	public String quizConcat (){
	//Incorrect	
	//	String text = "My ";
	//	text.concat("String");
		
	// Correct	
		/*String text = "My ";
		String s2 = "String";
		text = text + s2;*/
		
		//correct
		String s1 = "My String";
		String text = s1;
		
		return text;
		
		
	}
	
}