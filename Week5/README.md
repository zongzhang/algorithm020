学习笔记

## 复习 递归代码模版
``` java
public void recur(int level, int param) { 
  // 1、terminator 
  if (level > MAX_LEVEL) { 
    // process result 
    return; 
  }
  
  // 2、process current logic 
  process(level, param); 
  
  // 3、drill down 
  recur( level: level + 1, newParam); 
  
  // 4、restore current status 
}
```

## 分治代码模版
``` java
private static int divide_conquer(Problem problem, ) {
  // 终止条件
  if (problem == NULL) {
    int res = process_last_result();
    return res;     
  }
  
  // 分解问题
  subProblems = split_problem(problem)
  
  // 递归调用
  res0 = divide_conquer(subProblems[0])
  res1 = divide_conquer(subProblems[1])
  
  //合并问题
  result = process_result(res0, res1);
  
  // 可能要恢复状态
  return result;
}
```

## 动态规划
dynamic programming --》 动态推导，动态递归 --》 分治+最优子结构  

动态规划和递归或者分治没有根本上的区别（关键看有无最优子结构）  
共性：重复子问题。  
差异性：最优子结构、中途可以淘汰次优解  