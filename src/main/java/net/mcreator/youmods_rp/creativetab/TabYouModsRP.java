
package net.mcreator.youmods_rp.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.youmods_rp.item.ItemLogo;
import net.mcreator.youmods_rp.ElementsYouModsRP;

@ElementsYouModsRP.ModElement.Tag
public class TabYouModsRP extends ElementsYouModsRP.ModElement {
	public TabYouModsRP(ElementsYouModsRP instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabyoumodsrp") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemLogo.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
