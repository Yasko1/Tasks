
public class Dinosaur {

	double w;
	
	Dinosaur(double w){
		this.w=w;
	}
	
	double getWeightInKilo() {
		return w/1000;
	}
	
	double getWeightInCentner() {
		return w/10000;
	}
	
	double getWeightInMiligramm() {
		return w*1000;
	}
}
