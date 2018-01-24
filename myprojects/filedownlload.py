from urllib import request
file_url=r'http://samplecsvs.s3.amazonaws.com/Sacramentorealestatetransactions.csv'

def download_file(url):
    open_url = request.urlopen(url)
    read_url = open_url.read()
    con_str = str(read_url)
    lines = con_str.split("\n")
    file_write = open("fileda.txt", 'w')
    for line in lines:
        file_write.write(line + "\n")
        print(line)

    file_write.close()

download_file(file_url)