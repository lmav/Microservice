# Hotel 

<h3>Topics</h3>
<ul>
  <li>Java 8 </li>
  <li>Spring boot</li>
  <li>Spring cloud</li>
  <li>Eureka</li>
  <li>Git bash</li>
</ul>

<h3>Preview</h3>

<h3>Instructions</h3>

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
</li>After starting both microservices go to http://localhost:8761/
  
  ```
java -jar hotel-deals.js &


```    
</ul>  
<p>To stop the services from running do the following</p>

```
ps aux 
```

```

picture

```

```
kill 1234 
```


