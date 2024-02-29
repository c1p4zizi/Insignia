package net.minecraft.insignia.setting.settings;

import net.minecraft.insignia.setting.Setting;

public class MultipleSetting extends Setting<Integer> {
    private final String[] options;

    public MultipleSetting(final String[] options, final int defaultValue, final String name) {
        super(name);
        this.options = options;
        super.setValue(defaultValue);
    }

    public String[] getOptions() {
        return this.options;
    }

    public void setValue(int selectedOption) {
        if(selectedOption > 0 && selectedOption < options.length ) {
            super.setValue(selectedOption);
        }
    }

}
