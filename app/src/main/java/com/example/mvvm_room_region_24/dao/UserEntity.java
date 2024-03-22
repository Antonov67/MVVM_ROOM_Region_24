package com.example.mvvm_room_region_24.dao;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "users", indices = {@Index(value = {"name"}, unique = true)})
public class UserEntity {

    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "name")
    @NonNull
    private String name = "";
    @ColumnInfo(name = "password")
    @NonNull
    private String pswrd = "";

    public int getId() {
        return id;
    }

    @NonNull
    public String getName() {
        return name;
    }

    @NonNull
    public String getPswrd() {
        return pswrd;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public void setPswrd(@NonNull String pswrd) {
        this.pswrd = pswrd;
    }
}
