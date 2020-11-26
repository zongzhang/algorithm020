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

数组指的是transient Node<K,V>[] table这个哈希表。

其中node是：

```java
static class Node<K,V> implements Map.Entry<K,V> {
        final int hash;    //用来定位数组索引位置
        final K key;
        V value;
        Node<K,V> next;   //链表的下一个node

        Node(int hash, K key, V value, Node<K,V> next) { ... }
        public final K getKey(){ ... }
        public final V getValue() { ... }
        public final String toString() { ... }
        public final int hashCode() { ... }
        public final V setValue(V newValue) { ... }
        public final boolean equals(Object o) { ... }
}
```

Node是HashMap的一个内部类，实现了Map.Entry接口，本质是就是带一个映射(键值对)的单链表。

所以HashMap通过拉链法解决hash冲突问题，同时1.8开始引入红黑树，当链表超过8个结点时，链表转化为红黑树。

### 1.3关于hash函数

```java
方法一：
static final int hash(Object key) {   //jdk1.8 & jdk1.7
     int h;
     // h = key.hashCode() 为第一步 取hashCode值
     // h ^ (h >>> 16)  为第二步 高位参与运算
     return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
}
方法二：
static int indexFor(int h, int length) {  //jdk1.7的源码，jdk1.8没有这个方法，但是实现原理一样的
     return h & (length-1);  //第三步 取模运算
}
```

哈希函数最重要的是让哈希后的值分布均匀。

方法二方法非常巧妙，它通过h & (table.length -1)来得到该对象的保存位，而HashMap底层数组的长度总是2的n次方，这是HashMap在速度上的优化。当length总是2的n次方时，h& (length-1)运算等价于对length取模，也就是h%length，但是&比%具有更高的效率。

在JDK1.8的实现中，优化了高位运算的算法，通过hashCode()的高16位异或低16位实现的：(h = k.hashCode()) ^ (h >>> 16)，主要是从速度、功效、质量来考虑的，这么做可以在数组table的length比较小的时候，也能保证考虑到高低Bit都参与到Hash的计算中，同时不会有太大的开销。

### 1.4 小结

* 扩容是一个特别耗时的操作，最好能估算出map的大小。
* 线程不安全，rehash容易死循环。
* 负载因子可以修改，但不建议动







# 二、堆和二叉堆的实现和特性