package org.qascadia.util;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.qascadia.Kingdoms;

import java.io.File;
import java.io.IOException;

public class ConfigFactory {
    private File customFile;
    private FileConfiguration customConfig;

    public void createNewConfig(String fileName) {
        customFile = new File(Kingdoms.getInstance().getDataFolder(), fileName);

        if (!customFile.exists()) {
            customFile.getParentFile().mkdirs();
            saveConfig();
        }

        customConfig = new YamlConfiguration();

        try {
            customConfig.load(customFile);
        } catch (IOException | InvalidConfigurationException e) {
            System.out.println(e);
        }
    }

    public void saveConfig() {
        try {
            customConfig.save(customFile);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public FileConfiguration getCustomConfig() {
        return this.customConfig;
    }
}
