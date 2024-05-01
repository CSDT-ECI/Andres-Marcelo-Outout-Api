
# First Activity (Code Smells and Refactoring)

## Code Smells

### Controllers
- **Bad Separation of Concerns**: The `CreateAccountController`, `SuggestionController`, and `AuthenticationController` classes show a violation of the Single Responsibility Principle by combining controller, business logic, and data access code.

- **Naming Conventions**: Non-descriptive variable naming (i.e. `EntityManager em` or `PasswordEncoder pe`).

- **Magic Numbers/String**: Direct use of "5", "10", and "UNPROCESSABLE_ENTITY" in [CreateAccountController.java](src%2Fmain%2Fjava%2Foutout%2Fcontroller%2FCreateAccountController.java).

- **Authentication Failure Response**: Returning HttpStatus.NOT_FOUND in [AuthenticationController.java](src%2Fmain%2Fjava%2Foutout%2Fcontroller%2FAuthenticationController.java) for failed authentication may lead to confusion.

### Auth
- **Poor or Incomplete JWT Information**: [StatelessAuthenticationFilter.java](src%2Fmain%2Fjava%2Foutout%2Fsecurity%2FStatelessAuthenticationFilter.java) lacks proper validation and information in JWT Tokens.

### Tests
- **Lack of Service and Repository Tests**: The absence of tests for service and repository classes indicates a gap in test coverage.

- **Basic Test Descriptions and Coverage**: Existing tests lack descriptive names and cover only limited scenarios.

## Refactoring Techniques 

### Controllers
- **Single Responsability Principle**: implement business logic and data access code from controllers and placing them in separate service and repository classes.

- **Improve Naming Conventions**: Refactor variable names to follow consistent and descriptive naming conventions, improving code readability.

- **Replace Magic Number with Symbolic Constant**: Replace magic numbers and strings with constants or enums to enhance code maintainability and understanding.

- **Follow HTTP Status code Standard**: Adjust the HTTP status code in [AuthenticationController.java](src%2Fmain%2Fjava%2Foutout%2Fcontroller%2FAuthenticationController.java) to use more appropriate codes like HttpStatus.UNAUTHORIZED or HttpStatus.FORBIDDEN.

### Auth
- **Enhance JWT Token**: Improve the JWT Tokens in [StatelessAuthenticationFilter.java](src%2Fmain%2Fjava%2Foutout%2Fsecurity%2FStatelessAuthenticationFilter.java) by adding necessary user information and ensuring proper validation.

### Tests
- **Add Service and Repository Tests**: Develop tests for service and repository classes to verify their functionality.

- **Improve Test Descriptions and Coverage**: Enhance test descriptions and expand coverage to include a broader range of scenarios for more thorough testing.
