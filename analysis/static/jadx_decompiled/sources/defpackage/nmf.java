package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class nmf implements View.OnApplyWindowInsetsListener {
    public x6g a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ y2a c;

    public nmf(View view, y2a y2aVar) {
        this.b = view;
        this.c = y2aVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        x6g x6gVarF = x6g.f(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        y2a y2aVar = this.c;
        if (i < 30) {
            omf.a(windowInsets, this.b);
            if (x6gVarF.equals(this.a)) {
                return y2aVar.P(view, x6gVarF).e();
            }
        }
        this.a = x6gVarF;
        x6g x6gVarP = y2aVar.P(view, x6gVarF);
        if (i >= 30) {
            return x6gVarP.e();
        }
        WeakHashMap weakHashMap = zmf.a;
        mmf.c(view);
        return x6gVarP.e();
    }
}
