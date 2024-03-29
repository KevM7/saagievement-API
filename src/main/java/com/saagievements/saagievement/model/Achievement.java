package com.saagievements.saagievement.model;

import java.util.Objects;

/**
 * Achievement represents a goal to do or done
 * If it's done then this goal is unlocked
 */
public class Achievement {

    // ATTRIBUTES

    /**
     * Unique identifier
     */
    private int id;
    /**
     * Achievement description
     */
    private String goal;
    /**
     * true if this achievement is unlocked
     */
    private boolean unlock;

    // CONSTRUCTORS

    /**
     * Create a new default achievement instance
     */
    public Achievement() {

    }

    /**
     * Create a new achievement instance
     * @param id unique integer identifier greater than or equal to 0
     * @param goal achievement description
     * @param unlock true if unlock
     */
    public Achievement(int id, String goal, boolean unlock) {
        this.id = id;
        this.goal = goal;
        this.unlock = unlock;
    }

    // GETTERS AND SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public boolean isUnlock() {
        return unlock;
    }

    public void setUnlock(boolean unlock) {
        this.unlock = unlock;
    }

    // METHODS

    @Override
    public String toString() {
        return "Achievement{"
                    + "id=" + id
                    + ", goal=" + goal
                    + ", unlock=" + unlock
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Achievement that = (Achievement) o;
        return id == that.id &&
                unlock == that.unlock &&
                goal.equals(that.goal);
    }
}
