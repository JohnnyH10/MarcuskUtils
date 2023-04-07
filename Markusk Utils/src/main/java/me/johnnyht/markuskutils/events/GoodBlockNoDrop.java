package me.johnnyht.markuskutils.events;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDropItemEvent;

public class GoodBlockNoDrop implements Listener {
    @EventHandler
    public void onBreakBlock(BlockDropItemEvent e){
        Material block = e.getBlock().getType();
        if(e.getBlock().getType() == Material.IRON_BLOCK ||
                e.getBlock().getType() == Material.GOLD_BLOCK ||
                e.getBlock().getType() == Material.GOLD_ORE ||
                e.getBlock().getType() == Material.DIAMOND_BLOCK ||
                e.getBlock().getType() == Material.EMERALD_BLOCK ||
                e.getBlock().getType() == Material.IRON_ORE ||
                e.getBlock().getType() == Material.DIAMOND_ORE ||
                e.getBlock().getType() == Material.COAL_ORE ||
                e.getBlock().getType() == Material.EMERALD_ORE ||
                e.getBlock().getType() == Material.NETHERITE_BLOCK ||
                e.getBlock().getType() == Material.RAW_GOLD ||
                e.getBlock().getType() == Material.RAW_COPPER ||
                e.getBlock().getType() == Material.RAW_IRON ||
                e.getBlock().getType() == Material.TNT ||
                e.getBlock().getType() == Material.CHEST ||
                e.getBlock().getType() == Material.CHEST_MINECART ||
                e.getBlock().getType() == Material.TRAPPED_CHEST){
            e.setCancelled(true);
        }


             /*


- lapis block
- gold ore
- raw gold
- iron ore
- raw iron
- diamond ore
- diamonds
- coal ore
- coal
- emerald ore
- emerald

- beacon
- tnt
- chests
- trapped chests */


    }
}
