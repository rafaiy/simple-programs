from tkinter import *



window = Tk()
def printname():
    print('you clicked the button')

def hello(event):
    print('hello world')
button=Button(window,text='click me',command=printname)
button.pack()
button2 = Button(window, text='hello world')
button2.bind("<Button-1 >", hello)
button2.pack()

window.mainloop()