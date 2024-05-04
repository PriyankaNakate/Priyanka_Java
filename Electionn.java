class Electionn
{
	String type;
	int noOfCandidates;
	String electionCity;
	boolean electionResult;
	Vote vote = new Vote(486714,7857342772l,24,true);

	Electionn(String type,int noOfCandidates,String electionCity,boolean electionResult)
	{
		this.type = type;
		this.noOfCandidates = noOfCandidates;
		this.electionCity = electionCity;
		this.electionResult = electionResult;
	}

	public void displayElection(){
		System.out.println("**Election Details**");
		System.out.println("Type : "+type);
		System.out.println("noOfCandidates : "+noOfCandidates);
		System.out.println("electionCity : "+electionCity);
		System.out.println("electionResult : "+electionResult);
	}
}