# LogicLib
Truth value calculator with built-in resolution algorithm.

# Example
expression = "(P + R) & (Q + ~R) & (~Q) & (~P + G) & (S + ~G) & (~S)";

# Output
```
(P + R) & (Q + ~R) & (~Q) & (~P + G) & (S + ~G) & (~S) is false<br />

{{~S}, {~Q}, {P, R}, {Q, ~R}, {~P, G}, {S, ~G}}<br />
[0] Replacing {Q, ~R} and {~Q} with {~R} <br />
{{~S}, {P, R}, {~P, G}, {S, ~G}, {~R}}<br />
[1] Replacing {P, R} and {~R} with {P} <br />
{{~S}, {~P, G}, {S, ~G}, {P}}<br />
[2] Replacing {~P, G} and {P} with {G} <br />
{{~S}, {S, ~G}, {G}}<br />
[3] Replacing {S, ~G} and {~S} with {~G} <br />
{{G}, {~G}}<br />
[4] Replacing {~G} and {G} with ? <br />
{?}<br />
Empty clause found!<br />
```
