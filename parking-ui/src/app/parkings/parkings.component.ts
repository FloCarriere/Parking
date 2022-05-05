import { Component, OnInit } from '@angular/core';
import { ParkingService } from '../parking.service';
import { ParkingInfo } from '../parkinginfo';

@Component({
  selector: 'app-parkings',
  templateUrl: './parkings.component.html',
  styleUrls: ['./parkings.component.scss'],
})
export class ParkingsComponent implements OnInit {
  parkings: ParkingInfo[] = [];
  constructor(private parkingService: ParkingService) {}

  ngOnInit(): void {
    this.parkingService.getParking().subscribe((reponse) => {
      this.parkings = reponse;
    });
  }
}
