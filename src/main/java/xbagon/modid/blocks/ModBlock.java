package xbagon.modid.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import xbagon.modid.MyMod;


public class ModBlock extends Block{
    public ModBlock(){
        super(Material.ROCK);
        blockHardness = 1f;
        setSoundType(SoundType.STONE);
        setUnlocalizedName(Mod.MOD_ID + ".block_name");
        setRegistryName("block_name");
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}