package work7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopier {
	
	public static void main(String[] args) {
		try {
			File file = new File(".", "SampleText.txt");
			if (!file.exists()) 
				file.createNewFile();
			copyFile("Sample.txt","SampleText.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void copyFile(String srcFile, String destFile) throws IOException{
		//連接第一個檔案 進行輸入 的水管
		FileReader fr = new FileReader(srcFile);
		BufferedReader br = new BufferedReader(fr);
		
		//連接第二個檔案 進行輸出 的水管
		FileWriter fw = new FileWriter(destFile);
		BufferedWriter bw = new BufferedWriter(fw);
		
		int i ;
		while((i=br.read())!=-1) {
			bw.write(i);
		}
		bw.close();
		fw.close();
		br.close();
		fr.close();
	}
}
