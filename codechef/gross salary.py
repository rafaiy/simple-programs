testcases = int(input())
for x in range(testcases):
    salary = int(input())
    if salary < 1500:
        newsalary = (salary / 10) + (0.90 * salary) + salary
        newsalary = "{0:.6g}".format(newsalary)
        print(newsalary)
    elif salary >= 1500:
        newsalary = salary + 500 + (salary * 0.98)
        newsalary = "{0:.6g}".format(newsalary)
        print(newsalary)
