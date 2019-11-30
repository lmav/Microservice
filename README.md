# Hotel 

Basic functionalities of Microservice Architecture pattern  used to implement a hotel application service.
## Topics
<ul>
  <li>Java 8 </li>
  <li>Spring boot</li>
  <li>Spring cloud</li>
  <li>Eureka</li>
  <li>Git bash</li>
</ul>

## Preview

<br>
<img src="img/micro2.png">

## Instructions

<p>After cloning the repository run the following commands inside the run folder. Important note, I'm using the git bash 
  terminal.
</p>

<ul>
  <li>Start the eureka server first.<br><br>
  
```
java  -jar server.jar &
```
  </li>
    <li><br> Wait until you see the following message.<br><br>
  
   <img src="img/micro.png"><br>
  </li>
  <li>Start the hotel deals microservice next.<br><br>

```
java -jar hotel-deals.jar &
```
### repeat the steps for the remaining services


</li><br>After starting all microservices go to  <strong>http://localhost:8761/</strong><br><br>
  
  
  <img src="img/micro3.png">   
</ul>  

## To stop the services from running do the following

```
ps aux 
```

<img src="img/micro4.png">

```
kill 3131
kill 3158
kill 3148
kill 3138
```



