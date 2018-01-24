st=str(input("enter any string "))
vovel=['a','e','i','o','u']
def reversestring(data):
    for x in range((len(data)-1),-1,-1):
        print(data[x],end='')

vovelless={x for x in st if x not in vovel }
print(vovelless)
withvovel={x for x in st if x in vovel}
print(withvovel)
print(st[5])
reversestring(st)


print(st[:5])
