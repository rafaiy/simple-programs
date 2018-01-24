a=int(input())
sum1=0
sum2=0
lead=0
for i in range(a):
    b,c=input().split()
    b,c=[int(b),int(c)]
    sum1+=b
    sum2+=c
    if sum1>=sum2:
        d=sum1-sum2
        if (d>lead):
            lead=d
            l=1
    else:
        d=sum2-sum1
        if (d>lead):
            lead=d
            l=2
print (l,lead)