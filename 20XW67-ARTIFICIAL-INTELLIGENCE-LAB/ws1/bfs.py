# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""


def BFS(g,goal=""):
    q = list()
    visited = []
    
    for i in g:
        if i==goal:
            visited.append(i)
            return visited
        
        if i not in visited:
            q.append(i)
            visited.append(i)
                
        for j in g[i]:
            if j==goal:
                visited.append(j)
                return visited
            if j not in visited:
                q.append(j)
                visited.append(j)
        
        for j in g[i]:
            if j not in visited:
                break
        else:
            q.pop(0)
        
    return visited

g = {"a":{"b","c","d"},
     "b":{"a","f","e"},
     "c":{"a"},
     "d":{"a","g","h"},
     "e":{"b","f"},
     "f":{"b","i"},
     "g":{"d","i"},
     "h":{"d","i"},
     "i":{"e","f","g","h"}
     }

totbfs = BFS(g)
reqbfs = BFS(g,"f")
print(totbfs)
print(reqbfs)