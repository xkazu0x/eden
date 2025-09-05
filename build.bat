@echo off
setlocal enabledelayedexpansion
cd /D "%~dp0"

:: --- Unpack Arguments --------
for %%a in (%*) do set "%%a=1"

:: --- Define Compile Lines ----
set java_common= -classpath lib\*; -sourcepath src -d build

:: --- Prep Directories --------
if not exist build mkdir build

:: --- Build Everything --------
if not exist build\eden\parser set build_parser=1
if "%all%"=="1"                set build_parser=1

if "%build_parser%"=="1" (
   echo [build parser]
   java -jar lib\antlr-4.13.2-complete.jar -package eden.parser -o src\eden\parser -listener -visitor Eden.g4
   javac %java_common% src\eden\parser\*.java
)

echo [build compiler]
javac %java_common% src\eden\compiler\*.java
