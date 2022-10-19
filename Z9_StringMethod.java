
public class Z9_StringMethod {
	public static void main(String[] args) {
		
		//String = a reference data type that can store one or more character
		//         reference data type have access to useful methods
				
				String name = "WhisKey";
				
				//boolean result = name.equals("WhisKey"); 
				//boolean result = name.equalsIgnoreCase("whiskey");
				//char result = name.charAt(4);
				//int result = name.indexOf("K");
				//boolean result = name.isBlank();
				//String result = name.toUpperCase();
				//String result = name.toLowerCase();
				//String result = name.trim();   trim spaces before and after of name
				String result = name.replace("K", "k");
				
				
				System.out.println(result);
		
		
		
	}

}
