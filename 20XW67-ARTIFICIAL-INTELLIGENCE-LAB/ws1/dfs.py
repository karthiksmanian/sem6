# -*- coding: utf-8 -*-
"""
Created on Mon Dec 26 10:49:47 2022

@author: 20pw16
"""

def DFS(g):
    
    stack = []
    stack.append("a")
    dfs = []
    dfs.append("a")
    visited = []
    
    while len(stack):
        pass
        


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