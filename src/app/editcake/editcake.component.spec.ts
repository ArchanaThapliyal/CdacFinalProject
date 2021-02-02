import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditcakeComponent } from './editcake.component';

describe('EditcakeComponent', () => {
  let component: EditcakeComponent;
  let fixture: ComponentFixture<EditcakeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditcakeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EditcakeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
