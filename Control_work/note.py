import json
import os.path
import datetime


def add_note():
    """Добавление новой заметки."""
    title = input("Введите заголовок заметки: ")
    body = input("Введите тело заметки: ")
    timestamp = datetime.datetime.now().strftime("%Y-%m-%d %H:%M:%S")
    note = {
        "id": len(notes) + 1,
        "title": title,
        "body": body,
        "timestamp": timestamp,
    }
    notes.append(note)
    save_notes()
    print("Заметка успешно сохранена.")
    
def save_notes():
    """Сохранение списка заметок в файл."""
    with open(FILENAME, "w") as f:
        json.dump(notes, f)
        
def load_notes():
    """Загрузка списка заметок из файла."""
    if os.path.isfile(FILENAME):
        with open(FILENAME, "r") as f:
            return json.load(f)
    else:
        return []
    
def read_notes():
    """Чтение списка заметок."""
    filter_date = input("Введите дату для фильтрации (в формате ГГГГ-ММ-ДД): ")
    if filter_date:
        filtered_notes = [note for note in notes if note["timestamp"].startswith(filter_date)]
    else:
        filtered_notes = notes
    if filtered_notes:
        for note in filtered_notes:
            print(f"{note['id']}: {note['title']}\n{note['body']}\n{note['timestamp']}\n")
    else:
        print("Заметок не найдено.")
        
def edit_note():
    """Редактирование существующей заметки."""
    note_id = input("Введите ID заметки, которую нужно отредактировать: ")
    for note in notes:
        if str(note["id"]) == note_id:
            title = input("Введите новый заголовок заметки: ")
            body = input("Введите новое тело заметки: ")
            note["title"] = title
            note["body"] = body
            note["timestamp"] = datetime.datetime.now().strftime("%Y-%m-%d %H:%M:%S")
            save_notes()
            print("Заметка успешно отредактирована.")
            break
    else:
        print("Заметка не найдена.")
        
def delete_note():
    """Удаление существующей заметки."""
    note_id = input("Введите ID заметки, которую нужно удалить: ")
    for note in notes:
        if str(note["id"]) == note_id:
            notes.remove(note)
            save_notes()
            print("Заметка успешно удалена.")
            break
    else:
        print("Заметка не найдена.")
        
FILENAME = "notes.json"
notes = load_notes()

while True:
    command = input("Введите команду (add, read, edit, delete, exit): ")
    if command == "add":
        add_note()
    elif command == "read":
        read_notes()
    elif command == "edit":
        edit_note()
    elif command == "delete":
        delete_note()
    elif command == "exit":
        break
    else:
        print("Неверная команда.")