from tkinter import *

window = Tk()
frametop = Frame(window)
frametop.pack()
framebottom = Frame(window)
framebottom.pack()
button1 = Button(frametop, text="button1", fg='red', font='2')
button1.pack(ipadx=12, ipady=24)
button2 = Button(framebottom, text='button2', fg='blue')
button2.pack(padx=400,pady=200,ipadx=12, ipady=24)
window.mainloop()

