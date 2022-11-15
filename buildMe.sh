mkdir bin
cd src
javac -d ../bin -classpath ../bin ./org/gh/*.java
cd ../bin
java -classpath . org.gh.RunMe
