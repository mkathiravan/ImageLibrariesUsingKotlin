package net.kathir.imagelibraries

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.api.load
import kotlinx.android.synthetic.main.coil_ui_view.*

class CoilUIActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.coil_ui_view)

        imageView.load("https://talksport.com/wp-content/uploads/sites/5/2019/05/GettyImages-1139973692.jpg?strip=all&w=960&quality=100");
    }
}