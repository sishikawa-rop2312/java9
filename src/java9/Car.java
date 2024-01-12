package java9;

public class Car {
	double fuelRest;	// ガソリンの残量(リットル)
	double fuelRatio;	// 燃費(キロメートル/リットル)
	double fuelMax;		// タンク容量
	
	// コンストラクタ
	public Car(double fuelRest, double fuelRatio, double fuelMax) {
		this.fuelRest = fuelRest;
		this.fuelRatio = fuelRatio;
		this.fuelMax = fuelMax;
	}
	
	// ガソリン残量を表示
	public void displayFuel() {
		System.out.printf("現在の燃料は%.1fリットルです。\n", this.fuelRest);
	}
	
	// ガソリンを給油するメソッド。fuelは給油量(リットル)
	public void addFuel(double fuel) {
		if (this.fuelRest + fuel > this.fuelMax) {
			System.out.println("給油リミットオーバーです");
		} else {
			this.fuelRest += fuel;
			System.out.printf("%.1fリットル給油します。\n", fuel);
		}
		displayFuel();
	}
	
	// 車を走行させるメソッド。distanceは走行距離(キロメートル)
	public void run(double distance) {
		double fuelRatio = distance / this.fuelRatio;
		
		System.out.printf("%.1fキロ走行します\n", distance);
		this.fuelRest -= fuelRatio;
	}
}
