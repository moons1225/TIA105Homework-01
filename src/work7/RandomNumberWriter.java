package work7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class RandomNumberWriter {
	public static void main(String[] args) {
		
		Random random = new Random();
		
//在當前目錄下創建一個名為 Data.txt 的 File 物件，不會實際創建檔案
		File file = new File(".", "Data.txt");
		FileOutputStream fos = null;

		try {
			//要真正創建檔案，還需要使用 createNewFile() 方法
			if (!file.exists()) 
				file.createNewFile();
			
			// 建構子FileOutputStream(String name,boolean append)
			// 當append = true時，新增的資料將「附加」於原始資料中
			fos = new FileOutputStream(file.getPath(), true);

			// 產生10個1~1000的亂數
			for (int i = 0; i < 10; i++) {
				int num = random.nextInt(1000) + 1;

				fos.write((num + "\n").getBytes()); //getBytes()方法用於將字串轉換為位元組陣列。
				// 等於下面兩行
//				String numStr = num + "\n";
//				fos.write(numStr.getBytes());		
			}
			fos.write("-------------------\n".getBytes());
			System.out.println("亂數已成功寫入 Data.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
