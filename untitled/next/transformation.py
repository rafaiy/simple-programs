from PIL import Image

image1= Image.open("IMG_0433.JPG")
image_rotated_right = image1.transpose(Image.FLIP_LEFT_RIGHT)
image_rotated_right.show()
image_rotated_up = image1.transpose(Image.ROTATE_90)
image_rotated_up.show()
image_resize= image1.resize((600, 600))
image_resize.show()