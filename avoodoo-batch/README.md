
# Setting up JAVA EE 7 Projects with Maven 3

**Java EE 7 only requires a minimalistic pom.xml**

Based on Adam Bien's: [setting_up_java_ee_7](http://adambien.blog/roller/abien/entry/setting_up_java_ee_7)

### Create Project from Archetype
```Java
mvn archetype:generate -Dfilter=com.airhacks:javaee7-essentials-archetype
```

```Java
groupId: com.avoodoo
artifactId: min-ee7
version: 1.0.SNAPSHOT
```

```Java
mvn install -DskipTests
```

### Implementation RESTful Webservice
**See Classes**: 
 * com.avoodoo.RESTConfiguration
 * com.avoodoo.TestResources

### Build and Deploy

Build the Maven EE7 application
```
mvn clean install -DskipTests
```

The file listed under the filename parameter can be deployed to the server using the deploy goal.


```Java

mvn wildfly:deploy

```

The file can later be redeployed or undeployed using the appropriate goals.

```Java

mvn wildfly:redeploy
mvn wildfly:undeploy

```

### Access the REST application
[http://localhost:8080/avoodoo-batch/resources/test](http://localhost:8080/avoodoo-batch/resources/test)