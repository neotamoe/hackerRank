# list comprehensions: List comprehensions are an elegant way to build a list without
# having to use different for loops to append values one by one.

if __name__ == '__main__':
    x = int(input())
    y = int(input())
    z = int(input())
    n = int(input())

    print([[i, j, k]
          for i in range(x+1)
          for j in range(y+1)
          for k in range(z+1)
          if((i+j+k) != n)
         ])
