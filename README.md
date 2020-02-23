# LogicLib
Truth value calculator with built-in resolution algorithm.

# Example
expression = "(P + R) & (Q + ~R) & (~Q) & (~P + G) & (S + ~G) & (~S)";

# Output
```
(P + R) & (Q + ~R) & (~Q) & (~P + G) & (S + ~G) & (~S) is false<br />

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
