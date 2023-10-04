package org.qascadia.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.qascadia.events.kingdoms.KingdomRemove;
import org.qascadia.util.Formatter;

public class KingdomRemoveEvent implements Listener {
  @EventHandler
  public void onKingdomRemove(KingdomRemove event) {
    Player player = event.getPlayer();
    player.sendMessage(Formatter.colour("&cYou left the kingdom!"));
  }
}
