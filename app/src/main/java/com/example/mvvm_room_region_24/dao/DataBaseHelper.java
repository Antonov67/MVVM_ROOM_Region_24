package com.example.mvvm_room_region_24.dao;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {UserEntity.class}, version = 1)
public abstract class DataBaseHelper extends RoomDatabase {
    public static final String DATABASE_NAME = "db";
    public abstract DaoInt daoInt();
}
