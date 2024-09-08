package ananaseke.telosium;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;

public class Autoswing implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (client.player == null) return;
            if (!client.options.attackKey.isPressed()) return;

            Item heldItem = client.player.getMainHandStack().getItem();

            if (!(heldItem instanceof ToolItem)) return;
            if (client.player.getItemCooldownManager().isCoolingDown(heldItem)) return;

            client.player.swingHand(client.player.getActiveHand());
        });
    }
}
