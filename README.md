# SOAP-Geography-Web-Service

A simple web service that uses SOAP to send information via XML for U.S. states such as the capital, population, and region. 
To send a request, I used Postman with the following configurations:


* POST request to http://localhost:8888/soapWS
* **Header:** 
  - key: Content-Type
  - value: text/xml
* **Body:** 
```
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ss="http://soapwebapp.com/soap-web-app">
	<soapenv:Header></soapenv:Header>
	<soapenv:Body>
			 <ss:getStateRequest>
				 <ss:name>California</ss:name>
			 </ss:getStateRequest>
	 </soapenv:Body>
</soapenv:Envelope>
```

Send the request, and you should get back an XML based response with the state's information. 
Try entering different states in the "ss:name" field.
  
Make sure to check out https://github.com/lrbell17/SOAP-Geography-Consumer for a java program that consumes this service without using Postman, or https://github.com/lrbell17/SOAP-Geography-Consumer-Spring for a similar (and simpler) Spring Boot implementation.
