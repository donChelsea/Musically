package com.example.musically2.data.remote

import com.google.firebase.firestore.FirebaseFirestore
import com.example.musically2.data.models.Song
import com.example.musically2.other.Constants.SONG_COLLECTION
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class MusicDatabase @Inject constructor(private val storage: FirebaseFirestore) {

    private val songCollection = storage.collection(SONG_COLLECTION)

    suspend fun getAllSongs(): List<Song> {
        return try {
            songCollection.get().await().toObjects(Song::class.java)
        } catch(e: Exception) {
            emptyList()
        }
    }
}