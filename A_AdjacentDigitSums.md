You are given two numbers x,y. You need to determine if there exists an integer n such that S(n)=x, S(n+1)=y.

Here, S(a) denotes the sum of the digits of the number a in the decimal numeral system.

Input Each test contains multiple test cases. The first line contains the number of test cases t  (1≤t≤500 ). The description of the test cases follows.

The first line of each test case contains two integers x,y (1≤x≤1000,1≤y≤1000).

Output
For each test case, print "NO" if a suitable n does not exist. Otherwise, output "YES".

You can output each letter in any case (for example, "YES", "Yes", "yes", "yEs", "yEs" will be recognized as a positive answer).

Example:
Input<br>
7 <br>
1 2 <br>
77 77 <br>
997 999 <br>
999 1 <br>
1000 1 <br>
1 11 <br>
18 1 <br>

Output
Yes
No
No
Yes
No
No
Yes
Note
In the first test case, for example, n=100 works. S(100)=1, S(101)=2.

In the second test case, it can be shown that S(n)≠S(n+1) for all n; therefore, the answer is No.

In the fourth test case, n=(10^111)−1 works, which is a number consisting of 111 digits of 9.