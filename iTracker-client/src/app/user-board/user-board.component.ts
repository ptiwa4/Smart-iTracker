import { Component, OnInit } from '@angular/core';
import { UserBoardService } from '../services/user-board.service';
import { Board } from '../model/Board';

@Component({
  selector: 'app-user-board',
  templateUrl: './user-board.component.html',
  styleUrls: ['./user-board.component.css']
})
export class UserBoardComponent implements OnInit {
  board: Board;

  constructor(private userBoardService: UserBoardService) { }

  ngOnInit() {
    this.userBoardService.getAll().subscribe(data => {
      this.board = data;
    });
  }

}
