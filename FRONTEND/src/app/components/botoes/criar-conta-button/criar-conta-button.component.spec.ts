import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CriarContaButtonComponent } from './criar-conta-button.component';

describe('ButtonComponent', () => {
  let component: CriarContaButtonComponent;
  let fixture: ComponentFixture<CriarContaButtonComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CriarContaButtonComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CriarContaButtonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
