# To-Do App — Java Swing

## Overview

This project is a simple **To-Do List desktop application** developed using **Java Swing**. It allows users to add tasks, view them in a list, and delete selected tasks.

This project was developed as part of **Task 6: Java GUI – ToDo App** of the Java Developer Internship. The task focuses on desktop GUI development using Java Swing, event handling, and layout managers. 

## Features

* Add new tasks
* Display multiple tasks in a list
* Delete selected tasks
* Scroll through the task list
* Press **Enter** to add a task
* Warning message for empty tasks
* Warning message when trying to delete without selecting a task

## Technologies Used

* **Java**
* **Java Swing**
* **JFrame**
* **JPanel**
* **JTextField**
* **JButton**
* **JList**
* **DefaultListModel**
* **JScrollPane**
* **ActionListener**
* **BorderLayout**

No external libraries are required because Swing is built into Java.

## Project Structure

```text
Todo-App/
│
├── TodoApp.java
└── README.md
```

## How to Run

### 1. Clone the repository

```bash
git clone YOUR_GITHUB_REPOSITORY_URL
```

### 2. Navigate to the project folder

```bash
cd Todo-App
```

### 3. Compile the Java file

```bash
javac TodoApp.java
```

### 4. Run the application

```bash
java TodoApp
```

## How to Use

1. Enter a task in the text field.
2. Click **Add Task** or press **Enter**.
3. The task will appear in the task list.
4. Select a task from the list.
5. Click **Delete Selected Task** to remove it.

## Application Logic

```text
Start Application
       ↓
Enter Task
       ↓
Click "Add Task"
       ↓
Is Task Empty?
   ↙           ↘
 Yes            No
  ↓              ↓
Show Warning   Add Task
                 ↓
             Display List
                 ↓
          Select a Task
                 ↓
             Delete Task
                 ↓
           Update List
```

## Concepts Learned

### Swing

Swing is used to create the graphical user interface of the application.

### Event Handling

`ActionListener` is used to respond to button clicks and the Enter key.

### Layout Management

`BorderLayout` is used to organize the input field, buttons, and task list.

### JScrollPane

The task list is placed inside a `JScrollPane` so that multiple tasks can be viewed even when the list becomes longer.

### DefaultListModel

`DefaultListModel` manages the tasks displayed by the `JList`.

## Future Improvements

Possible improvements include:

* Mark tasks as completed
* Edit existing tasks
* Add task priorities
* Add due dates
* Save tasks to a file
* Load tasks when the application starts
* Add dark/light themes
* Add task categories

## Author

**Soha Sayyad**

Java Developer Internship — Task 6
