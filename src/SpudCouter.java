
public class SpudCouter {
public static void main(String[]args) {
	// the amazing lyrics1 potato, 2 potato, 3 potato, 4
	//5 potato, 6 potato, 7 potato, more 
	for(int i=1; i<=7; i++) {
		
		if(i==4) {
			System.out.println(""+i);
		}
		else {
			System.out.print(i+ " potato,");
		}
	}
	System.out.print(" more");
	
}
}
