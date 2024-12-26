/**
 * 
 */
package com.nabeyasu.training3;

import java.io.IOException; // IOExceptionを使用するためのインポート
import java.util.List; // リストを使用するためのインポート

/**
 * 
 */
public class Main {
	/**
	 * メインメソッド
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 引数の個数の確認
		if (args.length != 3) {
			Logger.log("異常", "3つの引数を入力してください。"); // エラーメッセージを表示
			Logger.log("情報", "処理を終了しました"); // 終了メッセージを表示
			return; // プログラムを終了
		}

		// 変数の宣言と初期化
		int targetRow = 0; // 抽出する行のインデックス
		int operation = 0; // 計算方法
		String filePath = args[2]; // ファイルパス
		int count = 0; // 処理対象行数

		// 引数を変数に格納
		try {
			targetRow = Integer.parseInt(args[0]); // 抽出する行番号（整数）
			operation = Integer.parseInt(args[1]); // 計算方法（整数）
		} catch (NumberFormatException e) { // parseIntが失敗した場合
			Logger.log("異常", "引数が整数ではありません");
			Logger.log("情報", "処理を終了しました");
			return; // プログラムを終了
		}

		// operationが1~4の範囲外の場合、カスタム例外をスロー
		try {
			if (operation < 1 || operation > 4) {
				throw new InvalidOperationException("計算区分（第二引数）は1から4の範囲で指定してください（1:加算、2:減算、3:乗算、4:除算）");
			}
		} catch (InvalidOperationException e) {
			Logger.log("異常", e.getMessage());
			Logger.log("情報", "処理を終了しました");
			return; // プログラムを終了
		}
		
		

		// 開始メッセージ
		Logger.log("情報", "処理を開始しました");

		// 引数の出力
		Logger.log("情報", String.format("指定された引数は 第一引数:%d 第二引数:%d 第三引数:%sです", targetRow, operation, filePath));

		// インスタンスを生成
		CSVDataHandler dataHandler = new CSVDataHandler(filePath);

		try {
			// CSVファイルのデータをすべて読み込みクラスに保持
			dataHandler.readAllData();

			// データを取得
			List<String[]> data = dataHandler.getData();

			// データを行ごとに処理
			for (String[] row : data) {
				// 行の最初の要素がキーと一致するか確認
				if (row.length == 3 && row[0].equals(String.valueOf(targetRow))) {

					count++; // 処理対象行数をカウントアップ

					// 一致した行のデータを取得
					int num1 = Integer.parseInt(row[1]);
					int num2 = Integer.parseInt(row[2]);

					// 計算機のインスタンス化
					ArithmeticCalculator calculator = new ArithmeticCalculator(operation, num1, num2);
					
					// 計算結果の取得
					calculator.calculate();

					// 計算結果の出力
					calculator.showResult(count);
				}
			}
		} catch (NumberFormatException e) {
			Logger.log("異常", "整数に変換できないデータが含まれています");
			Logger.log("情報", "例外が発生したため処理を終了しました");
			return; // プログラムを終了
		} catch (IOException e) {
			Logger.log("異常", e.getMessage());
			Logger.log("情報", "例外が発生したため処理を終了しました");
			return; // プログラムを終了
		} catch (Exception e) { // その他の例外
			Logger.log("異常", e.getMessage()); // 例外メッセージを表示
			Logger.log("情報", "例外が発生したため処理を終了しました");
			return; // プログラムを終了
		}

		// 正常終了時の処理
		// 処理対象行数の出力
		Logger.log("情報", "処理対象行は" + count + "行でした");

		// 終了メッセージ
		Logger.log("情報", "処理を終了しました");
	}
}