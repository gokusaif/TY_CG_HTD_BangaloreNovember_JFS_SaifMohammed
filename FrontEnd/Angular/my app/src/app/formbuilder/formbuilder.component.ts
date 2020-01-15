import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormArray, FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-formbuilder',
  templateUrl: './formbuilder.component.html',
  styleUrls: ['./formbuilder.component.css']
})
export class FormbuilderComponent implements OnInit {

  registerForm: FormGroup;

  constructor( private fb: FormBuilder) { }

  ngOnInit() {
    this.registerForm = this.fb.group ({
      name: this.fb.control (null, [
        Validators.required,
        Validators.minLength(5),
        Validators.pattern('^[a-zA-Z]*$')
      ]),
      email: this.fb.control(null, [
        Validators.required,
        Validators.minLength(8),
        Validators.email
      ]),
      password: this.fb.control(null, [
        Validators.required,
        Validators.minLength(5),
        Validators.pattern('(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}')
      ]),
      age: this.fb.control(null, [
        Validators.required,
        Validators.minLength(1),
        Validators.maxLength(3),
        Validators.pattern('[0-9]+')
      ]),
      skills: this.fb.array ([
        this.getSkill()
      ])
    });
  }

  // create form control object
  getSkill() {
    return this.fb.control (null, [
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
