package java9;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car(30.0, 8.4, 60.0);
		
		while (true) {
			System.out.print("1. 走行 / 2. 給油 / 3. 残量表示 / 4. 終了 >> ");
			Scanner scanner = new Scanner(System.in);
			int select = scanner.nextInt();
			
			
			switch (select) {
			case 1:
				System.out.print("何キロ走行しますか >");
				double run = scanner.nextDouble();
				car.run(run);
				break;
			case 2:
				System.out.print("何リットル給油しますか >");
				double fuel = scanner.nextDouble();
				car.addFuel(fuel);
				break;
			case 3:
				car.displayFuel();
				break;
			case 4:
				System.out.println("終了します");
				return;
			default:
				System.out.println("1～4の番号で選んでください");
				break;
			}
		}

	}

}
