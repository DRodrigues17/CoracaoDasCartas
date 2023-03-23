import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HistoriaDoJogoComponent } from './historia-do-jogo.component';

describe('HistoriaDoJogoComponent', () => {
  let component: HistoriaDoJogoComponent;
  let fixture: ComponentFixture<HistoriaDoJogoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HistoriaDoJogoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HistoriaDoJogoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
