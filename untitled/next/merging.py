from PIL import Image
img = Image.open("IMG_0433.JPG")

img2 = Image.open("IMG_0036.JPG")
r2, g2, b2 = img2.split()
#new_img = Image.merge("RGB", (r1,b2,g2))
area=(200, 200, 840, 1336)
crp_img = img.crop(area)
r, g, b = crp_img.split()
new_img = Image.merge("RGB", (r, g2, b2))
new_img.show()
print(crp_img.size)
print(img2.size)