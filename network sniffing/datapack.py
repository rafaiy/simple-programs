import _struct
import socket
import textwrap
import string
def main():
    connection = socket.socket(socket.AF_PACKET, socket.SOCK_RAW, socket.ntohs(3) )

def seprate_data(data):
    destination, source, type = _struct.unpack('! 6s 6s ', data[:14])
    print(destination, source, type)

    return get_mac(destination) , get_mac(source), socket.htons(type), data[14:]


def get_mac(byte_data):
    mac_adr = ['{:02x}'.format(x).upper() for x in byte_data]
    return ':'.join(mac_adr)
