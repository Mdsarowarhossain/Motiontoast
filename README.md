
  If you want to make like this type toast in Android flow this step
Step 1
App level build.gradle dependencies 
<code>
implementation 'com.github.lazy-pr0grammer:MotionToast-Easiotic:1.0'</code>
Step 2
 Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:
maven <code> { url 'https://jitpack.io' }</code>

Step 3
Java code ;
<code>
MotionToast motionToast = new MotionToast(MainActivity.this, 0, MotionStyle.LIGHT, MotionStyle.SUCCESS, MotionStyle.BOTTOM, "SUCCESS", "You got success", MotionStyle.LENGTH_SHORT).show();
</code>
For more details flow this blog article
 https://andriod.info/how-to-make-user-attractive-toast-in-android-studio-motiontoast-android-laibryrir/
