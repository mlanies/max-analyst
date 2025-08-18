package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class tu4 extends su4 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ru4
    public void a(qhe qheVar, qhe qheVar2, Window window, View view, boolean z, boolean z2) {
        y6g y6gVar;
        kp.A(window, false);
        qheVar.getClass();
        window.setStatusBarColor(0);
        qheVar2.getClass();
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        o9g o9gVar = new o9g(view);
        if (Build.VERSION.SDK_INT >= 30) {
            z6g z6gVar = new z6g(window.getInsetsController(), o9gVar);
            z6gVar.k = window;
            y6gVar = z6gVar;
        } else {
            y6gVar = new y6g(window, o9gVar);
        }
        y6gVar.v(!z);
        y6gVar.u(true ^ z2);
    }
}
