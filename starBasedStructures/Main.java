package starBasedStructures;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("--------Image one-----------");
		for(int i=9; i>=0;i--) {
			for(int k=i; k>=0;k--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		System.out.println("--------Image two-----------");
		for(int i=0; i<=9;i++) {
			for(int k=0;k<=i;k++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		System.out.println("--------Image three-----------");
		for(int i=0;i<=9;i++) {
			for(int k=0;k<=9;k++) {
				if(k<i) {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}				
			}
			System.out.println();
		}
		
		System.out.println("--------Image four-----------");
		for(int i=0;i<=9;i++) {
			for(int k=9;k>=0;k--) {
				if(k>i) {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
