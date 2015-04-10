package org.irri.breedingtool.rjava.pbtoolsanalysis;

import org.irri.breedingtool.rjava.manager.RJavaManager;

public class TestMultiEnvironmentFirstStage {

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
//		String dataFileName = DATA_PATH + "GY.csv";
//		int designIndex = 0;
//		String[] respvar = {"Yield"};
//		String environment = "Env";
//		String[] environmentLevels = {"BIHAR", "CARI", "CRRI", "DRR", "GOA", "KARAIKAL", "KARNALSA", "KARNALSO", "LUCKNOW", "NDUAT", "PANVEL", "TRICHY"};
//		String genotype = "Genotype";
//		String block = "Rep";
//		String rep = "NULL";
//		String row = "NULL";
//		String column = "NULL";
//		boolean descriptiveStat = true; 
//		boolean varianceComponents = true;
//		boolean boxplotRawData = false;
//		boolean histogramRawData = false;
//		boolean diagnosticPlot = false;
//		boolean genotypeFixed = true;
//		boolean performPairwise = false;
//		String pairwiseAlpha = "0.05";
//		String[] genotypeLevels = {"STBN 1", "STBN 2", "STBN 3", "STBN 4", "STBN 5", "STBN 6", "STBN 7", "STBN 8", "STBN 9", "STBN 10", "STBN 11", "STBN 12", "STBN 13", "STBN 14", "STBN 15", "STBN 16", "STBN 17", "STBN 18", "STBN 19", "STBN 20", "STBN 21", "STBN 22", "STBN 23", "STBN 24", "STBN 25", "STBN 26"};
//		String[] controlLevels = {};
//		boolean compareControl = false;
//		boolean performAllPairwise = false;
//		boolean genotypeRandom = true;
		
		//specify parameters
//		String dataFileName = DATA_PATH + "RCB_ME.csv";
//		int designIndex = 0;
//		String[] respvar = {"Yield"};
//		String environment = "Env";
//		String[] environmentLevels = {"E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8", "E9", "E10", "E11"};
//		String genotype = "Genotype";
//		String block = "Block";
//		String rep = "NULL";
//		String row = "NULL";
//		String column = "NULL";
//		boolean descriptiveStat = true; 
//		boolean varianceComponents = true;
//		boolean boxplotRawData = false;
//		boolean histogramRawData = false;
//		boolean diagnosticPlot = false;
//		boolean genotypeFixed = true;
//		boolean performPairwise = true;
//		String pairwiseAlpha = "0.10";
//		String[] genotypeLevels = {"GEN1", "GEN2", "GEN3", "GEN4", "GEN5", "GEN6", "GEN7", "GEN8", "GEN9", "GEN10", "GEN11", "GEN12", "GEN13", "GEN14", "GEN15"};
//		String[] controlLevels = {"GEN1"};
//		boolean compareControl = true;
//		boolean performAllPairwise = false;
//		boolean genotypeRandom = false;
		
