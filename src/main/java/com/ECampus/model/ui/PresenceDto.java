package com.ECampus.model.ui;

public class PresenceDto {
    private int presenceId;
    private int presence;
    private boolean presenceStatus;

    public PresenceDto(int presenceId, int presence, boolean presenceStatus) {
        this.presenceId = presenceId;
        this.presence = presence;
        this.presenceStatus = presenceStatus;
    }
}
