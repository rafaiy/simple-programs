while True:
    try:
        no1=input("enter the 1st no")
        no2=input("enter the second no")
        print(int(no1)/int(no2))
        break

    except ZeroDivisionError:
        print("you cannot devide by 0")
    except ValueError:
        print("make sure u enter nos only")
    except Exception:
        print("you got an exception")