/**
 * 
 */
package com.nabeyasu.training3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ログ出力を行うクラス
 * 
 * @author Yasuhiro WATANABE
 * @version 1.0
 */
public class Logger {
	/** タイムスタンプのフォーマット */
	private static final String timeFormat = "yyyy/MM/dd HH:mm:ss.SSS";
	
	/**
	 * メッセージをログを出力する
	 * 
	 * @param level   情報、警告、異常
	 * @param message 出力するメッセージ
	 */
	public static void log(String level, String message) {
		String timestamp = new SimpleDateFormat(timeFormat).format(new Date()); // フォーマットされたタイムスタンプを取得

		System.out.println(String.format("%s %s %s", timestamp, level, message)); // 出力
	}
}
