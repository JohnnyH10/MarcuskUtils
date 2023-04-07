package me.johnnyht.markuskutils.events;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

import javax.swing.text.html.parser.Entity;

public class NoWither implements Listener {
    @EventHandler
    public void WitherNo(EntitySpawnEvent e){
        EntityType entity = e.getEntity().getType();
        if(e.getEntityType() == EntityType.WITHER) {
            e.setCancelled(true);
        }

    }
}
