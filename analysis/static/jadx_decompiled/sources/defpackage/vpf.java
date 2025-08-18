package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class vpf implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ cd6 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;

    public vpf(cd6 cd6Var, View view, View view2) {
        this.a = cd6Var;
        this.b = view;
        this.c = view2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b A[PHI: r1
      0x005b: PHI (r1v8 android.view.View) = (r1v7 android.view.View), (r1v19 android.view.View) binds: [B:16:0x0035, B:24:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            r7 = this;
            cd6 r0 = r7.a
            java.lang.Object r1 = r0.Y
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            r2 = 1
            int r3 = r0.a
            r4 = 0
            r5 = 0
            if (r1 == 0) goto L2c
            int r6 = r1.getId()
            if (r6 != r3) goto L26
            boolean r6 = r1.isAttachedToWindow()
            if (r6 == 0) goto L26
            int r6 = r1.getVisibility()
            if (r6 != 0) goto L26
            goto L27
        L26:
            r1 = r4
        L27:
            if (r1 != 0) goto L2a
            goto L2c
        L2a:
            r6 = r5
            goto L35
        L2c:
            java.lang.Object r1 = r0.Y
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            r1.clear()
            r6 = r2
            r1 = r4
        L35:
            if (r1 != 0) goto L5b
            android.view.View r1 = r7.b
            if (r1 == 0) goto L41
            android.view.View r1 = r1.findViewById(r3)
            if (r1 != 0) goto L4b
        L41:
            android.view.View r7 = r7.c
            android.view.View r7 = r7.getRootView()
            android.view.View r1 = r7.findViewById(r3)
        L4b:
            if (r1 == 0) goto L5c
            java.lang.Class r7 = r1.getClass()
            java.lang.Object r3 = r0.o
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto L5c
        L5b:
            r4 = r1
        L5c:
            java.lang.Object r7 = r0.c
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            if (r4 == 0) goto L99
            if (r6 == 0) goto L7c
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r4)
            r0.Y = r1
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L7c
            android.view.ViewParent r1 = r1.getParent()
            if (r1 == 0) goto L7c
            r1.requestDisallowInterceptTouchEvent(r2)
        L7c:
            r0.b = r2
            java.lang.Object r0 = r0.X
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            defpackage.mpf.d(r0, r4)
            java.util.Iterator r7 = r7.iterator()
        L89:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Lb3
            java.lang.Object r1 = r7.next()
            spf r1 = (defpackage.spf) r1
            r1.c(r0, r4)
            goto L89
        L99:
            boolean r1 = r0.b
            if (r1 == 0) goto Lb3
            r0.b = r5
            java.util.Iterator r7 = r7.iterator()
        La3:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lb3
            java.lang.Object r0 = r7.next()
            spf r0 = (defpackage.spf) r0
            r0.a()
            goto La3
        Lb3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vpf.onPreDraw():boolean");
    }
}
