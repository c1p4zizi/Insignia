package net.minecraft.insignia.setting;

public class Setting<T> {
    private T value;

    public Setting(String name) {

    }
    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

}
