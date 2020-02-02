# kong-docker-compose
kong-docker-compose configuration

### Create Spring Service for Test

into test folder 
```
mvn clean install
docker build -t api-service/am .
docker run -p 8080:8080 -e APP_PROFILE=DEV api-service/am (optional)
```

### Start KONG and KONGA

```
docker-compose up --build
localhost:1337
```
