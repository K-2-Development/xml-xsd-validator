import { ComponentFixture, TestBed } from '@angular/core/testing';

import { XsdListItemComponent } from './xsd-list-item.component';

describe('XsdListItemComponent', () => {
  let component: XsdListItemComponent;
  let fixture: ComponentFixture<XsdListItemComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ XsdListItemComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(XsdListItemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
