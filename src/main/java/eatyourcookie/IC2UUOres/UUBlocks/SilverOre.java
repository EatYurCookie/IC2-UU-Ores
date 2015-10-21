package eatyourcookie.IC2UUOres.UUBlocks;

import eatyourcookie.IC2UUOres.Tab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SilverOre extends Block {

	protected SilverOre() {
		super(Material.rock);
		this.setHardness(2.0F);
		this.setHarvestLevel("pickaxe", 2);
		this.setBlockTextureName("uu:silver_ore");
		this.setBlockName("silver_ore");
		this.setCreativeTab(Tab.tabUUOres);
	}

}
