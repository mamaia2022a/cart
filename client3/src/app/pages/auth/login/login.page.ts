import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { NavController, Platform } from '@ionic/angular';
import { Store } from '@ngxs/store';
import { LoginRequest } from '../../../../app/payloads/aut/LoginRequest';
import { AuthAction } from '../../../core/auth-guard/auth-guard.actions';

@Component({
  selector: 'app-login',
  templateUrl: './login.page.html',
  styleUrls: ['./login.page.scss'],
})
export class LoginPage implements OnInit {
  login: FormGroup;

  constructor(private store: Store, private navController: NavController, private platform: Platform) {}

  onLogin() {
    if (this.login.valid) {
      //const randomUserId = Math.floor(Math.random() * 100).toString();
      var loginRequest : LoginRequest = new LoginRequest();
      loginRequest.username = this.login.get("username").value;
      loginRequest.password = this.login.get("password").value;
      this.store.dispatch(new AuthAction.Login(loginRequest));
    }
  }

  ngOnInit(): void {
    this.login = new FormGroup({
      username: new FormControl('', [Validators.required]),
      password: new FormControl('', [Validators.required, Validators.minLength(5), Validators.maxLength(255)]),
    });
  }
}
