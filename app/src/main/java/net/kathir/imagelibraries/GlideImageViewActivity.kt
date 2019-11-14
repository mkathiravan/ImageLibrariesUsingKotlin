package net.kathir.imagelibraries

import android.graphics.Bitmap
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.picasso_view.*
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import jp.wasabeef.glide.transformations.RoundedCornersTransformation
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import com.bumptech.glide.load.MultiTransformation
import jp.wasabeef.picasso.transformations.BlurTransformation


class GlideImageViewActivity : AppCompatActivity()
{

    private val TAG = GlideImageViewActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.picasso_view)

        val profileName=intent.getStringExtra("glide_type")

        if(profileName.equals("normal"))
        {
            Log.d(TAG,"Normal_load")
            Glide.with(this).load("https://www.cheatsheet.com/wp-content/uploads/2019/06/Cristiano-Ronaldo.jpg").into(ImageVw)

        }
        else if(profileName.equals("gif"))
        {
            Log.d(TAG,"Gif_image_load")

            Glide.with(this).asGif().load("https://thumbs.gfycat.com/SpiffyGentleAss-small.gif").into(ImageVw)

        }
        else if(profileName.equals("resize"))
        {
            Log.d(TAG,"resize_image")

            Glide.with(this).load("https://www.cheatsheet.com/wp-content/uploads/2019/06/Cristiano-Ronaldo.jpg")
                .override(300, 200)
                .into(ImageVw)

        }

        else if(profileName.equals("placeholder"))
        {
            Log.d(TAG,"placeholder/Error Image")

            Glide.with(this).load("https://www.cheatsheet.com/wp-content/uploads/2019/06/Cristiano-Ronaldo.jpg")
                .placeholder(R.drawable.cr7)
                .error(R.drawable.noimg)
                .into(ImageVw)

        }

        else if(profileName.equals("center_crop"))
        {

            Log.d(TAG,"center_crop")

            Glide.with(this)
                .load("https://www.cheatsheet.com/wp-content/uploads/2019/06/Cristiano-Ronaldo.jpg")
                .centerCrop()
                .into(ImageVw);
        }


        else if(profileName.equals("fit_center"))
        {

            Log.d(TAG,"fit_center_image")

            Glide.with(this)
                .load("https://www.cheatsheet.com/wp-content/uploads/2019/06/Cristiano-Ronaldo.jpg")
                .fitCenter()
                .into(ImageVw);
        }

        else if(profileName.equals("rounded_trans"))
        {

            Log.d(TAG,"rounded_trans_image")


            val radius = 30 // corner radius, higher value = more rounded
            val margin = 10 // crop margin, set to 0 for corners with no crop
            Glide.with(this)
                .load(R.drawable.cr7)
                .transform(RoundedCornersTransformation(radius, margin))
                .into(ImageVw)
        }

        else if(profileName.equals("circle_trans")){

            Log.d(TAG,"circle_trans_image")
            Glide.with(this)
                .load(R.drawable.cr7)
                .transform(CircleCrop())
                .into(ImageVw)
        }

        else if(profileName.equals("blur_image"))
        {
            Log.d(TAG,"blur_image")

            Glide.with(this)
                .load(R.drawable.cr7)
                .transform(jp.wasabeef.glide.transformations.BlurTransformation(10))
                .into(ImageVw)
        }

        else if(profileName.equals("multiple_trans"))
        {
            Log.d(TAG,"Multitrans_image")
            Glide.with(this)
                .load(R.drawable.cr7)
                .transform(MultiTransformation<Bitmap>(jp.wasabeef.glide.transformations.BlurTransformation(15)),CircleCrop())
                .into(ImageVw)
        }
    }
}