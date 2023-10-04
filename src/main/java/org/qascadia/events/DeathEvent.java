package org.qascadia.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathEvent implements Listener {
  @EventHandler
  public void onDeath(PlayerDeathEvent event) {
    // TODO: Logic to manage when killing a King and revive cooldown.
  }
}
