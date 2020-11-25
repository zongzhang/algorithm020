学习笔记

# 一、哈希表、映射、集合的实现与特性

## 1.HashMap学习

**基于jdk1.8**

### 1.1简介

java的map数据结构定义是java.util.Map

类继承实现关系如图：

![f7fe16a2](map1.png)

- HashMap根据hashcode存储数据。最多只允许一条记录的键值为null，允许多条记录的值为null。其非线程安全，如果想满足线程安全，可以用synchronizedMap方法或使用ConcurrentHashMap。
- HashTable，线程安全，为了线程安全其实现方式导致性能低下。
- LinkedHashMap：是HashMap的子类。保存了记录的插入顺序。
- TreeMap：可以根据键值排序。

注意：Key为不可变对象，不然会导致哈希值变化，从而映射不到原来的值。

### 1.2内部实现

HashMap采用数组+链表+红黑树实现。











# 二、堆和二叉堆的实现和特性