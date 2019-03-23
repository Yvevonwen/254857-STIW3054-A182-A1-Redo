
public class Table extends CalcuSoftwareEffortEstimation{
	public void Table1() {
    	System.out.println("	Table 1. Weighting Actors for Complexity");
    	System.out.println("-----------------------------------------------------------------------------");
		System.out.println("|    Actor Type   |                Description             |  Weight Factor |");
		System.out.println("|-----------------|----------------------------------------|-----------------");
		System.out.println("|      Simple     |                Defined API             |        5       |");
		System.out.println("|     Average     |Interactive or Protocol driven interface|        5       |");
		System.out.println("|     Complex     |         Graphical User Interface       |        5       |");
		System.out.println("-----------------------------------------------------------------------------");
     
    }
	public void Table2() {
	    	System.out.println("\n	Table 2. Weighting Use Case for Complexity");
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("|   Use Case Type   |             Description           |  Weight Factor |");
			System.out.println("|-------------------|-----------------------------------|----------------|");
			System.out.println("|       Simple      |      3 or fewer transactions      |        5       |");
			System.out.println("|      Average      |         4 to 7 transactions       |       10       |");
			System.out.println("|      Complex      |      Greater than 7 transaction   |       15       |");
			System.out.println("--------------------------------------------------------------------------");
	       
	    }
	public void Table3() {
		System.out.println("\n\t\t	Table 3. Weighting Technical Factors");
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("| Technical Factor |\t\tFator Description\t\t\t\t|  WeightFator |");
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("|         T1       |\tMusthave a distributed solution\t\t\t\t|       2      |"); 
		System.out.println("|         T2       |\tMust repond to specific performance objectives\t\t|       1      |");
		System.out.println("|         T3       |\tMust meet end-user effieciency desires\t\t\t|       1      |");
		System.out.println("|         T4       |\tComplex internal processing\t\t\t\t|       1      |");
		System.out.println("|         T5       |\tCode must be reusable\t\t\t\t\t|       1      |");
		System.out.println("|         T6       |\tMust be easy to install\t\t\t\t\t|       0.5    |");
		System.out.println("|         T7       |\tMust be easy to use    \t\t\t\t\t|       0.5    |");
		System.out.println("|         T8       |\tMust be portable     \t\t\t\t\t|       2      |");
		System.out.println("|         T9       |\tMust be easy to change\t\t\t\t\t|       1      | ");
		System.out.println("|        T10       |\tMust allow concurrent users\t\t\t\t|       1      |");
		System.out.println("|        T11       |\tIncludes special security features\t\t\t|       1      |");
		System.out.println("|        T12       |\tMust provide direct access for 3rd parties\t\t|       1      |");
		System.out.println("|        T13       |\tRequires special user training facilities\t\t|       1      |");
		System.out.println("---------------------------------------------------------------------------------------------");

	}
	
	public void Table4() {
		System.out.println("\n\t\t	Table 4. Weighting Experience Factors");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println(" |Experience Factor |\t\tFator Description\t\t|  Weight Factor |");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("|         E1        |\tFamiliar with FPT software process\t|\t 1 \t |");
		System.out.println("|         E2        |\tApplication experience\t\t\t|\t0.5\t |");
		System.out.println("|         E3        |\tParadigm experience (OO)\t\t|\t 1 \t |");
		System.out.println("|         E4        |\tLead analyst capability\t\t\t|\t0.5\t |");
		System.out.println("|         E5        |\tMotivation\t\t\t\t|\t 0 \t |");
		System.out.println("|         E6        |\tStable Requirements\t\t\t|\t 2 \t |");
		System.out.println("|         E7        |\tPart-time workers\t\t\t|\t-1 \t |");
		System.out.println("|         E8        |\tDifficulty of programming language\t|\t-1 \t |");
		System.out.println("----------------------------------------------------------------------------------");

	}
	
}
