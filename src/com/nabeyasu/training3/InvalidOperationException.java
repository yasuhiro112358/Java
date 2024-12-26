/**
 * 
 */
package com.nabeyasu.training3;

/**
 *  計算方法が不正な場合の例外クラス
 */
public class InvalidOperationException extends Exception {
	// シリアルバージョンUID
	private static final long serialVersionUID = 1L;

	/**
	 * コンストラクタ
	 * 
	 * @param message 例外メッセージ
	 */
	public InvalidOperationException(String message) {
		super(message);
	}
}
