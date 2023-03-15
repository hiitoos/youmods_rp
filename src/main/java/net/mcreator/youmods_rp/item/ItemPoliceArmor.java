
package net.mcreator.youmods_rp.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.youmods_rp.creativetab.TabYouModsRP;
import net.mcreator.youmods_rp.ElementsYouModsRP;

@ElementsYouModsRP.ModElement.Tag
public class ItemPoliceArmor extends ElementsYouModsRP.ModElement {
	@GameRegistry.ObjectHolder("youmods_rp:policearmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("youmods_rp:policearmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("youmods_rp:policearmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("youmods_rp:policearmorboots")
	public static final Item boots = null;
	public ItemPoliceArmor(ElementsYouModsRP instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("POLICEARMOR", "youmods_rp:core_", 10, new int[]{2, 2, 2, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_chain")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("policearmorhelmet")
				.setRegistryName("policearmorhelmet").setCreativeTab(TabYouModsRP.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("policearmorbody")
				.setRegistryName("policearmorbody").setCreativeTab(TabYouModsRP.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("policearmorlegs")
				.setRegistryName("policearmorlegs").setCreativeTab(TabYouModsRP.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("policearmorboots")
				.setRegistryName("policearmorboots").setCreativeTab(TabYouModsRP.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("youmods_rp:policearmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("youmods_rp:policearmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("youmods_rp:policearmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("youmods_rp:policearmorboots", "inventory"));
	}
}
