package net.minecraft.insignia.event;

public class Cancellable {
    private boolean cancelled = false;

    public boolean isCancelled() {
        return this.cancelled;
    }

    public void setCancelled() {
        this.cancelled = true;

    }
}
