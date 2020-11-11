Procedure
DOWNLOAD JAVA AND SET VARIABLES

1)Download and install JAVA from https://www.java.com/en/download/

2)In the System Properties window,click Advanced tab and then click the Environment Variables button.

3)In the "System variables" section of the Environment Variables window that opens, ensure that the JAVA_HOME and JRE_HOME environment variables 
are pointed at the following locations:

JAVA_HOME: C:\Program Files\Java\jdk<version>
  
JRE_HOME: C:\Program Files\Java\jre<version>

DOWNLOAD APACHE MAVEN AND SET VARIABLES
1)Visit Maven official website, download the Maven zip file, for example : apache-maven-3.6.0-bin.zip.
2)In the System Properties window,click Advanced tab and then click the Environment Variables button.

3)In the "System variables" section of the Environment Variables window that opens, ensure that the

MAVEN_HOME environment variable is pointing to c:\Program Files\apache-maven-3.6.0
4)In system variables, find PATH, clicks on the Edit... button. In “Edit environment variable” dialog, clicks on the New button and add this %MAVEN_HOME%\bin

On Command Prompt write mvn -version to check is Maven and Java properly set

CODE IS ON MASTER BRANCH
Download project from GIT
Unzip it and from command prompt locate to that folder that contains pom.xml file
For running tests just enter in command prompt:
mvn test -Dsurefire.suiteXmlFiles=scenario.xml
