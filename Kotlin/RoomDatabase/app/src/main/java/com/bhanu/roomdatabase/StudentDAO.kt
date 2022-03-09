package com.bhanu.roomdatabase
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface StudentDAO {

    //    CREATE
    @Insert
    fun addStudent(studentEntity: StudentEntity)

    //READ
    @Query("Select * from students")
    fun getAllStudents() : List<StudentEntity>

    //UPDATE
    @Query("Update students set studentName='JOHN SMITH' where studentId=:id")
    fun updateStudent(id:Int)

    //DELETE
    @Query("Delete from students where studentId=:id")
    fun deleteStudent(id:Int)

}