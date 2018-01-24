from PIL import Image
from PIL import ImageFilter

image1= Image.open("IMG_0036.JPG")
image2 = image1.convert("L")
image_blur = image1.filter(ImageFilter.BLUR)
image_details = image1.filter(ImageFilter.DETAIL)
image2.show()
image_blur.show()
image_details.show()
image1.show()