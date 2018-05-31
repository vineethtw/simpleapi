# Simple API 

A simple Java 8 + Jetty based API 

## Run

```
➜  docker build -f Dockerfile -t demo/simpleapi:latest . 
➜  docker run demo/simpleapi
```

## Test

```
➜  http GET "http://0.0.0.0:8081/health"

HTTP/1.1 200 OK
Content-Length: 15
Content-Type: application/json;charset=ISO-8859-1
Server: Jetty(8.y.z-SNAPSHOT)

{status: "OK"}

```

   