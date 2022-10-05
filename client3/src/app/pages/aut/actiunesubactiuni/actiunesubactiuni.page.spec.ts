import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';
import { ActiuneSubactiuniPage } from './actiunesubactiuni.page';

describe('ActiuneSubactiuniPage', () => {
  let component: ActiuneSubactiuniPage;
  let fixture: ComponentFixture<ActiuneSubactiuniPage>;

  beforeEach(
    waitForAsync(() => {
      TestBed.configureTestingModule({
        declarations: [ActiuneSubactiuniPage],
        imports: [IonicModule.forRoot()],
      }).compileComponents();

      fixture = TestBed.createComponent(ActiuneSubactiuniPage);
      component = fixture.componentInstance;
      fixture.detectChanges();
    }),
  );

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
