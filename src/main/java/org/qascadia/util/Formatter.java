package org.qascadia.util;

import java.util.ArrayList;
import java.util.List;

public class Formatter {
  public static String colour(String message) {
    return message.replace("&", "§");
  }

  public static List<String> lore(String... lines) {
    List<String> lore = new ArrayList<>();

    for (String line : lines) {
      colour(line);
      lore.add(line);
    }

    return lore;
  }
}
