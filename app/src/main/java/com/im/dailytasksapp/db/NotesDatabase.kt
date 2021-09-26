package com.im.dailytasksapp.db

import android.app.Application
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.im.dailytasksapp.model.Note

@Database(
    entities = [Note::class],
    version = 1,
    exportSchema = false
)
abstract class NotesDatabase : RoomDatabase(){

    abstract fun getNoteDao(): NotesDao

    companion object{

        @Volatile private var INSTANCE: NotesDatabase? = null


        fun getNoteDatabase(application: Application): NotesDatabase{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    application.applicationContext,
                    NotesDatabase::class.java,
                    "notes_table"
                ).build()

                INSTANCE = instance
                instance
            }

        }


    }
}