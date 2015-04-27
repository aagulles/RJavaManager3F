package org.irri.breedingtool.rjava.pbtoolsanalysis;

import org.irri.breedingtool.rjava.manager.RJavaManager;

public class TestSingleEnvironment_RCBD {

	private static String BSLASH = "\\";
	private static String FSLASH = "/";
	private static String PATH1 = System.getProperty("user.dir")+ System.getProperty("file.separator") + "sample_datasets" + System.getProperty("file.separator");
	public static String DATA_PATH = PATH1.replace(BSLASH, FSLASH);
	
	public static void main(String[] args) {
		
		//supply path and name of active data
//		String dataFileName = DATA_PATH + "12DS_MET2_Complete_Data.csv";
		//supply path and name of text file where text output is going to be saved
		String outFileName = DATA_PATH + "SEA_RCBDoutput.txt";
		//supply path where the graphs will be saved
		String resultFolderPath = DATA_PATH;
		
		//specify parameters
		//Design: Randomized Complete Block Design
		//sample data for DABT
		String dataFileName = DATA_PATH + "Yield94.csv";
		int design = 0;
		String[] respvars = {"Yield"};
		String environment = "Env";
		String[] environmentLevels = {"MB MBE", "MA MAN", "CR CARIMAGU", "EL E.LA.LIB", "NT ACNATIVA", "SY AC SOYA", "SG SITIUNG", "BH BOHOL PI", "CV CAVINTI", "ML MALIGAYA", "MD MINDANAO"};
		String genotype = "Geno";
		String block = "Rep";
		String rep = "NULL";
		String row = "NULL";
		String column = "NULL";
		boolean descriptiveStat = true; 
		boolean varianceComponents = true;
		boolean boxplotRawData = true;
		boolean histogramRawData = true;
		boolean heatmapResiduals = false;
		String heatmapRow = "NULL";
		String heatmapColumn = "NULLL";
		boolean diagnosticPlot = true;
		boolean genotypeFixed = true;
		boolean performPairwise = false;
		String pairwiseAlpha = "0.05";
		String[] genotypeLevels = {"AZU", "BGORA", "GUAR", "IT146", "OL5", "OS6","UPL5","VAND","W181-18","W56-125","W56-50","W96-1-1"};
		String[] controlLevels = {"BGORA","W96-1-1"};
		boolean compareControl = false;
		boolean performAllPairwise = false;
		boolean genotypeRandom = true;
		boolean excludeControls = false;
		boolean genoPhenoCorrelation = false;
		
//		String dataFileName = DATA_PATH + "RCB_ME.csv";
//		int design = 0;
//		String[] respvars = {"Yield"};
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
//		boolean heatmapResiduals = false;
//		String heatmapRow = "NULL";
//		String heatmapColumn = "NULLL";
//		boolean diagnosticPlot = false;
//		boolean genotypeFixed = false;
//		boolean performPairwise = false;
//		String pairwiseAlpha = "0.05";
//		String[] genotypeLevels = {"GEN1", "GEN2", "GEN3", "GEN4", "GEN5", "GEN6", "GEN7", "GEN8", "GEN9", "GEN10", "GEN11", "GEN12", "GEN13", "GEN14", "GEN15"};
//		String[] controlLevels = {"GEN1", "GEN2"};
//		boolean compareControl = true;
//		boolean performAllPairwise = false;
//		boolean genotypeRandom = true;
//		boolean excludeControls = true;
//		boolean genoPhenoCorrelation = false;
		
//		String dataFileName = DATA_PATH + "RCB_ME.csv";
//		int design = 0;
//		String[] respvars = {"Yield", "Y2"};
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
//		boolean heatmapResiduals = false;
//		String heatmapRow = "NULL";
//		String heatmapColumn = "NULL";
//		boolean diagnosticPlot = false;
//		boolean genotypeFixed = false;
//		boolean performPairwise = true;
//		String pairwiseAlpha = "0.05";
//		String[] genotypeLevels = {"GEN1", "GEN2", "GEN3", "GEN4", "GEN5", "GEN6", "GEN7", "GEN8", "GEN9", "GEN10", "GEN11", "GEN12", "GEN13", "GEN14", "GEN15"};
//		String[] controlLevels = {"GEN14"};
//		boolean compareControl = true;
//		boolean performAllPairwise = false;
//		boolean genotypeRandom = true;
//		boolean excludeControls = true;
//		boolean genoPhenoCorrelation = false;
		
//		String dataFileName = DATA_PATH + "RCB_ME_env2_b.csv";
//		int design = 0;
//		String[] respvars = {"Yield"};
//		String environment = "Env";
//		String[] environmentLevels = {"E1", "E2"};
//		String genotype = "Genotype";
//		String block = "Block";
//		String rep = "NULL";
//		String row = "NULL";
//		String column = "NULL";
//		boolean descriptiveStat = true; 
//		boolean varianceComponents = true;
//		boolean boxplotRawData = false;
//		boolean histogramRawData = false;
//		boolean heatmapResiduals = false;
//		String heatmapRow = "NULL";
//		String heatmapColumn = "NULLL";
//		boolean diagnosticPlot = false;
//		boolean genotypeFixed = false;
//		boolean performPairwise = false;
//		String pairwiseAlpha = "0.05";
//		String[] genotypeLevels = {"GEN100","GEN1", "GEN2", "GEN3", "GEN4", "GEN5", "GEN6", "GEN7", "GEN8", "GEN9", "GEN10", "GEN11", "GEN12", "GEN13", "GEN14", "GEN15"};
//		String[] controlLevels = {"GEN100", "GEN7", "GEN8", "GEN9", "GEN10", "GEN11", "GEN12", "GEN13", "GEN14", "GEN15"};
//		boolean compareControl = true;
//		boolean performAllPairwise = false;
//		boolean genotypeRandom = true;
//		boolean excludeControls = true;
//		boolean genoPhenoCorrelation = false;
		
//		String dataFileName = DATA_PATH + "RCB_ME_env3_b.csv";
//		int design = 0;
//		String[] respvars = {"Y3", "Y4"};
//		String environment = "environment";
//		String[] environmentLevels = {"E1", "E2", "E3"};
//		String genotype = "Genotype";
//		String block = "Block";
//		String rep = "NULL";
//		String row = "NULL";
//		String column = "NULL";
//		boolean descriptiveStat = false; 
//		boolean varianceComponents = true;
//		boolean boxplotRawData = true;
//		boolean histogramRawData = true;
//		boolean heatmapResiduals = false;
//		String heatmapRow = "NULL";
//		String heatmapColumn = "NULL";
//		boolean diagnosticPlot = true;
//		boolean genotypeFixed = true;
//		boolean performPairwise = false;
//		String pairwiseAlpha = "0.05";
//		String[] genotypeLevels = {"GEN1", "GEN2", "GEN3", "GEN4", "GEN5", "GEN6", "GEN7", "GEN8", "GEN9", "GEN10", "GEN11", "GEN12", "GEN13", "GEN14", "GEN15"};
//		String[] controlLevels = {"GEN100", "GEN14"};
//		boolean compareControl = true;
//		boolean performAllPairwise = false;
//		boolean genotypeRandom = true;
//		boolean excludeControls = true;
//		boolean genoPhenoCorrelation = true;
		
//		String dataFileName = DATA_PATH + "RCB_Multi.csv";
//		int design = 0;
//		String[] respvars = {"Y1"};
//		String environment = "Site";
//		String[] environmentLevels = {"Env1", "Env2"};
////		String environment = "NULL";
////		String[] environmentLevels = {};
//		String genotype = "Gen";
//		String block = "Blk";
//		String rep = "NULL";
//		String row = "NULL";
//		String column = "NULL";
//		boolean descriptiveStat = false; 
//		boolean varianceComponents = false;
//		boolean boxplotRawData = false;
//		boolean histogramRawData = false;
//		boolean heatmapResiduals = false;
//		String heatmapRow = "fieldRow";
//		String heatmapColumn = "fieldColumn";
//		boolean diagnosticPlot = false;
//		boolean genotypeFixed = true;
//		boolean performPairwise = false;
//		String pairwiseAlpha = "0.05";
//		String[] genotypeLevels = {"1",   "2",   "3",   "4",   "5",   "6",   "7",   "8"};
//		String[] controlLevels = {"1", "2", "3"};
//		boolean compareControl = false;
//		boolean performAllPairwise = false;
//		boolean genotypeRandom = false;
//		boolean excludeControls = false;
//		boolean genoPhenoCorrelation = false;
		
//		String dataFileName = DATA_PATH + "GGE DATA multiloc.csv";
//		int design = 0;
//		String[] respvars = {"MAT"};
//		String environment = "Env";
//		String[] environmentLevels = {"11DSAGU", "11DSASU", "11DSBAT", "11DSBIC", "11DSBUL", "11DSCES", "11DSILO", "11DSISA", "11DSLBL", "11DSMIN", "11DSNEG", "11DSNVS", "11WSAGU", "11WSASU", "11WSBAT", "11WSBIC", "11WSBUL", "11WSCES",
//				"11WSILO", "11WSISA", "11WSLBL", "11WSMIN", "11WSNEG", "11WSNVS"};
//		String genotype = "Geno";
//		String block = "Rep";
//		String rep = "NULL";
//		String row = "NULL";
//		String column = "NULL";
//		boolean descriptiveStat = true; 
//		boolean varianceComponents = true;
//		boolean boxplotRawData = false;
//		boolean histogramRawData = false;
//		boolean heatmapResiduals = false;
//		String heatmapRow = "NULL";
//		String heatmapColumn = "NULL";
//		boolean diagnosticPlot = false;
//		boolean genotypeFixed = true;
//		boolean performPairwise = false;
//		String pairwiseAlpha = "0.05";
//		String[] genotypeLevels = {"1",   "2",   "3",   "4",   "5",   "6",   "7",   "8", "9", "10"};
//		String[] controlLevels = {"7", "8", "9"};
//		boolean compareControl = true;
//		boolean performAllPairwise = false;
//		boolean genotypeRandom = true;
//		boolean excludeControls = false;
//		boolean genoPhenoCorrelation = true;
		
//		String dataFileName = DATA_PATH + "GGE DATA multiloc_env3.csv";
//		int design = 0;
//		String[] respvars = {"YLD", "DTF"};
//		String environment = "Env";
//		String[] environmentLevels = {"11DSCES", "11WSBIC", "11WSBUL"};
//		String genotype = "Geno";
//		String block = "Rep";
//		String rep = "NULL";
//		String row = "NULL";
//		String column = "NULL";
//		boolean descriptiveStat = true; 
//		boolean varianceComponents = true;
//		boolean boxplotRawData = false;
//		boolean histogramRawData = false;
//		boolean heatmapResiduals = true;
//		String heatmapRow = "Rep";
//		String heatmapColumn = "Geno";
//		boolean diagnosticPlot = false;
//		boolean genotypeFixed = true;
//		boolean performPairwise = false;
//		String pairwiseAlpha = "0.05";
//		String[] genotypeLevels = {"1",   "2",   "3",   "4",   "5",   "6",   "7",   "8", "9", "10"};
//		String[] controlLevels = {"7", "8", "9"};
//		boolean compareControl = true;
//		boolean performAllPairwise = false;
//		boolean genotypeRandom = true;
//		boolean excludeControls = true;
//		boolean genoPhenoCorrelation = false;
		
//		String dataFileName = DATA_PATH + "QTL_pheno.csv";
//		int design = 0;
//		String[] respvars = {"HEIGHT"};
//		String environment = "ENV";
//		String[] environmentLevels = {"1", "2"};
////		String environment = "NULL";
////		String[] environmentLevels = {};
//		String genotype = "GENOTYPE";
//		String block = "REP";
//		String rep = "NULL";
//		String row = "NULL";
//		String column = "NULL";
//		boolean descriptiveStat = false; 
//		boolean varianceComponents = false;
//		boolean boxplotRawData = false;
//		boolean histogramRawData = false;
//		boolean heatmapResiduals = false;
//		String heatmapRow = "fieldRow";
//		String heatmapColumn = "fieldColumn";
//		boolean diagnosticPlot = false;
//		boolean genotypeFixed = true;
//		boolean performPairwise = false;
//		String pairwiseAlpha = "0.05";
//		String[] genotypeLevels = {"1",   "2",   "3",   "4",   "5",   "6",   "7",   "8"};
//		String[] controlLevels = {"1", "2", "3"};
//		boolean compareControl = false;
//		boolean performAllPairwise = false;
//		boolean genotypeRandom = false;
//		boolean excludeControls = false;
//		boolean genoPhenoCorrelation = false;
		

		RJavaManager rJavaManager= new RJavaManager();
		rJavaManager.initPBtool();
		rJavaManager.getPbToolAnalysisManager().doSingleEnvironmentAnalysis(dataFileName, outFileName, resultFolderPath, design, respvars, environment, environmentLevels,
				genotype, block, rep, row, column, descriptiveStat, varianceComponents, boxplotRawData, histogramRawData, heatmapResiduals, heatmapRow, 
				heatmapColumn, diagnosticPlot, genotypeFixed, performPairwise, pairwiseAlpha, genotypeLevels, controlLevels, compareControl, performAllPairwise,
				genotypeRandom, excludeControls, genoPhenoCorrelation);
	}

}