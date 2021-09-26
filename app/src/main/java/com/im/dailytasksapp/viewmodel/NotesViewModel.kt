package com.im.dailytasksapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.im.dailytasksapp.db.NotesDatabase
import com.im.dailytasksapp.model.Note
import com.im.dailytasksapp.repository.NotesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NotesViewModel(
    var notes: LiveData<List<Note>>,
    var repository: NotesRepository,
    application: Application
) : AndroidViewModel(application) {

    init {
        val dao = NotesDatabase.getNoteDatabase(application).getNoteDao()
        repository = NotesRepository(dao)
        notes = repository.getNotes
    }


    fun insert(note: Note) = viewModelScope.launch(Dispatchers.IO) {
        repository.insert(note)
    }

    fun update(note: Note) = viewModelScope.launch(Dispatchers.IO) {
        repository.insert(note)
    }

    fun delete(note: Note) = viewModelScope.launch(Dispatchers.IO) {
        repository.insert(note)
    }

}