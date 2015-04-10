package org.irri.breedingtool.rjava.staranalysis;

import org.irri.breedingtool.rjava.manager.RJavaManager;

public class TestNormality {

	private static String BSLASH = "\\";
	private static String FSLASH = "/";
	private static String PATH1 = System.getProperty("user.dir")+ System.getProperty("file.separator") + "sample_datasets" + System.getProperty("file.separator");
	public static String DATA_PATH = PATH1.replace(BSLASH, FSLASH);
	
	public static void main(String[] args) {
		
		//supply path and name of active data
		String dataFileName = DATA_PATH + "Gerua.csv"; 
		//supply path and name of text file where text output is going to be saved
		String outFileName = DATA_PATH + "TestOutput.txt"; 
		//supply path and name of boxplot file
		String graphBoxFileName = DATA_PATH + "Boxplot_"; 
		//supply path and name of histogram file
		String graphHistFileName = DATA_PATH + "Histogram_"; 
		
		//specify parameters
		//String[] respvars = {"DFF", "PLHT", "PNCLE", "GRNYLD"};
		String[] respvars = {"GRNYLD"};
		// if grp is null
		 //String[] grp = null;
		//if grp is not null
		String[] grp = {"TPL"};
		String[] method = {"swilk", "sfrancia", "ks", "cramer", "anderson"};
		String outputBoxplot = "TRUE";
		String outputHist = "TRUE";
		
		RJavaManager rJavaManager= new RJavaManager();
		rJavaManager.initStar();
		rJavaManager.getSTARAnalysisManager().doNormality(dataFileName, outFileName, respvars, grp, method, outputBoxplot, graphBoxFileName, outputHist, graphHistFileName);
	}

}
