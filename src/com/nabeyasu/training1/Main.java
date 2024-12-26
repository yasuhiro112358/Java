/**
 * 
 */
package com.nabeyasu.training1;

/**
 * 
 */
public class Main {
	/**
	 * @param args 任意の２つの整数値のみを許容
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 引数が2つでない場合はエラーメッセージを表示して終了
		// その他のエラーは例外としてキャッチする
		if (args.length != 2) {
            System.out.println("Error: 実行時引数として2つの整数を与えてください。");
            return; // プログラムを終了
        }
        
		// 引数が２つであることは保証されている
        try {
            int num1 = Integer.parseInt(args[0]); // 第一引数
            int num2 = Integer.parseInt(args[1]); // 第二引数
            
            // Calculatorクラスのインスタンスを生成
            Calculator calculator = new Calculator(num1, num2); // 引数への型の記載は不要
//            Calculator calculator = null; // Exceptionのテスト用
            
            // 結果の表示
            System.out.println("加算結果 = " + calculator.add() + " 乗算結果 = " + calculator.multiply());
        } catch (NumberFormatException e) { // 引数が整数に変換できない場合（文字・記号の場合含む）
            System.out.println("Error: 与えられた実行時引数が整数ではありません。");
        } catch (Exception e) { // その他一般的な例外
            System.out.println("Error: " + e.getMessage());
        }
	}
}
