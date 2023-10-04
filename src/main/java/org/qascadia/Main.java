package org.qascadia;

import org.bukkit.plugin.java.JavaPlugin;
import org.qascadia.commands.Balance;
import org.qascadia.events.DeathEvent;
import org.qascadia.events.JoinEvent;
import org.qascadia.util.Console;

public class Main extends JavaPlugin {
  private Main Instance;

  public void onEnable() {
    Instance = this;
    Console.log("&aPlugin enabled!");

    // Events
    getServer().getPluginManager().registerEvents(new DeathEvent(), this);
    getServer().getPluginManager().registerEvents(new JoinEvent(), this);

    // Commands
    getCommand("balance").setExecutor(new Balance());
  }

  public void onDisable() {
    Console.log("&cPlugin disabled!");
  }

  public Main getInstance() {
    return Instance;
  }
}
