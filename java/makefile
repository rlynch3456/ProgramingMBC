# A simple makefile for compiling three java classes

# define a makefile variable for the java compiler

JCC = javac

# define a makefile variable for compilation flags
# the -g flag compiles with debugging information

JFLAGS = -g

# typing 'make' will invoke the first target entry in the makefile 
# (the default one in this case)

all: AreaCalc_withInput.class AreaCalc_simple HelloWorld.class

AreaCalc_withInput: AreaCalc_withInput.class
AreaCalc_simple: AreaCalc_simple.class
HelloWorld: HelloWorld.class


AreaCalc_withInput.class: AreaCalc_withInput.java
	$(JCC) $(JFLAGS) AreaCalc_withInput.java

AreaCalc_simple.class: AreaCalc_simple.java
	$(JCC) $(JFLAGS) AreaCalc_simple.java

HelloWorld.class: HelloWorld.java
	$(JCC) $(JFLAGS) HelloWorld.java

# To start over from scratch, type 'make clean'.  
# Removes all .class files, so that the next make rebuilds them

clean: 
	$(RM) *.class
	
