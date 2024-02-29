package net.minecraft.insignia.util;

public final class MathUtil {
    private MathUtil() {

    }

    public static float lerp(float x, float y, float distance) {
        return (x * (1 - distance) + y * distance);
    }

    public static float getDistance3D(float x, float y, float z, float x2, float y2, float z2) {
        float distanceX = x2 - x;
        float distanceY = y2 - y;
        float distanceZ = z2 - z;
        return (float) Math.sqrt(square(distanceX) + square(distanceY) + square(distanceZ));
    }

    public static int square(int x) {
        return x*x;
    }

    public static float square(float x) {
        return x*x;
    }
}
