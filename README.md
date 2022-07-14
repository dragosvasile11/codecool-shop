# Codecool shop

## Project Description

Everyone loves to buy and sell stuff, but we need a shop for that! In this
project, the goal is to build one of the [most common type of websites on the
web]: an online eCommerce web-application, where users can browse products, add them into
a shopping cart, then check out and make payments.

## What are you going to learn?

- how to create dynamic web pages in Java with servlets
- how to use the DAO design pattern in Java
- how to use the Thymeleaf templating engine
- how to handle fractional monetary unit appropriately with BigDecimal

## A bit of context

This application was built as part of my CodeCool journey.
I've worked on this app 1 sprint (4 days) with the help of my teammate Vlad Puschiulescu.
When we started working on this project we had about 9 months of programming experience and about 3 months of Object-oriented programming (OOP).

## General requirements

- Advanced OOP concepts, such as inheritance, are used in the project. There is at least one abstract class and one interface implemented.
- The project maintains the three-layer structure of controllers handling HTTP, service objects handling business logic, and DAOs handling data access.
- The page does not show a server error anytime during the review.
- All code is pushed to GitHub repository in atomic commits.

## Features of the project

- On the homepage you can scrooll all the products.

![2022-07-14_05-06](https://user-images.githubusercontent.com/89748211/178888165-fdb87868-b97c-4d32-8640-24efab8f1894.png)

- Click on the categories button, a sidebar will open and you can filter products.

![2022-07-14_05-07](https://user-images.githubusercontent.com/89748211/178888349-ae799b7a-d117-4fc1-9e4a-91ca85061aea.png)

- Add products to cart and you will see them by clicking on the green cart button.

![2022-07-14_05-07_1](https://user-images.githubusercontent.com/89748211/178888656-24a09e2c-c113-4281-b719-b5985b26dfac.png)

- Go to confirmation page and complete the billing address.

![2022-07-14_05-08_1](https://user-images.githubusercontent.com/89748211/178888801-deaec42e-7e48-4f35-ad69-ac6518b27d38.png)

- Congrats for buying our products!

![2022-07-14_05-09_1](https://user-images.githubusercontent.com/89748211/178888923-4cb6a062-9e25-486c-a2e6-54f7c8ea37fe.png)

## General requirements

Under every requirement there is a command line for installation(windows only)

- Java 17 or higher
- Maven

## Installation guide

- Open the project with pom.xml file
- Install all dependencies from pom.xml
- Run the Maven project with jetty:run


