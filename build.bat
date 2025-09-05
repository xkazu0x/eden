@echo off
setlocal enabledelayedexpansion
cd /D "%~dp0"

:: --- Unpack Arguments --------
for %%a in (%*) do set "%%a=1"
if "%clear%"=="1" (
   echo [build clear]
   if exist build rmdir /s /q build
   if exist src\parser rmdir /s /q src\parser
)

:: --- Define Compile Lines ----
set java_common= -classpath lib\*; -sourcepath src -d build

:: --- Prep Directories --------
if not exist build mkdir build

:: --- Build Everything --------
if not exist build\parser (
   echo [build parser]
   java -jar lib\antlr-4.13.2-complete.jar -package parser -o src\parser -listener -visitor Eden.g4
   javac %java_common% src\parser\*.java
)

echo [build compiler]
javac %java_common% src\compiler\*.java
