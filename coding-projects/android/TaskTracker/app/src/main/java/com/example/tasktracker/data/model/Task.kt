package com.example.tasktracker.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Gauri Gadkari on 1/23/24.
 */
@Entity
data class Task(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val activityName: String,
    val date: String,
    val startTimeInMillis: Int,
    val endTimeInMillis: Int,
    val duration: String,

    // these property names and types are subject to change when app persistence is implemented
)