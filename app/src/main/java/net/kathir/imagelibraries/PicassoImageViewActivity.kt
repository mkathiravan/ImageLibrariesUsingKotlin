package net.kathir.imagelibraries

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.BlurTransformation
import jp.wasabeef.picasso.transformations.GrayscaleTransformation
import kotlinx.android.synthetic.main.coil_ui_view.*
import kotlinx.android.synthetic.main.picasso_view.*
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import coil.transform.CircleCropTransformation
import jp.wasabeef.picasso.transformations.MaskTransformation
import jp.wasabeef.picasso.transformations.RoundedCornersTransformation
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import com.squareup.picasso.NetworkPolicy


class PicassoImageViewActivity : AppCompatActivity()
{

    private val TAG = PicassoImageViewActivity::class.java.simpleName



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.picasso_view)


        val profileName=intent.getStringExtra("picasso_type")
        if(profileName.equals("normal"))
        {

            Log.d(TAG,"Normal_View")
            Picasso.get()
                .load("https://www.cheatsheet.com/wp-content/uploads/2019/06/Cristiano-Ronaldo.jpg")
                .into(ImageVw, object : Callback {
                    override fun onSuccess() {
                        Log.d("success", "success")
                    }

                    override fun onError(e: Exception?) {
                        Log.d("error", "error")
                    }
                })
        }
        else if(profileName.equals("crop"))
        {
            Log.d(TAG,"Crop_View")

            Picasso.get()
                .load("https://www.cheatsheet.com/wp-content/uploads/2019/06/Cristiano-Ronaldo.jpg")
                .resize(300, 300)
                .centerCrop()
                .into(ImageVw)
        }
        else if(profileName.equals("local"))
        {
            Log.d(TAG,"Local_Directory")
            Picasso.get().load(R.drawable.cr7).into(ImageVw)
        }
        else if(profileName.equals("placeholder"))
        {
            Log.d(TAG,"Place_holder")

            Picasso.get()
                .load("https://www.cheatsheet.com/wp-content/uploads/2019/06/Cristiano-Ronaldo.jpg")
                .placeholder(R.drawable.cr7)
                .resize(200,200)
                .into(ImageVw);
        }
        else if(profileName.equals("blur_transformation"))
        {

            Log.d(TAG,"Blur_Transformation")

            Picasso.get()
                .load("https://www.cheatsheet.com/wp-content/uploads/2019/06/Cristiano-Ronaldo.jpg")
                .transform(BlurTransformation(this))
                .error(R.drawable.cr7)
                .into(ImageVw)
        }

        else if(profileName.equals("grey_transformation"))
        {

            Log.d(TAG,"Grey_Transformation")

            Picasso.get()
                .load("https://www.cheatsheet.com/wp-content/uploads/2019/06/Cristiano-Ronaldo.jpg")
                .transform(GrayscaleTransformation())
                .error(R.drawable.cr7)
                .into(ImageVw)
        }

        else if(profileName.equals("rounded_corner_transformation"))
        {

            Log.d(TAG,"Rounded_Corner_Transformation")
            val radius = 5
            val margin = 5
            val transformation = RoundedCornersTransformation(radius, margin)

            Picasso.get()
                .load("https://www.cheatsheet.com/wp-content/uploads/2019/06/Cristiano-Ronaldo.jpg")
                .transform(transformation)
                .error(R.drawable.cr7)
                .into(ImageVw)


        }


        else if(profileName.equals("rounded_corner_transformation"))
        {

            Log.d(TAG,"Rounded_Corner_Transformation")
            val radius = 5
            val margin = 5
            val transformation = RoundedCornersTransformation(radius, margin)

            Picasso.get()
                .load("https://www.cheatsheet.com/wp-content/uploads/2019/06/Cristiano-Ronaldo.jpg")
                .transform(transformation)
                .error(R.drawable.cr7)
                .into(ImageVw)


        }


        else if(profileName.equals("mask_transformation"))
        {

            Log.d(TAG,"Mask_Transformation")

            val transformation = MaskTransformation(this,R.drawable.cr7)

            Picasso.get()
                .load("https://www.cheatsheet.com/wp-content/uploads/2019/06/Cristiano-Ronaldo.jpg")
                .transform(transformation)
                .error(R.drawable.cr7)
                .into(ImageVw)
        }

        else if(profileName.equals("circlecrop_transformation"))
        {


            Log.d(TAG,"CircleCrop_Transformation")

            val transformation = CircleTransform()

            Picasso.get()
                .load("https://www.cheatsheet.com/wp-content/uploads/2019/06/Cristiano-Ronaldo.jpg")
                .transform(transformation)
                .error(R.drawable.cr7)
                .into(ImageVw)

        }

        else if(profileName.equals("ribon_color"))
        {

            Log.d(TAG,"Ribbon_Color")

            val picasso = Picasso.get()
            picasso.setIndicatorsEnabled(true)
            picasso.load("https://www.cheatsheet.com/wp-content/uploads/2019/06/Cristiano-Ronaldo.jpg")
                .into(ImageVw)


        }

        else if(profileName.equals("offline_mode"))
        {

            Log.d(TAG,"Offline_Mode")

            Picasso.get()
                .load("https://www.cheatsheet.com/wp-content/uploads/2019/06/Cristiano-Ronaldo.jpg")
                .networkPolicy(NetworkPolicy.OFFLINE)
                .error(R.drawable.cr7)
                .into(ImageVw)

        }



    }
}