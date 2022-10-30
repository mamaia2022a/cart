import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';
import { MemIncActExpNflPage } from './memincactexpnfl.page';

describe('MemIncActExpNflPage', () => {
  let component: MemIncActExpNflPage;
  let fixture: ComponentFixture<MemIncActExpNflPage>;

  beforeEach(
    waitForAsync(() => {
      TestBed.configureTestingModule({
        declarations: [MemIncActExpNflPage],
        imports: [IonicModule.forRoot()],
      }).compileComponents();

      fixture = TestBed.createComponent(MemIncActExpNflPage);
      component = fixture.componentInstance;
      fixture.detectChanges();
    }),
  );

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
