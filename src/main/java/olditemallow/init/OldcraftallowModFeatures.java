
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package olditemallow.init;

import olditemallow.world.features.plants.RoseFeature;

import olditemallow.OldcraftallowMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class OldcraftallowModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, OldcraftallowMod.MODID);
	public static final RegistryObject<Feature<?>> ROSE = REGISTRY.register("rose", RoseFeature::new);
}
