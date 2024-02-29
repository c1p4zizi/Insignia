package net.minecraft.insignia.setting.settings;

import net.minecraft.insignia.setting.Setting;

public class IntegerSetting extends Setting<Integer> {
    private int max;
    private int min;

    public IntegerSetting(final String name, int max, int min) {
        super(name);
    }

    public int getMax() {
        return this.max;
    }

    public int getMin() {
        return this.min;
    }

    public void setValue(int value) {
        if(max >= value && value >= min) {
            super.setValue(value);
        }
    }
}
