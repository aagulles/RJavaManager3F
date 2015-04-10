package org.irri.breedingtool.rjava.pbtoolsanalysis;

import org.irri.breedingtool.rjava.manager.RJavaManager;

public class TestTTCMEnew {

	private static String BSLASH = "\\";
	private static String FSLASH = "/";
	private static String PATH1 = System.getProperty("user.dir")+ System.getProperty("file.separator") + "sample_datasets" + System.getProperty("file.separator");
	public static String DATA_PATH = PATH1.replace(BSLASH, FSLASH);
	
	public static void main(String[] args) {
		
		//supply path and name of active data
		String dataFileName = DATA_PATH + "NC2Alpha_missing.csv";
		//supply path and name of text file where text output is going to be saved
		String outFileName = DATA_PATH + "TTC_ME_output.txt";
		
		//specify parameters
//		String design = "CRD";
//		String[] respvars = {"Y", "Y2"};
//		String female = "fem";
//		String male = "male";
//		String rep = "replication";
//		String block = "NULL";
//		String row = "NULL";
//		String column = "NULL";
//		String environment = "Trial";
//		String individual = "NULL";
//		String codeP1 = "1";
//		String codeP2 = "2";
//		String codeF1 = "3";
//		String alpha = "0.65";
		
		//specify parameters
		String design = "RCB";
		String[] respvars = {"Y"};
		String female = "fem";
		String male = "male";
		String rep = "NULL";
		String block = "replication";
		String row = "NULL";
		String column = "NULL";
		String environment = "Trial";
		String individual = "NULL";
		String codeP1 = "1";
		String codeP2 = "2";
		String codeF1 = "3";
		String alpha = "0.65";
		
		//specify parameters
//		String design = "Alpha";
//		String[] respvars = {"Y"};
//		String female = "fem";
//		String male = "male";
//		String rep = "replication";
//		String block = "block";
//		String row = "NULL";
//		String column = "NULL";
//		String environment = "Trial";
//		String individual = "NULL";
//		String codeP1 = "1";
//		String codeP2 = "2";
//		String codeF1 = "3";
//		String alpha = "0.65";
		
		//specify parameters
//		String dataFileName = DATA_PATH + "NC2RowCol.csv";
//		
//		String design = "RowColumn";
//		String[] respvars = {"Y"};
//		String female = "fem";
//		String male = "male";
//		String rep = "rep";
//		String block = "NULL";
//		String row = "row";
//		String column = "col";
//		String environment = "Trial";
//		String individual = "NULL";
//		String codeP1 = "F1";
//		String codeP2 = "F2";
//		String codeF1 = "F3";
//		String alpha = "0.98";
		
		RJavaManager rJavaManager= new RJavaManager();
		rJavaManager.initPBtool();
		rJavaManager.getPbToolAnalysisManager().doTTCMETest(dataFileName, outFileName, design, respvars, female, male, rep, block, row, column, individual, environment, codeP1, codeP2, codeF1, alpha);
	}

}