## Refactoring Suggestions found in the code

### Controllers
- The `CreateAccountController`,`SuggestionController` and `AuthenticationController` classes contains controller, business logic and data access code that should be separated out into different service and repository classes.
- Poor naming conventions, variables naming are inconsistent and not descriptive (i.e. `EntityManager em` or `PasswordEncoder pe`)
- API endpoints are not properly documented (**FIXED in this branch** [SwaggerConfig.java](src%2Fmain%2Fjava%2Foutout%2Fconfig%2FSwaggerConfig.java))
- Unused Imports should be removed
- SQL Injection vulnerable: In [SuggestionController.java](src%2Fmain%2Fjava%2Foutout%2Fcontroller%2FSuggestionController.java) Queries like `Query q = em.createQuery("select s from Suggestion s where trunc(s.suggestedDate) = trunc(:suggestedDate)");` should be parameterized to avoid SQL Injection
- Duplicated Code: the above query are repeated among controllers, and should be moved to a common place.
- Magic Numbers/String: In [CreateAccountController.java](src%2Fmain%2Fjava%2Foutout%2Fcontroller%2FCreateAccountController.java)  are occurrences of "5", "10", and "UNPROCESSABLE_ENTITY" directly in the code. It's better to use constants or enums to improve readability and maintainability.
- In [AuthenticationController.java](src%2Fmain%2Fjava%2Foutout%2Fcontroller%2FAuthenticationController.java)  The controller returns HttpStatus.NOT_FOUND when authentication fails, which might not be the most appropriate response for failed authentication. It's better to return HttpStatus.UNAUTHORIZED or HttpStatus.FORBIDDEN to indicate authentication failure.
- Complexity of functions should be reduced.

### Auth
- in [StatelessAuthenticationFilter.java](src%2Fmain%2Fjava%2Foutout%2Fsecurity%2FStatelessAuthenticationFilter.java) JWT Token should have more information about the user and should be validated properly (expiration, issuer, etc.)

