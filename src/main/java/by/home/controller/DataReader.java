package by.home.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {
	
public List<String> read(String FilePath) {
		
		BufferedReader br = null;
		List<String> lines = null;
		
		try {

			FileReader fr = new FileReader(FilePath);
			br = new BufferedReader(fr);

			lines = new ArrayList<String>();
			
			String line;

			while ((line = br.readLine()) != null) {
				if (!line.isEmpty()) {
				lines.add(line);
				}
			}
			
		} catch (IOException e) {
			throw new RuntimeException("Problems with file");
			
		} finally {
			
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return lines;
	}

}
