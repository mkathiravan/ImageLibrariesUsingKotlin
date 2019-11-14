package net.kathir.imagelibraries

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.picasso_main.*

class PicassoImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.picasso_main)

        picasso_loadImage.setOnClickListener {

            val intent = Intent(this@PicassoImageActivity,PicassoImageViewActivity::class.java)
            intent.putExtra("picasso_type","normal")
            startActivity(intent)

        }

        picasso_imageCrop.setOnClickListener {

            val intent = Intent(this@PicassoImageActivity,PicassoImageViewActivity::class.java)
            intent.putExtra("picasso_type","crop")
            startActivity(intent)

        }


        picasso_imageres.setOnClickListener {

            val intent = Intent(this@PicassoImageActivity,PicassoImageViewActivity::class.java)
            intent.putExtra("picasso_type","local")
            startActivity(intent)
        }



        picasso_placeholder.setOnClickListener {

            val intent = Intent(this@PicassoImageActivity,PicassoImageViewActivity::class.java)
            intent.putExtra("picasso_type","placeholder")
            startActivity(intent)
        }


        picasso_blurtransformation.setOnClickListener {


            val intent = Intent(this@PicassoImageActivity,PicassoImageViewActivity::class.java)
            intent.putExtra("picasso_type","blur_transformation")
            startActivity(intent)
        }


        picasso_greytransformation.setOnClickListener {


            val intent = Intent(this@PicassoImageActivity,PicassoImageViewActivity::class.java)
            intent.putExtra("picasso_type","grey_transformation")
            startActivity(intent)
        }


        picasso_roundedcornertransformation.setOnClickListener {

            val intent = Intent(this@PicassoImageActivity,PicassoImageViewActivity::class.java)
            intent.putExtra("picasso_type","rounded_corner_transformation")
            startActivity(intent)

        }

        picasso_masktransformation.setOnClickListener {

            val intent = Intent(this@PicassoImageActivity,PicassoImageViewActivity::class.java)
            intent.putExtra("picasso_type","mask_transformation")
            startActivity(intent)

        }

        picasso_circleransformation.setOnClickListener {

            val intent = Intent(this@PicassoImageActivity,PicassoImageViewActivity::class.java)
            intent.putExtra("picasso_type","circlecrop_transformation")
            startActivity(intent)

        }

        picasso_ribbonColor.setOnClickListener {


            val intent = Intent(this@PicassoImageActivity,PicassoImageViewActivity::class.java)
            intent.putExtra("picasso_type","ribon_color")
            startActivity(intent)
        }

        picasso_offline.setOnClickListener {

            val intent = Intent(this@PicassoImageActivity,PicassoImageViewActivity::class.java)
            intent.putExtra("picasso_type","offline_mode")
            startActivity(intent)
        }

    }
}