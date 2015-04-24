package org.irri.breedingtool.rjava.stardesign;

import org.irri.breedingtool.rjava.manager.RJavaManager;

public class TestDesignRowColumn {

	private static String BSLASH = "\\";
	private static String FSLASH = "/";
	private static String PATH1 = System.getProperty("user.dir")+ System.getProperty("file.separator") + "sample_datasets" + System.getProperty("file.separator");
	public static String DATA_PATH = PATH1.replace(BSLASH, FSLASH);
	
	public static void main(String[] args) {
		
		//supply path where the output will be saved
		String path = DATA_PATH; 
		//supply the fieldbook name specified by the user
		String fieldBookName = "fieldbookRowColumn"; 
		
		//specify parameters
//		// Case1: default values
//		Integer numTrmt = 9;
//		Integer rep = 2;
//		Integer trial = 1;
//		Integer rowblkPerRep = 3;
//		Integer rowPerRowblk = 1;
//		Integer colblkPerRep = 3;
//		Integer numFieldRow = 3;
//		String fieldOrder = "Serpentine";
		
		// Case2: 2 rows per row block and 2 col per column block
		Integer numTrmt = 36;
		Integer rep = 3;
		Integer trial = 1;
		Integer rowblkPerRep = 3;
		Integer rowPerRowblk = 2;
		Integer colblkPerRep = 3;
		Integer numFieldRow = 18;
		String fieldOrder = "Serpentine";
		
		RJavaManager rJavaManager= new RJavaManager();
		rJavaManager.initStar();
		rJavaManager.getSTARDesignManager().doDesignRowColumn(path, fieldBookName, numTrmt, 
				rep, trial, rowblkPerRep, rowPerRowblk, colblkPerRep, numFieldRow, fieldOrder);
		
		StringBuilder s = rJavaManager.getSTARDesignManager().getRscriptCommand();
		System.out.println("Script Command:\n" +s.toString());
	}

}
