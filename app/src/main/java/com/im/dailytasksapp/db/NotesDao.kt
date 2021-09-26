package com.im.dailytasksapp.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.im.dailytasksapp.model.Note

@Dao
interface NotesDao {


    @Query("SELECT * FROM notes_table ORDER BY id DESC")
    fun getAllNotes(): LiveData<List<Note>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(note: Note)

    @Update
    suspend fun update(note: Note)

    @Delete
    suspend fun delete(note: Note)


}