# Assignment 4 — JavaScript Interactive Web App

## Part A — Home Page & Theme Toggle (Aibyn)

In this part I implemented the **Home.html** page and a global **theme switching system** using JavaScript and CSS.

### 1. Crime Scene Mode
A button toggles a `crime-scene` class on the `<body>` element, changing background and colors dynamically:

```js
function toggleCrimeScene() {
  document.body.classList.toggle('crime-scene');
}
```

This demonstrates DOM manipulation and event handling.

### 2. Theme Switcher
The light/dark theme button triggers a function that updates the `data-bs-theme` attribute and stores user preference in **localStorage**:

```js
function toggleTheme() {
  const current = document.documentElement.getAttribute('data-bs-theme');
  const next = current === 'dark' ? 'light' : 'dark';
  document.documentElement.setAttribute('data-bs-theme', next);
  localStorage.setItem('theme', next);
}
```

When the page loads, the script retrieves the saved theme and applies it automatically.

### 3. Date & Time Display
The page displays the current time, updated every second with `setInterval()`:

```js
setInterval(() => {
  const now = new Date();
  document.getElementById('timestamp').textContent = now.toLocaleString();
}, 1000);
```

This part demonstrates **working with Date objects**, **timers**, and **text updates in DOM**.

---

## Part B — Case Files (To-Do List) (Farkhad)

In this part I developed a dynamic **To‑Do List** system on the Case_Files.html page.

### 1. Adding Tasks
Users can add new tasks through an input field. Empty submissions are blocked with an alert:

```js
function addTask() {
  const input = document.getElementById('taskInput');
  const taskText = input.value.trim();
  if (!taskText) {
    alert('Please enter a task.');
    return;
  }
  const li = document.createElement('li');
  li.textContent = taskText;
  // Add buttons for done/delete
  ...
}
```

### 2. Marking and Deleting
Each list item includes buttons for marking as done and deleting. Events are delegated efficiently:

```js
ul.addEventListener('click', (e) => {
  if (e.target.classList.contains('done')) {
    e.target.parentElement.classList.toggle('completed');
  } else if (e.target.classList.contains('delete')) {
    e.target.parentElement.remove();
  }
});
```

### 3. Result
The To‑Do List demonstrates **dynamic DOM creation**, **class toggling**, and **event delegation** in JavaScript.

---

## Part C — Analysis Tools & Form Validation (Assem)

### 1. Number Sorting Tool (Analysis.html)
This page allows the user to input comma‑separated numbers and sort them ascending or descending.

```js
function sortNumbers(order) {
  const input = document.getElementById('numbers').value;
  const nums = input.split(',').map(n => parseFloat(n.trim())).filter(n => !isNaN(n));
  const sorted = order === 'asc' ? nums.sort((a,b) => a - b) : nums.sort((a,b) => b - a);
  document.getElementById('result').textContent = sorted.join(', ');
}
```

This demonstrates **array parsing**, **filtering**, and **sorting with comparators**.

### 2. Threat Level Calculator (optional part)
The same page includes a simple calculator that outputs textual evaluation (e.g., “Low”, “Medium”, “High”) depending on input.

### 3. Form Validation (Form.html)
A login form simulates “Access Terminal” authentication with full validation logic:

```js
form.addEventListener('submit', (event) => {
  event.preventDefault();
  const name = nameInput.value.trim();
  const email = emailInput.value;
  const pass = passwordInput.value;
  const confirm = confirmInput.value;

  if (!name || !email.includes('@') || pass.length < 6 || pass !== confirm) {
    alert('Invalid input. Please check your data.');
    return;
  }
  alert(`Access Granted, Agent ${name}`);
});
```

This demonstrates **form event handling**, **string validation**, and **DOM feedback**.

---

## Part D — Styling & Integration

The **profiles.css** file defines global colors, spacing, and component styling.  
Theme compatibility is ensured with `data-bs-theme` and CSS variables.  
All HTML pages share consistent navigation and theme behavior.

---

## Deployment

The project runs locally — just open **Home.html** in a browser.  
No backend or server setup is required.  
All functionality is implemented in pure HTML/CSS/JavaScript.

---

## Conclusion

Each part covers separate JavaScript fundamentals:
- **DOM manipulation** (toggle, create, update, delete elements);
- **Event handling** (clicks, submit, timers);
- **Array and string operations**;
- **Local storage for persistence**;
- **Dynamic interface updates**.

Together these pages form a cohesive interactive web app demonstrating client‑side programming principles.
