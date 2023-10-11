package org.qascadia.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.qascadia.entities.CorePlayer;
import org.qascadia.util.Console;
import org.qascadia.util.Formatter;

public class KingdomCmd implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (!(sender instanceof Player)) {
            Console.log("&cThis command can only be executed in game!");
            return false;
        }


        // TODO: fix this part (Coreplayer may give error)
        CorePlayer player = (CorePlayer) sender;

        if (player.getKingdom() == null) {
            Bukkit.getPlayer(player.getUUID()).sendMessage(Formatter.colour("&cYou are not currently in a kingdom."));
            return true;
        }

        return false;
    }
}
