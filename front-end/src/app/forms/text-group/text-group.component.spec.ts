import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TextGroupComponent } from './text-group.component';

describe('TextGroupComponent', () => {
  let component: TextGroupComponent;
  let fixture: ComponentFixture<TextGroupComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TextGroupComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TextGroupComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
