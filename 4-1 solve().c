// 4-1 编写一个函数solve，给定浮点数a, b, c, d, e, f，求解方程组ax + by = c, dx + ey = f。
//
//下面利用线性代数知识来分析方程组的什么时候有唯一解、无解或无穷多解？方程组为如下：
//
//设它的系数矩阵为A ，它的增广矩阵为B
//
//（1）当ea - bd≠0时，系数矩阵A的秩R(A) = 2，增广矩阵的秩R(B) = 2, 即R(A) = R(B) = 2，此时线性方程组有唯一解。
//
//（2）当ea - bd = 0时
//
//①当fa - cd = 0时，R(A) = R(B) = 1<2, 此时线性方程组有无穷多组解。
//
//②当fa - cd≠0时，R(A) = 1，R(B) = 2, 则R(A)<R(B)，此时线性方程组无解。


// 任务1：使用assert宏，让解不唯一时异常退出。
void solve (float a, float b, float c, float d, float e, float f)

{

  float x, y;

  assert(e * a – b * d== 0 && f * a – c * d== 0); //使用断言，解不唯一退出

  if(e * a – b * d != 0){ //此方程的解是唯一的

printf("x=%f",(c * e – b * f) / (e * a – b * d));

printf("y=%f",(a * f – c * d)/(e * a – b * d));

return;

}

  if(e * a – b * d == 0 && f * a – c * d != 0){ //此方程无解

printf("The equation is no solutio:\n ");

return;

}

}

// 任务2：解不唯一时仍然正常返回，但调用者有办法知道解的数量（无解、唯一解、无穷多组解）。
int void solve (float a, float b, float c, float d, float e, float f)
{

  float x, y;

  if(e * a – b * d== 0 && f * a – c * d== 0){ //此方程的解是不唯一

printf("The solution of equation is not unique:\n ");

      return 2;

}

  if(e * a – b * d != 0){ //此方程的解是唯一的

printf("The solution of equation is unique:\n ");

printf("x=%f",(c * e – b * f) / (e * a – b * d));

printf("y=%f",(a * f – c * d)/(e * a – b * d));

return 1;

}

  if(e * a – b * d == 0 && f * a – c * d != 0){ //此方程无解

printf("The equation is no solutio:\n ");

return 0;

}

}