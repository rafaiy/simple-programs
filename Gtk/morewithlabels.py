from tkinter import *

window = Tk()
label1 = Label(window, text="label1",background='red', foreground='green' )
label1.pack()

label2 = Label(window, text="label2",background='blue', foreground='black' )
label2.pack(fill=X)
label3 = Label(window, text="label3",background='yellow', foreground='red' )
label3.pack(side=BOTTOM,fill=BOTH)
window.mainloop()