'''fw = open('data.txt','w')
fw.write("this file is created by pycharm \n ")
fw.close()
'''

fr= open('data.txt', 'r')
text = fr.read()
print(text)
fr.close()
