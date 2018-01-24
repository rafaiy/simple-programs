import socket
import _socket
import _struct

'''str='hello my name is rafaiy a rehman'
print(str[5:])
print(str[:5])
print(str[5:15])
a=1
print(socket.htons(a))
print(socket.htonl(a))
print(socket.gethostname())
print(_struct.calcsize('6s'))
print(_struct.calcsize('6H'))
print(_struct.calcsize('!'))
te = _struct.pack('llh0l', 1, 2, 3)
print(te)
te = _struct.pack('llh', 1, 2, 3)
print(te)
print(_struct.unpack('llh',b'\x01\x00\x00\x00\x02\x00\x00\x00\x03\x00'))
no=[1,5,10,15,16,17,18,19,25,32]
new_list=list(map('{:02x}'.format, no))
alt_new_list= ['{:02x}'.format(x) for x in no]
print(new_list)
print(alt_new_list)'''''
s = socket.socket(socket.AF_INET, socket.SOCK_RAW)
print(s)