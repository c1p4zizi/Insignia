package net.minecraft.insignia.setting.settings;

import net.minecraft.insignia.setting.Setting;

public class FloatSetting extends Setting<Float> {
    private float max;
    private float min;

    public FloatSetting(final String name, float max, float min) {
        super(name);
    }

    public float getMax() {
        return this.max;
    }

    public float getMin() {
        return this.min;
    }

    public void setValue(float value) {
        if(max >= value && value >= min) {
            super.setValue(value);
        }
    }
}
