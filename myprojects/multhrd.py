import _thread
import time

def fun_1(name,delay,no):
    count = 0
    while count < no:
        print("this is a function 1")
        print(name)
        time.sleep(delay)
        count += 1

try:
    no = 0
    no += 1
    # _thread.start_new_thread(fun_1,('thread-1', 3,4), )
    #_thread.start_new_thread(fun_1, ('thread-2',0,10), )

    print(no)


except:
    print('you got an error')



