package org.qascadia.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.qascadia.events.kingdoms.KingdomRemove;

public class KingdomRemoveEvent implements Listener {
  @EventHandler
  public void onKingdomRemove(KingdomRemove event) {}
}
