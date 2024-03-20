# Testing Debt Documentation

## Overview
This project contains only integration tests for controller layer, due to high coupling between the controller and the service layer. The service layer is not tested, and the integration tests are not implemented.

> [!NOTE]
> Given this situation, it is necessary to do a refactoring to decouple the controller and the service layer, and implement integration tests.
> Even though there are no tests for the service layer, the project contains a good coverage in overall.
![img.png](img/CoverageBefore.png)

## Testing Debt
- Integration tests are implemented but are not clear.
- There are no Unit tests for model or service layer.
- There are no performance tests
- There are no security tests (Injections, XSS, etc)

> [!IMPORTANT]
> For this exersice, we are going to focus on unit testing service layer and complete the coverage on some model classes.

## Testing Strategy 
- **Refactoring**: We are going to refactor the code to decouple the controller and the service layer.

- **Unit Testing**: We are going to implement unit tests for the service and model layer.

