package com.inetsolv;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class CronJob {
 
	/**
	 * @param args
	 */
	public static Map<String, List<String>> lookUpFolderWithFileExt(final String folder,final String ext) {
		// TODO Auto-generated method stub
		String testFile="";
		List<String> list = new ArrayList<String>(); 
		Map<String, List<String>> similarFileNames = new HashMap<String, List<String>>();
		try{
			File file = new File(folder);
			File[] listOfFiles = file.listFiles();

			for (File file1 : listOfFiles){
	    			if (file1.isFile()) {
	        			//System.out.println(file.getName());
	        			if(file1.getName().endsWith((ext))){
	        				int length=file1.getName().length();
	        				testFile=file1.getName().substring(0, length-4);
	        				//System.out.println(testFile); 
	        			}
	        			}
	    			}
			for (File file1 : listOfFiles) {
    			if (file1.isFile()) {
        			//System.out.println(file.getName());
    				String fileName = file1.getName();
    				int pos = fileName.lastIndexOf(".");
    				if (pos > 0) {
    				    fileName = fileName.substring(0, pos);
    				}
        			if(fileName.equals(testFile)){
        				list.add(file1.getAbsolutePath());
        				System.out.println(file1.getAbsolutePath());
        				
        			}
        			}
    			}
			similarFileNames.put(testFile, list);
			}
			catch(NullPointerException e){
			e.printStackTrace();
			}
		return similarFileNames;
	}

}
