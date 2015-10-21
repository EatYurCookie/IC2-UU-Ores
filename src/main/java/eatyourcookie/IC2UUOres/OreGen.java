package eatyourcookie.IC2UUOres;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import eatyourcookie.IC2UUOres.UUBlocks.UUBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class OreGen implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
		switch(world.provider.dimensionId)
		{
		case 0:
			break;
		}
    }
	
	public void generateOverWorld(World world, Random rand, int x, int z) {
		generateOre(UUBlocks.silver_ore, world, rand, x, z, 2, 6, 10, 0, 50, Blocks.stone);
		generateOre(UUBlocks.green_sapphire_ore, world, rand, x, z, 2, 4, 10, 0, 50, Blocks.stone);
		generateOre(UUBlocks.sapphire_ore, world, rand, x, z, 2, 4, 10, 0, 50, Blocks.stone);
		generateOre(UUBlocks.ruby_ore, world, rand, x, z, 2, 4, 10, 0, 50, Blocks.stone);
	}
	
	public void generateOre(Block block, World world, Random rand, int chunkX, int chunkZ, int minVienSize, int maxVienSize, int chance, int maxY, int minY, Block generateIn)
	{
		int vienSize = minVienSize + rand.nextInt(maxVienSize - minVienSize);
		int hightRange = maxY - minY;
		WorldGenMinable gen = new WorldGenMinable(block, vienSize, generateIn);
		for(int i = 0; i < chance; i++) {
			int xRand = chunkX * 16 + rand.nextInt(16);
			int yRand = rand.nextInt(hightRange) + maxY;
			int zRand = chunkZ * 16 + rand.nextInt(16);
			gen.generate(world, rand, xRand, yRand, zRand);
		}
	}
}
