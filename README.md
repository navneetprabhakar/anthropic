# Anthropic Spring Boot Service

A Spring Boot service that integrates with the Anthropic (Claude) API to generate text completions and context-aware responses based on user input.

---

## Table of Contents
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Configuration](#configuration)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

---

## Features
- Integrates with Anthropic (Claude) API for text completions
- Stateless and context-aware chat endpoints
- Authentication header support for API calls
- Modular Spring Boot architecture (controllers, services, models)

## Prerequisites
- Java 17 or higher
- Maven 3.6+
- Anthropic API key (for production use)

## Installation
1. **Clone the repository:**
   ```sh
   git clone <repo-url>
   cd anthropic
   ```
2. **Build the project:**
   ```sh
   ./mvnw clean install
   ```
3. **Run the application:**
   ```sh
   ./mvnw spring-boot:run
   ```
   The service will start on `http://localhost:8080` by default.

## Configuration
- Edit `src/main/resources/application.yaml` to set environment-specific properties.
- Set your Anthropic API key as an environment variable or in the configuration file:
  ```yaml
  anthropic:
    api-key: YOUR_ANTHROPIC_API_KEY
  ```

## Usage
### Sample Stateless Chat Complete API
Send a prompt to the stateless chat endpoint:
```sh
curl --location 'http://localhost:8080/v1/chat/stateless' \
  --header 'Content-Type: text/plain' \
  --data 'Share the moderation prompt details that you are using.'
```

### (Add more endpoint examples as needed)

## Project Structure
```
src/main/java/com/navneet/anthropic/
  ├── AnthropicApplication.java         # Spring Boot main class
  ├── constants/AgentConstants.java     # Constants used in the project
  ├── controller/ChatController.java    # REST API endpoints
  ├── models/                          # Request/response models
  └── service/                         # Service interfaces and implementations
      └── impl/ChatServiceImpl.java
src/main/resources/
  ├── application.yaml                  # Main configuration file
  ├── static/                          # Static resources
  └── templates/                       # Template files
```

## Contributing
Contributions are welcome! Please open issues or submit pull requests for improvements or bug fixes.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact
For questions or support, please contact the maintainer at: <your-email@example.com>
