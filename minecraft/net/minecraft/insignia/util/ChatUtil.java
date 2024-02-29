package net.minecraft.insignia.util;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public final class ChatUtil {
    private ChatUtil() {

    }

    public static void printClientMsg(String message) {
        Minecraft.getMinecraft().ingameGUI.getChatGUI().printChatMessage(new ChatComponentText("[" + EnumChatFormatting.RED + "Insignia"
                + EnumChatFormatting.RESET + "] "+ message));

    }

}
