package com.idea.lan.action;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListSetMap {
    private int id;
    private String name;
    private List listValue;
    private Set setValue;
    private Map mapValue;

    public ListSetMap(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public ListSetMap() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getListValue() {
        return listValue;
    }

    public void setListValue(List listValue) {
        this.listValue = listValue;
    }

    public Set getSetValue() {
        return setValue;
    }

    public void setSetValue(Set setValue) {
        this.setValue = setValue;
    }

    public Map getMapValue() {
        return mapValue;
    }

    public void setMapValue(Map mapValue) {
        this.mapValue = mapValue;
    }

    @Override
    public String toString() {
        return "ListSetMap{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", listValue=" + listValue +
                ", setValue=" + setValue +
                ", mapValue=" + mapValue +
                '}';
    }
}
