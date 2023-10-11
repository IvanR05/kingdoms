package org.qascadia;

import org.bukkit.plugin.java.JavaPlugin;
import org.qascadia.commands.Gamemode;
import org.qascadia.events.DeathEvent;
import org.qascadia.events.JoinEvent;
import org.qascadia.events.KingdomCreateEvent;
import org.qascadia.events.KingdomRemoveEvent;
import org.qascadia.util.Console;

public class Kingdoms extends JavaPlugin {
  private static Kingdoms Instance;

  public void onEnable() {
    Instance = this;
    Console.log("&aPlugin enabled!");

    // Events
    getServer().getPluginManager().registerEvents(new DeathEvent(), this);
    getServer().getPluginManager().registerEvents(new JoinEvent(), this);
    getServer().getPluginManager().registerEvents(new KingdomCreateEvent(), this);
    getServer().getPluginManager().registerEvents(new KingdomRemoveEvent(), this);

    // Commands
    getCommand("gamemode").setExecutor(new Gamemode());
  }

  public void onDisable() {
    Console.log("&cPlugin disabled!");
  }

  public static Kingdoms getInstance() {
    return Instance;
  }
}
