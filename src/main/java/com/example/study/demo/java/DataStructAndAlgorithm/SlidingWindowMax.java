package com.example.study.demo.java.DataStructAndAlgorithm;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 滑动窗口 当前窗口得最大值
 */
public class SlidingWindowMax {  //k = 3  i = 0,1,2,3
    /**
     * 解1：暴力法
     */




    /**
     * 解2：官方解答其实和下面得方法是一样得，只是下面得方法更容易理解
     */
    class OfficialSolution {//官方解答
        ArrayDeque<Integer> deq = new ArrayDeque<Integer>();
        int [] nums;

        public void clean_deque(int i, int k) {
            // remove indexes of elements not from sliding window
            if (!deq.isEmpty() && deq.getFirst() == i - k){  // i - 3
                deq.removeFirst();
            }

            // remove from deq indexes of all elements
            // which are smaller than current element nums[i]
            while (!deq.isEmpty() && nums[i] > nums[deq.getLast()]){
                deq.removeLast();
            }
        }

        /**
         * 2.1
         * @param nums
         * @param k
         * @return
         */
        public int[] maxSlidingWindow(int[] nums, int k) {
            int n = nums.length;
            if (n * k == 0) return new int[0];
            if (k == 1) return nums;

            // init deque and output
            this.nums = nums;
            int max_idx = 0;
            for (int i = 0; i < k; i++) {
                clean_deque(i, k);
                deq.addLast(i);
                // compute max in nums[:k]
                if (nums[i] > nums[max_idx]) max_idx = i;
            }
            int [] output = new int[n - k + 1];
            output[0] = nums[max_idx];

            // build output
            for (int i  = k; i < n; i++) {
                clean_deque(i, k);
                deq.addLast(i);
                output[i - k + 1] = nums[deq.getFirst()];
            }
            return output;
        }
    }


    /**
     * 2.2
     */
    class ForeignSolution {//foreign most vote

        /**
         * 解2  双端队列 deque
         * @param a   基础窗口数组
         * @param k  窗口长度
         * @return
         */
        public int[] maxSlidingWindow(int[] a,int k){
            if (a == null || k <= 0) {
                return new int[0];
            }
            int n = a.length;
            int[] r = new int[n-k+1];
            int ri = 0;
            // store index  双端队列存储索引
            Deque<Integer> q = new ArrayDeque<>();
            for (int i = 0; i < a.length; i++) {
                // remove numbers out of range k
//                while (!q.isEmpty() && q.peek() < i - k + 1) {
//                    q.poll();
//                }
                /** updated version
                 *  the first while loop is unnecessary since we only pop out one out of range element in one round at most.
                 *  一次只会向右移动一格，最多队列中也只会有1个数字不在当前窗口中
                 */
                if (!q.isEmpty() && q.peek() < i - k + 1) {//剔除小于滑动窗口中应该出现得最小index
                    q.poll();
                }
                // remove smaller numbers in k range as they are useless
                while (!q.isEmpty() && a[q.peekLast()] < a[i]) {//从尾部开始剔除比当前值小得index
                    q.pollLast();
                }
                // q contains index... r contains content
                q.offer(i);
                if (i >= k - 1) {//当前最大值放入输出数组中（双端队列头）
                    r[ri++] = a[q.peek()];
                }
            }
            return r;
        }
    }


    /**
     * 解法3 ：动态规划
     */





}
