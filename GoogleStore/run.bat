set projectLocation=C:\Users\HP\eclipse-workspace\GoogleStore

cd %projectLocation%

set classpath=%projectLocation%\bin;%projectLocation%\lib\*

java org.testng.TestNG %projectLocation%\testng.xml

pause