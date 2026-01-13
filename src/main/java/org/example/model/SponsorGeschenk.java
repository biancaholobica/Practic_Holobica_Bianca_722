package org.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SponsorGeschenk {
    @JsonProperty("id") int id;
    @JsonProperty("tributeId") int tributeId;
    @JsonProperty("itemName") String itemName;
    @JsonProperty("value") int value;
    @JsonProperty("day") int day;

    public SponsorGeschenk() {}
    public SponsorGeschenk(int id, int tributeId, String itemName, int value, int day) {
        this.id = id;
        this.tributeId = tributeId;
        this.itemName = itemName;
        this.value = value;
        this.day = day;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getTributeId() { return tributeId; }
    public void setTributeId(int tributeId) { this.tributeId = tributeId; }
    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }
    public int getValue() { return value; }
    public void setValue(int value) { this.value = value; }
    public int getDay() { return day; }
    public void setDay(int day) { this.day = day; }

    @Override
    public String toString() {
        return String.format("id: %d | tributeId: %d | itemName: %s | value: %d | day: %d", id, tributeId, itemName, value, day);
    }
}
