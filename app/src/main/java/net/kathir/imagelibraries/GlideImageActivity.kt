package net.kathir.imagelibraries

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.glide_main.*

class GlideImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.glide_main)

        loadImage.setOnClickListener {

            val intent = Intent(this@GlideImageActivity,GlideImageViewActivity::class.java)
            intent.putExtra("glide_type","normal")
            startActivity(intent)
        }

        gifImage.setOnClickListener {

            val intent = Intent(this@GlideImageActivity,GlideImageViewActivity::class.java)
            intent.putExtra("glide_type","gif")
            startActivity(intent)

        }

        resizeImage.setOnClickListener {

            val intent = Intent(this@GlideImageActivity,GlideImageViewActivity::class.java)
            intent.putExtra("glide_type","resize")
            startActivity(intent)
        }

        placeholderImage.setOnClickListener {

            val intent = Intent(this@GlideImageActivity,GlideImageViewActivity::class.java)
            intent.putExtra("glide_type","placeholder")
            startActivity(intent)
        }

        centercrop_Image.setOnClickListener {

            val intent = Intent(this@GlideImageActivity,GlideImageViewActivity::class.java)
            intent.putExtra("glide_type","center_crop")
            startActivity(intent)
        }

        fitcenter_Image.setOnClickListener {

            val intent = Intent(this@GlideImageActivity,GlideImageViewActivity::class.java)
            intent.putExtra("glide_type","fit_center")
            startActivity(intent)
        }

        roundedtrans_Image.setOnClickListener {


            val intent = Intent(this@GlideImageActivity,GlideImageViewActivity::class.java)
            intent.putExtra("glide_type","rounded_trans")
            startActivity(intent)

        }

        circlecrop_Image.setOnClickListener {

            val intent = Intent(this@GlideImageActivity,GlideImageViewActivity::class.java)
            intent.putExtra("glide_type","circle_trans")
            startActivity(intent)
        }

        blur_Image.setOnClickListener {

            val intent = Intent(this@GlideImageActivity,GlideImageViewActivity::class.java)
            intent.putExtra("glide_type","blur_image")
            startActivity(intent)
        }

        multiple_transform_image.setOnClickListener {

            val intent = Intent(this@GlideImageActivity,GlideImageViewActivity::class.java)
            intent.putExtra("glide_type","multiple_trans")
            startActivity(intent)

        }
    }
}