import random
import urllib.request

def imagedownloader(address):
    name = random.randrange(1, 1000)
    withextension = str(name) + ".jpg"
    urllib.request.urlretrieve(address, withextension)

imagedownloader("")