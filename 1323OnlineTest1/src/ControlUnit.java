import javax.swing.JOptionPane;
public class ControlUnit {
	public static void main(String[] a)
	  {
	    BallotingUnit BU = new BallotingUnit();   // construct model object

	    // tabulate the votes:
	    boolean processing = true;
	    while ( processing )
	          { String s = JOptionPane.showInputDialog("List");
	            if ( s == null )  // did election official press Cancel ?
	                 { processing = false; }  // yes, time to quit
	            else { if ( s.equals("BJP") )
		              { BU.voteForcand1(); }
	                   else if ( s.equals("Vijay") )
			      { BU.voteForcand2(); }
	                   else if ( s.equals("Congress") )
			      { BU.voteForcand3(); }
			   else { } // it's an invalid vote and is lost forever...
	                 }
	           }
	     // total the votes:
	     System.out.println( BU.computeTotals() );
	     System.exit(0);  // terminate program (including graphics components)
	  }
	

}
