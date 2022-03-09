package com.bhanu.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.room.Room
import com.bhanu.roomdatabase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        //ROOM = APP DB register => sqlite
        val db = Room.databaseBuilder(this, AppDB::class.java, "STUENTDB").build()

        binding.create.setOnClickListener {
            val thread = Thread {
                val studentEntity = StudentEntity()
                studentEntity.sName = "Bhanu"
                db.studentDao().addStudent(studentEntity)
            }
            thread.start()
        }
        binding.read.setOnClickListener {
            val thread = Thread {
                db.studentDao().getAllStudents().forEach {
                    Log.i("ROOMDBSE", "${it.studentId}")
                    Log.i("ROOMDBSE", "${it.sName}")
                }
            }
            thread.start()
        }
        binding.update.setOnClickListener {
            val thread = Thread {
                db.studentDao().updateStudent(3)
            }
            thread.start()
        }
        binding.delete.setOnClickListener {
            val thread = Thread {
                db.studentDao().deleteStudent(1)
            }
            thread.start()
        }
    }
}