package com.danp.danp_candidatos_01.data

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

abstract class CandidatoBaseDatos: RoomDatabase(){
    abstract fun candidatoDao():CandidatoDao

    companion object {
        @Volatile
        private var INSTANCE: CandidatoBaseDatos? = null

        fun obtenerBaseDatos(context: Context): CandidatoBaseDatos {
            val tempInstance = INSTANCE

            if(tempInstance != null){
                return  tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    CandidatoBaseDatos::class.java,
                    "candidato_database"
                ).build()
                INSTANCE=instance
                return  instance
            }
        }
    }

}