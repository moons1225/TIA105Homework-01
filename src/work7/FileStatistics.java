package work7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileStatistics {
	public static void main(String[] args) {
		String filePath = "Sample.txt";
		File file = new File(filePath);
		FileReader fr = null;
		BufferedReader br = null;
		try {
		fr = new FileReader(file);
		br = new BufferedReader(fr);
			// 計算位元組數
			long byteCount = file.length();

			// 計算字元數和列數
			int charCount = 0;
			int lineCount = 0;
			int ch;
			while ((ch = br.read()) != -1) {
				charCount++;
				if (ch == '\n')
					lineCount++;
			}
			// 如果最後一行沒有換行符，補上最後一行
			if (charCount > 0) {
				lineCount++;
			}
			System.out.println(
					file.getName() + "檔案共有" + byteCount + "個位元組，" + 
				charCount + "個字元，" + lineCount + "列資料");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(br != null)
					br.close();
				if(fr != null)
					fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
