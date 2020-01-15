import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormArray } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  registerForm: FormGroup;

  constructor() { }

  ngOnInit() {
    this.registerForm = new FormGroup({
      name: new FormControl(null, [
        Validators.required,
        Validators.minLength(5),
        Validators.pattern('^[a-zA-Z]*$')
      ]),
      email: new FormControl(null, [
        Validators.required,
        Validators.minLength(8),
        Validators.email
      ]),
      password: new FormControl(null, [
        Validators.required,
        Validators.minLength(5),
        Validators.pattern('(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}')
      ]),
      age: new FormControl(null, [
        Validators.required,
        Validators.minLength(1),
        Validators.maxLength(3),
        Validators.pattern('[0-9]+')
      ]),
      skills: new FormArray([
        this.getSkill()
      ])
    });
  }

  // create form control object
  getSkill() {
    return new FormControl(null, [
      Validators.required,
      Validators.minLength(3)
    ]);
  }

  // add skill
  addSkill() {
    this.skills.push(this.getSkill());
  }

  // get the skill entry
  get skills(): FormArray {
    return this.registerForm.get('skills') as FormArray;
  }

  // remove skill
  removeSkill(i: number) {
    this.skills.removeAt(i);
  }

  get name() {
    return this.registerForm.get('name');
  }


  get email() {
    return this.registerForm.get('email');
  }

  get password() {
    return this.registerForm.get('password');
  }

  get age() {
    return this.registerForm.get('age');
  }


  register() {
    console.log(this.registerForm.value);
    this.registerForm.reset();
  }

}
