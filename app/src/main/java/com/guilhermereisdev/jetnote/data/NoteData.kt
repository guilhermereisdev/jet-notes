package com.guilhermereisdev.jetnote.data

import com.guilhermereisdev.jetnote.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "Primeira anotação", description = "Descrição da primeira anotação."),
            Note(title = "Segunda anotação", description = "Descrição da Segunda anotação."),
            Note(title = "Terceira anotação", description = "Descrição da Terceira anotação."),
            Note(title = "Quarta anotação", description = "Descrição da Quarta anotação."),
            Note(title = "Quinta anotação", description = "Descrição da Quinta anotação."),
            Note(title = "Sexta anotação", description = "Descrição da Sexta anotação."),
            Note(title = "Sétima anotação", description = "Descrição da Sétima anotação."),
            Note(title = "Oitava anotação", description = "Descrição da Oitava anotação."),
        )
    }
}
