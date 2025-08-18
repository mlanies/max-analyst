package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public abstract class ru4 {
    /* JADX WARN: Multi-variable type inference failed */
    public void a(qhe qheVar, qhe qheVar2, Window window, View view, boolean z, boolean z2) {
        y6g y6gVar;
        kp.A(window, false);
        window.setStatusBarColor(z ? qheVar.b : qheVar.a);
        window.setNavigationBarColor(z2 ? qheVar2.b : qheVar2.a);
        o9g o9gVar = new o9g(view);
        if (Build.VERSION.SDK_INT >= 30) {
            z6g z6gVar = new z6g(window.getInsetsController(), o9gVar);
            z6gVar.k = window;
            y6gVar = z6gVar;
        } else {
            y6gVar = new y6g(window, o9gVar);
        }
        y6gVar.v(!z);
        y6gVar.u(!z2);
    }
}
