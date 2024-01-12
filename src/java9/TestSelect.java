package java9;

import java.util.Scanner;

public class TestSelect {

	public static void main(String[] args) {

		while (true) {
			System.out.print("1.確認 2.実行 3.終了 >> ");
			int select = new Scanner(System.in).nextInt();
//			boolean isEnd = false;
			switch (select) {
			case 1:
				System.out.println("確認します");
				break;
			case 2:
				System.out.println("実行します");
				break;
			case 3:
				System.out.println("終了します");
//				isEnd = true;
//				break;
				return;
			default:
				System.out.println("1～3の番号で選んでください");
				break;
			}

			// 終了するか
//			if (isEnd) {
//				break;
//			}

		}

	}

}
