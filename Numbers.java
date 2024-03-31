package AutomationQA.Demo;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="poop";
		String output = "";
		
		for(int i=input.length()-1; i>=0; i--)
		{
			output=output+input.charAt(i);
		}
		System.out.println("Reverse: "+output);
		
		if(output.equals(input)) {
			System.out.println("its is palindrome");
		}else 
			System.out.println("Its no palindrome");
	}

}
