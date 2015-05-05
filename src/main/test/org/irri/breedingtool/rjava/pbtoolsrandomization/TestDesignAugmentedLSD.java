package org.irri.breedingtool.rjava.pbtoolsrandomization;

import org.irri.breedingtool.rjava.manager.RJavaManager;

public class TestDesignAugmentedLSD {

	private static String BSLASH = "\\";
	private static String FSLASH = "/";
	private static String PATH1 = System.getProperty("user.dir")+ System.getProperty("file.separator") + "sample_datasets" + System.getProperty("file.separator");
	public static String DATA_PATH = PATH1.replace(BSLASH, FSLASH);
	
	public static void main(String[] args) {
		
		//supply path where the output will be saved
		String path = DATA_PATH; 
		//supply the fieldbook name specified by the user
		String fieldBookName = "fieldbookAugLSD"; 
		
		//specify parameters
		Integer repTrmt = 5;
		Integer unrepTrmt = 75;
		Integer fieldRow = 5;
		Integer trial = 2;
		String fieldOrder = "Serpentine";
		
		RJavaManager rJavaManager= new RJavaManager();
		rJavaManager.initPBtool();
		rJavaManager.getPbToolRandomizationManager().doDesignAugLSD(path, fieldBookName, repTrmt, unrepTrmt, fieldRow, 
				trial, fieldOrder);
		
//		StringBuilder s = rJavaManager.getPBToolsDesignManager().getRscriptCommand();
//		System.out.println("Script Command:\n" +s.toString());
	}

}
