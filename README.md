# Image Libraries Using Kotlin

# Coil Image Library:
Coil-kt library is purely made with Kotlin and using modern libraries like OkHttp, Okio, and AndroidX lifecycles. It has cool extension function for ImageView and optional trailing lambda for request configuration.

Features:

a) Drawable Transformation
b) Suspended Method
c) Disk Caching
d) Customization
e) Canceling on-going Request
f) Bitmap Pooling

# Crop Image Library:
Croppy is the image cropping Library for Android.

Features:

a) Double tap focus
b) Pinch Zoom
c) Aspect Ratio Mode
d) Size Displayer
e) Auto Centered 
f) Animations

# Picasso Image Library:
Picasso is one of the most popular image caching and networking libraries for Android. It is supported by a trusted source, Square, and has several other advantages including an easy to use syntax, a ton of online resources to help you learn and several utilities like image transformations, filters and more!

Features:

a) Loading Images from remote source and local.
b) Resizing the image.
c) Adding transformation.
d) Apply blur and grayscale transformation.
e) Managing Memory

# Glide Image Library:
Glide is the most recommended image loader for Android. it’s easy to use and requires minimal configuration. Although you might have used Glide to load image from a URL to ImageView, there are many cool features you might not know.

Features:

a) Loading photo/Images.
b) Clearing the cache.
c) Resize the image.
d) Apply transformation.

# Universal Image Library(UIL):
UIL aims to provide a powerful, flexible and highly customizable instrument for image loading, caching and displaying. It provides a lot of configuration options and good control over the image loading and caching process.

Features:

a) Multithread image loading (async or sync)
b) Wide customization of ImageLoader's configuration (thread executors, downloader, decoder, memory and disk cache, display image options, etc.)
c) Many customization options for every display image call (stub images, caching switch, decoding options, Bitmap processing and displaying, etc.)
d) Image caching in memory and/or on disk (device's file system or SD card)
e) Listening loading process (including downloading progress)

# Fresco Image Library

It is power system for displaying images in android applications. Fresco’s image pipeline will load images from the network, local storage, or local resources. To save data and CPU, it has three levels of cache; two in memory and another in internal storage. Fresco’s Drawee shows a placeholder for you until the image has loaded and then automatically shows the image when it arrives. When the image goes off-screen, it automatically releases its memory.

Features:

a) Memory
b) Drawing
c) Streaming
d) Loading
e) Animations


# Difference between Glide and Picasso?

Neither Glide nor Picasso is perfect. You can use any of this library based on your application requirement. If you want the smaller app and you require very fewer features in the image loading, than Picasso is best. But If you want more customization, animated GIF support, and very better memory management, you should use Glide as your image loader library.
In my opinion, Glide is the winner over here as it handles memory very well and prevents my app from OutOfMemoryError. Also, loads image much faster than Picasso. And yes, the support for animated GIFs is almost killer.

Size and Method Count:

While comparing the sizes of the .jar file of both the libraries, Glide is almost 3.5 times larger than Picasso in size.
