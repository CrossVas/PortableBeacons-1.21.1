package cross.mods.portablebeacons.init;

import cross.mods.portablebeacons.PortableBeacons;
import cross.mods.portablebeacons.items.PortableBeaconItem;
import cross.mods.portablebeacons.items.PortableBeaconShell;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.CustomData;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static cross.mods.portablebeacons.items.PortableBeaconItem.Tiers.*;

public class PortableItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PortableBeacons.ID);

    public static final Supplier<Item.Properties> COMMON_SUPPLIER = () -> new Item.Properties()
            .stacksTo(1)
            .component(PortableComponentData.CUSTOM_NBT, CustomData.EMPTY);

    public static final Supplier<Item.Properties> PROPERTIES_SUPPLIER = () -> COMMON_SUPPLIER.get().fireResistant();

    public static final DeferredItem<PortableBeaconShell> BEACON_SHELL = ITEMS.register("beacon_shell", PortableBeaconShell::new);
    public static final DeferredItem<PortableBeaconItem> PORTABLE_BEACON_IRON = ITEMS.register("portable_beacon_iron", () -> new PortableBeaconItem(COMMON_SUPPLIER.get(), IRON));
    public static final DeferredItem<PortableBeaconItem> PORTABLE_BEACON_IRON_II = ITEMS.register("portable_beacon_iron_ii", () -> new PortableBeaconItem(COMMON_SUPPLIER.get(), IRON_2));
    public static final DeferredItem<PortableBeaconItem> PORTABLE_BEACON_GOLD = ITEMS.register("portable_beacon_gold", () -> new PortableBeaconItem(COMMON_SUPPLIER.get(), GOLD));
    public static final DeferredItem<PortableBeaconItem> PORTABLE_BEACON_GOLD_II = ITEMS.register("portable_beacon_gold_ii", () -> new PortableBeaconItem(COMMON_SUPPLIER.get(), GOLD_2));
    public static final DeferredItem<PortableBeaconItem> PORTABLE_BEACON_EMERALD = ITEMS.register("portable_beacon_emerald", () -> new PortableBeaconItem(COMMON_SUPPLIER.get(), EMERALD));
    public static final DeferredItem<PortableBeaconItem> PORTABLE_BEACON_EMERALD_II = ITEMS.register("portable_beacon_emerald_ii", () -> new PortableBeaconItem(COMMON_SUPPLIER.get(), EMERALD_2));
    public static final DeferredItem<PortableBeaconItem> PORTABLE_BEACON_DIAMOND = ITEMS.register("portable_beacon_diamond", () -> new PortableBeaconItem(COMMON_SUPPLIER.get(), DIAMOND));
    public static final DeferredItem<PortableBeaconItem> PORTABLE_BEACON_DIAMOND_II = ITEMS.register("portable_beacon_diamond_ii", () -> new PortableBeaconItem(COMMON_SUPPLIER.get(), DIAMOND_2));
    public static final DeferredItem<PortableBeaconItem> PORTABLE_BEACON_NETHERITE = ITEMS.register("portable_beacon_netherite", () -> new PortableBeaconItem(PROPERTIES_SUPPLIER.get(), NETHERITE));
    public static final DeferredItem<PortableBeaconItem> PORTABLE_BEACON_NETHERITE_II = ITEMS.register("portable_beacon_netherite_ii", () -> new PortableBeaconItem(PROPERTIES_SUPPLIER.get(), NETHERITE_2));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
