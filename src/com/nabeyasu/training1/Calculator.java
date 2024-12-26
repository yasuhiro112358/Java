/**
 * 
 */
package com.nabeyasu.training1;

/**
 * ２変数の計算結果を返すクラス
 */
public class Calculator {
	// クラス変数
	/** 第１引数 */
	private int num1;
	/** 第２引数 */
    private int num2; 

    /**
     * コンストラクタ
     * 引数をクラス変数に保存
     * 
     * @param num1
     * @param num2
     */
    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * 
     * @return 加算結果
     */
    public int add() {
        return this.num1 + this.num2;
    }

    /**
     * 
     * @return 乗算結果
     */
    public int multiply() {
        return this.num1 * this.num2;
    }
}
