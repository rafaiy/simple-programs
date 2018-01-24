
n,m = input().strip().split(' ')
n,m = [int(n),int(m)]
c = [int(c_temp) for c_temp in input().strip().split(' ')]
list=[]
count=0
mini=999
for x in range(0, n):
    for y in c:
        if abs(x-y) < mini:
            mini=x-y
    list.append(mini)
    mini=99


print(max(list))