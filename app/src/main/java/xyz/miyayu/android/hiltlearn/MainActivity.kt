package xyz.miyayu.android.hiltlearn

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import xyz.miyayu.android.hiltlearn.model.Car
import javax.inject.Inject

class MainActivity @Inject constructor(var car: Car) : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        car.drive()
    }
}