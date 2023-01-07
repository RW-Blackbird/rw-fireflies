package net.rw.fireflies;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item FIREFLY_BOTTLE = registerItem("firefly_bottle",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Fireflies.MOD_ID, name), item);
    }


    public static void registerModItems(){
        Fireflies.LOGGER.debug("Registering Mod Items for " + Fireflies.MOD_ID);
    }
}
