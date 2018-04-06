import textwrap

def wrap(string, max_width):
    formatted = textwrap.wrap(string, width=max_width)
    return "\n".join(formatted)

if __name__ == '__main__':
string, max_width = input(), int(input())
result = wrap(string, max_width)
print(result)

# You are given a string S and width w.
# Your task is to wrap the string into a paragraph of width w.
