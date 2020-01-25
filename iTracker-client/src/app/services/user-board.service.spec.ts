import { TestBed } from '@angular/core/testing';

import { UserBoardService } from './user-board.service';

describe('UserBoardService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: UserBoardService = TestBed.get(UserBoardService);
    expect(service).toBeTruthy();
  });
});
