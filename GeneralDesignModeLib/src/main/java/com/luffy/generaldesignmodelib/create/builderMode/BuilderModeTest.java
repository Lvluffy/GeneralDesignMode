package com.luffy.generaldesignmodelib.create.builderMode;

import com.luffy.generaldesignmodelib.create.builderMode.builder.Builder;
import com.luffy.generaldesignmodelib.create.builderMode.builder.MacbookBuilder;
import com.luffy.generaldesignmodelib.create.builderMode.director.Director;

/**
 * Created by lvlufei on 2019/9/19
 *
 * @name 构建者模式~测试
 * @desc
 */
public class BuilderModeTest {

    public static String testBuilderMode() {
        /*构建者*/
        Builder builder = new MacbookBuilder();
        /*主管*/
        Director director = new Director(builder);
        director.construct("英特尔主板", "Mac OS X 10.10", "Retina显示器");
        return builder.create().toString();
    }

    public static void main(String[] args) {
        System.out.print(testBuilderMode());
    }
}
