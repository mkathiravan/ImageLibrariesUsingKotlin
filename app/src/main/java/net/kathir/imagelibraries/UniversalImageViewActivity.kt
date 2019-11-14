package net.kathir.imagelibraries

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.nostra13.universalimageloader.core.ImageLoader
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration
import kotlinx.android.synthetic.main.picasso_view.*
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener
import android.graphics.Bitmap
import com.nostra13.universalimageloader.core.assist.FailReason
import android.view.View
import com.nostra13.universalimageloader.core.assist.ImageSize
import com.nostra13.universalimageloader.core.DisplayImageOptions
import com.nostra13.universalimageloader.core.download.ImageDownloader.Scheme










class UniversalImageViewActivity : AppCompatActivity() {


    private val TAG = UniversalImageViewActivity::class.java.simpleName


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.picasso_view)

        ImageLoader.getInstance().init(ImageLoaderConfiguration.createDefault(this))

        val imageUrl = "https://www.cheatsheet.com/wp-content/uploads/2019/06/Cristiano-Ronaldo.jpg"



        val profileName=intent.getStringExtra("universal_type")

        if(profileName.equals("normal"))
        {

            Log.d(TAG,"Normal_View")
            val imageLoader = ImageLoader.getInstance()
            imageLoader.displayImage(imageUrl,ImageVw)
        }
        else if(profileName.equals("load_image_callback"))
        {
            Log.d(TAG,"Loading_callback")


            ImageLoader.getInstance().loadImage(imageUrl,object : ImageLoadingListener{
                override fun onLoadingComplete(
                    imageUri: String?,
                    view: View?,
                    loadedImage: Bitmap?
                ) {

                    ImageVw.setImageBitmap(loadedImage)


                }

                override fun onLoadingStarted(imageUri: String?, view: View?) {
                }

                override fun onLoadingCancelled(imageUri: String?, view: View?) {


                }

                override fun onLoadingFailed(
                    imageUri: String?,
                    view: View?,
                    failReason: FailReason?
                ) {
                }

            })


        }

        else if(profileName.equals("image_resize"))
        {

            Log.d(TAG,"Image_Resize")

            val mImageSize = ImageSize(100, 100)


            ImageLoader.getInstance().loadImage(imageUrl,mImageSize,object : ImageLoadingListener{
                override fun onLoadingComplete(
                    imageUri: String?,
                    view: View?,
                    loadedImage: Bitmap?
                ) {

                    ImageVw.setImageBitmap(loadedImage)


                }

                override fun onLoadingStarted(imageUri: String?, view: View?) {
                }

                override fun onLoadingCancelled(imageUri: String?, view: View?) {


                }

                override fun onLoadingFailed(
                    imageUri: String?,
                    view: View?,
                    failReason: FailReason?
                ) {
                }

            })
        }

        else if(profileName.equals("cache_memory"))
        {
            Log.d(TAG,"Cache_Image")

            val options = DisplayImageOptions.Builder()
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .bitmapConfig(Bitmap.Config.RGB_565)
                .build()

            ImageLoader.getInstance().displayImage(imageUrl,ImageVw,options)



        }

        else if(profileName.equals("image_fail"))
        {
            Log.d(TAG,"Image_Fail")

            ImageLoader.getInstance().clearMemoryCache()
            ImageLoader.getInstance().clearDiskCache()

            val options = DisplayImageOptions.Builder()
                .cacheInMemory(false)
                .showImageOnFail(R.drawable.noimg)
                .cacheOnDisk(false)
                .bitmapConfig(Bitmap.Config.RGB_565)
                .build()

            ImageLoader.getInstance().displayImage(imageUrl,ImageVw,options)
        }

        else if(profileName.equals("local_image"))
        {
            Log.d(TAG,"Local_Image")


            val drawableurl = "drawable://" + R.drawable.cr7


            //val drawableUrl = Scheme.DRAWABLE.wrap("R.drawable.cr7")
            ImageLoader.getInstance().displayImage(drawableurl,ImageVw)
        }
    }
}