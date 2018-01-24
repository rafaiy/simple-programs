class any:
    category= 'student'
    def __init__(self,name):
        self.name= name

anyobj = any('rafaiy')

print(anyobj.category)
print(anyobj.name)