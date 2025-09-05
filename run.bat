@echo off

set CURRENT_DIR=%CLASSPATH:.;=%
if "%CURRENT_DIR%"=="%CLASSPATH%" (SET CLASSPATH=.;%CLASSPATH%)

pushd build
call java compiler/Main
popd
