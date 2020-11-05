package com.example.madlevel5task1

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import java.util.*

@Entity(tableName = "NoteTable")
@TypeConverters(Converter::class)
class Note (
    @ColumnInfo(name = "title")
    var title: String,

    @ColumnInfo(name = "lastUpdated")
    var lastUpdated: Date,

    @ColumnInfo(name = "text")
    var text: String,

    @PrimaryKey(autoGenerate = true)
    var id: Long
)