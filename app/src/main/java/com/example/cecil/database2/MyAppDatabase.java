package com.example.cecil.database2;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by cecil on 16-04-2018.
 */
@Database(entities = {Mad.class}, version = 1,  exportSchema = false)
public abstract class MyAppDatabase extends RoomDatabase
{
    public abstract MyDao myDao();
}
