package java9;

import java.util.Scanner;

public class CopyMachineMain {

	public static void main(String[] args) {
		System.out.print("最初に給紙する枚数を入力して下さい >");
		Scanner scanner = new Scanner(System.in);
		int sheet = scanner.nextInt();

		CopyMachine copyMachine = new CopyMachine(sheet);

		while (true) {
			System.out.print("1. 給紙 / 2. コピー / 3. 表示 / 4. 終了 >");
			int select = scanner.nextInt();

			switch (select) {
			case 1:
				System.out.print("給紙する枚数を入力して下さい >");
				int feedPaper = scanner.nextInt();
				copyMachine.feedPaper(feedPaper);
				break;
			case 2:
				System.out.print("コピーする枚数を入力して下さい >");
				int copyPaper = scanner.nextInt();
				copyMachine.copy(copyPaper);
				break;
			case 3:
				copyMachine.display();
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

//最初に給紙する枚数を入力して下さい >20
//1. 給紙 / 2. コピー / 3. 表示 / 4. 終了>3
//コピー可能な枚数は20枚です。
//1. 給紙 / 2. コピー / 3. 表示 / 4. 終了>1
//給紙する枚数を入力して下さい >10
//10枚給紙しました。
//1. 給紙 / 2. コピー / 3. 表示 / 4. 終了>3
//コピー可能な枚数は30枚です。
//1. 給紙 / 2. コピー / 3. 表示 / 4. 終了>2
//コピーする枚数を入力して下さい >15
//15枚コピーしました。 
//1. 給紙 / 2. コピー / 3. 表示 / 4. 終了>3
//コピー可能な枚数は15枚です。
//1. 給紙 / 2. コピー / 3. 表示 / 4. 終了>2
//コピーする枚数を入力して下さい >30
//15枚コピーしました。 
//1. 給紙 / 2. コピー / 3. 表示 / 4. 終了>3
//コピー可能な枚数は0枚です。
//1. 給紙 / 2. コピー / 3. 表示 / 4. 終了>4
//アプリケーションを終了します。