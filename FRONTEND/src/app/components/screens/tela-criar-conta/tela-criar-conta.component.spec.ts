import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TelaCriarContaComponent } from './tela-criar-conta.component';

describe('TelaCriarContaComponent', () => {
  let component: TelaCriarContaComponent;
  let fixture: ComponentFixture<TelaCriarContaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TelaCriarContaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TelaCriarContaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
