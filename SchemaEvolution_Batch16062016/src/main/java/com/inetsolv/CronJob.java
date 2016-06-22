package com.inetsolv;
import java.io.*;
import java.util.List;
import java.util.Map;
public class CronJob {
 
	/**
	 * @param args
	 */
	public static Map<String, List<String>> lookUpFolderWithFileExt(final String folder,final String ext) {
		// TODO Auto-generated method stub
		String testFile="";
		try{
			File folder1 = new File(folder);
			File[] listOfFiles = folder1.listFiles();

			for (File file : listOfFiles) {
	    			if (file.isFile()) {
	        			//System.out.println(file.getName());
	        			if(file.getName().endsWith((ext))){
	        				int length=file.getName().length();
	        				testFile=file.getName().substring(0, length-4);
	        				System.out.println(testFile);
	        			}
	        			}
	    			}
			for (File file : listOfFiles) {
    			if (file.isFile()) {
        			//System.out.println(file.getName());
        			if(file.getName().startsWith(testFile)){
        				System.out.println(file.getName());
        			}
        			}
    			}
			}
			catch(NullPointerException e){
			e.printStackTrace();
			}
		return null;
	}

}
