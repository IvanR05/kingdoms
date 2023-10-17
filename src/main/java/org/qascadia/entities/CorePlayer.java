package org.qascadia.entities;

import java.util.UUID;

public class CorePlayer {
  protected UUID uuid;
  protected Kingdom kingdom;
  protected float balance;

  public CorePlayer(UUID uuid) {
    this.uuid = uuid;
    this.kingdom = null;
    this.balance = 0;
  }

  public UUID getUUID() {
    return uuid;
  }

  public Kingdom getKingdom() {
    return kingdom;
  }

  public float getBalance() {
    return balance;
  }

  public void setBalance(float balance) {
    this.balance = balance;
  }

  public void setKingdom(Kingdom kingdom) {
    this.kingdom = kingdom;
  }

  public void removeKingdom() {
    this.kingdom = null;
  }
}
