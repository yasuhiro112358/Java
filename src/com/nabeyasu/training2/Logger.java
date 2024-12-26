/**
 * 
 */
package com.nabeyasu.training2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 */
public class Logger {
	/**
	 * 現在時刻と共にメッセージをログ出力する
	 * 
	 * @param message 出力するメッセージ
	 */
	public static void log(String message) {
		String timeFormat = "yyyy/MM/dd HH:mm:ss.SSS"; // タイムスタンプのフォーマット
		String timestamp = new SimpleDateFormat(timeFormat).format(new Date()); // フォーマットされたタイムスタンプを取得
		
		System.out.println(String.format("%s %s", timestamp, message)); // 出力
	}
}
