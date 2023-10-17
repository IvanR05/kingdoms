package org.qascadia.controllers;

import org.bukkit.Bukkit;
import org.qascadia.entities.King;
import org.qascadia.entities.Kingdom;
import org.qascadia.events.kingdoms.KingdomCreate;
import org.qascadia.events.kingdoms.KingdomRemove;

import java.util.UUID;

public class KingdomController {
  public void createKingdom(String kingdomName, UUID kingUUID) {
    King newKing = new King(kingUUID);
    Kingdom kingdom = new Kingdom(kingdomName, newKing);

    KingdomCreate event = new KingdomCreate(kingdom);
    Bukkit.getServer().getPluginManager().callEvent(event);
  }

  public void removeKingdom(Kingdom kingdom) {
    KingdomRemove event = new KingdomRemove(kingdom);
    Bukkit.getServer().getPluginManager().callEvent(event);
  }
}
