import { Component, OnInit } from '@angular/core';
import { AbstractControl, FormControl, FormGroup, ValidationErrors, Validators } from '@angular/forms';
import { AuthAction } from '../../../core/auth-guard/auth-guard.actions';
import { RegisterRequest } from '../../../payloads/aut/RegisterRequest';
import { NavController, Platform } from '@ionic/angular';
import { Store } from '@ngxs/store';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-register',
  templateUrl: './register.page.html',
  styleUrls: ['./register.page.scss'],
})
export class RegisterPage implements OnInit {
  register: FormGroup = new FormGroup(
    {
       username: new FormControl('', [Validators.required, Validators.minLength(5), Validators.maxLength(150)]),
       password: new FormControl('', [Validators.required, Validators.minLength(5), Validators.maxLength(150)]),
       passwordConfirm: new FormControl('', [Validators.required, Validators.minLength(5), Validators.maxLength(150)]),
       nume: new FormControl('', [Validators.required, Validators.maxLength(150)]),
       prenume: new FormControl('', [Validators.required, Validators.maxLength(150)]),
       telefon: new FormControl('', [Validators.required, Validators.maxLength(150)]),
       email: new FormControl('', [Validators.required, Validators.maxLength(150)]),
       sex: new FormControl('', [Validators.required, Validators.maxLength(150)]),
       domzonatara: new FormControl('', [Validators.required, Validators.maxLength(150)]),
       domjudet: new FormControl('', [Validators.required, Validators.maxLength(150)]),
       domlocalitate: new FormControl('', [Validators.required, Validators.maxLength(150)]),
       domcodpostal: new FormControl('', [Validators.required, Validators.maxLength(150)]),
       domadresa: new FormControl('', [Validators.required, Validators.maxLength(150)]),
    },
    { validators: this.passwordConfirmMatchValidator },
  );

  obsActionRegister: Observable<any>;

  constructor(private store: Store, private navController: NavController, private platform: Platform) 
  {}

  onRegister() {
    if (this.register.valid) {
      console.log(this.register.value);
      var registerRequest : RegisterRequest = new RegisterRequest();
      registerRequest.username         = this.register.get("username").value;
      registerRequest.password         = this.register.get("password").value;
      registerRequest.nume             = this.register.get("nume").value;
      registerRequest.prenume          = this.register.get("prenume").value;
      registerRequest.telefon          = this.register.get("telefon").value;
      registerRequest.email            = this.register.get("email").value;
      registerRequest.sex              = this.register.get("sex").value;
      registerRequest.domZonataraid    = this.register.get("domzonatara").value;
      registerRequest.domJudetid       = this.register.get("domjudet").value;
      registerRequest.domLocalitateid  = this.register.get("domlocalitate").value;
      registerRequest.domCodpostal     = this.register.get("domcodpostal").value;
      registerRequest.domAdresa        = this.register.get("domadresa").value;

      this.obsActionRegister = this.store.dispatch(new AuthAction.Register(registerRequest));
      /** 
      this.obsActionRegister.subscribe(
        info => {
          console.log('REGISTER: ' + info);
        },
        error => {
          console.log('REGISTER ERROR: ' + error);
        }
      );*/

    }
  }

  ngOnInit(): void {}

  passwordConfirmMatchValidator(g: AbstractControl): ValidationErrors | null {
    const password = g.get('password');
    const passwordConfirm = g.get('passwordConfirm');

    if (passwordConfirm.hasError('required') || passwordConfirm.hasError('minlength')) {
      return;
    }

    if (password.value !== passwordConfirm.value) {
      passwordConfirm.setErrors({
        mismatch: true,
      });
    } else {
      passwordConfirm.setErrors(null);
    }
  }
 

  /**
  authUrl = "https://sampleapi.herokuapp.com"
  authHeaders;

  getToken() {
  this.storage.get('token').then((token) => {
    console.log('Bearer ' + token);
    this.authHeaders = {
      headers: new HttpHeaders({
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer ' + token
      })
  }
  });
  }

  getInfo(): Observable<Info> {
  return this.http.get<Info>(this.authUrl + '/api/users/info', this.authHeaders).pipe(
    catchError(this.handleError)
  );
  }

  ionViewDidLoad() {
    this._dashboardService.getToken();
    this._dashboardService.getInfo().subscribe(
      info => {
        console.log('USER INFO: ' + info);
        this.info = info
      },
      error => {
        console.log('INFO ERROR: ' + error);
      }
    );
    }
    */
}
