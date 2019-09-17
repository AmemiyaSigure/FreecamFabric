package moe.sigure.fabricmod.freecam;

import net.fabricmc.fabric.api.event.client.ClientTickCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;

public class Render {
    private FakeClientPlayer fakePlayer = null;
    public static double x, y, z, prevX, prevY, prevZ;
    public static float prevYaw, prevHeadYaw, prevPitch;
    public static boolean enabled = false;

    public Render() {
        ClientTickCallback.EVENT.register(this::onTick);
    }

    private void onTick(MinecraftClient minecraft) {
        if (enabled) {
            if (fakePlayer == null) {
                fakePlayer = new FakeClientPlayer(EntityType.PLAYER, minecraft.world);
            }

            PlayerEntity player = minecraft.player;
            if (player != null) {
                fakePlayer.setPositionAndAngles(x, y ,z, player.yaw, player.pitch);
                fakePlayer.headYaw = player.headYaw;

                fakePlayer.prevYaw = prevYaw;
                fakePlayer.prevHeadYaw = prevHeadYaw;
                fakePlayer.prevPitch = prevPitch;
                fakePlayer.prevX = prevX;
                fakePlayer.prevY = prevY;
                fakePlayer.prevZ = prevZ;
                minecraft.setCameraEntity(fakePlayer);

                prevX = x;
                prevY = y;
                prevZ = z;
                prevYaw = player.yaw;
                prevHeadYaw = player.headYaw;
                prevPitch = player.pitch;
            }
        }
        else
        {
            minecraft.setCameraEntity(minecraft.player);
        }
    }
}
