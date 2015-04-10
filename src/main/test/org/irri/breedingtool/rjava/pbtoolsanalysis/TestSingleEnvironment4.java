package org.irri.breedingtool.rjava.pbtoolsanalysis;

import org.irri.breedingtool.rjava.manager.RJavaManager;

public class TestSingleEnvironment4 {

	private static String BSLASH = "\\";
	private static String FSLASH = "/";
	private static String PATH1 = System.getProperty("user.dir")+ System.getProperty("file.separator") + "sample_datasets" + System.getProperty("file.separator");
	public static String DATA_PATH = PATH1.replace(BSLASH, FSLASH);
	
	public static void main(String[] args) {
		
		// test for BIMS dataset
		
		//supply path and name of active data
		//String dataFileName = DATA_PATH + "12DS_MET2_Complete_Data.csv";
		//supply path and name of text file where text output is going to be saved
		//String outFileName = DATA_PATH + "SEA_outputBIMS4.txt";
		
		//supply path where the graphs will be saved
		String resultFolderPath = DATA_PATH;

		//specify parameters

//		// TEST RUN FOR RCBD
//		String dataFileName = DATA_PATH + "StabilityData1.csv";
//		String outFileName = DATA_PATH + "SEA_RCBDoutput_StabilityData.txt";
//		String[] respvars = {"GRAINYLD"};
//		
//		int design = 0;
//		String environment = "ENV";
//		String[] environmentLevels = {};
//		String genotype = "GENO";
//		String block = "REP";
//		String rep = "NULL";
//		String row = "NULL";
//		String column = "NULL";
//		boolean descriptiveStat = true; 
//		boolean varianceComponents = true;
//		boolean boxplotRawData = true;
//		boolean histogramRawData = true;
//		boolean heatmapResiduals = false;
//		String heatmapRow = "NULL";
//		String heatmapColumn = "NULLL";
//		boolean diagnosticPlot = true;
//		boolean genotypeFixed = true;
////		boolean performPairwise = false;
//		String pairwiseAlpha = "0.05";
//		String[] genotypeLevels = {}; 
//		String[] controlLevels = {};
//		boolean compareControl = false;
////		boolean performAllPairwise = false;
//		boolean genotypeRandom = true;
//		boolean excludeControls = false;
//		boolean genoPhenoCorrelation = false;
//		boolean specifiedContrast = false;
//		String contrastFileName = null;
		
		// TEST RUN FOR ROWCOL
		String dataFileName = DATA_PATH + "2013DSRYT_row_col.csv";
		String outFileName = DATA_PATH + "SEA_RowColumnOutput_2013DSRYT.txt";
		String[] respvars = {"YIELD_Adj", "MATURITY", "PH", "TILLER","FLW"};
		
		int design = 4;
		String environment = "NULL";
		String[] environmentLevels = {};
		String genotype = "ENTRY";
		String block = "NULL";
		String rep = "REP";
		String row = "ROW";
		String column = "COLUMN";
		boolean descriptiveStat = true; 
		boolean varianceComponents = true;
		boolean boxplotRawData = true;
		boolean histogramRawData = true;
		boolean heatmapResiduals = false;
		String heatmapRow = "NULL";
		String heatmapColumn = "NULLL";
		boolean diagnosticPlot = true;
		boolean genotypeFixed = true;
//		boolean performPairwise = false;
		String pairwiseAlpha = "0.05";
		String[] genotypeLevels = {}; 
		String[] controlLevels = {};
		boolean compareControl = false;
//		boolean performAllPairwise = false;
		boolean genotypeRandom = true;
		boolean excludeControls = false;
		boolean genoPhenoCorrelation = true;
		boolean specifiedContrast = false;
		String contrastFileName = null;

		
		RJavaManager rJavaManager= new RJavaManager();
		rJavaManager.initPBtool();
		rJavaManager.getPbToolAnalysisManager().doSingleEnvironmentAnalysis2(dataFileName, outFileName, resultFolderPath, design, respvars, 
				environment, environmentLevels, genotype, block, rep, row, column, descriptiveStat, varianceComponents, 
				boxplotRawData, histogramRawData, heatmapResiduals, heatmapRow, heatmapColumn, diagnosticPlot, 
				genotypeFixed, pairwiseAlpha, genotypeLevels, controlLevels, compareControl, specifiedContrast, contrastFileName,
				genotypeRandom, excludeControls, genoPhenoCorrelation);
		
	}
}