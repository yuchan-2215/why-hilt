package xyz.miyayu.android.hiltlearn.model

import android.util.Log
import java.util.UUID

class Car {
    private val id = UUID.randomUUID()

    fun drive() {
        Log.i("EXAMPLE_CAR", "${id.toString()} is Driving !!")
    }
}