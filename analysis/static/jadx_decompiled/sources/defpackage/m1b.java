package defpackage;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import java.util.Locale;

/* loaded from: classes.dex */
public final class m1b {
    public static final void a(m1b m1bVar, View view, xg1 xg1Var, RectF rectF) {
        view.setPivotX(rectF.top);
        view.setPivotY(rectF.left);
        view.setX(rectF.top);
        view.setY(rectF.left);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        dy7.H(view, 0.0f);
        xg1Var.setAlpha(1.0f);
    }

    public static boolean b() {
        String str = Build.MANUFACTURER;
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        return w9e.p0(lowerCase, "huawei", false) || w9e.p0(lowerCase, "honor", false);
    }
}
