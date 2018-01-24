from _struct import *
binary = pack('iiif',3, 4, 2, 45.678)
print(binary)
digits = unpack('iiif', binary)
print(digits)
print(unpack('iiif', b'\x03\x00\x00\x00\x04\x00\x00\x00\x02\x00\x00\x00F\xb66B'))