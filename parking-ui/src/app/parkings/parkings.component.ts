import { Component, OnInit } from '@angular/core';
import { ParkingInfo } from '../parkinginfo';

@Component({
  selector: 'app-parkings',
  templateUrl: './parkings.component.html',
  styleUrls: ['./parkings.component.scss'],
})
export class ParkingsComponent implements OnInit {
  parkings: ParkingInfo[] = [];
  constructor() {}

  ngOnInit(): void {
    let parking1: ParkingInfo = {
      id: 1,
      nom: 'Parking 1',
      nbPlacesDispo: 150,
      nbPlacesTotal: 200,
      statut: 'OUVERT',
      heureMaj: '20h22',
    };
    let parking2: ParkingInfo = {
      id: 2,
      nom: 'Parking 2',
      nbPlacesDispo: 168,
      nbPlacesTotal: 302,
      statut: 'ABONNES',
      heureMaj: '20h22',
    };
    this.parkings.push(parking1);
    this.parkings.push(parking2);
  }
}
