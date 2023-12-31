﻿# SDP_Final_Project
Class Descriptions:

Alchemist Class: The Alchemist class implements the Character interface and represents a character with a poisoned sword. The alchemist has specific attributes, including health and a unique name. The class also includes methods for calculating damage, accessing health, retrieving the character's name, and obtaining information about the character's sword. Additionally, the alchemist can handle events related to other characters, such as displaying their health.

AlchemistFactory Class: The AlchemistFactory class implements the CharacterFactory interface and is responsible for creating instances of the Alchemist class. This factory follows the factory method pattern, providing a way to instantiate alchemist characters without exposing the details of their construction.

ArrowControl Interface: The ArrowControl interface declares methods for arrow-based character control, including movements in different directions: up, down, left, and right.

ArrowControlAdapter Class: The ArrowControlAdapter class implements the ArrowControl interface and adapts it to work with a different control system represented by the WasdPersonControl class. This adapter allows the use of arrow key controls in a context where WasdPersonControl is expected.

Character Interface: The Character interface defines methods that represent various aspects of a character, including attributes related to damage, health, name, and weaponry. It also includes a method for handling events related to other characters.

CharacterFactory Interface: The CharacterFactory interface declares a factory method for creating instances of the Character interface or its implementing classes. This interface follows the factory method pattern, allowing for the creation of different types of characters through the same interface.

GameLogger Class: The GameLogger class represents a simple logging mechanism for the game, following the singleton design pattern to ensure a single, globally accessible instance of the logger. It includes methods for obtaining the logger instance and logging messages to the console.

GoldenKnight Class: The GoldenKnight class implements the Character interface and represents a character named "Adlet," specifically a golden knight with unique attributes and behaviors related to damage, health, and weaponry. The golden knight wields a reinforced sword.

GoldenKnightFactory Class: The GoldenKnightFactory class implements the CharacterFactory interface and is responsible for creating instances of the GoldenKnight class. This factory follows the factory method pattern, providing a way to instantiate golden knight characters without exposing the details of their construction.

HandFighter Class: The HandFighter class implements the Character interface and represents a character named "Raiymbek," specifically a hand-to-hand fighter with unique attributes and behaviors related to damage, health, and weaponry.

HandFighterFactory Class: The HandFighterFactory class implements the CharacterFactory interface and is responsible for creating instances of the HandFighter class. This factory follows the factory method pattern, providing a way to instantiate hand-to-hand fighter characters without exposing the details of their construction.

HealthDisplay Class: The HealthDisplay class implements the Observed interface and represents a component responsible for managing and displaying the health of a character. It utilizes the observer design pattern to notify and update observers (other characters) about changes in the health of the observed character.

Knight Class: The Knight class implements the Character interface and represents a character named "Temirlan," specifically a knight with unique attributes and behaviors related to damage, health, and weaponry. The knight wields a simple sword.

KnightFactory Class: The KnightFactory class implements the CharacterFactory interface and is responsible for creating instances of the Knight class. This factory follows the factory method pattern, providing a way to instantiate knight characters without exposing the details of their construction.

Main Class: The Main class serves as the entry point for the application. It demonstrates the usage of various classes, including creating instances of characters, factories, and initiating an attack scenario. The Main class also utilizes the GameLogger for logging messages.

PoisonSwordDecorator Class: The PoisonSwordDecorator class implements the SwordDecorator interface and decorates another SwordDecorator with a poison effect. This class enhances the damage and description of a sword by adding poison attributes.

ReinforcedSwordDecorator Class: The ReinforcedSwordDecorator class implements the SwordDecorator interface and decorates another SwordDecorator with a reinforcement effect. This class enhances the damage and description of a sword by adding reinforcement attributes.

SimpleSword Class: The SimpleSword class implements the `SwordDecorator interface and represents a basic sword without any additional decorations. This class provides a baseline for other sword decorators.

WasdPersonControl Class: The WasdPersonControl class encapsulates the control logic for a character using the "W," "A," "S," and "D" keys. It provides methods for moving the character in different directions. This class is part of the user input system for character movement.

Main Project Overview: The project brings together a variety of classes to create a character-based simulation or game. Characters can have different roles, such as alchemists, golden knights, and hand-to-hand fighters, each with unique attributes and behaviors. The use of design patterns, such as the decorator pattern for swords and the observer pattern for health display, contributes to a modular and extensible codebase.

The factory method pattern is employed for creating instances of characters, allowing for the addition of new character types without modifying existing code. The project also incorporates a logging mechanism using the singleton pattern through the GameLogger class.

User input for character control is handled by the WasdPersonControl class, providing a basic interface for movement using the "W," "A," "S," and "D" keys. The ArrowControl interface and ArrowControlAdapter class facilitate the adaptation of arrow-based controls to the existing control system.

The project exhibits a well-structured and modular design, promoting code reusability and maintainability. Each class has a specific role in the overall functionality of the system, contributing to a cohesive and organized codebase.

UML Diagram
![image](https://github.com/TemirlanBakytbekov/SDP_Final_Project/assets/123005454/edcd2c2b-3a28-4c4d-8ad8-e2473985a637)
