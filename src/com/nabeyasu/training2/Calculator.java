/**
 * 
 */
package com.nabeyasu.training2;

/**
 * 計算のための親クラス<br>
 * 子クラスの生成を前提とするためabstractキーワードを付与<br>
 * 様々な計算用クラスの共通の親クラスになることを想定
 */
public abstract class Calculator {
	/** 任意の整数 */
	protected int num1; // protected修飾子で子クラスからアクセス可能にする
	/** 任意の整数 */
	protected int num2; // protected修飾子で子クラスからアクセス可能にする

	/**
	 * コンストラクタ
	 * @param num1 任意の整数
	 * @param num2 任意の整数
	 */
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	/* 
	 * ==========================================
	 * 具体的な計算メソッドは子クラスで実装する
	 * ==========================================
	 */
}
