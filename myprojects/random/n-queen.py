n = int(input("enter no of queens "))
position= [[0 for _ in range(n)] for _ in range(n)]



def placeq(x, y):
    position[x][y]+=99
    for rc in range(n):
        position[x][rc]=position[x][rc ]+1
        position[rc][y]=position[rc][y]+1
    for row in range(n):
        for col in range(n):
            for rc in range(n):
                if(x-rc is row and y-rc is col):
                    position[row][col]=position[row][col]+1
                elif(x-rc is row and y+rc is col):
                    position[row][col]=position[row][col]+1
                elif(x+rc is row and y-rc is col):
                    position[row][col] = position[row][col] + 1
                elif (x + rc is row and y + rc is col):
                    position[row][col] = position[row][col] + 1
def remq(x,y):
    position[x][y]-=99
    for rc in range(n):
        position[x][rc]-=1
        position[rc][y]-=1
        for row in range(n):
            for col in range(n):
                for rc in range(n):
                    if (x - rc is row and y - rc is col):
                        position[row][col] = position[row][col] - 1
                    elif (x - rc is row and y + rc is col):
                        position[row][col] = position[row][col] - 1
                    elif (x + rc is row and y - rc is col):
                        position[row][col] = position[row][col] - 1
                    elif (x + rc is row and y + rc is col):
                        position[row][col] = position[row][col] - 1


placeq(2,2)
print(position)
placeq(2,3)
print(position)
remq(2,3)
print(position)