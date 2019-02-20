
public class Dracon {

	public static int cauntHead(int y) {

		if (y <= 0) {
			return -1;
		}
		int h = 3;
		if (y < 200) {
			h += y * 3;
		} else if (y < 300) {
			h += 200 * 3 + 2 * (y - 200);
		} else if (y > 300) {
			h += 200 * 3 + 100 * 2 + (300 - y) * 1;
		}
		return h;
	}

	public static void main(String[] args) {

		int yearOfLife = 1;

		System.out.println("Количество голов:" + cauntHead(yearOfLife));
		System.out.println("Количество голов:" + cauntHead(201));
	}
}