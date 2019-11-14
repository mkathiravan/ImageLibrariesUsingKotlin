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

Disadvantages:

i) Slow loading big images from internet into ListView

Advantages:

a) Tinny size of library
b) Small size of cache
c) Simple in use
d) UI is not freeze
e) WebP support

Features:

a) Loading Images from remote source and local.
b) Resizing the image.
c) Adding transformation.
d) Apply blur and grayscale transformation.
e) Managing Memory

# Glide Image Library:
Glide is the most recommended image loader for Android. it’s easy to use and requires minimal configuration. Although you might have used Glide to load image from a URL to ImageView, there are many cool features you might not know.

Disadvantages:

a) Big size of library

Advantages:

a) Tinny size of cache
b) Simple in use
c) GIF support
d) WebP support
e) Fast loading big images from internet into ListView
f) UI is not freeze
g) BitmapPool to re-use memory and thus lesser GC events

Features:

a) Loading photo/Images.
b) Clearing the cache.
c) Resize the image.
d) Apply transformation.

# Universal Image Library(UIL):
UIL aims to provide a powerful, flexible and highly customizable instrument for image loading, caching and displaying. It provides a lot of configuration options and good control over the image loading and caching process.

Disadvantages:

a) Limited functionality (limited image processing)
b) Project support has stopped since 27.11.2015

Advantages:

a) Tinny size of library
b) Simple in use

Features:

a) Multithread image loading (async or sync)
b) Wide customization of ImageLoader's configuration (thread executors, downloader, decoder, memory and disk cache, display image options, etc.)
c) Many customization options for every display image call (stub images, caching switch, decoding options, Bitmap processing and displaying, etc.)
d) Image caching in memory and/or on disk (device's file system or SD card)
e) Listening loading process (including downloading progress)

# Fresco Image Library

It is power system for displaying images in android applications. Fresco’s image pipeline will load images from the network, local storage, or local resources. To save data and CPU, it has three levels of cache; two in memory and another in internal storage. Fresco’s Drawee shows a placeholder for you until the image has loaded and then automatically shows the image when it arrives. When the image goes off-screen, it automatically releases its memory.

Disadvantages:

a) Huge size of library
b) No Callback with View, Bitmap parameters
c) SimpleDraweeView doesn't support wrap_content
d) Huge size of cache

Advantages:

a) Pretty fast image loader (for small && medium images)
b) A lot of functionality(streaming, drawing tools, memory management, etc)
c) Possibility to setup directly in xml (for example round corners)
d) GIF support
f) WebP and Animated Webp support

Features:

a) Memory
b) Drawing
c) Streaming
d) Loading
e) Animations


# Difference between Glide and Picasso?

Neither Glide nor Picasso is perfect. You can use any of this library based on your application requirement. If you want the smaller app and you require very fewer features in the image loading, than Picasso is best. But If you want more customization, animated GIF support, and very better memory management, you should use Glide as your image loader library.
In my opinion, Glide is the winner over here as it handles memory very well and prevents my app from OutOfMemoryError. Also, loads image much faster than Picasso. And yes, the support for animated GIFs is almost killer.

i) Size and Method Count:

While comparing the sizes of the .jar file of both the libraries, Glide is almost 3.5 times larger than Picasso in size.

ii) Disk caching:

Both the library supports caching the image in the disk. They download the images from the URL and store those images on the disk by caching. But there are some differences how they store the images in the cache.
Picasso downloads the image and stores the full-size image (in my case the image resolution was 1160*750) in the cache and whenever we ask for the same image, it will return the full-size image and resize them to fit into the ImageView in real time.
On the other hand, Glide works differently. Glide downloads the image from the given URL, resize it to the size of the image view and stores it to the disk cache. So if you are loading the same image in two different sized image views, Glide will store two different copies of the same image in the cache with different resolutions. That will increase the disk cache size, but it has some of its own benefits.

iii) Time taken to load the Image:

When I tried to download images from the URL, Picasso was quite fast in loading the image from the internet than Glide. Maybe because after downloading the image, Picasso directly pushes the full-size image to the memory; while Glide resizes the image as per the dimension of the ImageView. That needs some time to resize the image.

Other features that Glide support but not Picasso:

a) Animated GIF support
b) Thumbnail support


![image](https://user-images.githubusercontent.com/39657409/68864096-8c22fe80-0716-11ea-96a2-d6fb4b35195b.png)

![image](https://user-images.githubusercontent.com/39657409/68864121-980ec080-0716-11ea-8330-ec29e1030d22.png)

![image](https://user-images.githubusercontent.com/39657409/68864158-a5c44600-0716-11ea-8447-cfa461e3f41f.png)

![image](https://user-images.githubusercontent.com/39657409/68864181-b1b00800-0716-11ea-890c-3922dd1df8a3.png)

![image](https://user-images.githubusercontent.com/39657409/68864208-bd9bca00-0716-11ea-8c14-0f85e5dae6c0.png)

![image](https://user-images.githubusercontent.com/39657409/68864241-cdb3a980-0716-11ea-98ee-2a58899035ad.png)

![image](https://user-images.githubusercontent.com/39657409/68864263-db692f00-0716-11ea-8039-a94120de3a22.png)

![image](https://user-images.githubusercontent.com/39657409/68864286-e45a0080-0716-11ea-9f85-b3c62e03c3f3.png)
