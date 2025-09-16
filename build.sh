#!/bin/bash

export CLASSPATH=".:lib/antlr-4.13.2-complete.jar:$CLASSPATH"

for arg in "$@"; do declare $arg='1'; done
antlr4="java -Xmx500M -jar lib/antlr-4.13.2-complete.jar"
compile="javac -sourcepath src/ -cp lib/* -d build/"

mkdir -p build

if [ -v par ]; then
    $antlr4 -package parser -o src/parser -visitor Eden.g4
    $compile src/parser/*.java
fi
$compile src/*.java

if [ -v run ]; then
    cd build
    java Main
    cd ..
fi
