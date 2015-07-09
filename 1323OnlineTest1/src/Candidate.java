import java.util.*;
public class Candidate {  
	   
	  ArrayList<String> candidate=new ArrayList<String>();//creating arraylist  
	  
	public void addcandi(){
		candidate.add("BJP");//adding object in arraylist  
	  candidate.add("Vijay");
	  candidate.add("Congress");
	  } 
	
	public void iter(){
	
	
	Iterator<String> itr=candidate.iterator();//getting Iterator from arraylist to traverse elements  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());
	   
	  }
	  
	}
	
	public int getCandidate() {
		return candidate.size();
		}
	 
	
	 /* System.out.println("No. of Candidates: " + candidate.size());  */
}
