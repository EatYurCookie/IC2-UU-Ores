package eatyourcookie.IC2UUOres.UUBlocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class UUBlocks {
	
	public static Block silver_ore;
	public static Block green_sapphire_ore;
	public static Block sapphire_ore;
	public static Block ruby_ore;
	
	public static void init()
	{
		silver_ore = new SilverOre();
		green_sapphire_ore = new GreenSapphireOre();
		sapphire_ore = new SapphireOre();
		ruby_ore = new RubyOre();
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(silver_ore, silver_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(green_sapphire_ore, green_sapphire_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(sapphire_ore, sapphire_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ruby_ore, ruby_ore.getUnlocalizedName().substring(5));
	}

}
