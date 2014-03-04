package com.leon1236.newend.world;

import java.util.Random;

import com.leon1236.newend.blocks.EndBlocks;
import com.leon1236.newend.blocks.EndVanillaBlocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class OreGeneration implements IWorldGenerator  {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		switch(world.provider.dimensionId){
        case -1:
            generateNether(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 0:
            generateSurface(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 1:
            generateEnd(world, random, chunkX * 16, chunkZ * 16);
            break;
        }
	}

	private void generateEnd(World world, Random random, int i, int j) {}

	private void generateSurface(World world, Random random, int x, int z) {
		
        	//For testing purposes 
        	addOre(EndBlocks.BlockEndOre, world, random, x, z, 8, 5, 4, 13);
        	addOre(EndVanillaBlocks.BlockEndCoalOre, world, random, x, z, 12, 10, 4, 70);
        	addOre(EndVanillaBlocks.BlockEndDiamondOre, world, random, x, z, 8, 5, 4, 15);
        	addOre(EndVanillaBlocks.BlockEndEmeraldOre, world, random, x, z, 5, 3, 4, 25);
        	addOre(EndVanillaBlocks.BlockEndGoldOre, world, random, x, z, 8, 10, 4, 30);
        	addOre(EndVanillaBlocks.BlockEndIronOre, world, random, x, z, 12, 15, 4, 70);
        	addOre(EndVanillaBlocks.BlockEndLapisOre, world, random, x, z, 4, 10, 4, 20);
        	addOre(EndVanillaBlocks.BlockEndQuartzOre, world, random, x, z, 5, 16, 4, 70);
        	addOre(EndVanillaBlocks.BlockEndRedstoneOre, world, random, x, z, 8, 10, 4, 15);
        }
	
	private void generateNether(World world, Random random, int i, int j) {}
		
	public void addOre(Block block, World world, Random random, int blockXPos, int blockZPos, int clusterSize, int spawnChances, int minY, int maxY) {
        for (int x = 0; x < spawnChances; x++) {
            int posX = blockXPos + random.nextInt(16);
            int posY = minY + random.nextInt(maxY - minY);
            int posZ = blockZPos + random.nextInt(16);
            (new WorldGenMinable(block, clusterSize, Blocks.stone)).generate(world, random, posX, posY, posZ);
            
        }
	}
}


