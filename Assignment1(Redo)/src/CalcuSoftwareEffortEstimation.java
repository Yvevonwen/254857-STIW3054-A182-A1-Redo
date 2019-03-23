
public class CalcuSoftwareEffortEstimation {

	public static void main(String[] args) {
		Table table = new Table();  		
		//1.Actor
        CalcuActor calcuActor = new CalcuActor();    
        table.Table1();
        calcuActor.userInputTable1();
        calcuActor.totalActorPoints();
        
        //2.Use Case         
        CalcuUseCase calcuUseCase = new CalcuUseCase();  
        table.Table2();   
        calcuUseCase.userInputTable2();
        calcuUseCase.totalUseCase();
        int UUCP = calcuActor.getTotalActorPoints();
        calcuUseCase.UnadjustedUseCasePoint(UUCP);
		     
        //3.Weighting Technical Factors  
        
        table.Table3();
        WeightingTechnicalFactors weightTF = new WeightingTechnicalFactors();
    	weightTF.CalcuWeightingTF();
        weightTF.TotalTFactor();
        weightTF.TechnicalComplexityFactor();
        int SzUC = calcuUseCase.getUUCP();
        weightTF.SizeOfTheSoftware(SzUC);
        
        //4.Weighting Experience Factors
        table.Table4();
        WeightingExperienceFactors weightEF = new WeightingExperienceFactors();
        weightEF.CalcuWeightingEF();
        weightEF.TotalEFactor();
        weightEF.CalcuExperienceFactor();
        double UCP = weightTF.getSzUC();
        weightEF.CalcuUseCasePoints(UCP);
        
        //5.Man-Hours
        CalcuManHours manH = new CalcuManHours();
        int count = weightEF.getCount();
        double UCP1 = weightEF.getUCP();
        manH.CalculationManHours(count);
        manH.totalManHours(UCP1);
                
        //6.Adjusting Man-Hours for Risk
        AdjustingManHours adjustingManH = new AdjustingManHours();
        double totalManH = manH.getManHours();
        adjustingManH.CalcuAdjustingMan_hours(totalManH);
        
        //7.Weighting Reports for Complexity 
        WeightingReportForComplexity weightingReport = new WeightingReportForComplexity();
        weightingReport.Table5();
        weightingReport.TotalReport();
        double adjManH = adjustingManH.getAdjusting();
        weightingReport.CalcuTotalAdjustingManHoursProject(adjManH);
		
	}
	}

