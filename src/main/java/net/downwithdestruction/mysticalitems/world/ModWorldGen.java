package net.downwithdestruction.mysticalitems.world;

import java.util.Random;
import net.downwithdestruction.mysticalitems.block.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator {

    /**
     * Called by forge for every chunk that is generated
     *
     * @param random Used for generation
     * @param chunkX Generates block position X
     * @param chunkZ Generates block position Z
     * @param world Generates in world
     * @param chunkGenerator Generates the chunk at the specified position, from scratch
     * @param chunkProvider Unloads chunks that are marked to be unloaded
     */
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider){
        if (world.provider.getDimension() == 0){ //Check for overworld
            generateOverWorld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
    }

    /**
     * Calls the 'generateOre' method
     *
     * @param random Used for generation
     * @param chunkX Generates block position X
     * @param chunkZ Generates block position Z
     * @param world Generates in world
     * @param chunkGenerator Generates the chunk at the specified position, from scratch
     * @param chunkProvider Unloads chunks that are marked to be unloaded
     */
    private void generateOverWorld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider){
        generateOre(ModBlocks.oreCopper.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt(4), 6);
    }

    /**
     * Helper Method
     *
     * @param ore Generate the ore blocks
     * @param world Generate in the world
     * @param random Used for generation
     * @param x Generates block position X
     * @param z Generates block position Z
     * @param minY Generates minimum Y position the ore can generate
     * @param maxY Generates maximum Y position the ore can generate
     * @param size Determines the ore vein size
     * @param chances Determines the number of veins per chunk
     */
    private void generateOre(IBlockState ore, World world, Random random, int x, int  z, int minY, int maxY, int size, int chances){
        int deltaY = maxY - minY;

        for (int i = 0; i < chances; i++){
            BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));

            WorldGenMinable generator = new WorldGenMinable(ore, size);
            generator.generate(world, random, pos);
        }
    }
}
