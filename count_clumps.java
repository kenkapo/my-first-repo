public int countClumps(int[] nums) {
  int clumpcount=0;
  boolean d=false;
  for (int i=0;i<nums.length-1;i++)
  {
    if (nums[i]==nums[i+1])
    {
      d=true;//if they are equal then condition is true
    }
    else if (d==true)
    {
      clumpcount++;//when they are not equal,before making condition false we increment clumpcount
      d=false;
    }
  }
  if (d==true)
  {
    clumpcount++;
  }
  return clumpcount;
}
