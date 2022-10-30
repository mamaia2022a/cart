import { Component, OnDestroy } from '@angular/core';
import { SplashScreen } from '@capacitor/splash-screen';
import { Platform } from '@ionic/angular';
import { TranslateService } from '@ngx-translate/core';
import { Select } from '@ngxs/store';
import { Observable } from 'rxjs';
import { Storage } from '@ionic/storage';
import { IonicStorageModule } from '@ionic/storage-angular';
//import { selectIsDarkMode } from './pages/settings/settings.selectors';

@Component({
  selector: 'app-root',
  templateUrl: 'app.component.html',
  styleUrls: ['app.component.scss'],
})
export class AppComponent implements OnDestroy {
  //@Select(selectIsDarkMode()) isDarkMode$: Observable<boolean>;
  constructor(private platform: Platform, private translateService: TranslateService, private storage: Storage ) {
    this.initializeApp();
  }

  initializeApp() {
    var self = this;
    this.platform.ready().then(() => {
      SplashScreen.hide();
      this.storage.create().then((value) => 
      {
        this.storage.clear().then((value) => 
        {
          
          console.log("App init")
        });          
      });
    });
  }
   

  ngOnDestroy() {
    this.storage.clear().then((value) => 
    {
      location.reload();
      console.log("App exit")
    });
    
  }

}

