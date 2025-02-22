# Groovyjar

This is a simple bash script that is equivalent to `java -jar` i.e. it provides the ability to "execute" a jar file but with groovy libraries added to the classpath

It takes 1 or 2 parameters, the first one being the path to the jar file to execute. The second parameter is an optional parameter for the main class to execute. If it is not given then the main class to execute it extracted from the META-INF/MANIFEST.MF file in the jar. 

Examples:
Execute a jar using the Main-Class attribute from the manifest:
`groovyjar build/libs/groovyjar-1.0-SNAPSHOT.jar`

Execute a jar providing the class to run:
`./groovyjar build/libs/groovyjar-1.0-SNAPSHOT.jar se.alipsa.groovy.Greeting`

### Note
please dont be confused by the src/main stuff. This is just a simple groovy class used for testing the script.

The actual groovyjar script is in the root of this project