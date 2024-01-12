package java9;

public class CopyMachine {
	int paper;
	
	// 最初に給紙する枚数を指定する。枚数がマイナスの場合は0枚に設定する
	public CopyMachine(int sheet) {
		this.paper = sheet > 0 ? sheet : 0;
	}
	
	// 引数として渡された枚数だけ給紙する
	public void feedPaper(int sheet) {
		this.paper += sheet;
		System.out.printf("%d枚給紙しました。\n", sheet);
	}

	// 引数として渡された枚数をコピーする。すべてをコピーできない場合は可能な枚数だけコピーする
	public void copy(int sheet) {
		int num = this.paper > sheet ? sheet : this.paper;
		this.paper-=num;
		System.out.printf("%d枚コピーしました。\n", num);
	}
	
	
	// コピー可能な枚数
	public void display() {
		System.out.printf("コピー可能な枚数は%d枚です。\n", this.paper);
	}
}


//<フィールド変数>
//・コピー可能な枚数 … -`paper : int`
//
//<コンストラクタ>
//`public CopyMachine(int sheet)`
//…　最初に給紙する枚数を指定する。
//枚数がマイナスの場合は0枚に設定する
//
//<一般メソッド>
//`public void feedPaper(int sheet)`
//…　引数として渡された枚数だけ給紙する
//`public void copy(int sheet)`
//…　引数として渡された枚数をコピーする
//　　すべてをコピーできない場合は可能な枚数だけコピーする
//`public void display()`
//…　コピー可能な枚数を表示する