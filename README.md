# 💧 Java Water Tank Monitoring System

A Java Swing-based desktop application developed to demonstrate the **Observer Design Pattern** and core Object-Oriented Programming (OOP) principles through real-time water level monitoring.

## 📌 Project Overview

The Water Tank Monitoring System allows users to adjust a water level using an interactive slider. Changes are automatically communicated to registered observer components, which update their displays and alarm statuses.

The application demonstrates how objects can communicate through the Observer Design Pattern while maintaining separation between the monitoring logic and graphical user interfaces.

## ✨ Key Features

- **Interactive Water Level Control:** Adjust the water level using a Java Swing JSlider.
- **Real-Time Updates:** Automatically notify registered observers when the water level changes.
- **Alarm Notifications:** Activate or deactivate the alarm based on a water level threshold of 50.
- **Water Level Display:** Display updated water levels and their status.
- **Multiple GUI Windows:** Separate windows for water level control, monitoring, and alarm notifications.
- **Dynamic Observer Management:** Use ArrayList to manage observer objects.

## 🛠️ Technologies Used

- Java
- Java Swing
- NetBeans IDE
- Git & GitHub

## 🧠 Programming Concepts

### Observer Design Pattern
The `WaterLevelObservable` class manages observers and notifies them whenever the water level changes.

### Object-Oriented Programming
Uses classes, objects, inheritance, encapsulation, and method overriding to organize the application's functionality.

### Inheritance and Polymorphism
Observer windows extend a shared observer class and provide their own implementations of the `update()` method.

### ArrayList
Maintains a collection of observer objects that receive water level notifications.

### Event-Driven Programming
Uses Java Swing event listeners to respond to slider movements and update the application.

## 🔄 How the System Works

1. The user adjusts the water level using JSlider.
2. The WaterTank window sends the updated value to WaterLevelObservable.
3. WaterLevelObservable notifies its registered observers.
4. The Display window updates its water level information.
5. The Alarm window activates or deactivates the alarm depending on the water level.

## ▶️ How to Run

**Requirements:**
- Java Development Kit (JDK)
- Apache NetBeans IDE

**Instructions:**

1. Clone or download this repository.
2. Open Apache NetBeans.
3. Select **File → Open Project**.
4. Select the downloaded `Java-Water-Tank-Monitoring-System` project folder.
5. Build and run the project using NetBeans.

## 📚 What I Learned

Through this project, I gained practical experience in:

- Implementing the Observer Design Pattern.
- Applying inheritance, polymorphism, and method overriding.
- Managing objects dynamically using ArrayList.
- Developing interactive Java Swing GUIs.
- Understanding event-driven programming.
- Improving code organization and problem-solving skills.

## 🚀 Future Improvements

- Adding a visual tank filling animation.
- Introducing configurable alarm thresholds.
- Recording water level history.
- Improving the graphical user interface.

## 📄 Project Purpose

This mini project was developed for educational purposes to strengthen Java programming, Object-Oriented Programming, and software design pattern knowledge.
