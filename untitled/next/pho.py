from PIL import Image
import PIL

ima = Image.open("IMG_0433.JPG")
print(ima.size)
area =(100, 100, 1350, 1375)
croppedimg = ima.crop(area)
croppedimg.show()
#ima.show()