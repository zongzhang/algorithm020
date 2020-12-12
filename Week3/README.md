# 学习笔记

## 递归

一言以蔽之，自己调用自己

### 递归模版

``` java
public void recur(int level, int param) { 

  // terminator 终止条件
  if (level > MAX_LEVEL) { 
    // process result 
    return; 
  }
  
  // process current logic  执行当前逻辑
  process(level, param); 
  
  // drill down  进入下一层
  recur( level: level + 1, newParam); 
  
  // restore current status 有些时候需要存储当前状态
}
```

## 分治 回溯

本质是递归，递归的一种细分类

### 分治代码模版

``` java
private static int divide_conquer(Problem problem, ) {
  
  if (problem == NULL) {
    int res = process_last_result();
    return res;     
  }
  subProblems = split_problem(problem)
  
  res0 = divide_conquer(subProblems[0])
  res1 = divide_conquer(subProblems[1])
  
  result = process_result(res0, res1);
  
  return result;
}

```