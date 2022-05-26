package com.danp.danp_candidatos_01

import android.content.Context
import android.graphics.Color
import android.graphics.fonts.FontFamily
import android.graphics.fonts.FontStyle
import android.webkit.WebSettings
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


class Preferencias(
    private val context: Context
) {
    suspend fun saveNoteDistrito(noteDistrito: String) {
        context.dataStoree.edit { preferences ->
            preferences[DISTRITO] = noteDistrito
        }
    }
    suspend fun saveNoteCandidato(noteCandidato: String) {
        context.dataStoree.edit { preferences ->
            preferences[CANDIDATO] = noteCandidato
        }
    }

    val getDistrito: Flow<String> = context.dataStoree.data
        .map { preferences ->
            preferences[DISTRITO] ?: "ninguno"
        }

    val getCandidato: Flow<String> = context.dataStoree.data
        .map { preferences ->
            preferences[CANDIDATO] ?: "ninguno"
        }

    companion object {
        private val Context.dataStoree: DataStore<Preferences> by preferencesDataStore("userPreferences")
        private val DISTRITO = stringPreferencesKey("key_app_distrito")
        private val CANDIDATO = stringPreferencesKey("key_app_candidato")
    }
}