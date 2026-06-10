Docker Commands:

1) Check Docker configruation un comment before creating jar

2) Create jar file (Jar's location will be same as mentioned in DOCKERCONFIG file)

3) Run these commands



//Mysql build
docker run --name mysql-standalone -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=db_takeout -e MYSQL_USER=az -e MYSQL_PASSWORD=password -d mysql:5.6



//Java build (Include . as building image in same directory)
docker build . -t takeout-system-service



//Linking bot Images
docker run -p 8098:8098 --name takeout-system-service --link mysql-standalone:mysql -d takeout-system-service