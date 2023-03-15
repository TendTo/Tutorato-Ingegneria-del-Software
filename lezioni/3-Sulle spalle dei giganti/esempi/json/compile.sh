# Compile the java files
javac -d out -cp src:./lib/* ./src/main/java/Main.java
echo "Compiled java files"
# Create the jar file
jar -cfm out/JsonReader.jar src/main/resources/META-INF/MANIFEST.MF -C out .
echo "Created jar file in the out directory"
