package com.example.mvvm_room_region_24.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.mvvm_room_region_24.dao.DaoInt;
import com.example.mvvm_room_region_24.dao.DataBaseManager;
import com.example.mvvm_room_region_24.dao.UserEntity;

import java.util.List;

public class MainViewModel extends AndroidViewModel {
    private DaoInt dao;
    private DataBaseManager dataBaseManager;

    public MainViewModel(@NonNull Application application) {
        super(application);
        dataBaseManager = DataBaseManager.getInstance(application);
        dao = dataBaseManager.getDaoInt();
    }

    public void insertUser(List<UserEntity> data){
        dao.insertUser(data);
    }

    public LiveData<List<UserEntity>> getAllUsers(){
         return dao.getAllUsers();
    }
}
