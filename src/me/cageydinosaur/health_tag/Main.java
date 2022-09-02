package me.cageydinosaur.health_tag;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class Main extends JavaPlugin {

	public ArrayList<Health> playerList = new ArrayList<Health>();

	public void onEnable() {
		this.saveDefaultConfig();
		this.getServer().getPluginManager().registerEvents(new Events(this), this);

		getServer().getScheduler().runTaskTimerAsynchronously(this, new Worker(this), 1, 20);
	}

	public void createScoreboard(Player player) {

		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();

/*
		if (board.getObjective("0") == null) {
			String name = this.chat(
					this.getConfig().getString("names.0").replace("<health>", Double.toString(player.getHealth())));
			final Objective objective = board.registerNewObjective("0", "dummy");
			objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		}
		if (board.getObjective("1") == null) {
			String name = this.chat(
					this.getConfig().getString("names.1").replace("<health>", Double.toString(player.getHealth())));
			final Objective objective = board.registerNewObjective("1", "dummy");
			objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		}
		if (board.getObjective("2") == null) {
			String name = this.chat(
					this.getConfig().getString("names.2").replace("<health>", Double.toString(player.getHealth())));
			final Objective objective = board.registerNewObjective("2", "dummy");
			objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		}
		if (board.getObjective("3") == null) {
			String name = this.chat(
					this.getConfig().getString("names.3").replace("<health>", Double.toString(player.getHealth())));
			final Objective objective = board.registerNewObjective("3", "dummy");
			objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		}
		if (board.getObjective("4") == null) {
			String name = this.chat(
					this.getConfig().getString("names.4").replace("<health>", Double.toString(player.getHealth())));
			final Objective objective = board.registerNewObjective("4", "dummy");
			objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		}
		if (board.getObjective("5") == null) {
			String name = this.chat(
					this.getConfig().getString("names.5").replace("<health>", Double.toString(player.getHealth())));
			final Objective objective = board.registerNewObjective("5", "dummy");
			objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		}
		if (board.getObjective("6") == null) {
			String name = this.chat(
					this.getConfig().getString("names.6").replace("<health>", Double.toString(player.getHealth())));
			final Objective objective = board.registerNewObjective("6", "dummy");
			objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		}
		if (board.getObjective("7") == null) {
			String name = this.chat(
					this.getConfig().getString("names.7").replace("<health>", Double.toString(player.getHealth())));
			final Objective objective = board.registerNewObjective("7", "dummy");
			objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		}
		if (board.getObjective("8") == null) {
			String name = this.chat(
					this.getConfig().getString("names.8").replace("<health>", Double.toString(player.getHealth())));
			final Objective objective = board.registerNewObjective("8", "dummy");
			objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		}
		if (board.getObjective("9") == null) {
			String name = this.chat(
					this.getConfig().getString("names.9").replace("<health>", Double.toString(player.getHealth())));
			final Objective objective = board.registerNewObjective("9", "dummy");
			objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		}
		if (board.getObjective("10") == null) {
			String name = this.chat(
					this.getConfig().getString("names.10").replace("<health>", Double.toString(player.getHealth())));
			final Objective objective = board.registerNewObjective("10", "dummy");
			objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		}
		if (board.getObjective("11") == null) {
			String name = this.chat(
					this.getConfig().getString("names.11").replace("<health>", Double.toString(player.getHealth())));
			final Objective objective = board.registerNewObjective("11", "dummy");
			objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		}
		if (board.getObjective("12") == null) {
			String name = this.chat(
					this.getConfig().getString("names.12").replace("<health>", Double.toString(player.getHealth())));
			final Objective objective = board.registerNewObjective("12", "dummy");
			objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		}
		if (board.getObjective("13") == null) {
			String name = this.chat(
					this.getConfig().getString("names.13").replace("<health>", Double.toString(player.getHealth())));
			final Objective objective = board.registerNewObjective("13", "dummy");
			objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		}
		if (board.getObjective("14") == null) {
			String name = this.chat(
					this.getConfig().getString("names.14").replace("<health>", Double.toString(player.getHealth())));
			final Objective objective = board.registerNewObjective("14", "dummy");
			objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		}
		if (board.getObjective("15") == null) {
			String name = this.chat(
					this.getConfig().getString("names.15").replace("<health>", Double.toString(player.getHealth())));
			final Objective objective = board.registerNewObjective("15", "dummy");
			objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		}
		if (board.getObjective("16") == null) {
			String name = this.chat(
					this.getConfig().getString("names.16").replace("<health>", Double.toString(player.getHealth())));
			final Objective objective = board.registerNewObjective("16", "dummy");
			objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		}
		if (board.getObjective("17") == null) {
			String name = this.chat(
					this.getConfig().getString("names.17").replace("<health>", Double.toString(player.getHealth())));
			final Objective objective = board.registerNewObjective("17", "dummy");
			objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		}
		if (board.getObjective("18") == null) {
			String name = this.chat(
					this.getConfig().getString("names.18").replace("<health>", Double.toString(player.getHealth())));
			final Objective objective = board.registerNewObjective("18", "dummy");
			objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		}
		if (board.getObjective("19") == null) {
			String name = this.chat(
					this.getConfig().getString("names.19").replace("<health>", Double.toString(player.getHealth())));
			final Objective objective = board.registerNewObjective("19", "dummy");
			objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		}
		if (board.getObjective("20") == null) {
			String name = this.chat(
					this.getConfig().getString("names.20").replace("<health>", Double.toString(player.getHealth())));
			final Objective objective = board.registerNewObjective("20", "dummy");
			objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		}
		if (board.getObjective("21") == null) {
			String name = this.chat(
					this.getConfig().getString("names.21").replace("<health>", Double.toString(player.getHealth())));
			final Objective objective = board.registerNewObjective("21", "dummy");
			objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		}
		if (board.getObjective("22") == null) {
			String name = this.chat(
					this.getConfig().getString("names.22").replace("<health>", Double.toString(player.getHealth())));
			final Objective objective = board.registerNewObjective("22", "dummy");
			objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		}
		if (board.getObjective("23") == null) {
			String name = this.chat(
					this.getConfig().getString("names.23").replace("<health>", Double.toString(player.getHealth())));
			final Objective objective = board.registerNewObjective("23", "dummy");
			objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		}
		if (board.getObjective("24") == null) {
			String name = this.chat(
					this.getConfig().getString("names.24").replace("<health>", Double.toString(player.getHealth())));
			final Objective objective = board.registerNewObjective("24", "dummy");
			objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		}
*/
		
		String name = this.chat(this.getConfig().getString("name").replace("<health>", Double.toString(player.getHealth())));
		Objective objective = board.registerNewObjective("health", "dummy");
		objective.setDisplayName("this is the name");
		objective.setDisplaySlot(DisplaySlot.SIDEBAR);
		
		Score score = objective.getScore(name);
		score.setScore(4);
		
		

		player.setScoreboard(board);

	}

	public String chat(String s) {
		return ChatColor.translateAlternateColorCodes('&', s);
	}

}
