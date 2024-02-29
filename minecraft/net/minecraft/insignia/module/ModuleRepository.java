package net.minecraft.insignia.module;

import net.minecraft.insignia.module.movement.Flight;

public final class ModuleRepository {
    public ModuleRepository() {}

    private Module[] modules = {new Flight()};
    public Module flight = modules[0];

    public Module[] getModules() {
        return this.modules;
    }


}
