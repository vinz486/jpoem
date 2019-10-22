# JPoem
Modern Spring controller generator via Swagger/OpenAPI

### What
This is a code generator. It generates Spring MVC controllers and POJO classes (models) as request/response objects. Source (for now) is an OpenAPI (former Swagger) spec definition.

### Why?
I need an highly customizable code generator. Existing pojects relies on handlebar templating for generating code. They are very hard to customize. This project uses [JavaPoet](https://github.com/square/javapoet) library to generate code, thus it's name.

### Status
"first commits"

### Alternatives
If you need a ready made code generator head on Swagger Codegen projects: [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)
