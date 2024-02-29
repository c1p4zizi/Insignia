package net.minecraft.insignia.module;


//zajchu horse fucker idiot retard


import net.minecraft.client.Minecraft;

public abstract class Module {
    private final String name;
    private final String description;
    private boolean toggled;
    private int key;
    private final Category category;
    public Minecraft mc = Minecraft.getMinecraft();

    protected Module(final String name, String description, final int key, final Category category) {
        this.name = name;
        this.key = key;
        this.category = category;
        this.description = description;
    }

    public void toggle() {
        this.toggled = !this.toggled;

        if(this.toggled) {
            this.onEnable();
        }
        else {
            this.onDisable();
        }
    }

    public abstract void onEnable();

    public abstract void onDisable();

    public String getName() {
        return this.name;
    }

    public boolean isToggled() {
        return this.toggled;
    }

    public Category getCategory() {
        return this.category;
    }

    public int getKey() {
        return this.key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getDescription() {
        return this.description;
    }


}

