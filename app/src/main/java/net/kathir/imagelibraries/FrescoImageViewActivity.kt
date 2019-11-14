package net.kathir.imagelibraries

import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.drawee.drawable.ProgressBarDrawable
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder
import com.facebook.drawee.generic.RoundingParams
import com.facebook.drawee.view.SimpleDraweeView
import com.facebook.imagepipeline.common.ResizeOptions
import com.facebook.imagepipeline.common.RotationOptions
import com.facebook.imagepipeline.request.ImageRequest
import com.facebook.imagepipeline.request.ImageRequestBuilder
import kotlinx.android.synthetic.main.fresco_view.*

class FrescoImageViewActivity : AppCompatActivity() {

    private val TAG = FrescoImageViewActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fresco_view)

        val profileName=intent.getStringExtra("fresco_type")

        if(profileName.equals("normal_image"))
        {
            Log.d(TAG,"Noraml_Image_View")

            val uri = Uri.parse("https://www.cheatsheet.com/wp-content/uploads/2019/06/Cristiano-Ronaldo.jpg")
            val draweeView = findViewById<View>(R.id.my_image_view) as SimpleDraweeView
            draweeView.setImageURI(uri)
        }
        else if(profileName.equals("rounded_image"))
        {

            val overlayColor = resources.getColor(R.color.red)

            val roundingParams = RoundingParams.fromCornersRadius(7f)

            roundingParams.setBorder(overlayColor, 3.0f)
            roundingParams.setRoundAsCircle(true)

            val uri = Uri.parse("https://www.cheatsheet.com/wp-content/uploads/2019/06/Cristiano-Ronaldo.jpg")
            val draweeView = findViewById<View>(R.id.my_image_view) as SimpleDraweeView
            draweeView.setImageURI(uri)

            draweeView.setHierarchy(GenericDraweeHierarchyBuilder(resources)
                    .setRoundingParams(roundingParams)
                   .build())

        }

        else if(profileName.equals("progress_bar"))
        {


            val overlayColor = resources.getColor(R.color.red)

            val roundingParams = RoundingParams.fromCornersRadius(7f)

            roundingParams.setBorder(overlayColor, 3.0f)
            roundingParams.setRoundAsCircle(true)

            val uri = Uri.parse("https://www.cheatsheet.com/wp-content/uploads/2019/06/Cristiano-Ronaldo.jpg")
            val draweeView = findViewById<View>(R.id.my_image_view) as SimpleDraweeView
            draweeView.setImageURI(uri)

            val progressBarDrawable = ProgressBarDrawable()
            progressBarDrawable.color = ContextCompat.getColor(this, R.color.colorPrimary)
            progressBarDrawable.backgroundColor = ContextCompat.getColor(this, android.R.color.darker_gray)
            progressBarDrawable.radius = 32
            progressBarDrawable.barWidth= 16

            draweeView.hierarchy.setProgressBarImage(progressBarDrawable)




        }

        else if(profileName.equals("rotate_image"))
        {

            val uri = Uri.parse("https://www.cheatsheet.com/wp-content/uploads/2019/06/Cristiano-Ronaldo.jpg")

            val request = ImageRequestBuilder.newBuilderWithSource(uri)
                .setResizeOptions(ResizeOptions(200, 200))
                .setRotationOptions(RotationOptions.forceRotation(RotationOptions.ROTATE_90))
                .build()

            my_image_view.setController(Fresco.newDraweeControllerBuilder()
                    .setImageRequest(request)
                    .build());
        }

        else if(profileName.equals("animated_image"))
        {

            val simpleDraweeView = findViewById<View>(R.id.my_image_view) as SimpleDraweeView
            simpleDraweeView.controller = Fresco.newDraweeControllerBuilder()
                .setImageRequest(ImageRequest.fromUri("https://media1.tenor.com/images/f0379ab2234136466fede013f3fd2976/tenor.gif?itemid=7770087"))
                .setAutoPlayAnimations(true)
                .build()
        }
    }
}


