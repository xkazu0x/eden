#!/bin/bash

for arg in "$@"; do declare $arg='1'; done

mkdir -p build

javac -sourcepath src/ -cp lib/* -d build/ src/*.java

if [ -v run ]; then
    cd build
    java Main
    cd ..
fi
