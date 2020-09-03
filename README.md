# Code Structure
1. Config class - JedisConnectionFactory and RedisTempalte
2. Model - User mode class
3. Repository - Interface for CRUD operation and its implemetation. Uses the HashOperations to perform tasks.
4. Controller - Have the Rest Controller for each api mapping for resource.

# Redis

1. Redis server needs to installed and run
2. Run **redis-server** command to run the server
3. Redis runs on default port of **6379** and Spring auto configures the port to connect **_JedisConnectionFactory_**.
4. On Mac run **_brew install redis_** to install it.
