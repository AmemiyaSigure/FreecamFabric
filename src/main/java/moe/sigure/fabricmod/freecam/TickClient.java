package moe.sigure.fabricmod.freecam;

import net.fabricmc.fabric.api.event.client.ClientTickCallback;
import net.minecraft.client.MinecraftClient;

public class TickClient {
    public TickClient() {
        ClientTickCallback.EVENT.register(this::onTick);
    }

    private void onTick(MinecraftClient minecraft) {
        if (FreeCam.TIMEOUT > 0) {
            FreeCam.TIMEOUT--;
        }

        if(FreeCam.TIMEOUT == 0 && KeyBindFreeCam.keyBindToggle.isPressed()) {
            FreeCam.TIMEOUT = 10;

            if(Render.enabled) {
                Render.enabled = false;
            } else {
                Render.enabled = true;
            }

            if(Render.enabled) {
                Render.x = minecraft.player.x;
                Render.y = minecraft.player.y;
                Render.z = minecraft.player.z;
            }
        }
        if(FreeCam.TIMEOUT == 0 && KeyBindFreeCam.keyBindReset.isPressed() && Render.enabled) {
            FreeCam.TIMEOUT = 10;
            Render.x = minecraft.player.x;
            Render.y = minecraft.player.y;
            Render.z = minecraft.player.z;
        }
        if(FreeCam.TIMEOUT == 0 && KeyBindFreeCam.keyBindUp.isPressed() && Render.enabled) {
            FreeCam.TIMEOUT = 2;
            Render.y += 0.5F;
        }
        if(FreeCam.TIMEOUT == 0 && KeyBindFreeCam.keyBindDown.isPressed() && Render.enabled) {
            FreeCam.TIMEOUT = 2;
            Render.y -= 0.5F;
        }
        if(FreeCam.TIMEOUT == 0 && KeyBindFreeCam.keyBindBackward.isPressed() && Render.enabled) {
            FreeCam.TIMEOUT = 2;
            Render.z += 0.5F;
        }
        if(FreeCam.TIMEOUT == 0 && KeyBindFreeCam.keyBindForward.isPressed() && Render.enabled) {
            FreeCam.TIMEOUT = 2;
            Render.z -= 0.5F;
        }
        if(FreeCam.TIMEOUT == 0 && KeyBindFreeCam.keyBindRight.isPressed() && Render.enabled) {
            FreeCam.TIMEOUT = 2;
            Render.x += 0.5F;
        }
        if(FreeCam.TIMEOUT == 0 && KeyBindFreeCam.keyBindLeft.isPressed() && Render.enabled) {
            FreeCam.TIMEOUT = 2;
            Render.x -= 0.5F;
        }
    }
}
