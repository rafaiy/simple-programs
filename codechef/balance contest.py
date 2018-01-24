N = int(input())
arr = []
for x in range(N):
    countercakewalk = int(0)
    counterhard = int(0)
    N1 = input()
    text = input()
    questions, participants = N1.split()
    questions = int(questions)
    participants = int(participants)
    arr = text.split()
    arr = [int(x) for x in arr]
    cakewalk = participants // 2
    hard = participants // 10
    for a in arr:
        if a >= cakewalk:
            countercakewalk += 1
        elif a <= hard:
            counterhard += 1
    if countercakewalk == 1 and counterhard == 2:
        print("yes")
    else:
        print("no")
