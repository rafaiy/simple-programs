tc=int(input())
for m in range(tc):
    question,participants=map(int,input().split())
    arr=list(map(int,input().split()))
    print("arr", arr)
    arr1=[0]*2
    print("arr1", arr1)
    for i in range(question):
        if arr[i] >= participants//2:
            arr1[0]+=1
        elif arr[i]<=participants//10:
            arr1[1]+=1
    if arr1[0]==1 and arr1[1]==2:
        print("yes")
    else:
        print("no")