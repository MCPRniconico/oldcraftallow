
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package olditemallow.init;

import olditemallow.item.RubyItem;
import olditemallow.item.GiarItem;
import olditemallow.item.FishcookingItem;
import olditemallow.item.FishItem;

import olditemallow.OldcraftallowMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class OldcraftallowModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OldcraftallowMod.MODID);
	public static final RegistryObject<Item> RUBYPRE = block(OldcraftallowModBlocks.RUBYPRE);
	public static final RegistryObject<Item> NOGRASS_DIT = block(OldcraftallowModBlocks.NOGRASS_DIT);
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> GIAR = REGISTRY.register("giar", () -> new GiarItem());
	public static final RegistryObject<Item> ROSE = block(OldcraftallowModBlocks.ROSE);
	public static final RegistryObject<Item> FISH = REGISTRY.register("fish", () -> new FishItem());
	public static final RegistryObject<Item> FISHCOOKING = REGISTRY.register("fishcooking", () -> new FishcookingItem());
	public static final RegistryObject<Item> RUBYBLOCK = block(OldcraftallowModBlocks.RUBYBLOCK);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
