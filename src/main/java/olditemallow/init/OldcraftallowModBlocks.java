
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package olditemallow.init;

import olditemallow.block.RubypreBlock;
import olditemallow.block.RubyblockBlock;
import olditemallow.block.RoseBlock;
import olditemallow.block.NograssDitBlock;

import olditemallow.OldcraftallowMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class OldcraftallowModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, OldcraftallowMod.MODID);
	public static final RegistryObject<Block> RUBYPRE = REGISTRY.register("rubypre", () -> new RubypreBlock());
	public static final RegistryObject<Block> NOGRASS_DIT = REGISTRY.register("nograss_dit", () -> new NograssDitBlock());
	public static final RegistryObject<Block> ROSE = REGISTRY.register("rose", () -> new RoseBlock());
	public static final RegistryObject<Block> RUBYBLOCK = REGISTRY.register("rubyblock", () -> new RubyblockBlock());
}
