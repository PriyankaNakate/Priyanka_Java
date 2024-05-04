class Vote
{
	int voterId;
	long noOfPeople;
	int ageOfVoter;
	boolean isVirtuallyCanVote;

	Vote(int voterId,long noOfPeople,int ageOfVoter,boolean isVirtuallyCanVote)
	{
		this.voterId = voterId;
		this.noOfPeople = noOfPeople;
		this.ageOfVoter = ageOfVoter;
		this.isVirtuallyCanVote = isVirtuallyCanVote;
	}

	public void displayVote()
	{
		System.out.println("**Voting Details**");
		System.out.println("voterId : "+voterId);
		System.out.println("noOfPeople : "+noOfPeople);
		System.out.println("ageOfVoter : "+ageOfVoter);
		System.out.println("isVirtuallyCanVote : "+isVirtuallyCanVote);
	}

}