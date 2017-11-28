package xbagon.modid;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import xbagon.modid.proxy.CommonProxy;

@Mod(
        modid = MyMod.MOD_ID,
        name = MyMod.MOD_NAME,
        version = MyMod.VERSION
)
public class MyMod {

    public static final String MOD_ID = "modid";
    public static final String MOD_NAME = "ModName";
    public static final String VERSION = "0.1";

    @SidedProxy(clientSide = "xbagon.modid.proxy.ClientProxy", serverSide = "xbagon.modid.proxy.ServerProxy")
    public static CommonProxy proxy;
    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(MOD_ID)
    public static Mod INSTANCE;

    public static Logger logger;

    /**
     * This is the first initialization event. Register tile entities here.
     * The registry events below will have fired prior to entry to this method.
     */
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    /**
     * This is the second initialization event. Register custom recipes
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    /**
     * This is the final initialization event. Register actions from other mods here
     */
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
