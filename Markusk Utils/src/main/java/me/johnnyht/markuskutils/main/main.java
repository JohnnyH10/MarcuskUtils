package me.johnnyht.markuskutils.main;

import me.johnnyht.markuskutils.events.GoodBlockNoDrop;
import me.johnnyht.markuskutils.events.NoWither;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new GoodBlockNoDrop(), this);
        getServer().getPluginManager().registerEvents(new NoWither(), this);
    }
}
