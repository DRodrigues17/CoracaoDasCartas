import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ComoJogarComponent } from './como-jogar.component';

describe('ComoJogarComponent', () => {
  let component: ComoJogarComponent;
  let fixture: ComponentFixture<ComoJogarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ComoJogarComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ComoJogarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
