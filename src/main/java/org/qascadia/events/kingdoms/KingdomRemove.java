package org.qascadia.events.kingdoms;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.qascadia.entities.Kingdom;

public class KingdomRemove extends Event implements Cancellable {
  private static final HandlerList HANDLERS = new HandlerList();
  private boolean isCancelled;
  private Kingdom kingdom;
  private Player player;

  public KingdomRemove(Kingdom kingdom) {
    super();
    this.kingdom = kingdom;
    this.isCancelled = false;
  }

  public KingdomRemove(Kingdom kingdom, Player player) {
    super();
    this.kingdom = kingdom;
    this.player = player;
    this.isCancelled = false;
  }

  public Player getPlayer() {
    return player;
  }

  public Kingdom getKingdom() {
    return kingdom;
  }

  public static HandlerList getHandlerList() {
    return HANDLERS;
  }

  @Override
  public HandlerList getHandlers() {
    return HANDLERS;
  }

  @Override
  public boolean isCancelled() {
    return isCancelled;
  }

  @Override
  public void setCancelled(boolean isCancelled) {
    this.isCancelled = isCancelled;
  }
}
