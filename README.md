# Eden

## Project Development Setup Instructions
### 1. Installing the required tool (JDK)
In order to work with the codebase, you'll need the Java SE Development Kit, the version used for the development was `21.0.3`.

### 2. Build Environment Setup
Building the codebase can be done in a terminal that can call Java from command line.

Add the JDK directory to Path. This can be done by:
- Using System Properties dialog > Environment variables > Append to Path variable

You can ensure that the Java compiler is accessible from your command line by running:
```
javac
```
### 3. Building
Within the terminal, `cd` to the root directory of the codebase, and just run the `build.bat` script:
```
build
```
By default, `build.bat` only builds the the compiler, but there are some arguments that can be passed:
- `clean` remove all generated files by the script.
- `tree` display a graphical window of the generated parse tree by the ANTLR4 tool.
- `run` run the compiler and pass to the arguments the file `exemple.eden`. Compile and run the generated java file by the compiler.
---
# Codebase Introduction
## Directory Descriptions
- `src`: All source code.
- `lib`: All library dependencies.
- `build`: All build artifacts.
- `local`: Local files, used to output the example java file.
