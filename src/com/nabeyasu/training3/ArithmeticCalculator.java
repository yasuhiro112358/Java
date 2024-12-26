/**
 * 
 */
package com.nabeyasu.training3;

/**
 * 四則演算を行うクラス
 * 
 * @author Yasuhiro WATANABE
 * @version 1.0
 * @see Calculator
 * @see ArithmeticOperation
 */
public class ArithmeticCalculator extends Calculator implements ArithmeticOperation {
	/**
	 * コンストラクタ
	 * 
	 * @param num1 任意の整数
	 * @param num2 任意の整数
	 */
	public ArithmeticCalculator(int operation, int num1, int num2) {
		super(operation, num1, num2); // 親クラスのコンストラクタを呼び出す
	}

	/**
	 * ２変数の加算
	 * 
	 * @param num1 任意の整数
	 * @param num2 任意の整数
	 * @return 加算結果
	 */
	public int add() {
		return this.num1 + this.num2;
	}

	/**
	 * ２変数の減算
	 * 
	 * @param num1 任意の整数（引かれる数）
	 * @param num2 任意の整数（引く数）
	 * @return 減算結果
	 */
	public int subtract() {
		return this.num1 - this.num2;
	}

	/**
	 * ２変数の乗算
	 * 
	 * @param num1 任意の整数
	 * @param num2 任意の整数
	 * @return 乗算結果
	 */
	public int multiply() {
		return this.num1 * this.num2;
	}

	/**
	 * 2変数の除算
	 * 
	 * @param num1 任意の整数（割られる数）
	 * @param num2 任意の整数（割る数）
	 * @return 除算結果（整数。余りは切り捨て）
	 * @throws ArithmeticException ゼロ除算の例外
	 */
	public int divide() throws ArithmeticException {
		if (this.num2 == 0) { // 割る数
			throw new ArithmeticException("ゼロで除算することはできません"); // ゼロ除算の例外をスロー
		}

		return this.num1 / this.num2; // 整数値の除算結果は整数値になる
	}

	/**
	 * 計算を実行する
	 * 
	 * @throws IllegalArgumentException
	 */
	public void calculate() throws IllegalArgumentException {
		// 計算区分の名前を取得
		this.operationName = switch (this.operation) {
		case 1 -> "加算";
		case 2 -> "減算";
		case 3 -> "乗算";
		case 4 -> "除算";
		default -> throw new IllegalArgumentException("計算区分（第二引数）は1から4の範囲で指定してください（1:加算、2:減算、3:乗算、4:除算）");
		};

		// 計算結果を取得
		this.result = switch (this.operation) {
		case 1 -> this.add();
		case 2 -> this.subtract();
		case 3 -> this.multiply();
		case 4 -> this.divide();
		default -> throw new IllegalArgumentException("計算区分（第二引数）は1から4の範囲で指定してください（1:加算、2:減算、3:乗算、4:除算）");
		};
	}
}
