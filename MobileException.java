class MobileException
{
	boolean playGames;
	boolean watchReels;
	public void playGames(boolean playGames){
		if(playGames==true){
			System.out.println("playing games");
		}
		else{
			System.out.println(" not playing games");
		}
	}

	public void watchReels(boolean watchReels){
		if(watchReels==true){
			System.out.println("we watched reels");
		}
		else{
			System.out.println("we not watched reels");
		}
	}
}