package com.example.madlevel5task1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_note.view.*

class NotepadAdapter(var notes: List<Note>) : RecyclerView.Adapter<NotepadAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_note, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.databind(notes[position])
    }

    override fun getItemCount(): Int {
        return notes.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun databind(note: Note) {
            itemView.txtTitle.text = note.title
            itemView.txtNote.text = note.text
        }
    }
}