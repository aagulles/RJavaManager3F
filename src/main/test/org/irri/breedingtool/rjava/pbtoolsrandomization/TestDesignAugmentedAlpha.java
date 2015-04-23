package org.irri.breedingtool.rjava.pbtoolsrandomization;

import org.irri.breedingtool.rjava.manager.RJavaManager;

public class TestDesignAugmentedAlpha {

	private static String BSLASH = "\\";
	private static String FSLASH = "/";
	private static String PATH1 = System.getProperty("user.dir")+ System.getProperty("file.separator") + "sample_datasets" + System.getProperty("file.separator");
	public static String DATA_PATH = PATH1.replace(BSLASH, FSLASH);
	
	public static void main(String[] args) {
		
		//supply path where the output will be saved
		String path = DATA_PATH; 
		//supply the fieldbook name specified by the user
		String fieldBookName = "fieldbookAugmentedAlphaLattice"; 
		
		//specify parameters
//		// Case 1: default values
//		Integer numCheck = 9;
//		Integer numNew = 6;
//		String trmtName = null;
//		Integer rep = 2;
//		Integer blkSize = 4;
//		Integer rowPerBlk = 1;
//		Integer rowPerRep = 3;
//		Integer numFieldRow = 3;
//		Integer trial = 1;
//		String fieldOrder = "Serpentine";//"Plot Order";
//		String trmtLabel = null;
//		String checkTrmt = null;
//		String newTrmt = null;
		
		//specify parameters
		// Case 2: demo files
		Integer numCheck = 9;
		Integer numNew = 63;
		String trmtName = "EntryNo";
		Integer blkSize = 10;
		Integer rep = 3;
		Integer trial = 2;
		Integer rowPerBlk = 5;
		Integer rowPerRep = 15;
		Integer numFieldRow = 15;
		String fieldOrder = "Serpentine";
		String trmtLabel = "Designation";
		String[] checkTrmt = null;
		String[] newTrmt = null;
		
		RJavaManager rJavaManager= new RJavaManager();
		rJavaManager.initPBtool();
		rJavaManager.getPbToolRandomizationManager().doDesignAugmentedAlpha(path, fieldBookName, numCheck, numNew, trmtName, 
				blkSize, rep, trial, rowPerBlk, rowPerRep, numFieldRow, fieldOrder, trmtLabel, checkTrmt, newTrmt);
		
	}

}
