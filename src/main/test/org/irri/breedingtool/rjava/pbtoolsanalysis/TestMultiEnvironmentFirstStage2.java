package org.irri.breedingtool.rjava.pbtoolsanalysis;

import org.irri.breedingtool.rjava.manager.RJavaManager;

public class TestMultiEnvironmentFirstStage2 {

	private static String BSLASH = "\\";
	private static String FSLASH = "/";
	private static String PATH1 = System.getProperty("user.dir")+ System.getProperty("file.separator") + "sample_datasets" + System.getProperty("file.separator");
	public static String DATA_PATH = PATH1.replace(BSLASH, FSLASH);
	
	public static void main(String[] args) {
		
		//supply path and name of active data
		
		//supply path and name of text file where text output is going to be saved
		String outFileName = DATA_PATH + "MEAFirstStage_output.txt";
		//supply path where the graphs will be saved
		String resultFolderPath = DATA_PATH;
		
		//specify parameters
		String dataFileName = DATA_PATH + "StabilityData1.csv";
		int designIndex = 0;
		String[] respvar = {"GRAINYLD"};
		String environment = "ENV";
		String[] environmentLevels = {"E1", "E2", "E3", "E4", "E5","E6"};
		String genotype = "GENO";
		String block = "REP";
		String rep = "NULL";
		String row = "NULL";
		String column = "NULL";
		boolean descriptiveStat = true; 
		boolean varianceComponents = true;
		boolean boxplotRawData = true;
		boolean histogramRawData = true;
		boolean diagnosticPlot = true;
		boolean genotypeFixed = true;
		boolean performPairwise = false;
		String pairwiseAlpha = "0.05";
		String[] genotypeLevels = {"G1", "G2", "G3", "G4", "G5", "G6", "G7"};
		String[] controlLevels = {"G6", "G7"};
		boolean compareControl = true;
		boolean performAllPairwise = false;
		boolean genotypeRandom = true;
		
		
		RJavaManager rJavaManager= new RJavaManager();
		rJavaManager.initPBtool();
		rJavaManager.getPbToolAnalysisManager().doMultiEnvironmentOneStage(dataFileName, outFileName, resultFolderPath, designIndex, respvar, environment, environmentLevels,
				genotype, block, rep, row, column, descriptiveStat, varianceComponents, boxplotRawData, histogramRawData, diagnosticPlot, 
				genotypeFixed, performPairwise, pairwiseAlpha, genotypeLevels, controlLevels, compareControl, performAllPairwise, genotypeRandom);
	}

}