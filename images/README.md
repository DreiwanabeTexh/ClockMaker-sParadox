# The Clockmaker's Paradox

<img src="images/ClockmakerParadox.jpg" width="100%">

## 🎮 A time bending mystery where death is just the beginning

**CS 1203 Project**  
Buenavista, Christian Paolo M.  
Talagtag, Karl Andrei C.  
Villena, Kurt Andrei

---

## 🔥 Overview

The Clockmaker's Paradox is a psychological horror–mystery narrative game with strong elements of logical problem-solving, surreal exploration, and philosophical storytelling.

This project demonstrates the practical use of Object-Oriented Programming (OOP) principles such as encapsulation, inheritance, polymorphism, and abstraction. Additionally, it incorporates proper file handling for saving and loading progress, as well as a modular design structure to ensure clean, maintainable, and scalable code.

### 👤 Players can:
- ❓ Make choices that shape the story
- ⏳ Manage the 100-day countdown 
- 🧩 Solve logical and psychological challenges
- 💀 Experience consequences (Die, Loop, & Progress)
- 💾 Save and load game progress

---

## 🏗️ OOP Concepts Applied

### 🌀 Abstraction
Choice, Scene, Player, and GameEngine abstract the components of a text-based adventure. Each class focuses only on what is necessary.

### 💊 Encapsulation
Data is kept safe within classes through private fields and controlled access.

**Choice.java:**
```java
private String description;
private boolean isCorrect;
private String consequence;
Player.java:

java
public int getDaysLeft();
public void reduceDays(int days);
Scene.java hides title, narrative, and choices with getters only.

🧬 Inheritance
GameEntity serves as the base class for all game entities, allowing for shared functionality.

Example:

java
public class Player extends GameEntity {
    // Player-specific implementation
}
✨ Polymorphism
The code uses method-level polymorphism through inheritance and interfaces.

Runtime Example:

java
GameEntity entity = new Player(); // Upcasting
entity.update(); // Calls Player's update() method
📁 Project Structure
text
OOP/
├── 📂 images/
│   ├── Buenavista.jpg
│   ├── ClockmakerParadox.jpg
│   ├── Talagtag.jpg
│   └── Villena.jpg
├── 📂 src/
│   ├── 📂 entity/
│   │   ├── GameEntity.java
│   │   └── Player.java
│   ├── 📂 main/
│   │   ├── Choice.java
│   │   ├── GameEngine.java
│   │   └── Main.java
│   ├── 📂 scene/
│   │   ├── Scene.java
│   │   └── SceneLoader.java
│   └── 📂 ui/
│       └── TextDisplayer.java
├── 📂 resources/
│   └── 📂 audio/
│       └── bg.wav
└── README.md
🚀 How to Run
Method 1: Command Line
bash
# Clone repository
git clone https://github.com/DreiwanabeTexh/OOP.git
cd OOP

# Compile
javac -d bin src/**/*.java

# Run
java -cp bin main.Main
Method 2: Using IDE
Open project in IntelliJ IDEA/Eclipse/VS Code

Set source directory to src/

Run Main.java

💾 Features
✅ Save/Load System

✅ Modular Scene Management

✅ Sound Integration

✅ Clean Architecture

📸 Sample Output
text
=== THE CLOCKMAKER'S PARADOX ===
Days remaining: 100

You find yourself in a dimly lit workshop...
[1] Examine the grandfather clock
[2] Look for the exit
[3] Search the workbench

Enter your choice (1-3): 
👥 Contributors
Member	Name	Role	GitHub
<img src="images/Buenavista.jpg" width="100">	Christian Paolo M. Buenavista, BSCS	System Architect/Code Debugger	@PaoloBuenavista
<img src="images/Talagtag.jpg" width="100">	Karl Andrei C. Talagtag, MSIT	Project Leader/File Handling Specialist	@DreiwanabeTexh
<img src="images/Villena.jpg" width="100">	Kurt Andrei C. Villena	Code Debugger/Contributor	@digZy030509
🎖️ Acknowledgement
We would like to respectfully thank our Object-Oriented Programming Instructor, Ms. Fatima Marie Agdon, for her guidance, advice, and expertise in Object-Oriented Programming best practices and principles.