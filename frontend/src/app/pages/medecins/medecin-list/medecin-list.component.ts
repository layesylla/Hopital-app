import { Component, OnInit } from '@angular/core';
import { Router, RouterModule } from '@angular/router';
import { MedecinService, Medecin } from 'src/app/services/medecin.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-medecin-list',
  standalone: true,
  imports: [CommonModule,RouterModule,FormsModule],
  templateUrl: './medecin-list.component.html'
})
export class MedecinListComponent implements OnInit {
  medecins: Medecin[] = [];

  constructor(private service: MedecinService, public router: Router) {}

  ngOnInit(): void {
    this.service.getAll().subscribe(data => this.medecins = data);
  }

  delete(id: number) {
    if (confirm('Supprimer ce médecin ?')) {
      this.service.delete(id).subscribe(() => this.ngOnInit());
    }
  }
}
