package com.firebase.project_daily_quests.quests;

/**
 * Created by Marius on 12/23/2017.
 */

public class Quest {
    private final String name;
    public Quest(String name) {this.name = name;}

    @Override public String toString() {
        return "Quest{" +
                "name='" + name + '\'' +
                '}';
    }
}
