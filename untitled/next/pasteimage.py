from PIL import Image
try:
    image1 = Image.open("IMG_0433.JPG")
    image2 = Image.open("IMG_0036.JPG")
    print("image 2",image2.size)
    print("image 1 ", image1.size)
    area = (100, 100, 740, 1236)
    image1.paste(image2, area)
    image1.show()
except :
    print("opps!!!you got an error")