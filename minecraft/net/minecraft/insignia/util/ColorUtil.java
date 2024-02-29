package net.minecraft.insignia.util;

import java.awt.*;

public final class ColorUtil {
    private ColorUtil() {

    }

    public static Color getDarkenedColor(Color color, float darkenPercent) {
        float[] darkenedColorBase = new float[3];
        Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), darkenedColorBase);
        float newBrightness = Math.max(0, darkenedColorBase[2] - darkenPercent);
        return new Color(Color.HSBtoRGB(darkenedColorBase[0], darkenedColorBase[1],  newBrightness));
    }

    public static Color getInterpolatedColor2D(Color color, Color color2, float distance) {
        float r = MathUtil.lerp(color.getRed(), color2.getRed(), distance);
        float g = MathUtil.lerp(color.getGreen(), color2.getGreen(), distance);
        float b = MathUtil.lerp(color.getBlue(), color2.getBlue(), distance);

        return new Color(r,g,b);
    }

    public static Color getBreathingColor(Color color) {
        float distance = (float) (Math.sin(System.nanoTime()) + 0.5F) / 2F;
        Color darkenedColor = getDarkenedColor(color, 60);
        return getInterpolatedColor2D(color, darkenedColor, distance);
    }
}
