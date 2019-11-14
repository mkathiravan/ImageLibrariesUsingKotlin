package net.kathir.imagelibraries

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        coilImage.setOnClickListener {

            startActivity(Intent(this@MainActivity,CoilUIActivity::class.java))
        }

        cropImage.setOnClickListener {

            startActivity(Intent(this@MainActivity,CropImageActivity::class.java))
        }

        picassoImage.setOnClickListener {

            startActivity(Intent(this@MainActivity,PicassoImageActivity::class.java))
        }

        glideImage.setOnClickListener {

            startActivity(Intent(this@MainActivity,GlideImageActivity::class.java))

        }

        universalImage.setOnClickListener {

            startActivity(Intent(this@MainActivity,UniversalImageActivity::class.java))

        }

        frescoImage.setOnClickListener {

            startActivity(Intent(this@MainActivity,FrescoImageActivity::class.java))
        }


    }
}
