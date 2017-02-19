# the compiler: gcc for C program, define as g++ for C++
CC = gcc

# compiler flags:
#  -g    adds debugging information to the executable file
#  -Wall turns on most, but not all, compiler warnings
CFLAGS  = -g -Wall

# the build target executable:

PROG_LIST = helloworld dice area branching

all: $(PROG_LIST)

#$(TARGET):
#	$(CC) $(CFLAGS) -o $(TARGET) $(TARGET).c

helloworld: helloworld.c
	$(CC) $(CFLAGS) -o helloworld helloworld.c

dice: dice.c
	$(CC) $(CFLAGS) -o dice dice.c

area: area.c
	$(CC) $(CFLAGS) -o area area.c

branching: branching.c
	$(CC) $(CFLAGS) -o branching branching.c

clean:
	$(RM) $(PROG_LIST)
