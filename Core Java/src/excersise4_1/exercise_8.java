package excersise4_1;

public class exercise_8 {
	
	public static void main(String[] args) {
		int[][]tables = new int[11][11];
			for (int row = 1; row < tables.length; row++) {
			for (int col = 2; col < tables.length; col++) {
				tables[row][col]=row*col;
				System.out.print(row*col+"\t");
				
			}
			System.out.println();
		}
	}

}
