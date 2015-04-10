package org.irri.breedingtool.rjava.staranalysis;

import org.irri.breedingtool.rjava.manager.RJavaManager;

public class TestPrincipalComponentAnalysis {

	private static String BSLASH = "\\";
	private static String FSLASH = "/";
	private static String PATH1 = System.getProperty("user.dir")+ System.getProperty("file.separator") + "sample_datasets" + System.getProperty("file.separator");
	public static String DATA_PATH = PATH1.replace(BSLASH, FSLASH);
	
	public static void main(String[] args) {
		//supply path and name of active data
		String dataFileName = DATA_PATH + "PCAex.csv"; 
		//supply path where the output will be placed
		String outputPath = DATA_PATH; 

		//specify parameters
		String[] var = {"SPKLT", "SPKWD", "SLLT", "SLWD", "AWLT"};
		String idVar = "CODE_ACCNO1";
		boolean descriptiveStat = false;
		boolean corMatx = true;
		boolean covMatx = true;
		String matx = "corr";
		String transform = "zerocenter";
		boolean saveScore = true;
		boolean scatterMatx = true;
		boolean scree = true;
		boolean biplot = true;
		boolean pcaplot = false;
		boolean useIdVar = false;
		int[] pChars = {1,2,3,4,5};
		double[] pSizes = {0.75, 0.75, 0.75, 0.75, 0.75};
		String[] pCol = {"rgb(255,0,0,max = 255)", "rgb(0,255,0,max = 255)", "rgb(0,0,255,max = 255)", "rgb(0,255,255,max = 255)", "rgb(127,127,127,max = 255)"};
		boolean showLeg = false; // true;
		String legTitle = "Species";
		String legPos = "bottomright";
		int legNcol = 1;
		int axesNum = 3;

		RJavaManager rJavaManager= new RJavaManager();
		rJavaManager.initStar();
		rJavaManager.getSTARAnalysisManager().doPCA(dataFileName, outputPath,
				var, idVar, descriptiveStat, corMatx, covMatx,matx, transform, saveScore, scatterMatx, scree, biplot, pcaplot, useIdVar, pChars, pSizes, pCol, showLeg,
				legTitle, legPos, legNcol, axesNum);
	}
}
