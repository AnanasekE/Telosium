package ananaseke.telosium;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TelosiumClient implements ClientModInitializer {
    public static final String MOD_ID = "telosium";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("Initializing Telosium Client");
        new Autoswing().onInitializeClient();
    }
}