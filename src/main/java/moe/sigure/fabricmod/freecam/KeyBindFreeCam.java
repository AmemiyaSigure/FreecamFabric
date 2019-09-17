package moe.sigure.fabricmod.freecam;

import net.fabricmc.fabric.api.client.keybinding.FabricKeyBinding;
import net.fabricmc.fabric.api.client.keybinding.KeyBindingRegistry;
import net.minecraft.client.util.InputUtil;
import net.minecraft.util.Identifier;
import org.lwjgl.glfw.GLFW;

public class KeyBindFreeCam {
    public static FabricKeyBinding keyBindToggle = FabricKeyBinding.Builder.create(
            new Identifier(FreeCam.MODID, "toggle"),
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_U,
            "FreeCam"
    ).build();
    public static FabricKeyBinding keyBindReset = FabricKeyBinding.Builder.create(
            new Identifier(FreeCam.MODID, "reset"),
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_O,
            "FreeCam"
    ).build();
    public static FabricKeyBinding keyBindUp = FabricKeyBinding.Builder.create(
            new Identifier(FreeCam.MODID, "up"),
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_PAGE_UP,
            "FreeCam"
    ).build();
    public static FabricKeyBinding keyBindDown = FabricKeyBinding.Builder.create(
            new Identifier(FreeCam.MODID, "down"),
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_PAGE_DOWN,
            "FreeCam"
    ).build();
    public static FabricKeyBinding keyBindRight = FabricKeyBinding.Builder.create(
            new Identifier(FreeCam.MODID, "right"),
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_RIGHT,
            "FreeCam"
    ).build();
    public static FabricKeyBinding keyBindLeft = FabricKeyBinding.Builder.create(
            new Identifier(FreeCam.MODID, "left"),
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_LEFT,
            "FreeCam"
    ).build();
    public static FabricKeyBinding keyBindForward = FabricKeyBinding.Builder.create(
            new Identifier(FreeCam.MODID, "forward"),
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_UP,
            "FreeCam"
    ).build();
    public static FabricKeyBinding keyBindBackward = FabricKeyBinding.Builder.create(
            new Identifier(FreeCam.MODID, "backward"),
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_DOWN,
            "FreeCam"
    ).build();

    public KeyBindFreeCam() {
        KeyBindingRegistry.INSTANCE.register(keyBindToggle);
        KeyBindingRegistry.INSTANCE.register(keyBindReset);
        KeyBindingRegistry.INSTANCE.register(keyBindUp);
        KeyBindingRegistry.INSTANCE.register(keyBindDown);
        KeyBindingRegistry.INSTANCE.register(keyBindRight);
        KeyBindingRegistry.INSTANCE.register(keyBindLeft);
        KeyBindingRegistry.INSTANCE.register(keyBindForward);
        KeyBindingRegistry.INSTANCE.register(keyBindBackward);
    }
}
