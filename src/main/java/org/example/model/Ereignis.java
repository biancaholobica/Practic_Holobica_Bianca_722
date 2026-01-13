package org.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ereignis {
    @JsonProperty("id") int id;
    @JsonProperty("tributeId") int tributeId;
    @JsonProperty("type") EventTyp typ;
    @JsonProperty("points") int points;
    @JsonProperty("day") int day;

    public Ereignis() {}

    public Ereignis(int id, int tributeId, EventTyp typ, int points, int day) {
        this.id = id;
        this.tributeId = tributeId;
        this.typ = typ;
        this.points = points;
        this.day = day;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getTributeId() { return tributeId; }
    public void setTributeId(int tributeId) { this.tributeId = tributeId; }
    public EventTyp getTyp() { return typ; }
    public void setTyp(EventTyp typ) { this.typ = typ; }
    public int getPoints() { return points; }
    public void setPoints(int points) { this.points = points; }
    public int getDay() { return day; }
    public void setDay(int day) { this.day = day; }

    @Override
    public String toString() {
        return String.format("id: %d | tributeId: %d | typ: %s | points: %d | day: %d", id, tributeId, typ, points, day);
    }
}
