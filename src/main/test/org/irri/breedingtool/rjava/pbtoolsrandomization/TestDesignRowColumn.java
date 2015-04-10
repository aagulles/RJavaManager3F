package org.irri.breedingtool.rjava.pbtoolsrandomization;

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
		String fieldBookName = "fieldbookPBToolsRowColumn1"; 
		
		//specify parameters
		Integer numTrmt = 4;
		Integer rep = 2;
		Integer trial = 1;
		Integer rowPerRep = 2;
		Integer numFieldRow = 2;
		String fieldOrder = "Serpentine";
		
		RJavaManager rJavaManager= new RJavaManager();
		rJavaManager.initPBtool();
		rJavaManager.getPbToolRandomizationManager().doDesignRowColumn(path, fieldBookName, numTrmt, 
				rep, trial, rowPerRep, numFieldRow, fieldOrder);
		
//		StringBuilder s = rJavaManager.getSTARDesignManager().getRscriptCommand();
//		System.out.println("Script Command:\n" +s.toString());
	}

}
