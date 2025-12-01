<h1 align = "center"> ⏱ The Clockmaker's Paradox ⏱ </h1>
<img src = "static/ClockmakerParadox.jpg" width ="100%">

<h2 align = "center"> 
A time bending mystery where death is just the beginning </h3>
<p align = "center">
<b> CS 1203 </b><br/>
Buenavista, Christian Paolo M. <br/>
Talagtag, Karl Andrei C. <br/>
Villena, Kurt Andrei C.</p>

## 🔥 Overview 🔥
The Clockmaker’s Paradox is a psychological horror–mystery narrative game with strong elements of logical problem-solving, surreal exploration, and philosophical storytelling.
<br/><br/>
This project also demonstrates the practical use of Object-Oriented Programming (OOP) principles such as encapsulation, inheritance, polymorphism, and abstraction. Additionally, it incorporates proper file handling for saving and loading progress, as well as a modular design structure to ensure clean, maintainable, and scalable code.<br/>

### 👤 Users can:
❓ Make choices that can shape the story.<br/>
⏳ Manage the 10-day countdown <br/> 
🧩 Solve logical and psychological challenges <br/>
💀 Experience Consequences (Die, Loop, & Progress) <br/>
💾 Save and load their Progress


<h1>OOP Concepts Applied

<h2> 🌀 Abstraction </h2>

`Choice`, `Scene`, `Player`, and `GameEngine` abstract the components of a text-based adventure.

    Each class focuses only on what is necessary:
`Player` only stores and manages days left.<br/>
`Choice` only stores info about a choice.<br/>
`Scene` stores title, narrative, and choices.<br/>
`GameEngine` controls the flow of the game.<br/>

<h2> 💊 Encapsulation</h2>
are the data that is kept safe within classes through private fields and controlled access<br/>
for example:<br/><br/>

```java
private String description;
private boolean isCorrect;
private String consequence; 
```
in `choice`. <br/>
* `Player` hides its `daysLeft` field and exposes:<br/>

```java
public int getDaysLeft();
public void reduceDays(int days);
```
* `Scene` hides title, narrative, and choices with getters only.<br/>


<h1> 🧬 Inheritance</h1>
inheritance is minimal because each class represents a distinct concept in the game. However, the structure still supports inheritance naturally, and the classes are organized in a way that would allow expansion through subclassing. <br/>
<br/>
Right now, the project doesn't use inheritance directly, but the class design is structured so that inheritance can be added cleanly if the game grows more complex.

<h1>✨ Polymorphism</h1>
The code uses method-level polymorphism only indirectly.<br/>
<br/>
for example:<br/>

`Choice[]` inside `Scene` <br/>
Although each `Choice` is the same class, the game treats them differently at runtime:<br/>
* `choice.isCorrect()` determines behavior dynamically.<br/>
* Each `Choice` holds its own consequence text, producing different outputs. <br/>
this is called "**data-driven polymorphism**"


## | Project Structure |
```
📂 \ClockMaker-sParadox
├── 📂 images/
│   ├── 📷 Buenavista.jpg
│   ├── 📷 ClockmakerParadox.jpg
│   ├── 📷 Talagtag.jpg
│   └── 📷 Villena.jpg
├── 📂 scr/
│   ├── 📂 Entity/
│   │   ├── ☕ GameEntity.java
│   │   └── ☕ Player.java
│   ├── 📂 main/
│   │   ├── ☕ Choice.java
│   │   ├── ☕ GameEngine.java
│   │   └── ☕ Main.java
│   ├── 📂 resources/audio/
│   │   └── 🔊 bg.wav
│   ├── 📂 scene/
│   │   ├── ☕ Scene.java
│   │   └── ☕ SceneLoader.java
│   └── 📂 ui/
│       └── ☕ TextDisplayer.java
└── 📄 README.md
  
```
## **How to Run the Program**
1. **Clone the repository:**
     ```bash
     git clone https://github.com/DreiwanabeTexh/OOP.git
     ```
