package org.irri.breedingtool.rjava.staranalysis;

import org.irri.breedingtool.rjava.manager.RJavaManager;

public class TestIndependentMedian {

	private static String BSLASH = "\\";
	private static String FSLASH = "/";
	private static String PATH1 = System.getProperty("user.dir")+ System.getProperty("file.separator") + "sample_datasets" + System.getProperty("file.separator");
	public static String DATA_PATH = PATH1.replace(BSLASH, FSLASH);
	
	public static void main(String[] args) {
		
		//supply path and name of active data
		String dataFileName = DATA_PATH + "Gerua.csv"; 
		//supply path and name of text file where text output is going to be saved
		String outFileName = DATA_PATH; 
		
		//specify parameters
		String[] respvars = {"DFF", "PLHT", "PNCLE", "GRNYLD"};
		String grp = "TPL";
		String altHypo = "two.sided";
		boolean confInt = true;
		float confLevel = 95;
				
		RJavaManager rJavaManager= new RJavaManager();
		rJavaManager.initStar();
		rJavaManager.getSTARAnalysisManager().doIndependentMedian(dataFileName, outFileName, respvars, grp, altHypo, confInt, confLevel);
	}

}
