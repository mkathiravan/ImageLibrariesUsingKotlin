package net.kathir.imagelibraries

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.universal_main.*


class UniversalImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.universal_main)

        loadImage.setOnClickListener {

            val intent = Intent(this@UniversalImageActivity,UniversalImageViewActivity::class.java)
            intent.putExtra("universal_type","normal")
            startActivity(intent)

        }

        universal_image_callback.setOnClickListener {

            val intent = Intent(this@UniversalImageActivity,UniversalImageViewActivity::class.java)
            intent.putExtra("universal_type","load_image_callback")
            startActivity(intent)
        }

        adjust_imagesize.setOnClickListener {

            val intent = Intent(this@UniversalImageActivity,UniversalImageViewActivity::class.java)
            intent.putExtra("universal_type","image_resize")
            startActivity(intent)
        }

        cache_memory.setOnClickListener {

            val intent = Intent(this@UniversalImageActivity,UniversalImageViewActivity::class.java)
            intent.putExtra("universal_type","cache_memory")
            startActivity(intent)
        }

        image_fail.setOnClickListener {

            val intent = Intent(this@UniversalImageActivity,UniversalImageViewActivity::class.java)
            intent.putExtra("universal_type","image_fail")
            startActivity(intent)
        }

        local_image.setOnClickListener {

            val intent = Intent(this@UniversalImageActivity,UniversalImageViewActivity::class.java)
            intent.putExtra("universal_type","local_image")
            startActivity(intent)
        }

    }
}