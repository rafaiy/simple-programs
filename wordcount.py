file = open('text.txt', 'r')
f = file.read()
wordcount = {}


for word in f.split():
    if word not in wordcount:
        wordcount[word] = 1
    else:
        wordcount[word] += 1

file = open('newfile.txt',mode='w')

for k,v in wordcount.items():
    file.write(k)
    file.write("\t")
    file.write(str(v))
    file.write("\n")