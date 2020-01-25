import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { PhaseComponent } from './phase/phase.component';
import { UserBoardComponent } from './user-board/user-board.component';


const routes: Routes = [
  { path: 'dashboard', component: DashboardComponent },
  { path: 'phase', component: PhaseComponent },
  { path: 'board', component: UserBoardComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
