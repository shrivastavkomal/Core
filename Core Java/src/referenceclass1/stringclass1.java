package referenceclass1;

public class stringclass1 {
	
	public static void main(String[] args) {
		  String name = "Tech Mahindra Company";
		  
		  System.out.println("String lenght"+name.length());
		  System.out.println("7th length is"+name.charAt(7));
		  System.out.println("Tech index is"+name.indexOf("Tech"));
		  System.out.println("First c position"+name.lastIndexOf("c"));
		  System.out.println("t is replaced by c"+name.replace("t","c"));
		  System.out.println("Chhota Tech"+name.toLowerCase());
		  System.out.println("Bada Tech"+name.toUpperCase());
		  System.out.println("Starts with Tech"+name.startsWith("Tech"));
		  System.out.println("Ends with pany"+ name.endsWith("pany"));
		  System.out.println("Substring"+name.substring(8));
		  
		  
		  ;
		  
	}

}
