# Hotel 

small  hotel  application designed  with the microservice  architecture pattern

## Topics
<ul>
  <li>Java 8 </li>
  <li>Spring boot</li>
  <li>Spring cloud</li>
  <li>Eureka</li>
  <li>Git bash</li>
</ul>

## Preview

## Instructions

<p>After cloning the repository run the following commands inside the run folder. Important note, I'm using the git bash 
  terminal.
</p>

<ul>
  <li>Start the eureka server first.
  
```
java -jar server.js &
```
  </li>
    <li> Wait until you see the following message. 
  
```

picture


```
  </li>
  <li>Start the hotel deals microservice next.

```
java -jar hotel-deals.js &
```
</li>After starting both microservices go to  <strong>http://localhost:8761/</strong>
  
  ```
java -jar hotel-deals.js &


```    
</ul>  
## To stop the services from running do the following

```
ps aux 
```

```

picture

```

```
kill 1234 
```

## License

