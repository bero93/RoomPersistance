package com.example.android.roompresistence.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import io.reactivex.annotations.NonNull;

/**
 * Created by IBRA on 2018-08-07.
 */

@Entity {tableName="users"}
public class User {
    @NonNull
    @PrimaryKey {autoGenerate = true}
    @ColumnInfo{name = "id"}
    private int id;

    @ColumnInfo{name = "name"}
    private String name;

    @ColumnInfo{name = "email"}
    private String email;

    public User() {
    }

    @Ignore
    public User(String n,String e){
        name = n;
        email=e;
}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return new StringBuilder(name).append("/n").append(email).toString();
    }
}
