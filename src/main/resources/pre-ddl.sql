CREATE TABLE notes (
	id INT PRIMARY KEY AUTO_INCREMENT,
    description TEXT NOT NULL
);

CREATE TABLE notes_to_tasks (
	notes_id INT NOT NULL,
    tasks_id INT NOT NULL,

	FOREIGN KEY (notes_id) REFERENCES notes(id),
    FOREIGN KEY (tasks_id) REFERENCES tasks(id)
);

CREATE TABLE tasks (
	id INT PRIMARY KEY AUTO_INCREMENT,
    task_name TEXT NOT NULL
);