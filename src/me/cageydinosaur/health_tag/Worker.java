package me.cageydinosaur.health_tag;

public class Worker implements Runnable{

	Main plugin;
	
	public Worker(Main plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public void run() {
		for (Health i : plugin.playerList) {
			
		}
		
	}

}
