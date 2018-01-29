if __name__ == '__main__':
    students = []
    n = int(input())
    for i in range(0,n):
        name = input()
        score = float(input())
        students.append([name,score])
    second_highest = sorted(list(set([marks for name, marks in students])))[1]
    for name,marks in sorted(students):
        if (marks==second_highest):
            print(name)
    
