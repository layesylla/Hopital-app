import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { NoteMedicale } from '../pages/notes/note.model';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class NoteService {
  private apiUrl = `${environment.apiUrl}/notes`;  

  constructor(private http: HttpClient) {}

  getNotes(): Observable<NoteMedicale[]> {
    return this.http.get<NoteMedicale[]>(this.apiUrl);
  }

  getNote(id: number): Observable<NoteMedicale> {
    return this.http.get<NoteMedicale>(`${this.apiUrl}/${id}`);
  }

  addNote(note: NoteMedicale): Observable<NoteMedicale> {
    return this.http.post<NoteMedicale>(this.apiUrl, note);
  }

  updateNote(id: number, updated: NoteMedicale): Observable<NoteMedicale> {
    return this.http.put<NoteMedicale>(`${this.apiUrl}/${id}`, updated);
  }

  deleteNote(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}
