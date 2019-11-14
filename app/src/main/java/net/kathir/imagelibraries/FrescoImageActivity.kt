package net.kathir.imagelibraries

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.fresco_main.*

class FrescoImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fresco_main)

        normalView.setOnClickListener {

            val intent = Intent(this@FrescoImageActivity,FrescoImageViewActivity::class.java)
            intent.putExtra("fresco_type","normal_image")
            startActivity(intent)
        }


        rounder_image.setOnClickListener {

            val intent = Intent(this@FrescoImageActivity,FrescoImageViewActivity::class.java)
            intent.putExtra("fresco_type","rounded_image")
            startActivity(intent)
        }

        progressbarImage.setOnClickListener {

            val intent = Intent(this@FrescoImageActivity,FrescoImageViewActivity::class.java)
            intent.putExtra("fresco_type","progress_bar")
            startActivity(intent)
        }

        rotateImage.setOnClickListener {

            val intent = Intent(this@FrescoImageActivity,FrescoImageViewActivity::class.java)
            intent.putExtra("fresco_type","rotate_image")
            startActivity(intent)
        }

        animatedImage.setOnClickListener {

            val intent = Intent(this@FrescoImageActivity,FrescoImageViewActivity::class.java)
            intent.putExtra("fresco_type","animated_image")
            startActivity(intent)
        }
    }
}