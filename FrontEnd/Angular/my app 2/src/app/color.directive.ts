import { Directive, ElementRef, Renderer2, HostListener, HostBinding } from '@angular/core';

@Directive({
  selector: '[appColor]'
})
export class ColorDirective {

  @HostBinding('style.background') backgroundColor: string;
  @HostBinding('style.color') colorText: string;

  constructor(private el: ElementRef, private renderer: Renderer2) {
    // this.el.nativeElement.style.background = 'blue';
    // let h1 = this.renderer.createElement('h1');
    // let text = this.renderer.createText('Custom Directive');
    // this.renderer.appendChild(h1, text);
    // this.renderer.appendChild(this.el.nativeElement, h1);
  }

@HostListener('mouseenter')
x() {
  // this.el.nativeElement.style.background = '#ccc';
  this.backgroundColor = '#ccc';
  this.colorText = 'black';
  this.el.nativeElement.style.fontSize = '20px';
}

@HostListener('mouseleave')
y() {
  this.backgroundColor = 'lightblue';
  this.colorText = 'black';
  this.el.nativeElement.style.fontSize = '20px';
}



}

