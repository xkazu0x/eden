#!/bin/bash
set -e
cd "$(dirname "$0")"

lib_dir="$(pwd)/lib"
antlr_lib="$lib_dir/antlr-4.13.2-complete.jar"

export CLASSPATH="$lib_dir:$antlr_lib:$CLASSPATH"

for arg in "$@"; do declare $arg='1'; done

antlr4="java -cp $antlr_lib:$CLASSPATH org.antlr.v4.Tool"
grun="java -cp $antlr_lib:$CLASSPATH org.antlr.v4.gui.TestRig"

compile="javac -sourcepath src -d build"
execute="java"

if [ -v clean ]; then
    rm -rf build; 
    rm -rf local;
fi

mkdir -p build
mkdir -p local

$antlr4 -o src -visitor Eden.g4
$compile src/*.java

if [ -v test ]; then
    cp Eden.g4 build/Eden.g4
    cd build
    $grun Eden prog -gui ../Example.eden
    cd ..
fi

if [ -v run ]; then
    cd build
    $execute Eden ../Example.eden -o ../local
    cd ..
fi
