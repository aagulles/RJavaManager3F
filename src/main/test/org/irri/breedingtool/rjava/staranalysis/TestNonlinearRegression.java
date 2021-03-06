package org.irri.breedingtool.rjava.staranalysis;

import org.irri.breedingtool.rjava.manager.RJavaManager;

public class TestNonlinearRegression {

	private static String BSLASH = "\\";
	private static String FSLASH = "/";
	private static String PATH1 = System.getProperty("user.dir")+ System.getProperty("file.separator") + "sample_datasets" + System.getProperty("file.separator");
	public static String DATA_PATH = PATH1.replace(BSLASH, FSLASH);
	
	public static void main(String[] args) {
		
//		//supply path and name of active data
//		String dataFileName = DATA_PATH + "dnase2.csv"; 
//		//supply path and name of text file where text output is going to be saved
//		String outputPath = DATA_PATH; 
//		
//		//specify parameters
//		String[] depvar = {"density", "densK"};
//		//String[] indepvar = {"PLHT", "PNCLE"};
//		String indepvar = "logConc";
//		boolean statistics = true;
//		String model = "gompertz";
//		String modelExp = "NULL";
//		String startValues = "NULL";
//		boolean normality = true;
//		boolean covMatrix = true;
//		boolean confInterval = true; //false; 
//		double confLevel = 95;
		
		//supply path and name of active data	
		//quadratic as custom example

		String dataFileName = DATA_PATH + "dataPoly.csv"; 
		//supply path and name of text file where text output is going to be saved
		String outputPath = DATA_PATH; 
		
		//specify parameters
		String[] depvar = {"y2", "y1"};
		String indepvar = "consum";
		boolean statistics = true;
		String model = "custom";
		String modelExp = "A + B * consum + C * consum ^ 2"; //"NULL";
		String startValues = "list(A = 1500, B = 10, C = 0)"; //"NULL";
		boolean normality = true;
		boolean covMatrix = true;
		boolean confInterval = true; //false; 
		double confLevel = 0.95;

//				
//		//supply path and name of active data
//		String dataFileName = DATA_PATH + "dataPoly.csv"; 
//		//supply path and name of text file where text output is going to be saved
//		String outputPath = DATA_PATH; 
//		
//		//specify parameters
//		String[] depvar = {"y2", "y1"};
//		//String[] indepvar = {"PLHT", "PNCLE"};
//		String indepvar = "consum";
//		boolean statistics = true;
//		String model = "fpl";
//		String modelExp = "NULL";
//		String startValues = "NULL";
//		boolean normality = true;
//		boolean covMatrix = true;
//		boolean confInterval = true; //false; 
//		double confLevel = 95;
		
		RJavaManager rJavaManager= new RJavaManager();
		rJavaManager.initStar();
		rJavaManager.getSTARAnalysisManager().doNonlinearRegression(dataFileName, 
				outputPath, depvar, indepvar, statistics, model, modelExp, 
				startValues, covMatrix, normality, confInterval, confLevel); 
	}

}
