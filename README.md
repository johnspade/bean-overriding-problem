Output:

```
Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2018-12-04 19:18:00.071 ERROR 10464 --- [           main] o.s.b.d.LoggingFailureAnalysisReporter   : 

***************************
APPLICATION FAILED TO START
***************************

Description:

The bean 'pageableResolver', defined in class path resource [org/springframework/data/rest/webmvc/config/RepositoryRestMvcConfiguration.class], could not be registered. A bean with that name has already been defined in class path resource [org/springframework/data/web/config/HateoasAwareSpringDataWebConfiguration.class] and overriding is disabled.

Action:

Consider renaming one of the beans or enabling overriding by setting spring.main.allow-bean-definition-overriding=true
```
