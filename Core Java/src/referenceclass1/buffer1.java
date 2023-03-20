package referenceclass1;

public class buffer1 {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Corporate");
		sb.append(" Java course");
		System.out.println(sb);
		
		System.out.println("Length"+sb.length());
		System.out.println(("Capacity"+sb.capacity()));
		System.out.println("Char at"+sb.charAt(1));
		System.out.println(("Index Of"+sb.indexOf("course")));
		System.out.println("Replace"+sb.replace(0,  5, "rpo"));
		System.out.println("Reverse"+sb.reverse());
	
		

		
	}

}
