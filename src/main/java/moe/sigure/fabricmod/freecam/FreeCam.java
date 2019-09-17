package moe.sigure.fabricmod.freecam;

import net.fabricmc.api.ClientModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FreeCam implements ClientModInitializer {
    public static FreeCam INSTANCE = null;
    public static String MODID = "freecam";
    private Logger LOG = LogManager.getLogger("FreeCam");
    public static int TIMEOUT = 0;

    @Override
    public void onInitializeClient() {
        INSTANCE = this;
        LOG.info("[FreeCam] Mod is initializing.");

        new KeyBindFreeCam();
        new TickClient();
        new Render();
    }

    public Logger getLogger() {
        return LOG;
    }
}
