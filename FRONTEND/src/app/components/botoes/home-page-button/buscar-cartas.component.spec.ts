import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BuscarCartasComponent } from '././buscar-cartas.component';

describe('HomePageButtonComponent', () => {
  let component: BuscarCartasComponent;
  let fixture: ComponentFixture<BuscarCartasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BuscarCartasComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BuscarCartasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
