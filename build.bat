@echo off
setlocal enabledelayedexpansion
cd /D "%~dp0"

set lib_dir=%CD%\lib
set antlr_lib=%lib_dir%\antlr-4.13.2-complete.jar

set CLASSPATH=%lib_dir%;%antlr_lib%;%CLASSPATH%

for %%a in (%*) do set "%%a=1"

set antlr4=java -cp %antlr_lib%;%CLASSPATH% org.antlr.v4.Tool
set grun=java -cp %antlr_lib%;%CLASSPATH% org.antlr.v4.gui.TestRig

set compile=javac -sourcepath src -d build
set execute=java

if not exist build mkdir build

%antlr4% -o src -visitor Eden.g4
%compile% src\*.java

if "%test%"=="1" (
    copy Eden.g4 build/Eden.g4
    cd build
    %grun% Eden prog -gui ..\example.eden
    cd ..
)

if "%run%"=="1" (
    cd build
    %execute% Main
    cd ..
)
