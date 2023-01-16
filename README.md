# Spring boot - Rest API

## How was it built?
    ► 1. create a project called 'user.service' which is going to be the main service.
      # now you need to create some packages with some classes and interfaces inside of each one:
        ≡ entity: contains a class called 'User'
        ≡ repository: contains an interface which extends JPARepository
        ≡ service: create a class with a variable of the repository interface inside
        ≡ controller: create a class from where you can map all the endpoints to control the service
        
    ► 2. create a project called 'car.service' and repeat step 1.
    
    ► 3. create a project called 'motorcycle.service' and repeat step 1.
    
    ► 4. let's connect the services among them.
      # go to the service 'user.service' and do this:
        ≡ create a package called 'configuration': inside that package, create a class called 'RestTemplateConfig' and inject 'Restemplate' as a Bean in order to be able to communicate and interchange our services
        ≡ now create a package called 'models' and inside of it, create two classes: 'Car' and 'Motorcycle' and give them the String attributes 'brand' and 'model' (just as they were given in their classes inside their own services)
        ≡ now, go to the class UserService, in the package service inside the service 'user.service', and let's inject what we've saved in RestTemplateConfig class as attribute
        ≡ in the same class, we have to create all the methods that involves the other services with the object 'restTemplate' which is place as attribute inside the class. Give the endpoint of the other services in the url that is claimed in the method getForObject of the objetct 'restTemplate' 
         ≡ go to the class controller, and add the method thats in going to link the controller class with the service class

![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=flat&logo=spring&logoColor=white)
<br>
![img](https://img.shields.io/badge/version-0.4-blue)
