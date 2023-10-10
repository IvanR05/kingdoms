package org.qascadia.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.qascadia.util.Formatter;

public class JoinEvent implements Listener {
  @EventHandler
  public void onJoin(PlayerJoinEvent event) {
    event.setJoinMessage(Formatter.colour("&dWelcome to kingdoms!"));

    Player player = event.getPlayer();

    if (player.hasPermission("kingdoms.join")) {
      Bukkit.getServer().broadcastMessage(Formatter.colour("&c❱&e❱&6❱ &d" + event.getPlayer().getName() + " has joined the server!"));
    }
  }
}
