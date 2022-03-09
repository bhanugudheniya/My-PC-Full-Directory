package com.bhanu.roomdatabase

import androidx.room.Database
import androidx.room.RoomDatabase
//TABLES IN DATABASE
@Database(entities = [(StudentEntity::class)], version = 1)
abstract class AppDB : RoomDatabase() {
    abstract fun studentDao() : StudentDAO
}