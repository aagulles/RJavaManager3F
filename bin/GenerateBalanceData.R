# -------------------------------------------------------------------------------
# GenerateBalancedData
# This function checks if the raw data is balanced or not. If not, it generates 
# the balanced data for a specific mating design 
# Created by: Nellwyn L. Sales 07.23.2012 
# -------------------------------------------------------------------------------


generateBalancedData<-function(design=c("NESTED","FACTORIAL", "DIALLEL2", "DIALLEL3", "DIALLEL4"), data, respvar, male, female, rep) {
	tempData<-data
	
	# get factor levels
	levelsMale<-levels(tempData[,match(male, names(tempData))])
	levelsFemale<-levels(tempData[,match(female, names(tempData))])
	levelsRep<-levels(tempData[,match(rep, names(tempData))])

	# create template of full treatment combinations of the specified design
	fullTrtCombi<-NULL
	if (design == "NESTED")  {
		tempData$Cross <- eval(parse(text = paste("tempData[,'",male,"']:tempData[,'",female,"']", sep="")))
		tempData$Cross <- factor(tempData$Cross)
		levelsMaleFemale <- levels(tempData$Cross)
		for(x in 1:length(levelsMaleFemale)) {
			for (y in 1:length(levelsRep))  {
				newRow<-c(strsplit(levelsMaleFemale[x],":",fixed=TRUE)[[1]][1], strsplit(levelsMaleFemale[x],":",fixed=TRUE)[[1]][2],levelsRep[y])
				fullTrtCombi<- rbind(fullTrtCombi, newRow)
			}
		}
	} else if (design == "FACTORIAL") {
			allLevels<-list (male=as.character(levelsMale),female=as.character(levelsFemale),rep=as.character(levelsRep))
			fullTrtCombi<-fac.gen(allLevels,order="yates")
			colnames(fullTrtCombi) <- c(male, female, rep)
		} else {
			levelsParent<-unique(c(levelsMale, levelsFemale))
			for (i in 1:length(levelsParent)){
				for (j in 1:length(levelsParent)) {
					for (k in 1:length(levelsRep)) {
						if (design == "DIALLEL2") {
							if (i <= j) {
								newRow<-c(levelsParent[i], levelsParent[j], levelsRep[k])
								fullTrtCombi<- rbind(fullTrtCombi, newRow)
							}
						}
						if (design == "DIALLEL3") {
							if (i != j) {
								newRow<-c(levelsParent[i], levelsParent[j], levelsRep[k])
								fullTrtCombi<- rbind(fullTrtCombi, newRow)
							}
						}
						if (design == "DIALLEL4") {
							if (i < j) {
								newRow<-c(levelsParent[i], levelsParent[j], levelsRep[k])
								fullTrtCombi<- rbind(fullTrtCombi, newRow)
							}
						}	
					}
				}
			}
		}
	colnames(fullTrtCombi) <- c(male, female, rep)
	rownames(fullTrtCombi) <- c(1:nrow(fullTrtCombi))
	fullTrtCombi<-data.frame(fullTrtCombi)
	
	# check if the data is balanced. If not, generate balanced data.
	tempComplete <- tempData[complete.cases(tempData[,respvar]),]
	if (nrow(tempComplete)<nrow(fullTrtCombi)) {
		tempData <- merge(tempComplete , fullTrtCombi , by = c(male,female,rep), all.x = TRUE, all.y = TRUE)
	}
	tempData$Cross <- eval(parse(text = paste("tempData[,'",male,"']:tempData[,'",female,"']", sep="")))
	return(tempData)
}