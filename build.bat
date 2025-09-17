@echo off
setlocal enabledelayedexpansion
cd /D "%~dp0"

set CLASSPATH=.;lib\antlr-4.13.2-complete.jar;%CLASSPATH%

for %%a in (%*) do set "%%a=1"

set antlr4=java -Xmx500M -cp lib\antlr-4.13.2-complete.jar;%CLASSPATH% org.antlr.v4.Tool
set grun=java -Xmx500M -cp lib\antlr-4.13.2-complete.jar;%CLASSPATH% org.antlr.v4.gui.TestRig

set compile=javac -sourcepath src -d build -cp lib\antlr-4.13.2-complete.jar
set execute=java

if not exist build mkdir build

%antlr4% -o src -visitor Eden.g4
%compile% src\*.java

if "%run%"=="1" (
    cd build
    %execute% Main
    cd ..
)