		//specify parameters
//		String dataFileName = DATA_PATH + "RCB_ME_env3.csv";
//		int designIndex = 0;
//		String[] respvar = {"Yield"};
//		String environment = "environment";
//		String[] environmentLevels = {"E1", "E2", "E3"};
//		String genotype = "Genotype";
//		String block = "Block";
//		String rep = "NULL";
//		String row = "NULL";
//		String column = "NULL";
//		boolean descriptiveStat = true; 
//		boolean varianceComponents = true;
//		boolean boxplotRawData = false;
//		boolean histogramRawData = false;
//		boolean diagnosticPlot = false;
//		boolean genotypeFixed = true;
//		boolean performPairwise = false;
//		String pairwiseAlpha = "0.10";
//		String[] genotypeLevels = {"GEN1", "GEN2", "GEN3", "GEN4", "GEN5", "GEN6", "GEN7", "GEN8", "GEN9", "GEN10", "GEN11", "GEN12", "GEN13", "GEN14", "GEN15"};
//		String[] controlLevels = {"GEN5"};
//		boolean compareControl = true;
//		boolean performAllPairwise = false;
//		boolean genotypeRandom = false;
		
				
		//specify parameters
		String dataFileName = DATA_PATH + "RCB_Multi.csv";
		int designIndex = 0;
		String[] respvar = {"Y1", "Y3"};
		String environment = "Site";
		String[] environmentLevels = {"Env1", "Env2"};
		String genotype = "Gen";
		String block = "Blk";
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
		String[] genotypeLevels = {"1", "2", "3", "4", "5", "6", "7", "8"};
		String[] controlLevels = {"6", "7", "8"};
		boolean compareControl = true;
		boolean performAllPairwise = false;
		boolean genotypeRandom = true;
		
//		String dataFileName = DATA_PATH + "Dule_GxE.csv";
//		int designIndex = 3;
//		String[] respvar = {"PlantHt", "YLD"};
//		String environment = "Env";
//		String[] environmentLevels = {"A01WSCM", "A03WS-0", "A03WS-1", "AWS01-D", "UWS02-2", "UWS02-8"};
//		String genotype = "Geno";
//		String block = "Block";
//		String rep = "Rep";
//		String row = "NULL";
//		String column = "NULL";
//		boolean descriptiveStat = false; 
//		boolean varianceComponents = false;
//		boolean boxplotRawData = false;
//		boolean histogramRawData = false;
//		boolean diagnosticPlot = false;
//		boolean genotypeFixed = true;
//		boolean performPairwise = false;
//		String pairwiseAlpha = "0.05";
//		String[] genotypeLevels = {"AUS196", "AZUCENA", "B6144F-MR-6-0-0", "C22", "CT13370-12-2-M", "CT13377-4-2-M", "CT13382-8-3-M", "CT6510-24-1-2", "CT6516-24-3-2",    
//				"DINORADO", "IR47686-30-3-2", "IR55419-04", "IR55423-01", "IR60080-46A", "IR65261-09-1-B", "IR65907-116-1-B", "IR66417-18-1-1-1", "IR66421-062-1-1-2",
//				"IR66424-1-2-1-5", "IR68702-072-1-4-B", "IR70358-84-1-1", "IR70360-38-1-B-1", "IR71524-44-1-1", "IR71525-19-1-1", "IR72768-15-1-1", "IRAT170", "IRAT177",
//				"IRAT212", "IRAT216", "MARAVILHA", "PALAWAN", "PRIMAVERA", "UPLRI-5", "UPLRI-7", "VANDANA", "WAB181-18", "WAB56-125", "WAB638-1", "WAB96-1-1", "WAYRAREM"}; 
//		String[] controlLevels = {"UPLRI-7 ", "IRAT212", "IRAT216"};
//		boolean compareControl = true;
//		boolean performAllPairwise = false;
//		boolean genotypeRandom = true;
		
//		String dataFileName = DATA_PATH + "Yield94.csv";
//		int designIndex = 0;
//		String[] respvar = {"Yield"};
//		String environment = "Env";
//		String[] environmentLevels = {"BH BOHOL PI", "CR CARIMAGU", "CV CAVINTI ", "EL E.LA.LIB", "MA MAN     ", "MB MBE    ",  "MD MINDANAO", "ML MALIGAYA",
//				 "NT ACNATIVA", "SG SITIUNG ", "SY AC SOYA "};
//		String genotype = "Geno";
//		String block = "Rep";
//		String rep = "NULL";
//		String row = "NULL";
//		String column = "NULL";
//		boolean descriptiveStat = false; 
//		boolean varianceComponents = true;
//		boolean boxplotRawData = false;
//		boolean histogramRawData = false;
//		boolean diagnosticPlot = false;
//		boolean genotypeFixed = true;
//		boolean performPairwise = false;
//		String pairwiseAlpha = "0.05";
//		String[] genotypeLevels = {"AZU", "BGORA", "GUAR", "IT146", "OL5", "OS6", "UPL5", "VAND", "W181-18", "W56-125", "W56-50", "W96-1-1"};
//		String[] controlLevels = {};
//		boolean compareControl = false;
//		boolean performAllPairwise = false;
//		boolean genotypeRandom = true;
		
//		String dataFileName = DATA_PATH + "LatinAlpha.csv";
//		int designIndex = 5;
//		String[] respvar = {"Y"};
//		String environment = "Trial";
//		String[] environmentLevels = {"E1", "E2", "E3", "E4", "E5"};
//		String genotype = "Treatment";
//		String block = "Block";
//		String rep = "Rep";
//		String row = "NULL";
//		String column = "NULL";
//		boolean descriptiveStat = true; 
//		boolean varianceComponents = true;
//		boolean boxplotRawData = false;
//		boolean histogramRawData = false;
//		boolean diagnosticPlot = false;
//		boolean genotypeFixed = true;
//		boolean performPairwise = true;
//		String pairwiseAlpha = "0.05";
//		String[] genotypeLevels = {"T1",   "T2",   "T3",   "T4",   "T5",   "T6",   "T7",   "T8",   "T9"}; 
//		String[] controlLevels = {"T3"};
//		boolean compareControl = true;
//		boolean performAllPairwise = false;
//		boolean genotypeRandom = true;
		
//		String dataFileName = DATA_PATH + "NC2RowCol.csv";
//		String dataFileName = DATA_PATH + "NC2RowCol_case3.csv";
//		int designIndex = 6;
//		String[] respvar = {"Y"};
//		String environment = "Trial";
//		String[] environmentLevels = {"1", "2"};
//		String genotype = "trmt";
//		String block = "NULL";
//		String rep = "rep";
//		String row = "row";
//		String column = "col";
//		boolean descriptiveStat = true; 
//		boolean varianceComponents = true;
//		boolean boxplotRawData = false;
//		boolean histogramRawData = false;
//		boolean diagnosticPlot = false;
//		boolean genotypeFixed = true;
//		boolean performPairwise = true;
//		String pairwiseAlpha = "0.05";
//		String[] genotypeLevels = {"T1",   "T2",   "T3",   "T4",   "T5",   "T6",   "T7",   "T8",   "T9"}; 
//		String[] controlLevels = {"T3"};
//		boolean compareControl = true;
//		boolean performAllPairwise = false;
//		boolean genotypeRandom = true;
		
		
		RJavaManager rJavaManager= new RJavaManager();
		rJavaManager.initPBtool();
		rJavaManager.getPbToolAnalysisManager().doMultiEnvironmentOneStage(dataFileName, outFileName, resultFolderPath, designIndex, respvar, environment, environmentLevels,
				genotype, block, rep, row, column, descriptiveStat, varianceComponents, boxplotRawData, histogramRawData, diagnosticPlot, 
				genotypeFixed, performPairwise, pairwiseAlpha, genotypeLevels, controlLevels, compareControl, performAllPairwise, genotypeRandom);
	}

}