package org.qascadia.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.qascadia.util.Console;
import org.qascadia.util.Formatter;

public class Gamemode implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            gamemodeSwitcher(args[0], player);
            player.sendMessage(Formatter.colour("&aYour gamemode changed to &2" + args[0].toLowerCase() + "&a."));

            return true;
        }

        try {
            gamemodeSwitcher(args[0], Bukkit.getPlayer(args[1]));
            return true;
        } catch (Exception e) {
            Console.log(Formatter.colour("&cPlayer or gamemode not found!"));
        }

        return false;
    }

    private void gamemodeSwitcher(String gamemode, Player player) {
        switch (gamemode.toLowerCase()) {
            case "0":
            case "survival":
                player.setGameMode(GameMode.SURVIVAL);
                break;
            case "1":
            case "creative":
                player.setGameMode(GameMode.CREATIVE);
                break;
            case "2":
            case "adventure":
                player.setGameMode(GameMode.ADVENTURE);
                break;
            case "3":
            case "spectator":
                player.setGameMode(GameMode.SPECTATOR);
                break;
        }
    }
}
