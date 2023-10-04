package org.qascadia.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.qascadia.events.kingdoms.KingdomCreate;
import org.qascadia.util.Formatter;

public class KingdomCreateEvent implements Listener {
  @EventHandler
  public void onKingdomCreate(KingdomCreate event) {
    Player player = event.getPlayer();
    player.sendMessage(Formatter.colour("&aYou have created a kingdom!" + event.getKingdom().getName()));
  }
}
