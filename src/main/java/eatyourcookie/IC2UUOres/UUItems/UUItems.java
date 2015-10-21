package eatyourcookie.IC2UUOres.UUItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class UUItems {
	
	public static Item green_sapphire;
	public static Item sapphire;
	public static Item ruby;
	public static Item green_sapphire_pickaxe;
	public static Item green_sapphire_axe;
	public static Item green_sapphire_shovel;
	public static Item green_sapphire_hoe;
	public static Item green_sapphire_sword;
	public static Item sapphire_pickaxe;
	public static Item sapphire_axe;
	public static Item sapphire_shovel;
	public static Item sapphire_hoe;
	public static Item sapphire_sword;
	public static Item ruby_pickaxe;
	public static Item ruby_axe;
	public static Item ruby_shovel;
	public static Item ruby_hoe;
	public static Item ruby_sword;
	public static final Item.ToolMaterial crystalToolMaterial = EnumHelper.addToolMaterial("crystalToolMaterial", 2, 1562, 8.0F, 2.5F, 20);
	
	public static void init()
	{
		green_sapphire = new UUItem().setUnlocalizedName("green_sapphire").setTextureName("uu:green_sapphire");
		sapphire = new UUItem().setUnlocalizedName("sapphire").setTextureName("uu:sapphire");
		ruby = new UUItem().setUnlocalizedName("ruby").setTextureName("uu:ruby");
		green_sapphire_pickaxe = new Pickaxe(crystalToolMaterial).setUnlocalizedName("green_sapphire_pickaxe").setTextureName("uu:green_sapphire_pickaxe");
		green_sapphire_axe = new Axe(crystalToolMaterial).setUnlocalizedName("green_sapphire_axe").setTextureName("uu:green_sapphire_axe");
		green_sapphire_shovel = new Shovel(crystalToolMaterial).setUnlocalizedName("green_sapphire_shovel").setTextureName("uu:green_sapphire_shovel");
		green_sapphire_hoe = new Hoe(crystalToolMaterial).setUnlocalizedName("green_sapphire_hoe").setTextureName("uu:green_sapphire_hoe");
		green_sapphire_sword = new Sword(crystalToolMaterial).setUnlocalizedName("green_sapphire_sword").setTextureName("uu:green_sapphire_sword");
		sapphire_pickaxe = new Pickaxe(crystalToolMaterial).setUnlocalizedName("sapphire_pickaxe").setTextureName("uu:sapphire_pickaxe");
		sapphire_axe = new Axe(crystalToolMaterial).setUnlocalizedName("sapphire_axe").setTextureName("uu:sapphire_axe");
		sapphire_shovel = new Shovel(crystalToolMaterial).setUnlocalizedName("sapphire_shovel").setTextureName("uu:sapphire_shovel");
		sapphire_hoe = new Hoe(crystalToolMaterial).setUnlocalizedName("sapphire_hoe").setTextureName("uu:sapphire_hoe");
		sapphire_sword = new Sword(crystalToolMaterial).setUnlocalizedName("sapphire_sword").setTextureName("uu:sapphire_sword");
		ruby_pickaxe = new Pickaxe(crystalToolMaterial).setUnlocalizedName("ruby_pickaxe").setTextureName("uu:ruby_pickaxe");
		ruby_axe = new Axe(crystalToolMaterial).setUnlocalizedName("ruby_axe").setTextureName("uu:ruby_pickaxe");
		ruby_shovel = new Shovel(crystalToolMaterial).setUnlocalizedName("ruby_shovel").setTextureName("uu:ruby_shovel");
		ruby_hoe = new Hoe(crystalToolMaterial).setUnlocalizedName("ruby_hoe").setTextureName("uu:ruby_hoe");
		ruby_sword = new Sword(crystalToolMaterial).setUnlocalizedName("ruby_sword").setTextureName("uu:ruby_sword");
	}
	
	public static void register()
	{
		GameRegistry.registerItem(green_sapphire, green_sapphire.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sapphire, sapphire.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ruby, ruby.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(green_sapphire_pickaxe, green_sapphire_pickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(green_sapphire_axe, green_sapphire_axe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(green_sapphire_shovel, green_sapphire_shovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(green_sapphire_hoe, green_sapphire_hoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(green_sapphire_sword, green_sapphire_sword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sapphire_pickaxe, sapphire_pickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sapphire_axe, sapphire_axe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sapphire_shovel, sapphire_shovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sapphire_hoe, sapphire_hoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sapphire_sword, sapphire_sword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ruby_pickaxe, ruby_pickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ruby_axe, ruby_axe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ruby_shovel, ruby_shovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ruby_hoe, ruby_hoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ruby_sword, ruby_sword.getUnlocalizedName().substring(5));
	}
}
