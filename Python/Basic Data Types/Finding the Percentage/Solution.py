if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query_name = input()
    for name in student_marks.keys():
        if name == query_name:
            marks = list(student_marks.get(name))
            total = 0
            for i in marks:
                total += i
            percentage = total/len(marks)
    print ("%.2f" %(percentage))
        
        
