from PIL import Image
img = Image.open("IMG_0433.JPG")
r, g, b = img.split()
r.show()
g.show()
b.show()
