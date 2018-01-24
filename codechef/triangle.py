testcases=int(input())
array=[]
max1=0
for _ in range(testcases):
    trilength=int(input())
    array2 = [[0 for row in range(trilength)] for col in range(trilength)]
    for x in range(trilength):
        line=input()
        for y in range(x):
            array.append(y)
        array = line.split()
        for z in range(x+1):
            array2[x][z]=int(array[z])
    print(array2)

    for x in range(trilength-1):
        for y in range(x):
            x1=x
            y1=y
            print(x1, y1)
            if max1 < (array2[x1][y1] + array2[++x1][y1] + array2[++x1][++y1]):
                max1 = array2[x1][y1] + array2[++x1][y1] + array2[++x1][++y1]

                print(max1)

