
package olditemallow.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GiarItem extends Item {
	public GiarItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
