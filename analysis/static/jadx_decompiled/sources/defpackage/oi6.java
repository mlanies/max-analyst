package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public interface oi6 {
    int a();

    default void b(View view) {
        Object njcVar;
        try {
            njcVar = Boolean.valueOf(pag.F(view, this));
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        Object obj = Boolean.FALSE;
        if (njcVar instanceof njc) {
            njcVar = obj;
        }
    }
}
