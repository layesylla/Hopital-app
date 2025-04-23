// src/app/pages/materiels/materiel-form/materiel-form.component.ts
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router, RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { MaterielService, Materiel } from 'src/app/services/materiel.service';

@Component({
  selector: 'app-materiel-form',
  standalone: true,
  imports: [CommonModule, FormsModule, RouterModule],
  templateUrl: './materiel-form.component.html'
})
export class MaterielFormComponent implements OnInit {
  materiel: Materiel = { nom: '', quantite: 0 };
  isEdit = false;

  constructor(
    private service: MaterielService,
    private route: ActivatedRoute,
    private router: Router
  ) {}

  ngOnInit(): void {
    const id = this.route.snapshot.paramMap.get('id');
    if (id) {
      this.isEdit = true;
      this.service.get(+id).subscribe(m => this.materiel = m);
    }
  }

  onSubmit() {
    if (this.isEdit) {
      this.service.update(this.materiel.id!, this.materiel).subscribe(() => this.router.navigate(['/materiels']));
    } else {
      this.service.add(this.materiel).subscribe(() => this.router.navigate(['/materiels']));
    }
  }
}
