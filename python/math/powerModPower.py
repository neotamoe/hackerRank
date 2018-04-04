# Powers or exponents in Python can be calculated using the built-in power function.
# You can use either pow(a,b) or a**b.
#
# You are given three integers: a, b, and m, respectively. Print two lines.
# The first line should print the result of pow(a,b).
# The second line should print the result of pow(a,b,m).

a = int(input())
b = int(input())
m = int(input())

print(a**b)  # could also do print(pow(a,b))
print(pow(a,b,m))
