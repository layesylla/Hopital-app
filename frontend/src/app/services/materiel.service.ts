// src/app/services/materiel.service.ts
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

export interface Materiel {
  id?: number;
  nom: string;
  quantite: number;
}

@Injectable({ providedIn: 'root' })
export class MaterielService {
  private apiUrl = `${environment.apiUrl}/materiels`;

  constructor(private http: HttpClient) {}

  getAll(): Observable<Materiel[]> {
    return this.http.get<Materiel[]>(this.apiUrl);
  }

  get(id: number): Observable<Materiel> {
    return this.http.get<Materiel>(`${this.apiUrl}/${id}`);
  }

  add(m: Materiel): Observable<Materiel> {
    return this.http.post<Materiel>(this.apiUrl, m);
  }

  update(id: number, m: Materiel): Observable<Materiel> {
    return this.http.put<Materiel>(`${this.apiUrl}/${id}`, m);
  }

  delete(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}
