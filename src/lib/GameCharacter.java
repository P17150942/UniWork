package lib;

public class GameCharacter {
	//Fields
	private int lives;
	private int rewards;
	private int rewardsPerLife;
	
	//Constructor
	
	public GameCharacter(){
		this.lives = 1;
		this.rewards = 1;
		this.rewardsPerLife = 1;
	}
	
	public GameCharacter(int lives, int rewards, int rewardsPerLife) {
		this.lives = lives;
		this.rewards = rewards;
		this.rewardsPerLife = rewardsPerLife;
	}
	
	
	//Methods
	
	public void addRewards(int rewards) {
		this.rewards += rewards;
	}
	
	public void setRewardsPerLife(int rewardsPerLife) {
		this.rewardsPerLife = rewardsPerLife;
	}
	
	public int getLivesRemaining() {
		return lives;
	}
	
	public int getRewards() {
		return rewards;
	}
	
	public int getRewardsPerLife() {
		return rewardsPerLife;
	}
	
	public void loseLife() {
		lives -= 1;
	}
	
	public void buyLife() {
		lives += 1;
	}
	
	public boolean isAlive() {
		return lives > 0;
	}

}
