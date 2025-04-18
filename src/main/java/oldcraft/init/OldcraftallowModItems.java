
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package oldcraft.init;

import oldcraft.item.RubyItem;

import oldcraft.OldcraftallowMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class OldcraftallowModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OldcraftallowMod.MODID);
	public static final RegistryObject<Item> RUBYORE = block(OldcraftallowModBlocks.RUBYORE);
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> GRASSLESSDIRT = block(OldcraftallowModBlocks.GRASSLESSDIRT);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
