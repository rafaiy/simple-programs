class parent:
    def abc(self):
        print('this is parent class')
class other:
    def bcd(self):
        print('this bcd method is called')

class child(parent,other):
    def child_fun(self):
        print('child fun is called')

obj = parent()
obj.abc()
childobj = child()
childobj.abc()
childobj.bcd()
childobj.child_fun()
