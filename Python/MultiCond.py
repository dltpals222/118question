def MultiCond(x,y,z):
    if(z != 0):
        print("z의 값이 0이 아닙니다.")
    elif(x != y):
        print("z의 값이 0입니다. 그리고 x와 y의 값이 다릅니다.")
    else:
        print("z의 값이 0입니다. 그리고 x와 y의 값이 같습니다.")

MultiCond(1,2,3)
MultiCond(1,2,0)
MultiCond(2,2,0)
MultiCond(2,2,3)