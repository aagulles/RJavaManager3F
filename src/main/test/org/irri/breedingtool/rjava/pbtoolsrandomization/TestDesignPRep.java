package org.irri.breedingtool.rjava.pbtoolsrandomization;

import org.irri.breedingtool.rjava.manager.RJavaManager;

public class TestDesignPRep {

	private static String BSLASH = "\\";
	private static String FSLASH = "/";
	private static String PATH1 = System.getProperty("user.dir")+ System.getProperty("file.separator") + "sample_datasets" + System.getProperty("file.separator");
	public static String DATA_PATH = PATH1.replace(BSLASH, FSLASH);
	
	public static void main(String[] args) {
		
		//supply path where the output will be saved
		String path = DATA_PATH; 
		//supply the fieldbook name specified by the user
		String fieldBookName = "fieldbookPRep"; 
		
		//specify parameters
		String[] trmtGrpName = {"NewRepTrmt", "NewUnrepTrmt", "Parent"};
		Integer[] numTrmtPerGrp = {48, 80, 2};
		Integer[] trmtRepPerGrp = {2, 1, 2};
		String trmtName = "ENTRYNO";
		Integer blk = 6;
		Integer trial = 1;
		Integer rowPerBlk = 6;
		Integer numFieldRow = 18; 
		String fieldOrder = "Serpentine";
		String trmtLabel = null;
		String trmtListPerGrp = null;
		
		RJavaManager rJavaManager= new RJavaManager();
		rJavaManager.initPBtool();
		rJavaManager.getPbToolRandomizationManager().doDesignPRep(path, fieldBookName, trmtGrpName, numTrmtPerGrp, 
				trmtRepPerGrp, trmtName, blk, trial, rowPerBlk, numFieldRow, fieldOrder, trmtLabel, trmtListPerGrp);
	}

}
