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
    
    