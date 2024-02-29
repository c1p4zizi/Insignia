package net.minecraft.insignia.command;

public abstract class Command {
    private final String name;
    private final String description;

    public Command(final String name, final String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public abstract void execute(String...args);

}
