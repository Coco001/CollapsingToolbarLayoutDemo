package com.coco.collapsingtoolbarlayoutdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * CollapsingToolbarLayout控件可以实现当屏幕内容滚动时收缩Toolbar的效果，通常配合AppBarLayout一起使用。
 * <p>
 * CollapsingToolbarLayout 提供以下属性和方法是用：
 * 1. Collapsing title：ToolBar的标题，当CollapsingToolbarLayout全屏没有折叠时，title显示的是大字体，在折叠的过程中，title不断变小到一定大小的效果。你可以调用setTitle(CharSequence)方法设置title。
 * 2. Content scrim：ToolBar被折叠到顶部固定时候的背景，你可以调用setContentScrim(Drawable)方法改变背景或者在属性中使用 app:contentScrim=”?attr/colorPrimary”来改变背景。
 * 3. Status bar scrim：状态栏的背景，调用方法setStatusBarScrim(Drawable)。还没研究明白，不过这个只能在Android5.0以上系统有效果。
 * 4. Parallax scrolling children：CollapsingToolbarLayout滑动时，子视图的视觉差，可以通过属性app:layout_collapseParallaxMultiplier=”0.6”改变。值de的范围[0.0,1.0]，值越大视察越大。
 * 5. CollapseMode ：子视图的折叠模式，在子视图设置，有两种“pin”：固定模式，在折叠的时候最后固定在顶端；“parallax”：视差模式，在折叠的时候会有个视差折叠的效果。我们可以在布局中使用属性app:layout_collapseMode=”parallax”来改变。
 * <p>
 * 使用CollapsingToolbarLayout实现折叠效果，需要注意3点 。
 * 1. AppBarLayout的高度固定
 * 2. CollapsingToolbarLayout的子视图设置layout_collapseMode属性
 * 3. 关联悬浮视图设置app:layout_anchor，app:layout_anchorGravity属性
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collasping);
    }
}
