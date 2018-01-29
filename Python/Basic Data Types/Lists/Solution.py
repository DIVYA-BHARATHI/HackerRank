if __name__ == '__main__':
    N = int(input())
    l =[]
    for i in range(0,N):
        c = input()
        w = c.split()
        if w[0] == "insert":
            ind = int(w[1])
            e = int(w[2])
            l.insert(ind,e)
        elif w[0] == "append":
            e = int(w[1])
            l.append(e)
        elif w[0] == "remove":
            e = int(w[1])
            l.remove(e)
        elif w[0] == "print":
            print (l)
        elif w[0] == "sort":
            l.sort()
        elif w[0] == "pop":
            l.pop()
        elif w[0] == "reverse":
            l.reverse()
          
        
    
