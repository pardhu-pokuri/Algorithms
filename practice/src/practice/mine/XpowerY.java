package practice.mine;

public class XpowerY {

	public static void main(String[] args) {
		System.out.println(getXpowerY(5, 1));
	}
	
	public static int getXpowerY(int x, int y) {
		if (y == 0) {
			return 1;
		}
		int power = getXpowerY(x, y / 2);

		if (y % 2 == 0) {
			return power * power;
		} else {
			return power * power * x;
		}

	}
	

}
