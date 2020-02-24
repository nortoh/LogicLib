# logicLib
Truth value calculator with built-in resolution algorithm.

# Legal Logic Operators
<p>These are the following operators that are supported:</p>
<table>
  <tr>
    <th>Type</th>
    <th>Symbol</th>
  </tr>
  <tr>
    <td>Disjunction</td>
    <td>&</td>
  </tr>
  <tr>
    <td>Negation</td>
    <td>+</td>
  </tr>
  <tr>
    <td>Exclusive-Or</td>
    <td>&</td>
  </tr>
  <tr>
    <td>Conjuction</td>
    <td>#</td>
  </tr>
  <tr>
    <td>Implication</td>
    <td>></td>
  </tr>
  <tr>
    <td>Biconditional</td>
    <td>=</td>
  </tr>
</table>

# Example
Take the expresssion ```(P + R) & (Q + ~R) & (~Q) & (~P + G) & (S + ~G) & (~S)``` for example,
and compute the truth value for the following boolean map:
```
P -> FALSE
Q -> FALSE
G -> FALSE
R -> TRUE
S -> TRUE
```
... then compute the resolution method.

# Example Output
```
(P + R) & (Q + ~R) & (~Q) & (~P + G) & (S + ~G) & (~S) is false

{{~S}, {~Q}, {P, R}, {Q, ~R}, {~P, G}, {S, ~G}}
[0] Replacing {Q, ~R} and {~Q} with {~R}
{{~S}, {P, R}, {~P, G}, {S, ~G}, {~R}}
[1] Replacing {P, R} and {~R} with {P}
{{~S}, {~P, G}, {S, ~G}, {P}}
[2] Replacing {~P, G} and {P} with {G}
{{~S}, {S, ~G}, {G}}
[3] Replacing {S, ~G} and {~S} with {~G}
{{G}, {~G}}
[4] Replacing {~G} and {G} with ?
{?}
Empty clause found!
```
# Bugs
<ul>
  <li>Resolution method does not break when an empty clause is not found</li>
</ul>

# License

MIT License

Copyright (c) 2020 Christian Horton

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
