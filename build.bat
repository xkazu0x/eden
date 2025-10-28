@echo off
setlocal enabledelayedexpansion
cd /D "%~dp0"

for %%a in (%*) do set "%%a=1"

set lib_dir=%CD%\lib
set antlr_lib=%lib_dir%\antlr-4.13.2-complete.jar
set CLASSPATH=%lib_dir%;%antlr_lib%;%CLASSPATH%

set antlr4=java -cp %antlr_lib%;%CLASSPATH% org.antlr.v4.Tool
set grun=java -cp %antlr_lib%;%CLASSPATH% org.antlr.v4.gui.TestRig
set compile=javac -sourcepath src -d build

if "%clean%"=="1" (
  rmdir /s /q build
  rmdir /s /q local
)

if not exist build mkdir build
if not exist local mkdir local

%antlr4% Eden.g4 -o src -visitor
%compile% src\*.java

pushd build
if "%test%"=="1" %grun% Eden prog -gui ..\Example.eden
if "%run%"=="1" java EdenCompiler ../Example.eden -o ../local
popd
