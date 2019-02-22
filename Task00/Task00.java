public class Task00{
	public static void main(String args[]) {
		
		Rectangle R = new Rectangle(1, 3);
		System.out.println("Площадь прямоугольника со сторонами " +
		 R.getSideA() + " и "+ R.getSideB() + " равна: " + R.getSquare());
		System.out.println("Периметр  прямоугольника со сторонами " +
		 R.getSideA() + " и "+ R.getSideB() + " равен: " + R.getPerimetr());
		
	}
}