package com.example.mvvm_room_region_24.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DaoInt {

    @Insert
    void insertUser(List<UserEntity> data);

    @Query("SELECT * FROM 'users'")
    LiveData<List<UserEntity>> getAllUsers();
}
