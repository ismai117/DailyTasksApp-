package com.im.dailytasksapp.repository

import com.im.dailytasksapp.db.NotesDao
import com.im.dailytasksapp.model.Note

class NotesRepository(
    val notesDao: NotesDao
) {

    val getNotes = notesDao.getAllNotes()

    suspend fun insert(note: Note){
        notesDao.insert(note)
    }

    suspend fun update(note: Note){
        notesDao.update(note)
    }

    suspend fun delete(note: Note){
        notesDao.delete(note)
    }

}