# Hoplon markdown editor

An example hoplon page that implements a minimal live markdown editor.

Uses:

- [hoplon](https://www.github.com/hoplon/hoplon) - web app framework
- [boot](https://www.github.com/boot-clj/boot) - Clojure build framework
- [showdown](https://github.com/showdownjs/showdown) - markdown to html converter written in JS. Used from Clojurescript through [cljsjs](https://cljsjs.github.io/)
- [basscss](https://github.com/basscss/basscss) - low-level CSS toolkit

## Usage
Clone the repo and run `boot dev`. This will compile the hoplon page down to cljs and that to js. Open `file:///path/to/cloned/repo/target/index.html` in your favorite browser. The boot task starts a reloadable environment so any changes you make to the code will be instantly visible in the browser.

## Screenshot
![screenshot](../img/view.jpg)

## License (BSD3)
Copyright (c) 2015, Peter Nagy 

All rights reserved. 

Redistribution and use in source and binary forms, with or without 
modification, are permitted provided that the following conditions are met: 

 * Redistributions of source code must retain the above copyright notice, 
   this list of conditions and the following disclaimer. 
 * Redistributions in binary form must reproduce the above copyright 
   notice, this list of conditions and the following disclaimer in the 
   documentation and/or other materials provided with the distribution. 
 * Neither the name of Peter Nagy nor the names of its contributors may be 
   used to endorse or promote products derived from this software without 
   specific prior written permission. 

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE 
LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
POSSIBILITY OF SUCH DAMAGE. 