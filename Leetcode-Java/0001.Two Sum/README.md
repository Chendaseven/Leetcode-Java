## 题目

给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 的那?两个?整数，并返回它们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

你可以按任意顺序返回答案。



## 解题思路

使用HashMap存储每个数字和它的位置，如果在遍历过程中找到了和它相加之和和target的数字，那么直接返回它们的下标；否则返回null

