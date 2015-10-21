package eatyourcookie.IC2UUOres.UUBlocks;

import java.util.Random;

import eatyourcookie.IC2UUOres.Tab;
import eatyourcookie.IC2UUOres.UUItems.UUItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

public class SapphireOre extends Block {

	protected SapphireOre() {
		super(Material.rock);
		this.setHardness(2.0F);
		this.setHarvestLevel("pickaxe", 2);
		this.setBlockTextureName("uu:sapphire_ore");
		this.setBlockName("sapphire_ore");
		this.setCreativeTab(Tab.tabUUOres);
	}
	
	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	{
		return UUItems.sapphire;
	}
	
	@Override
	public int getExpDrop(IBlockAccess world, int metadata, int fortune)
    {
        return 2;
    }

}
