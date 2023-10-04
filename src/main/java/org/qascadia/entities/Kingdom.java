package org.qascadia.entities;

import java.util.List;

import org.bukkit.entity.Player;

public class Kingdom {
  private String name;
  private King king;
  private List<Player> members;
  private List<Kingdom> allies;
  private List<Kingdom> enemies;
  private float balance;

  public Kingdom(String name, King king) {
    this.name = name;
    this.king = king;
    this.balance = 100000;
  }

  public void disband() {
    // TODO: Logic to disband the kingdom
  }

  public void declareWar(Kingdom enemy) {
    enemies.add(enemy);
  }

  public void makeAlliance(Kingdom ally) {
    allies.add(ally);
  }

  public void addMember(Player player) {
    members.add(player);
  }

  public void removeMember(Player player) {
    members.remove(player);
  }

  public List<Player> getMembers() {
    return members;
  }

  public List<Kingdom> getAllies() {
    return allies;
  }

  public List<Kingdom> getEnemies() {
    return enemies;
  }

  public String getName() {
    return name;
  }

  public King getKing() {
    return king;
  }

  public float getBalance() {
    return balance;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setKing(King king) {
    this.king = king;
  }

  public void setBalance(float balance) {
    this.balance = balance;
  }
}
