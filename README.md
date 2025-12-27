# Appium Android Automation Framework

## Purpose

This repository demonstrates a **production-oriented mobile automation framework**
built using **Appium** for **native Android applications**.

The framework focuses on **stable, maintainable Android UI automation**
that can be executed locally or integrated into CI pipelines.

---

## What This Project Covers

The automation validates **core native Android behaviors**, including:
- App launch and navigation
- Interaction with native UI elements
- User-driven flows executed on Android emulators or devices
- Repeatable execution across test runs

The emphasis is on **framework structure and test stability**, not application coverage.

---

## Tooling

- **Appium**
- **Java**
- **TestNG**
- **Page Object Model (POM)**
- Android Emulator / Android Device
- CI-compatible execution

---

## Core Design Principles

- **Clear separation of test logic and UI interaction**
- **Reusable Page Object design**
- **Stable Android locator strategies**
- **Deterministic execution**
- **CI-friendly setup**

These principles reduce flakiness and long-term maintenance cost.

---

## Architecture Overview

### Base Test Layer
- Manages Appium driver lifecycle
- Handles Android capabilities and initialization
- Centralizes setup and teardown logic

### Page Objects
- Encapsulate Android UI locators and actions
- Keep UI logic isolated from test orchestration
- Avoid embedding assertions or test flow

### Test Layer
- Defines user-centric Android scenarios
- Orchestrates actions via Page Objects
- Expresses intent, not implementation details

---

## Example Test Flow

1. Launch Android application  
2. Navigate through primary screens  
3. Perform user actions (tap, input, scroll)  
4. Validate expected behavior  
5. Close application  

Tests focus on **user behavior**, not internal application state.

---

## Android Locator Strategy

- Prefer **accessibility IDs** where available
- Use **resource-id** over XPath
- Avoid brittle locators tied to layout structure
- Centralize locator definitions per screen

Stable locators are critical for Android automation reliability.

---

## Running the Tests

```bash
mvn clean test
