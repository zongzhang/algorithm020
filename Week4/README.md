学习笔记

## 深度优先搜索和广度优先搜素

### dfs模版

#### 递归写法

``` java
public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> allResults = new ArrayList<>();
    if(root==null){
        return allResults;
    }
    travel(root,0,allResults);
    return allResults;
}


private void travel(TreeNode root,int level,
List<List<Integer>> results) {
 
    if(results.size()==level){
        results.add(new ArrayList<>());
    }
    results.get(level).add(root.val);
    if(root.left!=null){
        travel(root.left,level+1,results);
    }
    if(root.right!=null){
        travel(root.right,level+1,results);
    }
}
```

### bfs模版

``` java
public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> allResults = new ArrayList<>();
    if (root == null) {
        return allResults;
    }
    Queue<TreeNode> nodes = new LinkedList<>();
    nodes.add(root);
    while (!nodes.isEmpty()) {
        int size = nodes.size();
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            TreeNode node = nodes.poll();
            results.add(node.val);
            if (node.left != null) {
                nodes.add(node.left);
            }
            if (node.right != null) {
                nodes.add(node.right);
            }
        }
        allResults.add(results);
    }
    return allResults;
}
```

## 贪心算法
每一步，当前状态下的最好或最优选择，希望导致结果是全局最优或最好的算法。不能保证一定全局最优。
一个问题可以用贪心算法，那么一般贪心算法就是最优解。

与动态规划的不同：不能回退，不保存子问题结果，不能针对上一步的结果再做判断。

## 二分查找
1、有序的，单调的  
2、存在上下界  
3、能够通过索引访问  

### 模版
``` java
public int binarySearch(int[] array, int target) {
    int left = 0, right = array.length - 1, mid;
    while (left <= right) {
        //细节 防止left+right越界
        mid = (right - left) / 2 + left;

        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }

    return -1;
}
```
