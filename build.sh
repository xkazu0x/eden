#!/bin/bash
set -e
cd "$(dirname "$0")"

for arg in "$@"; do declare $arg='1'; done

lib_dir="$(pwd)/lib"
antlr_lib="$lib_dir/antlr-4.13.2-complete.jar"
export CLASSPATH="$lib_dir:$antlr_lib:$CLASSPATH"

antlr4="java -cp $antlr_lib:$CLASSPATH org.antlr.v4.Tool"
grun="java -cp $antlr_lib:$CLASSPATH org.antlr.v4.gui.TestRig"
compile="javac -sourcepath src -d build"

if [ -v clean ]; then
    rm -rf build; 
    rm -rf local;
fi

mkdir -p build
mkdir -p local

$antlr4 Eden.g4 -o src -visitor
$compile src/*.java

cd build
if [ -v test ]; then $grun Eden prog -gui ../Example.eden; fi
if [ -v run ]; then java EdenCompiler ../Example.eden -o ../local; fi
cd ..
