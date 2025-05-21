
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package olditemallow.init;

import olditemallow.OldcraftallowMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;

public class OldcraftallowModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, OldcraftallowMod.MODID);
	public static final RegistryObject<Potion> UNCRAFTABLEPOTIONS = REGISTRY.register("uncraftablepotions", () -> new Potion());
}
