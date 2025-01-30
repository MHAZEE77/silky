package com.app.silky.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.app.silky.db.dao.UserDao
import com.app.silky.db.entity.UserEntity

@Database(
    version = 1,
    entities = [UserEntity::class],
)

abstract class AppDatabase :RoomDatabase(){
    abstract fun articleDao(): UserDao
}