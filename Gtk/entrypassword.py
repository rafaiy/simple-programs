from tkinter import *

window= Tk()
name =  Label(window, text='Name')
passw = Label(window, text='Password')

nameentry= Entry(window)
passentry= Entry(window, show='*')


name.grid(row=0,sticky=E)
passw.grid(row=1, sticky=E)

nameentry.grid(row=0, column=1)
passentry.grid(row=1, column=1)

cb = Checkbutton(text='remeber me')
cb.grid(columnspan=2)



window.mainloop()