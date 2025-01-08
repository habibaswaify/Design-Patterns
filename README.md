# Design Patterns in Java

This repository contains examples of design patterns in Java, categorized into creational, structural, and behavioral
types. Each example is based on an AI-generated story problem, followed by my interpretation of the solution.

---

## Table of Contents:

1. [Creational Design Patterns](#1-creational-design-patterns)
    - [Factory](#factory)
    - [Abstract Factory](#abstract-factory)
    - [Builder](#builder)
    - [Prototype](#prototype)
    - [Singleton](#singleton)

2. [Structural Design Patterns](#2-structural-design-patterns)
    - [Composite](#composite)
    - [Adapter](#adapter)
    - [Proxy](#proxy)
    - [Flyweight](#flyweight)
    - [Facade](#facade)
    - [Bridge](#bridge)
    - [Decorator](#decorator)

3. [Behavioral Design Patterns](#3-behavioral-design-patterns)
    - [Observer](#observer)
    - [Iterator](#iterator)
    - [Strategy](#strategy)
    - [Chain of Responsibility](#chain-of-responsibility)

---

## 1. Creational Design Patterns:

- ### **Factory:**
    - **Story Problem:** Toy manufacturing process.
    - **Explanation:** A factory creates different toys (e.g., cars, dolls) based on input, without knowing the exact
      class type.

- ### **Abstract Factory:**
    - **Story Problem:** Video game design.
    - **Explanation:** Ensures related objects (e.g., input methods, sound formats) for various platforms are created
      together.

- ### **Builder:**
    - **Story Problem:** Pizza shop.
    - **Explanation:** Allows step-by-step construction of pizzas with customizable options.

- ### **Prototype:**
    - **Story Problem:** Interior design templates.
    - **Explanation:** New designs are cloned and customized from existing prototypes.

- ### **Singleton:**
    - **Story Problem:** Configuration manager.
    - **Explanation:** Ensures only one instance of a configuration object exists globally.

---

## 2. Structural Design Patterns:

- ### **Composite:**
    - **Story Problem:** Task management system.
    - **Explanation:** Uniformly treats individual tasks and projects, allowing recursive operations like marking
      completion or calculating total time.

- ### **Adapter:**
    - **Story Problem:** Integrating old and new payment systems.
    - **Explanation:** Converts credit card payments into digital wallet formats, enabling compatibility without
      modifying the old system.

- ### **Proxy:**
    - **Story Problem:** Online video streaming access control.
    - **Explanation:** A proxy checks user subscriptions before forwarding requests to the real service.

- ### **Flyweight:**
    - **Story Problem:** Managing cats in a shelter.
    - **Explanation:** Reuses existing instances of cats with the same breed to save memory.

- ### **Facade:**
    - **Story Problem:** Smart home control system.
    - **Explanation:** Simplifies managing multiple subsystems (e.g., lighting, temperature) via a unified interface.

- ### **Bridge:**
    - **Story Problem:** Universal remote control for devices.
    - **Explanation:** Decouples the remote control abstraction from device implementations, allowing flexibility and
      scalability.

- ### **Decorator:**
    - **Story Problem:** Customizing coffee orders.
    - **Explanation:** Enhances coffee objects (e.g., espresso, americano) with additional features (e.g., milk, whipped
      cream) dynamically without altering the base class.

---

## 3. Behavioral Design Patterns:

- ### **Observer:**
    - **Story Problem:** Weather station updates devices with real-time data.
    - **Explanation:** Observers (e.g., TVs, phones) register to receive updates from the weather station when data
      changes.

- ### **Iterator:**
    - **Story Problem:** A music player application needs to handle different types of playlists (e.g., small, large,
      auto-sorted).
    - **Explanation:** The Iterator pattern is used to traverse through different types of playlists (array, linked
      list, sorted set) without exposing the underlying data structure. Each playlist implements the `createIterator()`
      method to provide a standard way to iterate over the elements.

- ### **Strategy:**
    - **Story Problem:** A game with different characters (e.g., warrior, mage), each using various attack strategies.
    - **Explanation:** The Strategy pattern allows characters to change their attack behavior at runtime by setting
      different strategies (e.g., sword attack, throwing daggers, using a hammer).

- ### **Chain of Responsibility:**
    - **Story Problem:** A support system for a software company where issues are handled by different levels of
      support (e.g., junior, senior, expert).
    - **Explanation:** The Chain of Responsibility pattern allows requests to be passed along a chain of handlers, where
      each handler decides whether to process the request or pass it to the next handler in the chain.

