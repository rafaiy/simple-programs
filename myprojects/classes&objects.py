class rareh:
    lives=5
    power=20

    def attack(self):
        print('you are attacked by an enemy')
        self.lives -= 1
        print(self.lives)
    def lose(self):
        print('you loose')
        self.power -= 1

objrar=rareh()
objrar.attack()
objrar.attack()
objrar.attack()
objrar.attack()
objrar.attack()
objrar.lose()
