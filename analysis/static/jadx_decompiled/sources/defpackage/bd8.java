package defpackage;

import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public abstract class bd8 extends ViewGroup implements k34, x5d, l7c, jw8, aoa, u5d, mc8 {
    public static final /* synthetic */ bc7[] v0;
    public final r6c a;
    public final dw8 b;
    public final s5d c;
    public final boa o;
    public final y5d s0;
    public final j34 t0;
    public final yj u0;

    static {
        oi9 oi9Var = new oi9(bd8.class, "model", "getModel()Lone/me/messages/list/loader/model/MediaAttachInfo;");
        nec.a.getClass();
        v0 = new bc7[]{oi9Var};
    }

    public bd8(Context context) {
        r6c r6cVar = new r6c();
        dw8 dw8Var = new dw8();
        boa boaVar = new boa();
        s5d s5dVar = new s5d();
        super(context);
        this.a = r6cVar;
        this.b = dw8Var;
        this.c = s5dVar;
        this.o = boaVar;
        this.s0 = new y5d(this);
        j34 j34Var = new j34(context);
        j34Var.setBackgroundEnabled$message_list_release(true);
        this.t0 = j34Var;
        this.u0 = new yj(11, this);
        dw8Var.b = this;
        r6cVar.b = this;
        s5dVar.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(j34Var, new ViewGroup.LayoutParams(-2, -2));
        qx7 qx7Var = vs8.y;
        fka fkaVarJ = qp4.u0.j(this);
        qx7Var.getClass();
        setBackground(qx7.e(fkaVarJ));
        setWillNotDraw(false);
        setTransitionGroup(true);
    }

    public void a(f53 f53Var) {
        setModel(f53Var);
    }

    @Override // defpackage.jw8
    public final void c(is0 is0Var) {
        this.b.c(is0Var);
    }

    @Override // defpackage.l7c
    public final void f(ix8 ix8Var, boolean z) {
        this.a.f(ix8Var, z);
    }

    @Override // defpackage.k34
    public final void g(CharSequence charSequence, boolean z) {
        this.t0.c(charSequence, z);
    }

    public int getAliasWidthWithPaddings() {
        return this.c.h0();
    }

    public final j34 getDate() {
        return this.t0;
    }

    public boolean getDependOnOutsideView() {
        return this.o.a;
    }

    public x38 getModel() {
        bc7 bc7Var = v0[0];
        return (x38) this.u0.b;
    }

    public void i(bsd bsdVar) {
        setModel(bsdVar);
    }

    @Override // defpackage.l7c
    public final void k(is0 is0Var, boolean z) {
        this.a.k(is0Var, z);
    }

    @Override // defpackage.jw8
    public final void l() {
        this.b.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iK;
        int iG = tu0.G(10 * fk4.d().getDisplayMetrics().density);
        y5d y5dVar = this.s0;
        if (br7.H(y5dVar.b)) {
            int iG2 = tu0.G(8 * fk4.d().getDisplayMetrics().density);
            y5dVar.c(iG, iG2);
            iK = y5dVar.a() + iG2;
        } else {
            iK = 0;
        }
        s5d s5dVar = this.c;
        if (br7.H((je7) s5dVar.c) && br7.H(y5dVar.b)) {
            s5dVar.T((getMeasuredWidth() - iG) - s5dVar.L(), rh4.c(8, fk4.d().getDisplayMetrics().density, (y5dVar.a() / 2) - (s5dVar.K() / 2)));
        }
        dw8 dw8Var = this.b;
        if (br7.H((je7) dw8Var.c)) {
            int iG3 = iK + tu0.G((iK == 0 ? 8 : 4) * fk4.d().getDisplayMetrics().density);
            dw8Var.T(iG, iG3);
            iK = iG3 + dw8Var.K();
        }
        float f = 1;
        int iG4 = tu0.G(fk4.d().getDisplayMetrics().density * f) + (iK == 0 ? 0 : tu0.G(8 * fk4.d().getDisplayMetrics().density)) + iK;
        int iB = b(tu0.G(f * fk4.d().getDisplayMetrics().density), iG4) + iG4;
        int measuredWidth = getMeasuredWidth();
        j34 j34Var = this.t0;
        float f2 = 4;
        ote.E(j34Var, rh4.q(f2, fk4.d().getDisplayMetrics().density, measuredWidth - j34Var.getMeasuredWidth()), rh4.q(f2, fk4.d().getDisplayMetrics().density, iB - j34Var.getMeasuredHeight()), 0, 12);
        r6c r6cVar = this.a;
        if (br7.H((je7) r6cVar.c)) {
            r6cVar.T(r6cVar.Z ? getMeasuredWidth() - r6cVar.L() : 0, rh4.c(f2, fk4.d().getDisplayMetrics().density, iB));
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iK;
        float f = 10;
        int iM = wg0.m(f, fk4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        int size = getDependOnOutsideView() ? View.MeasureSpec.getSize(i) : 0;
        s5d s5dVar = this.c;
        boolean zH = br7.H((je7) s5dVar.c);
        y5d y5dVar = this.s0;
        if (zH && br7.H(y5dVar.b)) {
            s5dVar.U(View.MeasureSpec.makeMeasureSpec(iM, Integer.MIN_VALUE), i2);
            size = Math.max(size, s5dVar.L());
        }
        if (br7.H(y5dVar.b)) {
            y5dVar.d(View.MeasureSpec.makeMeasureSpec(iM, Integer.MIN_VALUE), i2);
            size = Math.max(size, (tu0.G(fk4.d().getDisplayMetrics().density * f) * 2) + y5dVar.b() + s5dVar.h0());
            iK = y5dVar.a() + tu0.G(8 * fk4.d().getDisplayMetrics().density);
        } else {
            iK = 0;
        }
        dw8 dw8Var = this.b;
        if (br7.H((je7) dw8Var.c)) {
            dw8Var.U(View.MeasureSpec.makeMeasureSpec(iM, Integer.MIN_VALUE), i2);
            size = Math.max(size, (tu0.G(f * fk4.d().getDisplayMetrics().density) * 2) + dw8Var.L());
            iK += dw8Var.K() + tu0.G((iK == 0 ? 8 : 4) * fk4.d().getDisplayMetrics().density);
        }
        int iG = iK + (iK != 0 ? tu0.G(8 * fk4.d().getDisplayMetrics().density) : 0);
        this.t0.measure(i, i2);
        r6c r6cVar = this.a;
        if (br7.H((je7) r6cVar.c)) {
            r6cVar.U(View.MeasureSpec.makeMeasureSpec(iM, Integer.MIN_VALUE), i2);
            size = Math.max(size, r6cVar.L());
            int iC = rh4.c(8, fk4.d().getDisplayMetrics().density, r6cVar.K() + tu0.G(4 * fk4.d().getDisplayMetrics().density));
            iG += iC;
            ((vs8) getBackground()).w = iC;
        } else {
            ((vs8) getBackground()).w = 0.0f;
        }
        float f2 = 1;
        long jT = t(wg0.m(f2, fk4.d().getDisplayMetrics().density, 2, size), wg0.m(f2, fk4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i)), i, i2);
        setMeasuredDimension(Math.max(size, (tu0.G(fk4.d().getDisplayMetrics().density * f2) * 2) + ((int) (jT >> 32))), (tu0.G(f2 * fk4.d().getDisplayMetrics().density) * 2) + ((int) (jT & 4294967295L)) + iG);
    }

    public void p(vqd vqdVar) {
        setModel(vqdVar);
    }

    @Override // defpackage.l7c
    public final void q(boolean z) {
        this.a.q(z);
    }

    @Override // defpackage.u5d
    public void setAlias(Layout layout) {
        this.c.setAlias(layout);
    }

    @Override // defpackage.u5d
    public void setAliasColor(int i) {
        this.c.setAliasColor(i);
    }

    @Override // defpackage.l7c
    public void setChipObserver(w5c w5cVar) {
        this.a.setChipObserver(w5cVar);
    }

    @Override // defpackage.k34
    public void setDateBackgroundColor(int i) {
        this.t0.setBackgroundColor(i);
    }

    @Override // defpackage.k34
    public void setDateTextColor(int i) {
        this.t0.setTextColor$message_list_release(i);
    }

    @Override // defpackage.k34
    public void setDateViewStatus(zof zofVar) {
        this.t0.setStatus$message_list_release(zofVar);
    }

    @Override // defpackage.aoa
    public void setDependOnOutsideView(boolean z) {
        this.o.a = z;
    }

    @Override // defpackage.jw8
    public void setForwardClickListener(m56 m56Var) {
        this.b.X = m56Var;
    }

    @Override // defpackage.l7c
    public void setIsIncoming(boolean z) {
        this.a.o = z;
    }

    @Override // defpackage.jw8
    public void setLink(cw8 cw8Var) {
        this.b.setLink(cw8Var);
    }

    public void setModel(x38 x38Var) {
        this.u0.o1(this, v0[0], x38Var);
    }

    @Override // defpackage.l7c
    public void setOnClickListener(m56 m56Var) {
        this.a.X = m56Var;
    }

    @Override // defpackage.jw8
    public void setReplyClickListener(a66 a66Var) {
        this.b.o = a66Var;
    }

    @Override // defpackage.x5d
    public void setSenderName(Layout layout) {
        this.s0.e(layout);
    }

    @Override // defpackage.x5d
    public void setSenderNameColor(int i) {
        this.s0.f(i);
    }

    @Override // defpackage.l7c
    public void setStackFromEnd(boolean z) {
        this.a.Z = z;
    }
}
