#!/bin/bash
cd "$(dirname "$0")"

export CLASSPATH=".:lib/antlr-4.13.2-complete.jar:$CLASSPATH"

for arg in "$@"; do declare $arg='1'; done

antlr4="java -Xmx500M -cp lib/antlr-4.13.2-complete.jar:$CLASSPATH org.antlr.v4.Tool"
grun="java -Xmx500M -cp lib/antlr-4.13.2-complete.jar:$CLASSPATH org.antlr.v4.gui.TestRig"

compile="javac -sourcepath src -d build -cp lib/antlr-4.13.2-complete.jar"
execute="java"

mkdir -p build

$antlr4 -o src -visitor Eden.g4
$compile src/*.java

if [ -v run ]; then
    cd build
    $execute Main
    cd ..
fi
