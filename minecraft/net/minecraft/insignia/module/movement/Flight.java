package net.minecraft.insignia.module.movement;

import net.minecraft.insignia.module.Category;
import net.minecraft.insignia.module.Module;
import org.lwjgl.input.Keyboard;

public class Flight extends Module  {
    public Flight() {
        super("Flight", "Makes you fly", Keyboard.KEY_F, Category.MOVEMENT);
    }

    @Override
    public void onEnable() {
        System.out.println("toggled");
        mc.thePlayer.capabilities.allowFlying = true;
        mc.thePlayer.capabilities.isFlying = true;
    }

    @Override
    public void onDisable() {
        if(!mc.playerController.isInCreativeMode()) {
            mc.thePlayer.capabilities.allowFlying = false;
            mc.thePlayer.capabilities.isFlying = false;
        }
    }
}
