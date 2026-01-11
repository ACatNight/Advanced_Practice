package ioAndReflection.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		Map<String,String> config = new HashMap<>();
		try(BufferedReader br = new BufferedReader(new FileReader("config.txt"))) {
		  String line;
		  while ((line = br.readLine()) != null){
			  if (line.trim().isEmpty()){
				  continue;
			  }
//			  String [] arr = line.split("=");
//			  String key = arr[0];
//			  String value = arr[1];
//			  config.put(key,value);
//			  System.out.println(key + ":" + value);
			  int idx = line.indexOf("=");
			  String key = line.substring(0,idx).trim();
			  String value = line.substring(idx+1).trim();
			  config.put(key,value);
		  }
		}catch (IOException e){
			e.printStackTrace();
		}
		System.out.println(config);


	}
}
