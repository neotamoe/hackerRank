# Read an integer N. For all non-negative integers i<N, print i^2.

if __name__ == '__main__':
    n = int(input())
    i = 0;
    while i < n:
        print(i * i)
        i += 1



# There are two kinds of loops in Python.
# 1) for loop:
# for i in range(0, 5):
#     print i
# 2) while loop:
# i = 0
# while i < 5:
#     print i
#     i += 1
