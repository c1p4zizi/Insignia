package net.minecraft.insignia.object;

public final class Vector3f {
    int x = 0;
    int y = 0;
    int z = 0;

    public Vector3f(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3f() {

    }

    public Vector3f(Vector3f vec) {
        this.x = vec.x;
        this.y = vec.y;
        this.z = vec.z;
    }
}
