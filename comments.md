### 完成度：
* 按照给定的API，所有接口均无法进行正常调用

### 知识点：
* 了解下repository的概念
* 了解下数据库、JPA的使用
* 很多基础知识点的使用都不正确
* 了解下异常处理

__Details:__
- \- GroupService.java:17 一般不推荐使用这样的转String的方式，如果一定要转，看看String.valueOf()。

### 工程实践：
* code smell过多，了解下clean code

__Details:__

- \- TrainerService.java:21 命名需要更加表意，尽量避免后缀带数字的命名
- \- TrainerService.java:31 变量名一般是驼峰形式
- \- GroupService.java:11 拼写错误
- \- GroupService.java:12 不需要static
- \- GroupService.java:21 未用到的方法
- \- GroupService.java:22 无必要的注释
- \- GroupService.java:29 未用到的变量
- \- TraineeService.java:19 命名不够表意，不要进行不表意的缩写
- \- TraineeService.java:21 这种写法可能抛NPE
- \- TraineeService.java:30 尽量使用 equals()



