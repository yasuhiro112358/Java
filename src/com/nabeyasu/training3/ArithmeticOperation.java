package com.nabeyasu.training3;

/**
 * 四則演算を実装必須にするためのインタフェイス
 */
public interface ArithmeticOperation {
	/**
	 * 加算処理
	 * @return 加算結果
	 */
	public abstract int add();

	/**
	 * 減算処理
	 * @return 減算結果
	 */
	public abstract int subtract();
	
	/**
	 * 乗算処理
	 * @return 乗算結果
	 */
	public abstract int multiply();

	/**
	 * 除算処理
	 * @return 除算結果
	 */
	public abstract int divide();
}