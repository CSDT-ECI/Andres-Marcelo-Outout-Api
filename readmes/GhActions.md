# Continuous Integration with GitHub Actions
You can find the build workflow in -> [build.yml](..%2F.github%2Fworkflows%2Fbuild.yml)

## Overview
In this excersice I will complement the CI pipeline made in [QualityModels.md](QualityModels.md), I already had a GH Actions workflow that builds the project and uploads the coverage results to sonarcloud, but I will add a new step that sends a message to a MS Teams channel informing about a new PR and a build status.

## Badges
This is the badge that shows the status of the build process in the project:
### Github Actions Badge! 🔧[![SonarCloud](https://github.com/CSDT-ECI/Andres-Marcelo-Outout-Api/actions/workflows/build.yml/badge.svg)](https://github.com/CSDT-ECI/Andres-Marcelo-Outout-Api/actions/workflows/build.yml)

> [!NOTE]
> The Sonarcloud analysis was first implemented in a personal account, now it is integrated in the organization account, but as the previous PRs are not fully merged, the full sonar analysis in *master* branch and the comparations with it are not available yet in sonarcloud! 🔧 but you can see the results of the pipeline running in the personal account in [QualityModels.md](QualityModels.md). When all the PRs are merged, the analysis will be available in Sonarcloud organization account.

## Pipeline Steps
The pipeline has the following steps:
### First Job (Build)
1. **Checkout**: This step checks out the repository so the workflow can access the code.
2. **Setup Java**: This step sets up the Java version to use in the workflow.
3. **Setup Sonarcloud packages**: This step sets up the cache for Sonarcloud packages to improve the analysis time.
4. **Setup Gradle packages**: This step sets up the cache for Gradle packages to improve the build time.
5. **Build**: This step builds the project using Gradle.

### Second Job (MS Teams Notification)
1. **Use MS teams Action**: this step upses `neonidian/teams-notify-build-status@v3` action to send a message to a MS Teams channel throug a webhook with the build status and the PR that triggered the build.

> [!TIP]
> The MS Teams action is configured to send a message to a specific channel in a MS Teams account, the webhook is configured in the repository secrets.

### Failed Attempt: Code Analysis with ChatGPT
I tried to implement a step that uses ChatGPT to analyze the code and suggest improvements, but I had some issues using the Action and the step was not implemented, The service for every query returned 429 error code (Too many requests)
![gptfail.png](..%2Fimg%2Fgptfail.png)


## Results
The pipeline was successfully implemented and the build status is shown in the badge at the beginning of the document, the MS Teams notification was sent to the configured channel with the build status and the PR that triggered the build as shown in the following image:
![ghactionsmsteams.png](..%2Fimg%2Fghactionsmsteams.png)

## Conclusion
Implementing this MS Teams notification Action was a good exercise to understand how to integrate external services with GitHub Actions, it was a good experience to see how the pipeline can be extended to include more steps and improve the communication among the team members.



