package org.irri.breedingtool.rjava.pbtoolsrandomization;

import org.irri.breedingtool.rjava.manager.RJavaManager;

public class TestDesignAugmentedRCB {

	private static String BSLASH = "\\";
	private static String FSLASH = "/";
	private static String PATH1 = System.getProperty("user.dir")+ System.getProperty("file.separator") + "sample_datasets" + System.getProperty("file.separator");
	public static String DATA_PATH = PATH1.replace(BSLASH, FSLASH);
	
	public static void main(String[] args) {
		
		//supply path where the output will be saved
		String path = DATA_PATH; 

		//specify parameters
//		// Case 1: default values 
//		String fieldBookName = "fieldbookAugRCB1"; 		//supply the fieldbook name specified by the user 
//		Integer numCheck = 6;
//		Integer numNew = 8;
//		String trmtName = null;
//		Integer Blk = 4; 
//		Integer trial = 1;
//		Integer rowPerBlk = 2;
//		Integer numFieldRow = 4;
//		String fieldOrder = "Serpentine";
//		String trmtLabel = null;
//		String[] checkTrmt = null; 
//		String[] newTrmt = null;

//		// Case 2: 
//		String fieldBookName = "fieldbookAugRCB2"; 		//supply the fieldbook name specified by the user 
//
//		Integer numCheck = 6;
//		Integer numNew = 60;
//		String trmtName = null;
//		Integer Blk = 4; 
//		Integer trial = 2;
//		Integer rowPerBlk = 21;
//		Integer numFieldRow = 21;
//		String fieldOrder = "Plot Order";
//		String trmtLabel = null;
//		String[] checkTrmt = null; 
//		String[] newTrmt = null;

		
//		// Case 3: 
//		String fieldBookName = "fieldbookAugRCB3"; 		//supply the fieldbook name specified by the user 
//
//		Integer numCheck = 6;
//		Integer numNew = 60;
//		String trmtName = null;
//		Integer Blk = 4; 
//		Integer trial = 2;
//		Integer rowPerBlk = 7;
//		Integer numFieldRow = 14;
//		String fieldOrder = "Serpentine";
//		String trmtLabel = "Variety";
//		String[] checkTrmt = {"T1", "T2", "T3","T4","T5","T6"}; 
//		String[] newTrmt = null;

//		// Case 4: 
//		String fieldBookName = "fieldbookAugRCB4"; 		//supply the fieldbook name specified by the user 
//		//specify parameters
//		Integer numCheck = 6;
//		Integer numNew = 60;
//		String trmtName = "EntryNum";
//		Integer Blk = 4; 
//		Integer trial = 2;
//		Integer rowPerBlk = 7;
//		Integer numFieldRow = 14;
//		String fieldOrder = "Serpentine";
//		String trmtLabel = null;
//		String[] checkTrmt = null; 
//		String[] newTrmt = null;
		
//		// Case 5: test for B4Rice 
//		String fieldBookName = "fieldbookAugRCB5"; 		//supply the fieldbook name specified by the user 
//		//specify parameters
//		Integer numCheck = 5;
//		Integer numNew = 702;
//		String trmtName = "EntryNum";
//		Integer Blk = 6; 
//		Integer trial = 1;
//		Integer rowPerBlk = 122;
//		Integer numFieldRow = 122;
//		String fieldOrder = "Serpentine";
//		String trmtLabel = null;
//		String[] checkTrmt = null; 
//		String[] newTrmt = null;
		
		// Case 5: test for B4Rice 
		String fieldBookName = "fieldbookAugRCB6"; 		//supply the fieldbook name specified by the user 
		//specify parameters
		Integer numCheck = 2;
		Integer numNew = 4;
		String trmtName = "EntryNum";
		Integer Blk = 2; 
		Integer trial = 1;
		Integer rowPerBlk = 4;
		Integer numFieldRow = 8;
		String fieldOrder = "Serpentine";
		String trmtLabel = null;
		String[] checkTrmt = null; 
		String[] newTrmt = null;

		RJavaManager rJavaManager= new RJavaManager();
		rJavaManager.initPBtool();
		rJavaManager.getPbToolRandomizationManager().doDesignAugRCB(path, fieldBookName, numCheck, numNew, trmtName, Blk, 
				trial, rowPerBlk, numFieldRow, fieldOrder, trmtLabel, checkTrmt, newTrmt);
	}

}
