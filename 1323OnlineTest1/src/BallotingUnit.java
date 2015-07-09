
public class BallotingUnit {
	  private int[] vote; // holds the votes for the candidates
	                      // vote[0] holds BJP's votes
	                      // vote[1] holds Vijay's votes
	                      // vote[2] holds Congress's votes

	  /** Constructor  BallotingUnit  initializes the votes */
	  public BallotingUnit(){
		  vote = new int[3]; 
		  }  // all cells are automatically set to 0

	  /** voteForcand1  adds one more vote to BJP's total */
	  public void voteForcand1()
	  { vote[0] = vote[0] + 1; }

	  /** voteForcand2 adds one more vote to Vijay's total */
	  public void voteForcand2()
	  { vote[1] = vote[1] + 1; }

	  /** voteForcand3 adds one more vote to Congress's total */
	  public void voteForcand3()
	  { vote[2] = vote[2] + 1; }

	  /** computeTotals reports the votes for the three candidates
	    * @return a string that lists the candidates and their votes. */
	  public String computeTotals()
	  { return   "BJP:" + vote[0] + "\n"
	           + "Vijay: = " + vote[1] + "\n"
	           + "Congress= " + vote[2] + "\n" ; 
	  }
}
