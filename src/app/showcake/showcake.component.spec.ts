import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowcakeComponent } from './showcake.component';

describe('ShowcakeComponent', () => {
  let component: ShowcakeComponent;
  let fixture: ComponentFixture<ShowcakeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShowcakeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowcakeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
