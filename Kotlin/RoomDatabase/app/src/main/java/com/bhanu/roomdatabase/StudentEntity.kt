package com.bhanu.roomdatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "students")
class StudentEntity {

    @PrimaryKey(autoGenerate = true)
    var studentId : Int = 0

    @ColumnInfo(name = "studentName")
    var sName : String = ""
}