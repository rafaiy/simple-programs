n = input()
lead=0
p1=0
p2=0

for x in range(int(n)):
    player1,player2 = input().split(" ")
    player1,player2 = [int(player1), int(player2)]
    p1+=player1
    p2+=player2
    if p1>=p2:
        if lead<=p1-p2:
            lead=player1-player2
            w="1"
    else:
        if lead<p2-p1:
            lead=player2-player1
            w="2"

print(str(w),lead)