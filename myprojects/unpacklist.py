items, *vehicle, abc={'mobile','laptop', 'car','bike','bus', 'assosaries'}
print(items)
print(vehicle)
print(abc)



def average(list):
    first, *middle= list
    first2,*middle1=middle
    print(*middle1)
    avg= sum(middle1)/len(middle1)
    print("sum",sum(middle1))
    print("length",len(middle1))
    return avg

list={23,76,78,80,90}
print(average(list))