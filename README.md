# EjercicioBotonesColores

A desktop application developed with **JavaFX** and **Maven** that dynamically updates button background colors based on numerical user input.

---

## 📋 Features

- **Interactive UI**: Clean interface built with JavaFX and FXML.
- **Dynamic Color Changes**:
  - Input `1`: Highlights the **Left Button** in **Yellow**.
  - Input `2`: Highlights the **Middle Button** in **Green**.
  - Input `3`: Highlights the **Right Button** in **Blue**.
- **Input Validation**: Displays an error message when any input other than `1`, `2`, or `3` is entered.
- **State Reset**: Resets previously applied button highlights on each new interaction.

---

## 🛠️ Tech Stack & Requirements

- **Java**: JDK 21 or higher
- **Framework**: JavaFX 21 (`javafx-controls`, `javafx-fxml`)
- **Build Tool**: Maven (Maven Wrapper included)
- **Testing**: JUnit 5 (JUnit Jupiter)

---

## 📂 Project Structure

```text
EjercicioBotonesColores/
├── .mvn/wrapper/               # Maven wrapper files
├── src/
│   └── main/
│       ├── java/
│       │   ├── module-info.java
│       │   └── edu/rico/ejercicios/ejerciciobotonescolores/
│       │       ├── App.java          # Application entry point
│       │       └── Controller.java   # FXML UI controller & event handlers
│       └── resources/
│           └── edu/rico/ejercicios/ejerciciobotonescolores/
│               └── main-view.fxml    # Scene definition (layout and components)
├── mvnw / mvnw.cmd             # Maven wrapper scripts
├── pom.xml                     # Maven project configuration
└── README.md                   # Project documentation
```

---

## 🚀 Getting Started

### Prerequisites

Ensure you have **Java JDK 21** installed and configured in your `PATH` or `JAVA_HOME`.

Verify your Java version:
```bash
java -version
```

### Running the Application

You can run the application directly using the Maven wrapper or your local Maven installation.

#### Using Maven Wrapper

- **Linux / macOS:**
  ```bash
  ./mvnw clean javafx:run
  ```

- **Windows (PowerShell / Command Prompt):**
  ```powershell
  .\mvnw clean javafx:run
  ```

#### Using Installed Maven

```bash
mvn clean javafx:run
```

### Building the Project

To compile and package the project:

```bash
./mvnw clean package
```
*(On Windows, use `.\mvnw clean package`)*

---

## 🎮 How to Use

1. Launch the application.
2. Enter a number (`1`, `2`, or `3`) into the text field.
3. Click the reaction/trigger button.
4. Observe the corresponding button changing its background color according to the value entered:
   - `1` &rarr; Left button turns **Yellow**
   - `2` &rarr; Middle button turns **Green**
   - `3` &rarr; Right button turns **Blue**
5. If invalid input is provided, an error prompt will notify you: *"No se acepta ninguna entrada distinta de 1, 2 o 3"*.

---

## 📄 License

This project is open-source and intended for educational and practice purposes.
