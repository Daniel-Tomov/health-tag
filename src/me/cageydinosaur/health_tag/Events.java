package me.cageydinosaur.health_tag;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Events implements Listener {
	Main plugin;

	public Events(Main plugin) {
		this.plugin = plugin;
	}

	@EventHandler
	public void onDamage(EntityDamageByEntityEvent e) {
		if (e.getEntity() instanceof Player) {
			Player player = (Player) e.getEntity();
			
			player.sendMessage("asdf");
			
			plugin.createScoreboard(player);
		}
	}
}