2. **Go to the project directory:**
    ```bash
    cd OOP
3. **Navigate to the correct folder (if needed):**
     ```bash
     cd FinalProj 
     ```
4. **Compile the program:**
    ```bash
   javac -d . src/main/*.java src/entity/*.java src/scene/*.java src/ui/*.java
    ```

5. **Run the program:**
    ```bash
    java main.Main
    ```

<h1> Sample Output</h1>

```java 
=== THE CLOCKMAKER'S PARADOX ===
---------------------------------------------------

Rain. Screeching tires. A flash of headlights.
Then-impact.
Before everything went silent, you saw a broken watch on the road,
its hands ticking backward.
Now you wake in a place that isn't home-cold walls, distant whispers,
shadows that wait.
A voice echoes in your mind:
   "Every mistake costs time.
    Every truth returns it."
Somewhere, your real body lies motionless.
Here, you must find the truth-or repeat the loop forever.

You have 10 days. Every wrong decision costs one.
Type 'music' at any time to toggle background music
---------------------------------------------------

Scene 1 ? The Room of Echoes
You awaken in a dim cell. A lamp, a mirror, and a wooden door stand before you.
Whispers curl along the walls: 'Time forgets the careless.'
1. Smash the lamp.
2. Kick the door.
3. Look into the mirror.

Enter choice (1-3) or 'music': 1

Darkness floods in. A whisper screams. You lose a day.
Days left: 9

? Time warps violently! You're thrown back to the very beginning...

Scene 1 ? The Room of Echoes
You awaken in a dim cell. A lamp, a mirror, and a wooden door stand before you.
Whispers curl along the walls: 'Time forgets the careless.'
1. Smash the lamp.
2. Kick the door.
3. Look into the mirror.

Enter choice (1-3) or 'music': 3

Your reflection distorts, revealing a hidden fear inside you...

The walls rumble...
A cold breeze brushes your neck...
You feel the world shifting again.


Scene 2 ? The Hall of Whispers
A corridor stretches forward, lined with six clocks ticking at different speeds.
At the end is a door labeled: SILENCE.
1. Walk straight to the SILENCE door.
2. Listen closely to each clock.
3. Break all the clocks.

Enter choice (1-3) or 'music': 

``` 
## 👉 Contributors 👈


<table>
<tr>
    <th> &nbsp; </th>
    <th> Name </th>
    <th> Role </th>
</tr>
<tr>
    <td><img src="images/Buenavista.jpg" width="100" height="100"> </td>
    <td><strong>Christian Paolo V. Buenavista</strong> <br/>
    <a href="https://github.com/PaoloBuenavista" target="_blank">
    <img src="https://img.shields.io/badge/GitHub-%23121011.svg?logo=github&logoColor=black" alt="PaoloBuenavista's Github">
        </a>
    <td>System Architect/Code debugger</td>
</tr>

<tr>
    <td><img src="images/Talagtag.jpg" width="100" height="100"> </td>
    <td><strong>Karl Andrei C. Talagtag</strong> <br/>
    <a href="https://github.com/DreiwanabeTexh" target="_blank">
    <img src="https://img.shields.io/badge/GitHub-%23121011.svg?logo=github&logoColor=blue" alt="DreiwanabeTexh's Github">
        </a>
    </td>
    <td>Project Leader/ File Handling Specialist</td>
</tr>
<tr>
    <td><img src="images/Villena.jpg" width="100" height="100"> </td>
    <td><strong>Kurt Andrei C. Villena</strong> <br/>
    <a href="https://github.com/andreiiiizz" target="_blank">
    <img src="https://img.shields.io/badge/GitHub-%23121011.svg?logo=github&logoColor=green" alt="andreiiiizz's Github">
        </a>
    </td>
    <td>Code debugger/Contributor</td>
</tr>
</table>

<h2> 🎖️ Acknowledgement 🎖️ </h2>
We would like to respectfully thank our *Object-Oriented Programming Instructor*, **Ms. **Fatima Marie Agdon**, for her advice and sharing of her expertise in **Object-Oriented Programming** (OOP) best practices and principles. We also thank our teammates for their collaboration, commitment, and hard work in finishing this task. 
