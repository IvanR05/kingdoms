package org.qascadia.controllers;

import org.bukkit.Bukkit;
import org.qascadia.entities.King;
import org.qascadia.entities.Kingdom;
import org.qascadia.events.kingdoms.KingdomCreate;
import org.qascadia.events.kingdoms.KingdomRemove;

public class KingdomController {
  public void createKingdom(String kingdomName, King king) {
    Kingdom kingdom = new Kingdom(kingdomName, king);

    KingdomCreate event = new KingdomCreate(kingdom);
    Bukkit.getServer().getPluginManager().callEvent(event);
  }

  public void removeKingdom(Kingdom kingdom) {
    KingdomRemove event = new KingdomRemove(kingdom);
    Bukkit.getServer().getPluginManager().callEvent(event);
  }
}
