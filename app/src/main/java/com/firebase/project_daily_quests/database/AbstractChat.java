package com.firebase.project_daily_quests.database;

/**
 * Common interface for chat messages, helps share code between RTDB and Firestore examples.
 */
public abstract class AbstractChat {

    public abstract String getName();

    public abstract String getMessage();

    public abstract String getUid();

    @Override
    public abstract int hashCode();

    @Override
    public abstract boolean equals(Object obj);

}