package org.qascadia.util;

import org.bukkit.Bukkit;

public class Console {
  private static final String PREFIX = "&8[&bKingdoms&8] &f";

  public static void log(String message) {
    Bukkit.getConsoleSender().sendMessage(Formatter.colour(PREFIX + message));
  }
}
