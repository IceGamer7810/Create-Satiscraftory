@echo off
call "%~dp0gradlew.bat" build
if errorlevel 1 goto end

call "%~dp0gradlew.bat" runClient

:end
pause
