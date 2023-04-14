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