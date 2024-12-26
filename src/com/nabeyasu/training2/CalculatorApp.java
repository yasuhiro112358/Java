package com.nabeyasu.training2;

public class CalculatorApp {
	/**
	 * 計算結果をコンソールに出力するアプリケーション
	 * 
	 * @param args[0] 計算種別（１：加算、２：減算、３：乗算、４：除算）
	 * @param args[1] 整数
	 * @param args[2] 整数
	 * @throws IllegalArgumentException 計算区分が1~4以外の場合
	 * @throws NumberFormatException    引数が整数以外の場合
	 * @throws ArithmeticException      ゼロ除算が発生した場合
	 * @throws Exception                その他の例外
	 */
	public static void main(String[] args) {
		// 開始メッセージ
		Logger.log("処理を開始しました");

		// 引数が3つでない場合はエラーメッセージを表示して終了
		if (args.length != 3) {
			Logger.log("エラー: 実行時引数として3つの整数を指定してください");
			Logger.log("処理を終了しました");
			return; // プログラムを終了
		}

		// 3つの引数に対して処理
		try {
			int operation = Integer.parseInt(args[0]); // 計算種別（1 ~ 4）
			int num1 = Integer.parseInt(args[1]); // 整数
			int num2 = Integer.parseInt(args[2]); // 整数

			// 入力引数のメッセージを出力
			Logger.log("指定された引数は 第一引数: " + operation + " 第二引数: " + num1 + " 第三引数: " + num2 + " です");

			// operationが1~4の範囲外の場合、例外をスロー
			if (operation < 1 || operation > 4) {
				throw new IllegalArgumentException();
			}

			// 計算機のインスタンス化
			ArithmeticCalculator calculator = new ArithmeticCalculator(num1, num2);

			// 計算結果の取得
			int result; // 計算結果
			String operationName; // 計算種別の名前

			// 計算区分によって処理を分岐
			switch (operation) {
			// 加算
			case 1:
				operationName = "加算";
				result = calculator.add();
				break;
			// 減算
			case 2:
				operationName = "減算";
				result = calculator.subtract();
				break;
			// 乗算
			case 3:
				operationName = "乗算";
				result = calculator.multiply();
				break;
			// 除算
			case 4:
				operationName = "除算";
				result = calculator.divide();
				break;
			// 計算区分が不適
			default:
				throw new IllegalArgumentException();
			}

			// 計算結果の出力
			Logger.log("計算方法: " + operationName + " 計算結果: " + result + " です");
		} catch (NumberFormatException e) { // .parseIntが失敗したとき
			Logger.log("エラー: 引数が整数ではありません");
		} catch (IllegalArgumentException e) { // 計算区分が1~4以外のとき
			Logger.log("エラー: 計算区分（第一引数）は1から4の範囲で指定してください（1:加算、2:減算、3:乗算、4:除算）");
		} catch (ArithmeticException e) { // ゼロ除算が発生したとき
			Logger.log("エラー: ゼロで除算することはできません");
		} catch (Exception e) { // その他の例外
			Logger.log("エラー: " + e.getMessage());
		}

		// 終了メッセージ
		Logger.log("処理を終了しました");
	}
}
