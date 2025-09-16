#!/bin/bash

export CLASSPATH=".:lib/antlr-4.13.2-complete.jar:$CLASSPATH"

for arg in "$@"; do declare $arg='1'; done
compile="javac -sourcepath src/ -cp lib/* -d build/"

mkdir -p build

if [ -v p ]; then
    java -Xmx500M -jar lib/antlr-4.13.2-complete.jar -package parser -o src/parser Eden.g4
    $compile src/parser/*.java
fi
$compile src/*.java

if [ -v run ]; then
    cd build
    java Main
    cd ..
fi
