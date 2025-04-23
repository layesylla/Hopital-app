// src/app/pages/materiels/materiel-list/materiel-list.component.ts
import { Component, OnInit } from '@angular/core';
import { MaterielService, Materiel } from 'src/app/services/materiel.service';
import { RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-materiel-list',
  standalone: true,
  imports: [CommonModule,RouterModule ,RouterModule],
  templateUrl: './materiel-list.component.html'
})
export class MaterielListComponent implements OnInit {
  materiels: Materiel[] = [];

  constructor(private service: MaterielService) {}

  ngOnInit(): void {
    this.load();
  }

  load() {
    this.service.getAll().subscribe(data => this.materiels = data);
  }

  delete(id: number) {
    if (confirm('Supprimer ce matériel ?')) {
      this.service.delete(id).subscribe(() => this.load());
    }
  }
}
