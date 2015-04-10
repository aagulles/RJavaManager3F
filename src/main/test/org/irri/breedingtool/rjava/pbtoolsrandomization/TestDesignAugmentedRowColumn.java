package org.irri.breedingtool.rjava.pbtoolsrandomization;

import org.irri.breedingtool.rjava.manager.RJavaManager;

public class TestDesignAugmentedRowColumn {

	private static String BSLASH = "\\";
	private static String FSLASH = "/";
	private static String PATH1 = System.getProperty("user.dir")+ System.getProperty("file.separator") + "sample_datasets" + System.getProperty("file.separator");
	public static String DATA_PATH = PATH1.replace(BSLASH, FSLASH);
	
	public static void main(String[] args) {
		
		//supply path where the output will be saved
		String path = DATA_PATH; 
		//supply the fieldbook name specified by the user
		String fieldBookName = "fieldbookAugmentedRowColumn"; 
		
		//specify parameters
		// default values:
		Integer numCheck = 4;
		Integer numNew = 8;
		String trmtName = "EntryNo";
		Integer rep = 2; 
		Integer trial = 1; 
		Integer rowblkPerRep = 2;
		Integer rowPerRowblk = 1; 
		Integer numFieldRow = 2;
		String fieldOrder = "Plot Order";
		String trmtLabel = null;
		String checkTrmt = null;
		String newTrmt = null;	
		
		
//		//specify parameters
//		Integer numCheck = 12;
//		Integer numNew = 120;
//		String trmtName = null;
//		Integer rep = 2; 
//		Integer trial = 2; 
//		Integer rowblkPerRep = 3;
//		Integer rowPerRowblk = 3; 
//		Integer numFieldRow = 18;
//		String fieldOrder = "Serpentine";
//		String trmtLabel = null;
//		String checkTrmt = null;
//		String newTrmt = null;
		

		
		RJavaManager rJavaManager= new RJavaManager();
		rJavaManager.initPBtool();
		rJavaManager.getPbToolRandomizationManager().doDesignAugmentedRowColumn(path, fieldBookName, numCheck, numNew,
				trmtName, rep, trial, rowblkPerRep, rowPerRowblk, numFieldRow, fieldOrder, trmtLabel, checkTrmt, 
				newTrmt);
		
	}

}
