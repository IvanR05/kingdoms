package org.qascadia.entities;

import java.util.UUID;

public class King extends CorePlayer {
  private final UUID uuid;
  private Kingdom kingdom;

  public King(UUID uuid, Kingdom kingdom) {
    super(uuid);
    this.uuid = uuid;
    this.kingdom = kingdom;
  }

  public UUID getUUID() {
    return uuid;
  }

  public Kingdom getKingdom() {
    return kingdom;
  }
}
