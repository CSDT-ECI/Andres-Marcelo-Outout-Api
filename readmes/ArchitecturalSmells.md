# Architectural Smells 

## Part 1
In order to analyze the architectural smells in the project, we will first identify the main architectural smells present in the codebase using 2 important tools commonly used to check this kind of smells: **Designite** and **Arcan**

### Designite
Designite is a software design quality assessment tool that provides a comprehensive set of software design quality metrics and detects design smells such as God Classes, Brain Classes, Spaghetti Code, and more.

The following results are a comparative analysis between the original project and the refactored project:

- ### Original Codebase Analysis: ![designiteresultsantiguo.png](..%2Fimg%2Fdesigniteresultsantiguo.png)
- ### Refactored Codebase Analysis: ![designiteresultsactual.png](..%2Fimg%2Fdesigniteresultsactual.png)

>[!IMPORTANT]
In this comparative analysis, we can see that the refactored codebase has a lower number of design smells compared to the original codebase. This indicates that the refactoring process has improved the quality of the codebase by reducing the number of design smells.
we can see that the old codebase has design smells like 'Deficient Encapsulation' and 'Unnecesary Abstraction' in main service/model classes, and the refactored one has only smells on test and configuration classes, which is a good sign of improvement.

### Arcan
Arcan is a tool that provides a set of architectural smells detection rules that can be used to identify architectural smells in a codebase, also gives a graphical representation of the codebase architecture, and its usefull to identify dependencies between classes and packages.

## Overall Analysis
The following results are a comparative analysis between the original project and the refactored project:

- ### Original Codebase Analysis: ![statsoriginal.png](..%2Fimg%2Fstatsoriginal.png)
- ### Refactored Codebase Analysis: ![statsMejorado.png](..%2Fimg%2FstatsMejorado.png)

>[!IMPORTANT] Here we can see that the original code has a high level of rigidity but a simple design, and the refactored code has a more complex design but with a lower level of rigidity, which indicates that the refactoring process has improved the flexibility and maintainability of the codebase.

## Dependencies Analysis
The same comparative analysis can be done with the dependencies between classes and packages in the codebase.

- ### Original Codebase Dependencies: ![Arquitectura original.png](..%2Fimg%2FArquitectura%20original.png)
- ### Refactored Codebase Dependencies: ![arquitecturaMejorado.png](..%2Fimg%2FarquitecturaMejorado.png)


>[!IMPORTANT] With these two images, we can conclude that the original codebase, despite its simple design, exhibits some coupling and unmanaged dependencies between classes and packages. In the other hand, the refactored codebase demonstrates a more intricate design but with reduced coupling and clearer dependencies among classes and packages. This improvement facilitates a deeper understanding of the codebase, enhances maintainability, and streamlines the onboarding process for new developers.

