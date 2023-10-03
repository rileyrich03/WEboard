JFLAGS = -d bin -sourcepath src
JUNIT5_RUNNER = org.junit.platform.console.ConsoleLauncher
CKSTYLE_COMMAND =  -jar lib/checkstyle-10.5.0-all.jar 

default: 
	@echo "usage: make target"
	@echo "3 available targets: clean - removes editor tmpfiles and .class files"
	@echo "____________________ compile - builds codebase"
	@echo "____________________ demo - runs demo (client)"
compile:
	javac $(JFLAGS) src/*.java

demo: 
	java -cp .:bin WEboard

clean:
	rm -f ./bin/**/*.class
	rm -f ./bin/WEboard.class