# Printing the pattern

#       1
#      ##
#     333
#    ####
#   55555

n = 5
for i in range(0,n):
    for j in range(i,n-1):
        print(" ", end="")
    
    for k in range(i+1):
        if (i % 2 == 0):
            print(i+1,end="")
        else:
            print("#", end = "")
    print()
