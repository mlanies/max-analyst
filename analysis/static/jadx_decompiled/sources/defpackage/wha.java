package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class wha {
    public final WeakReference a;
    public uia b;
    public final i50 c;
    public final int d;
    public final int e;

    public wha(FrameLayout frameLayout) {
        WeakReference weakReference = new WeakReference(frameLayout);
        this.a = weakReference;
        this.b = uia.Z;
        if (frameLayout != null) {
            this.c = new i50(weakReference);
        }
    }

    public final void a(jqe jqeVar) {
        ViewGroup viewGroup;
        Context context;
        uia uiaVar = this.b;
        CharSequence charSequenceB = null;
        if (jqeVar != null && (viewGroup = (ViewGroup) this.a.get()) != null && (context = viewGroup.getContext()) != null) {
            charSequenceB = jqeVar.b(context);
        }
        this.b = uia.a(uiaVar, null, null, charSequenceB, null, null, null, 59);
    }

    public final void b(CharSequence charSequence) {
        this.b = uia.a(this.b, null, null, charSequence, null, null, null, 59);
    }

    public final void c(eia eiaVar) {
        this.b = uia.a(this.b, null, null, null, null, eiaVar, null, 47);
    }

    public final void d(xha xhaVar) {
        i50 i50Var = this.c;
        if (i50Var != null) {
            i50Var.Y = xhaVar;
        }
    }

    public final void e(oia oiaVar) {
        uia uiaVar = this.b;
        this.b = uia.a(uiaVar, oiaVar, null, null, null, null, oiaVar instanceof nia ? hia.b : uiaVar.Y, 30);
    }

    public final void f(tia tiaVar) {
        this.b = uia.a(this.b, null, null, null, tiaVar, null, null, 55);
    }

    public final void g(jqe jqeVar) {
        Context context;
        uia uiaVar = this.b;
        ViewGroup viewGroup = (ViewGroup) this.a.get();
        CharSequence charSequenceB = (viewGroup == null || (context = viewGroup.getContext()) == null) ? null : jqeVar.b(context);
        if (charSequenceB == null) {
            charSequenceB = "";
        }
        this.b = uia.a(uiaVar, null, charSequenceB, null, null, null, null, 61);
    }

    public final void h(CharSequence charSequence) {
        this.b = uia.a(this.b, null, charSequence, null, null, null, null, 61);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.vha i() {
        /*
            r11 = this;
            java.lang.ref.WeakReference r0 = r11.a
            java.lang.Object r0 = r0.get()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            i50 r0 = r11.c
            if (r0 != 0) goto Lf
            return r1
        Lf:
            uia r2 = r11.b
            eia r3 = r2.X
            int r4 = r3.c
            int r5 = r11.d
            int r4 = r4 + r5
            int r11 = r11.e
            int r5 = r3.b
            int r5 = r5 + r11
            r11 = 0
            r10 = 1
            eia r7 = defpackage.eia.a(r3, r11, r5, r4, r10)
            r5 = 0
            r9 = 47
            r3 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            uia r2 = defpackage.uia.a(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.o = r2
            java.util.concurrent.atomic.AtomicBoolean r3 = defpackage.cia.d
            boolean r4 = r3.compareAndSet(r11, r10)
            if (r4 == 0) goto L92
            bia r4 = defpackage.cia.b
            java.lang.Object r5 = r0.s0
            zha r5 = (defpackage.zha) r5
            if (r4 == 0) goto L4b
            java.lang.ref.WeakReference r4 = r4.b
            java.lang.Object r4 = r4.get()
            boolean r4 = defpackage.tpa.f(r4, r5)
            goto L4c
        L4b:
            r4 = r11
        L4c:
            if (r4 == 0) goto L60
            bia r4 = defpackage.cia.b
            if (r4 == 0) goto L54
            iia r1 = r4.a
        L54:
            fia r4 = defpackage.fia.b
            boolean r1 = defpackage.tpa.f(r1, r4)
            if (r1 == 0) goto L60
            r3.set(r11)
            goto L92
        L60:
            bia r1 = defpackage.cia.b
            if (r1 == 0) goto L6f
            java.lang.ref.WeakReference r1 = r1.b
            java.lang.Object r1 = r1.get()
            boolean r1 = defpackage.tpa.f(r1, r5)
            goto L70
        L6f:
            r1 = r11
        L70:
            if (r1 == 0) goto L7f
            android.os.Handler r1 = defpackage.cia.a
            bia r2 = defpackage.cia.b
            r1.removeCallbacksAndMessages(r2)
            bia r1 = defpackage.cia.b
            defpackage.cia.c(r1)
            goto L8f
        L7f:
            bia r1 = new bia
            iia r2 = r2.Y
            r1.<init>(r5, r2)
            defpackage.cia.c = r1
            bia r1 = defpackage.cia.b
            if (r1 != 0) goto L8f
            defpackage.cia.d()
        L8f:
            r3.set(r11)
        L92:
            vha r11 = new vha
            r11.<init>(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wha.i():vha");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wha(one.me.sdk.arch.Widget r9) {
        /*
            r8 = this;
            r0 = r9
        L1:
            uu3 r1 = r0.getParentController()
            if (r1 == 0) goto Lc
            uu3 r0 = r0.getParentController()
            goto L1
        Lc:
            android.view.View r0 = r0.getView()
            r1 = 0
            if (r0 == 0) goto L18
            android.view.ViewParent r0 = r0.getParent()
            goto L19
        L18:
            r0 = r1
        L19:
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L20
            android.view.View r0 = (android.view.View) r0
            goto L21
        L20:
            r0 = r1
        L21:
            boolean r2 = r0 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L28
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            goto L29
        L28:
            r0 = r1
        L29:
            r8.<init>(r0)
            q0e r0 = defpackage.vc7.f
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto L44
            android.content.Context r0 = r9.getContext()
            int r0 = defpackage.vc7.a(r0)
            goto L45
        L44:
            r0 = r2
        L45:
            x27 r3 = r9.getB()
            int r3 = r3.a
            if (r3 != 0) goto L4e
            r3 = r2
        L4e:
            r4 = -1
            if (r3 != 0) goto L53
            r3 = r4
            goto L5b
        L53:
            int[] r5 = defpackage.uha.$EnumSwitchMapping$0
            int r3 = defpackage.au1.s(r3)
            r3 = r5[r3]
        L5b:
            r5 = 2
            r6 = 1
            if (r3 == r6) goto L7a
            if (r3 == r5) goto L63
        L61:
            r3 = r2
            goto L84
        L63:
            android.view.View r3 = r9.getView()
            if (r3 == 0) goto L61
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            boolean r7 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L74
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            goto L75
        L74:
            r3 = r1
        L75:
            if (r3 == 0) goto L61
            int r3 = r3.topMargin
            goto L84
        L7a:
            android.view.View r3 = r9.getView()
            if (r3 == 0) goto L61
            int r3 = r3.getPaddingTop()
        L84:
            r8.e = r3
            x27 r3 = r9.getB()
            yq0 r3 = r3.b
            if (r3 == 0) goto L91
            int r3 = r3.a
            goto L92
        L91:
            r3 = r2
        L92:
            if (r3 != 0) goto L95
            goto L9d
        L95:
            int[] r4 = defpackage.uha.$EnumSwitchMapping$0
            int r3 = defpackage.au1.s(r3)
            r4 = r4[r3]
        L9d:
            if (r4 == r6) goto Lb9
            if (r4 == r5) goto La2
            goto Lc3
        La2:
            android.view.View r9 = r9.getView()
            if (r9 == 0) goto Lc3
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            boolean r0 = r9 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lb3
            r1 = r9
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
        Lb3:
            if (r1 == 0) goto Lb7
            int r2 = r1.bottomMargin
        Lb7:
            r0 = r2
            goto Lc3
        Lb9:
            android.view.View r9 = r9.getView()
            if (r9 == 0) goto Lc3
            int r0 = r9.getPaddingBottom()
        Lc3:
            r8.d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wha.<init>(one.me.sdk.arch.Widget):void");
    }
}
