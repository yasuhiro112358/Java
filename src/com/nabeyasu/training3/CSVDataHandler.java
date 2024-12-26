/**
 * 
 */
package com.nabeyasu.training3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVDataHandler {

	private Path filePath; // ファイルパスを保持するフィールド
	private List<String[]> data; // データを保持するフィールド

	/**
	 * コンストラクタ
	 * 
	 * @param filePath ファイルパス
	 */
	public CSVDataHandler(String filePath) {
		this.filePath = Paths.get(filePath); // ファイルパスをフィールドに設定
		this.data = new ArrayList<>(); // データフィールドを初期化
	}

	/**
	 * CSVデータを読み込むメソッド
	 * 
	 * @throws IOException ファイルの読み込みエラー
	 */
	public void readAllData() throws IOException {
		try {
			List<String> lines = Files.readAllLines(this.filePath); // ファイルの全行を読み込む

			// 行ごとにデータを分割してリストに追加
			for (String line : lines) {
				String[] values = line.split(","); // カンマで分割
				data.add(values); // 配列としてリストに追加
			}
		} catch (IOException e) { // .readAllLines() でのエラー
			throw new IOException("ファイルの読み込み中にエラーが発生しました");
		} 
	}

	/**
	 * 保持したデータを取得
	 * 
	 * @return data 全データ
	 */
	public List<String[]> getData() {
		return data;
	}

	/**
	 * 読み込んだデータを出力<br>
	 * デバッグ用
	 */
	public void printData() {
		for (String[] row : data) {
			for (String value : row) {
				System.out.print(value + " ");
			}
			System.out.println(); // 改行
		}
	}
}
