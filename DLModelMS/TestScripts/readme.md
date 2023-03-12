# Simple Guide

1. First, you need to right-click on the written remodel file to generate the basic spring boot code and configuration file

2. In the directory where the POM file is located in the generation folder, execute `mvn clean package k8s:deploy`

3. You can access '127.0.0.1:30080' through Postman for business operations, or you can connect to MySQL through the port (30306 by default) and password (lemon by default)

4. The stop command is `mvn k8s:undeploy`

