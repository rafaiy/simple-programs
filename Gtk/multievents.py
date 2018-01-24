from tkinter import *

window = Tk()
def leftclick(event):
    print('left')

def middleclick(event):
    print('middle')

def rightclick(event):
    print('right')
frame = Frame(window, width=300, height=250)
frame.bind("<Button-1>", leftclick)
frame.bind("<Button-2>", middleclick)
frame.bind("<Button-3>", rightclick)
frame.pack()

window.mainloop()