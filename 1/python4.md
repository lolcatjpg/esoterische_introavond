I have written a new python4 interpreter, it's pretty simple:

it reads in a file called python5, reads it's content, removes whitespace before and after the printable characters, encodes the content to utf-8, compiles the code and prints the output

the complilation process is as follows:
 - md5hash the code 
 
 finally the hash is ascii decoded and printed out.
 
 currently only printing out the hashes is supported, so it's hard to do any real computation in this format, see it more as a proof of work generator
 
 example usage:
 
 ```
 printf "import hashlib\nprint(bytes.fromhex(hashlib.md5(open('python5').read().strip().encode('utf-8')).hexdigest()).decode('ascii', errors='ignore'))" > python4
 echo '10958639490' > python5
 python3 python4
 ```
 
 This prints out `zeus`
