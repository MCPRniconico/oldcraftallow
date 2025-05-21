
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package olditemallow.init;

import olditemallow.OldcraftallowMod;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OldcraftallowModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OldcraftallowMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(OldcraftallowModItems.GIAR.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(OldcraftallowModItems.RUBY.get());
			tabData.accept(OldcraftallowModBlocks.RUBYBLOCK.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(OldcraftallowModBlocks.RUBYPRE.get().asItem());
			tabData.accept(OldcraftallowModBlocks.NOGRASS_DIT.get().asItem());
			tabData.accept(OldcraftallowModBlocks.ROSE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(OldcraftallowModItems.FISH.get());
		}
	}
}
