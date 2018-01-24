def avg(*args):
    average=0
    count=0
    for x in args:
        average=average + x
        count+=1
    print(average/count)

avg(10)
avg(10,15,20,30)