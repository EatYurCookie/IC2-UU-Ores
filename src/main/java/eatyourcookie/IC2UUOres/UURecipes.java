package eatyourcookie.IC2UUOres;

import cpw.mods.fml.common.registry.GameRegistry;
import eatyourcookie.IC2UUOres.UUBlocks.UUBlocks;
import eatyourcookie.IC2UUOres.UUItems.UUItems;
import ic2.api.item.IC2Items;
import ic2.api.recipe.RecipeInputItemStack;
import ic2.api.recipe.Recipes;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class UURecipes {
	
	public static void registerCrafting()
	{
		GameRegistry.addRecipe(new ItemStack(UUItems.green_sapphire_pickaxe), new Object[]{"GGG", " S ", " S ", 'G', UUItems.green_sapphire, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(UUItems.green_sapphire_axe), new Object[]{"GG ", "GS ", " S ", 'G', UUItems.green_sapphire, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(UUItems.green_sapphire_shovel), new Object[]{"G", "S", "S", 'G', UUItems.green_sapphire, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(UUItems.green_sapphire_hoe), new Object[]{"GG ", " S ", " S ", 'G', UUItems.green_sapphire, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(UUItems.green_sapphire_sword), new Object[]{"G", "G", "S", 'G', UUItems.green_sapphire, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(UUItems.sapphire_pickaxe), new Object[]{"GGG", " S ", " S ", 'G', UUItems.sapphire, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(UUItems.sapphire_axe), new Object[]{"GG ", "GS ", " S ", 'G', UUItems.sapphire, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(UUItems.sapphire_shovel), new Object[]{"G", "S", "S", 'G', UUItems.sapphire, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(UUItems.sapphire_hoe), new Object[]{"GG ", " S ", " S ", 'G', UUItems.sapphire, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(UUItems.sapphire_sword), new Object[]{"G", "G", "S", 'G', UUItems.sapphire, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(UUItems.ruby_pickaxe), new Object[]{"GGG", " S ", " S ", 'G', UUItems.ruby, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(UUItems.ruby_axe), new Object[]{"GG ", "GS ", " S ", 'G', UUItems.ruby, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(UUItems.ruby_shovel), new Object[]{"G", "S", "S", 'G', UUItems.ruby, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(UUItems.ruby_hoe), new Object[]{"GG ", " S ", " S ", 'G', UUItems.ruby, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(UUItems.ruby_sword), new Object[]{"G", "G", "S", 'G', UUItems.ruby, 'S', Items.stick});
	}
	
	public static void registerSmelting()
	{
		GameRegistry.addSmelting(new ItemStack(UUBlocks.silver_ore), IC2Items.getItem("silverIngot"), 2.0F);
	}
	
	public static void registerMacerator()
	{
		RecipeInputItemStack input1 = new RecipeInputItemStack(new ItemStack(UUBlocks.silver_ore));
		Recipes.macerator.addRecipe(input1, null, IC2Items.getItem("crushedSilverOre"), IC2Items.getItem("crushedSilverOre"));
	}
}
