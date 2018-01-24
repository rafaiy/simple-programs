from _struct import *

bytess = pack('hhl', 1, 2, 3)
print(bytess)
print(unpack('il', b'\x01\x00\x02\x00\x03\x00\x00\x00' ))
print(calcsize('i'),calcsize('h'))