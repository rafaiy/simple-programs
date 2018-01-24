answer = lambda x: print('this lambada function will return value given to it i.e' , x)

print(answer(5))

newlist=[]
list2=[]
list={12,23,45,56,34,2,64,676,45,23,46,67,57}
for y in list:
    if y%2 is 0:
        continue
    else:
        newlist.append(y)
print(newlist)

list2.append((x for x in list if x%2 is 0))
print(list2)