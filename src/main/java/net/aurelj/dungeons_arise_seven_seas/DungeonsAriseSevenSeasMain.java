package net.aurelj.dungeons_arise_seven_seas;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(DungeonsAriseSevenSeasMain.MODID)

public class DungeonsAriseSevenSeasMain
{
    public static final String MODID = "dungeons_arise_seven_seas";

    private static final Logger LOGGER = LogUtils.getLogger();


    public DungeonsAriseSevenSeasMain() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    }
}
