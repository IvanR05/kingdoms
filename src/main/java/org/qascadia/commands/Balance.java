package org.qascadia.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.qascadia.entities.CorePlayer;

public class Balance implements CommandExecutor {
  @Override
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    if (!(sender instanceof Player)) {
      return false;
    }

    Player player = (Player) sender;
    CorePlayer corePlayer = new CorePlayer(player.getUniqueId());
    player.sendMessage("Your balance is: " + corePlayer.getBalance());

    return true;
  }
}
