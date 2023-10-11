package org.qascadia.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.qascadia.entities.King;
import org.qascadia.util.Formatter;

public class DeathEvent implements Listener {
  @EventHandler
  public void onDeath(PlayerDeathEvent event) {
    // TODO: Logic to manage when killing a King and revive cooldown.
    Player player = event.getEntity().getPlayer();

    if (player instanceof King) {
      ((King) player).getKingdom().setKing(null);
    }

    player.sendMessage(Formatter.colour("&cYou last location: &4" + player.getLocation()));
  }
}
