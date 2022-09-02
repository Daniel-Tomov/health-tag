package me.cageydinosaur.health_tag;

import java.util.Date;

import org.bukkit.entity.Player;

public class Health {
	private Player player;
	private long timeCreated;

	public Health(Player player) {
		this.player = player;
		this.timeCreated = new Date().getTime();
	}
	
	public long getTime() {
		return this.timeCreated;
	}
	
	public Player getPlayer() {
		return this.player;
	}
}
