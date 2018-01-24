class constructer:
    count=10
    def __init__(self):
        print('this is ato matically called')
        self.count-=1
    def printc(self):
        print(self.count)
obj = constructer()
obj.printc()