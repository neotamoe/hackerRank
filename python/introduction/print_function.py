# Read an integer N.  Without using any string methods, try to print the following: 123…N

from __future__ import print_function
if __name__ == '__main__':
    n = int(input())
    i = 1
    while i <= n:
        print(i, sep='', end='')
        i += 1


# Let’s import the advanced print_function from the __future__ module.
#
# Its method signature is below:
#
# print(*values, sep=' ‘, end=‘\n’, file=sys.stdout)
# print(value1, value2, value3, sep=' ‘, end=‘\n’, file=sys.stdout)
# Here, values is an array and *values means array is unpacked, you can add values separated by a comma too. The arguments sep, end, and file are optional, but they can prove helpful in formatting output without taking help from a string module.
#
# The argument definitions are below:
# sep defines the delimiter between the values.
# end defines what to print after the values.
# file defines the output stream.
