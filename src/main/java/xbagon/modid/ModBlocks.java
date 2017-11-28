package xbagon.modid;

import net.minecraftforge.fml.common.registry.GameRegistry;
import xbagon.modid.blocks.ModBlock;

@GameRegistry.ObjectHolder("modid")
public class ModBlocks {
    public static final ModBlock MOD_BLOCK = new ModBlock();
}
