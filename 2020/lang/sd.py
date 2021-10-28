"""
An interpreter for the sd language (https://esolangs.org/wiki/Sd).
This implementation changes a few things from the reference implementation:
- The tape is zero-indexed instead of one-indexed.
- Decrementing beyond zero is not possible, this results in a no-op.
- The '&' instruction is added to jump back to the mark.
- Input is read byte by byte from stdin.
"""
import sys

global store, tape

with open(sys.argv[1], 'rb') as f:
    tape = bytearray(f.read())

store = {
    'a': 0,
    'b': 0,
    'mark': 0,
    'position': 0,
}

def increment(name):
    """ increment a variable """
    def f():
        store[name] +=1
    return f

def decrement(name):
    """ decrement a variable """
    def f():
        if store[name] > 0:
            store[name] -= 1
    return f

def write(value_name, pos_name):
    """ write a value to the tape """
    def f():
        tape[store[pos_name]] = store[value_name]
    return f

def set_value(target_name, source_name):
    """ set $target = $source """
    def f():
        store[target_name] = store[source_name]
    return f

def read_input(target_name):
    """ read a byte from stdin into $variable """
    def f():
        store[target_name] = ord(sys.stdin.buffer.read(1))
    return f

def print_until_mark():
    """ prints contents of the tape up until the most recently set mark position """
    print(tape[:store['mark']].decode())


instructions = {
    '+': increment('a'),
    '-': decrement('a'),

    '*': increment('b'),
    '/': decrement('b'),

    '.': write('a', 'b'),
    ',': write('b', 'a'),

    '@': set_value('mark', 'position'),
    '&': set_value('position', 'mark'),

    '!': print_until_mark,
    ':': read_input('a'),
    ';': read_input('b'),
}

while store['position'] < len(tape):
    char = chr(tape[store['position']])
    if char in instructions:
        instructions[char]()
    else:
        sys.stderr.write("Syntax error! Unexpected symbol at position {}: '{}'\n".format(store['position'], char))
        sys.exit(1)

    store['position'] += 1