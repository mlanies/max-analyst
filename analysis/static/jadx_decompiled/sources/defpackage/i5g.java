package defpackage;

import android.view.View;
import one.me.sdk.arch.Widget;

/* loaded from: classes2.dex */
public final class i5g extends su3 {
    public boolean a;
    public final /* synthetic */ Widget b;

    public i5g(Widget widget) {
        this.b = widget;
    }

    @Override // defpackage.su3
    public final void d(uu3 uu3Var) {
        Widget widget = this.b;
        View viewRequireView = widget.requireView();
        widget.onViewCreated(viewRequireView);
        br7.d(viewRequireView, widget.getC(), new b5g(widget, 1));
    }

    @Override // defpackage.su3
    public final void j(uu3 uu3Var, View view) {
        boolean zB = nd7.B(uu3Var);
        Widget widget = this.b;
        if (!zB) {
            widget.onViewCreated(view);
            br7.d(view, widget.getC(), new b5g(widget, 1));
        }
        view.addOnAttachStateChangeListener(new o50(widget, 15, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    @Override // defpackage.su3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(defpackage.uu3 r15) {
        /*
            r14 = this;
            boolean r14 = r15 instanceof one.me.sdk.arch.Widget
            if (r14 == 0) goto L7
            one.me.sdk.arch.Widget r15 = (one.me.sdk.arch.Widget) r15
            goto L8
        L7:
            r15 = 0
        L8:
            if (r15 == 0) goto L68
            w5g r14 = r15.getViewModelStore()
            if (r14 == 0) goto L68
            qi9 r15 = r14.a
            java.lang.Object[] r0 = r15.c
            long[] r1 = r15.a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L60
            r3 = 0
            r4 = r3
        L1d:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L5b
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L37:
            if (r9 >= r7) goto L59
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L55
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            pnf r10 = (defpackage.pnf) r10
            kotlinx.coroutines.internal.ContextScope r11 = r10.a
            lx3 r11 = r11.getCoroutineContext()
            defpackage.pag.d(r11)
            r10.p()
        L55:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L37
        L59:
            if (r7 != r8) goto L60
        L5b:
            if (r4 == r2) goto L60
            int r4 = r4 + 1
            goto L1d
        L60:
            r15.a()
            qi9 r14 = r14.b
            r14.a()
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i5g.k(uu3):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    @Override // defpackage.su3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.uu3 r17) {
        /*
            r16 = this;
            r0 = r16
            one.me.sdk.arch.Widget r1 = r0.b
            qi9 r2 = r1.getCleanActions()
            java.lang.Object[] r3 = r2.c
            long[] r2 = r2.a
            int r4 = r2.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L60
            r5 = 0
            r6 = r5
        L13:
            r7 = r2[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5b
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r5
        L2d:
            if (r11 >= r9) goto L59
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L55
            int r12 = r6 << 3
            int r12 = r12 + r11
            r12 = r3[r12]
            l23 r12 = (defpackage.l23) r12
            pm0 r12 = (defpackage.pm0) r12
            r12.getClass()
            java.lang.ref.WeakReference r13 = new java.lang.ref.WeakReference
            qm0 r14 = r12.b
            java.lang.Object r15 = r14.o
            r13.<init>(r15)
            r14.X = r13
            r13 = 0
            r14.o = r13
            r13 = 1
            r12.a = r13
        L55:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L2d
        L59:
            if (r9 != r10) goto L60
        L5b:
            if (r6 == r4) goto L60
            int r6 = r6 + 1
            goto L13
        L60:
            boolean r0 = r0.a
            if (r0 == 0) goto L69
            r0 = r17
            one.me.sdk.arch.Widget.access$finalizeCleanActions(r1, r0)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i5g.l(uu3):void");
    }

    @Override // defpackage.su3
    public final void n(uu3 uu3Var, View view) {
        view.addOnAttachStateChangeListener(new ck(12, this.b));
    }
}
