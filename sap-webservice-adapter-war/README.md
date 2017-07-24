IMPORTANT:


https://stackoverflow.com/questions/23011547/webservice-client-generation-error-with-jdk8




Add a file ``jaxp.properties`` to ``C:\develop\platform\prod\jdk\jdk-1.8.0_60\jre\lib`` with the following content: ``javax.xml.accessExternalSchema = all`



Well, I found the solution. (based on http://docs.oracle.com/javase/7/docs/api/javax/xml/XMLConstants.html#ACCESS_EXTERNAL_SCHEMA)

Create a file named jaxp.properties (if it doesn't exist) under /path/to/jdk1.8.0/jre/lib and then write this line in it:

javax.xml.accessExternalSchema = all
That's all. Enjoy JDK 8.