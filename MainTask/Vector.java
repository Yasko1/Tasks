package by.epam.javatrining.model.logic;

public class Vector {

	public double[] vector;

	public Vector(double[] arr) {
		this.vector = arr;
	}

	public Vector(int size) {
		vector = new double[size];
		for (int i = 0; i < vector.length; i++) {
			vector[i] = Math.random();
		}
	}

	public Vector() {
		vector = new double[4];
		for (int i = 0; i < vector.length; i++) {
			vector[i] = Math.random();
		}
	}

	@Override
	public String toString() { // метод возвращающий все элементы вектора
		String s = "";
		for (int i = 0; i < vector.length; i++) {
			s = (String) s + "  " + vector[i];
		}
		return s;
	}

	public double findMinElement() {
		double min = vector[0];
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] < min)
				min = vector[i];
		}
		return min;
	}

	public double findMaxElement() {
		double max = vector[0];
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] > max)
				max = vector[i];
		}
		return max;
	}

	public double getArifmeticalAverage() {
		double result = 0;
		for (int i = 0; i < vector.length; i++) {
			result += vector[i];
		}
		return (double) result / vector.length;
	}

	public double getGeometryAverage() {
		double result = 0;
		for (int i = 0; i < vector.length; i++) {
			result *= vector[i];
		}
		return (double) Math.pow(result, 1.0 / vector.length);
	}

	public boolean isSort() {
		int countIncrese = 1, countDecrease = 1;
		for (int i = 0; i < vector.length - 1; i++) {
			if (vector[i] < vector[i + 1]) {
				++countIncrese;
			}
			if (vector[i] > vector[i + 1]) {
				++countDecrease;
			}
		}
		if (countIncrese == vector.length ^ countDecrease == vector.length)
			return true;
		else
			return false;
	}

	public int findPositionOfFirstLocMin() {
		int position = -1;
		for (int i = 1; i < vector.length - 1; i++) {
			if (vector[i - 1] > vector[i] && vector[i] < vector[i + 1]) {
				position = ++i;
				break;
			}
		}
		return position;
	}

	public int binarySearch(double d) {
		int low = 0, high = vector.length - 1, i = -1;
		while (low <= high) {
			int midle = (low + high) / 2;
			if (vector[midle] == d) {
				i = midle;
				break;
			} else if (vector[midle] > d) {
				high = midle - 1;
			} else {
				low = midle + 1;
			}
		}
		return i;
	}
	
	public void reverseVector() {
		for (int i = 0; i <= vector.length/2; i++) {
			double buf=vector[i];
			vector[i]=vector[vector.length-1-i];
			vector[vector.length-1-i]=buf;
		}
	}

	public void bubbleSort() {
		for (int i = 1; i < vector.length; i++) {
			for (int j = 0; j <= vector.length - i; j++) {
				if (vector[j] > vector[j + 1]) {
					double buf = vector[j];
					vector[j] = vector[j + 1];
					vector[j + 1] = buf;
				}
			}
		}
	}

	public void easySort() {
		for (int i = 0; i < vector.length - 1; i++) {
			int k = i;
			for (int j = i + 1; j < vector.length; j++) {
				if (vector[k] > vector[j])
					k = j;
			}
			double buf = vector[i];
			vector[i] = vector[k];
			vector[k] = buf;
		}
	}

	public void sortByInsertMethod() {
		for (int i = 1; i < vector.length; i++) {
			double y = vector[i];
			int j = i - 1;
			while (j >= 0 && y < vector[j]) {
				vector[j + 1] = vector[j];
				j--;
			}
			vector[j + 1] = y;
		}
	}

	public static void main(String[] args) {
		// Vector v = new Vector(4);  // создание объекта рандомными числами
		double[] array = { 1.2, 56, 2, 98.2, 0, 1 };
		Vector v = new Vector(array);   // создание объекта и заполнение его мссивом
		System.out.println(v.toString());
		System.out.println("\nmax:  " + v.findMaxElement());
		System.out.println("min:  " + v.findMinElement());
		System.out.println("\nArifmetical Average:  " + v.getArifmeticalAverage());
		System.out.println("Geometry average:  " + v.getGeometryAverage());
		System.out.println("\nIsSort: " + v.isSort());
		
		if (v.findPositionOfFirstLocMin() != -1) {
			System.out.println("\nLoc min: " + v.findPositionOfFirstLocMin());
		} else {
			System.out.println("There are no loc min.");
		}
		System.out.println("\nBinary serch: "+v.binarySearch(0.1)+"\n");
		v.reverseVector();	System.out.println(v.toString());
		
	}
}

