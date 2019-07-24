CREATE TABLE notes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    description TEXT NOT NULL
);


CREATE TABLE tasks (
    id INT PRIMARY KEY AUTO_INCREMENT,
    task_name TEXT NOT NULL
    notes_id INT NOT NULL,
	
    FOREIGN KEY (notes_id) REFERENCES notes(id)
);
