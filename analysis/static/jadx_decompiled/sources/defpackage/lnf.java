package defpackage;

import android.util.Log;
import android.view.View;

/* loaded from: classes2.dex */
public abstract class lnf {
    public static final knf a = new knf();
    public static final boolean b = Log.isLoggable("shared.ViewLifecycle", 3);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.eh7 a(android.view.View r4) {
        /*
            n71 r0 = defpackage.n71.A0
            if (r4 != 0) goto L7
            vz4 r0 = defpackage.vz4.a
            goto L14
        L7:
            km4 r1 = new km4
            ie r2 = new ie
            r3 = 6
            r2.<init>(r3, r4)
            r3 = 1
            r1.<init>(r2, r3, r0)
            r0 = r1
        L14:
            n71 r1 = defpackage.n71.B0
            qk5 r0 = defpackage.l6d.e0(r0, r1)
            java.lang.Object r0 = defpackage.l6d.c0(r0)
            eh7 r0 = (defpackage.eh7) r0
            if (r0 != 0) goto L66
            int r0 = defpackage.dyb.view_custom_attach_lifecycle_owner
            java.lang.Object r0 = r4.getTag(r0)
            boolean r1 = r0 instanceof defpackage.bh7
            if (r1 == 0) goto L2f
            bh7 r0 = (defpackage.bh7) r0
            goto L30
        L2f:
            r0 = 0
        L30:
            if (r0 == 0) goto L44
            gh7 r1 = r0.a
            if (r1 == 0) goto L44
            fg7 r1 = r1.d
            if (r1 == 0) goto L44
            fg7 r2 = defpackage.fg7.c
            boolean r1 = r1.a(r2)
            r2 = 1
            if (r1 != r2) goto L44
            goto L66
        L44:
            bh7 r0 = new bh7
            r0.<init>()
            gh7 r1 = new gh7
            r1.<init>(r0)
            r0.a = r1
            eg7 r2 = defpackage.eg7.ON_CREATE
            r1.d(r2)
            r4.addOnAttachStateChangeListener(r0)
            boolean r1 = r4.isAttachedToWindow()
            if (r1 == 0) goto L61
            r0.onViewAttachedToWindow(r4)
        L61:
            int r1 = defpackage.dyb.view_custom_attach_lifecycle_owner
            r4.setTag(r1, r0)
        L66:
            boolean r4 = defpackage.lnf.b
            if (r4 == 0) goto L7a
            gh7 r4 = r0.Q()
            knf r1 = defpackage.lnf.a
            r4.f(r1)
            gh7 r4 = r0.Q()
            r4.a(r1)
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lnf.a(android.view.View):eh7");
    }

    public static final rg7 b(View view) {
        return f46.J(a(view));
    }
}
