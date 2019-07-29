# Email Service Provider

This application can be used to send email from one of the predefined email service provider.
(Gmail, SendGrid, MailGun, SparkPost, Amazon SES)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

What things you need to install the software and how to install them

```
Need JDK 8+ version.
Need maven installed (above version 3)
Need accounts from service providers : gmail, sendgrid, mailgun, sparkpost, amazon ses
```

### Installing

A step by step series of examples that tell you how to get a development env running.

- Run this command

```
mvn clean package
```

- This will create jar file under target directory.
- To run this jar, copy jar under one directory.
Create 2 directories as per below along with this jar in same directory.
    - lib : copy external jar files if needed
    - config : copy application.yml file from src/main/resources

```
Ex. To enable sendgrid email provider, just un-comment profile under this file.
(src/main/resources/application.yml)

Add sendgrid.proeprties with your configuration changes in this config directory
```
Try to do for all other email service providers.


## Flow
Once you provide your email providers configuration, it will try to send email using one of the email service providers.

## Start & Access
Run this command:
```
java -jar jar_name.jar
```

API to access this:
```
http://IP:8090/emailservice/sendEmail

RequestBody :
{
  "to": "xyz@mail.com",
  "subject": "subject test",
  "body": "body test"
}
```

## Built With

* [Spring Boot](https://spring.io/projects/spring-boot) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management


## Authors

* **Milan Kamboya** - *Initial work* 

See also the list of [contributors](https://github.com/milankamboya/emailserviceprovider/contributors) who participated in this project.

