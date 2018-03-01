import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { JoinerResultComponent } from './joiner-result.component';

describe('JoinerResultComponent', () => {
  let component: JoinerResultComponent;
  let fixture: ComponentFixture<JoinerResultComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ JoinerResultComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(JoinerResultComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
