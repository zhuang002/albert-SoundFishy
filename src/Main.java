import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int dep1 = sc.nextInt();
		int dep2 = sc.nextInt();
		int direction1 = getDirection(dep1,dep2);
		dep1 = dep2;
		
		for (int i=0;i<2;i++) {
			dep2 = sc.nextInt();
			int direction2 = getDirection(dep1,dep2);
			if (direction1 != direction2) {
				System.out.println("No Fish");
				return;
			}
			dep1 = dep2;
		}
		if (direction1 > 0) {
			System.out.println("Fish Rising");
		} else if (direction1 == 0) {
			System.out.println("Fish At Constant Depth");
		} else {
			System.out.println("Fish Diving");
		}
		
	}

	private static int getDirection(int dep1, int dep2) {
		// TODO Auto-generated method stub
		if (dep1>dep2) return -1;
		if (dep1==dep2) return 0;
		return 1;
	}

}
