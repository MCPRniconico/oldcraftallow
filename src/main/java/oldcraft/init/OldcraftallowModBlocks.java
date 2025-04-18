
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package oldcraft.init;

import oldcraft.block.RubyoreBlock;
import oldcraft.block.GrasslessdirtBlock;

import oldcraft.OldcraftallowMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class OldcraftallowModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, OldcraftallowMod.MODID);
	public static final RegistryObject<Block> RUBYORE = REGISTRY.register("rubyore", () -> new RubyoreBlock());
	public static final RegistryObject<Block> GRASSLESSDIRT = REGISTRY.register("grasslessdirt", () -> new GrasslessdirtBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
