/**
 * 
 */
package com.nabeyasu.training2;

/**
 * 四則演算のみを行うクラス
 */
public class ArithmeticCalculator extends Calculator {
	/**
	 * コンストラクタ
	 * @param num1 任意の整数
	 * @param num2 任意の整数
	 */
	public ArithmeticCalculator(int num1, int num2) {
		super(num1, num2); // 親クラスのコンストラクタを呼び出す
	}

	/**
	 * ２変数の加算
	 * @param num1 任意の整数
	 * @param num2 任意の整数
	 * @return 加算結果
	 */
	public int add() {
		return this.num1 + this.num2;
	}

	/**
	 * ２変数の減算
	 * @param num1 任意の整数（引かれる数）
	 * @param num2 任意の整数（引く数）
	 * @return 減算結果
	 */
	public int subtract() {
		return this.num1 - this.num2;
	}

	/**
	 * ２変数の乗算
	 * @param num1 任意の整数
	 * @param num2 任意の整数
	 * @return 乗算結果
	 */
	public int multiply() {
		return this.num1 * this.num2;
	}

	/**
	 * 2変数の除算
	 * @param num1 任意の整数（割られる数）
	 * @param num2 任意の整数（割る数）
	 * @return 除算結果（整数。余りは切り捨て）
	 * @throws ArithmeticException ゼロ除算の例外
	 */
	public int divide() {
		if (this.num2 == 0) { // 割る数
			throw new ArithmeticException(); // ゼロ除算の例外をスロー
		}
		
		return this.num1 / this.num2; // 整数値の除算結果は整数値になる
	}
}
