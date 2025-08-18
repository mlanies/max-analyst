package defpackage;

import android.graphics.Color;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class qu4 {
    public static final int a = Color.argb(230, 255, 255, 255);
    public static final int b = Color.argb(128, 27, 27, 27);

    public static void a(yb3 yb3Var) {
        n71 n71Var = n71.w0;
        qhe qheVar = new qhe(0, 0, n71Var);
        qhe qheVar2 = new qhe(a, b, n71Var);
        View decorView = yb3Var.getWindow().getDecorView();
        boolean zBooleanValue = ((Boolean) n71Var.invoke(decorView.getResources())).booleanValue();
        boolean zBooleanValue2 = ((Boolean) n71Var.invoke(decorView.getResources())).booleanValue();
        su4 uu4Var = Build.VERSION.SDK_INT >= 30 ? new uu4() : new tu4();
        uu4Var.a(qheVar, qheVar2, yb3Var.getWindow(), decorView, zBooleanValue, zBooleanValue2);
        uu4Var.b(yb3Var.getWindow());
    }
}
