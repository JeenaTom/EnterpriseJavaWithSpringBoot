
public class Assignmentineuron {

	public static void main(String[] args) {
		int n=9;
		
		for (int i=0;i<n;i++) {
//			for letter I
			for (int j=0; j<n;j++) {
				if (i==0 || i==(n-1) || j==(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print(" ");
//			for letter N
			for (int j=0; j<n;j++) {
				if (j==0 || j==(n-1) || i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print(" ");
//			for letter E			
			for (int j=0; j<n;j++) {
				if (i==0 || i==(n-1) || i==((n-1)/2) || j==0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print(" ");
//			for letter U			
			for (int j=0; j<n;j++) {
				if (((j==0 || j==(n-1)) && i!=(n-1)) || (i==(n-1) && j!=0 && j!=n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print(" ");
//			for letter R			
			for (int j=0; j<n;j++) {
				if (j==0 || ((i==0 || i==((n-1)/2)) && j!=(n-1)) || (j==(n-1) && i!=0 && i!=((n-1)/2)))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print(" ");
//			for letter O			
			for (int j=0; j<n;j++) {
				if (j!=0 && j!=(n-1) && (i==0 || i==(n-1)) || i!=0 && i!=(n-1) && (j==0 || j==(n-1)))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print(" ");
//			for letter N
			for (int j=0; j<n;j++) {
				if (j==0 || j==(n-1) || i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
