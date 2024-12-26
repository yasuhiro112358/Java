/**
 * 
 */
package com.nabeyasu.training3;

/**
 * 計算のための親クラス<br>
 * 子クラスの生成を前提とするためabstractキーワードを付与（抽象クラス）<br>
 * 様々な計算用クラスの共通の親クラスになることを想定
 */
public abstract class Calculator {
	protected int num1;
	protected int num2;
	protected int result; // 計算結果
	protected int operation; // 計算種別
	protected String operationName; // 計算種別の名前

	/**
	 * コンストラクタ
	 * 
	 * @param num1 整数
	 * @param num2 整数
	 */
	public Calculator(int operation, int num1, int num2) {
		this.operation = operation;
		this.num1 = num1;
		this.num2 = num2;
	}

	/**
	 * 計算結果をコンソールに出力する
	 * 
	 * @param count 計算した行数
	 */
	public void showResult(int count) {
		Logger.log("情報", count + "行目:計算方法=" + this.operationName + " 計算結果=" + this.result);

		// 除算で整数以下を切り捨てた場合、警告メッセージを出力
		if (this.operation == 4 && this.num1 % this.num2 != 0) {
			Logger.log("警告", "除算結果で整数以下を切り捨てました");
		}
	}

	/*
	 * ==========================================
	 * 
	 * 具体的な計算メソッドは子クラスで実装する
	 * 
	 * ==========================================
	 */
}
