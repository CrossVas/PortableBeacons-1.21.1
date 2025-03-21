package cross.mods.portablebeacons.utils;

import cross.mods.portablebeacons.PortableBeacons;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class PortableBeaconsTags {

    public static TagKey<Item> ARMOR_TRIMS = ItemTags.create(ResourceLocation.fromNamespaceAndPath("minecraft", "armor_trims"));
    public static TagKey<Item> BEACONS = ItemTags.create(ResourceLocation.fromNamespaceAndPath(PortableBeacons.ID, "beacons"));
    public static TagKey<Item> CURIO_BEACONS = ItemTags.create(ResourceLocation.fromNamespaceAndPath("curios", "portablebeacons"));
}
