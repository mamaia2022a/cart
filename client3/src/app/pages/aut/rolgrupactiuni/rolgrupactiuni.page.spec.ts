import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';
import { RolGrupActiuniPage } from './rolgrupactiuni.page';

describe('RolGrupActiuniPage', () => {
  let component: RolGrupActiuniPage;
  let fixture: ComponentFixture<RolGrupActiuniPage>;

  beforeEach(
    waitForAsync(() => {
      TestBed.configureTestingModule({
        declarations: [RolGrupActiuniPage],
        imports: [IonicModule.forRoot()],
      }).compileComponents();

      fixture = TestBed.createComponent(RolGrupActiuniPage);
      component = fixture.componentInstance;
      fixture.detectChanges();
    }),
  );

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
