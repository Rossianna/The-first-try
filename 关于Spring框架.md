# 关于Spring框架的碎碎念....
* 用STS创建一个新的Spring Starter Project之后（关于创建时的配置以后再写...有点忘记了...），
* 需要包含几个文件夹（一般会自动生成）
* 最主要的两个就是
>src/main/java
src/main/resource
* 通过学习了解到，Spring框架需要包含Entity层，Controller层以及最终的Service层，Service层提供最终服务
* 其中所有的Java代码都放在main文件夹里，resource文件夹里包含
>实体的mapper.xml文件（mapper开发我不是很理解，但是这个文件就相当于寻址一样的功能吧，这个文件里包含的是对数据库进行增删查改的SQL代码），网页前端代码，还有一些风格渲染
* 同时还需要进行数据库连接和配置等操作（感觉工程量十分庞大啊...）

