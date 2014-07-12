package com.tenjava.entries._22vortex22.t3.events;


import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.scheduler.BukkitRunnable;

import com.tenjava.entries._22vortex22.t3.TenJava;

public class DeathEvents implements Listener
{
	public TenJava plugin;
	public DeathEvents(TenJava instance)
	{	
		plugin = instance;
	}
	
	
	@EventHandler
	public void onDeath(final PlayerDeathEvent e)
	{
			Player p = e.getEntity();
			final Location loc = p.getLocation();
			final World world = loc.getWorld();
			new BukkitRunnable()
			{
			  public void run()
			  {
				   for (int i = 0; i < 10; i++)
				   {	 
				   	world.strikeLightningEffect(loc);
				   }
			  }
			}.runTaskLater(plugin, 5);
			
	}
	
	
}