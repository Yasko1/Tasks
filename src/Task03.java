
public class Task03 {

	public static int getMaxValue(int a, int b, int c, int d) {
		int m;
		if(a>b && a>c && a>d) {
			m=a;
		}else if(b>c && b>d) {
			m=b;
		}else if(c>d) {
			m=c;
		}else {
			m=d;
		}
		return m;
	}
	public static void main(String[] args) {
		
		System.out.println(getMaxValue(1,2,3,4));
	}
}
