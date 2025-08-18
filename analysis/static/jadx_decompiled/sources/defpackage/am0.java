package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class am0 extends ViewGroup implements k34, qpe, l7c, jw8, aoa {
    public final r6c a;
    public final dw8 b;
    public final boa c;
    public final dy8 o;
    public final j34 s0;
    public final int t0;

    public am0(Context context) {
        r6c r6cVar = new r6c();
        dw8 dw8Var = new dw8();
        boa boaVar = new boa();
        super(context);
        this.a = r6cVar;
        this.b = dw8Var;
        this.c = boaVar;
        dy8 dy8Var = new dy8(context);
        dy8Var.setId(mda.N);
        this.o = dy8Var;
        j34 j34Var = new j34(context);
        j34Var.setBackgroundEnabled$message_list_release(true);
        this.s0 = j34Var;
        this.t0 = tu0.G(10 * fk4.d().getDisplayMetrics().density);
        r6cVar.b = this;
        dw8Var.b = this;
        dy8Var.setSingleClickAction(new b(16, this));
        dy8Var.setOnLongClickListener(new zl0(0, this));
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(dy8Var, new ViewGroup.LayoutParams(-2, -2));
        addView(j34Var, new ViewGroup.LayoutParams(-2, -2));
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
        this.s0.c(charSequence, z);
    }

    public boolean getDependOnOutsideView() {
        return this.c.a;
    }

    public final CharSequence getText() {
        return this.o.getText();
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
        int iD;
        int measuredWidth;
        dw8 dw8Var = this.b;
        boolean zH = br7.H((je7) dw8Var.c);
        int measuredWidth2 = this.t0;
        if (zH) {
            dw8Var.T(measuredWidth2, measuredWidth2);
            iD = wg0.d(4, fk4.d().getDisplayMetrics().density, dw8Var.K(), measuredWidth2);
        } else {
            iD = measuredWidth2;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ys8 ys8Var = layoutParams instanceof ys8 ? (ys8) layoutParams : null;
        boolean z2 = (ys8Var == null || ys8Var.a) ? false : true;
        dy8 dy8Var = this.o;
        je7 je7Var = (je7) dw8Var.c;
        ote.E(dy8Var, (!z2 || br7.H(je7Var)) ? measuredWidth2 : (getMeasuredWidth() - dy8Var.getMeasuredWidth()) - measuredWidth2, iD, 0, 12);
        int measuredHeight = dy8Var.getMeasuredHeight() + (getBackground() == null ? tu0.G(2 * fk4.d().getDisplayMetrics().density) : 0) + iD;
        boolean zH2 = br7.H(je7Var);
        j34 j34Var = this.s0;
        if (zH2 || z2) {
            measuredWidth = getMeasuredWidth() - j34Var.getMeasuredWidth();
        } else {
            measuredWidth = dy8Var.getMeasuredWidth();
            measuredWidth2 = j34Var.getMeasuredWidth();
        }
        ote.E(j34Var, measuredWidth - measuredWidth2, measuredHeight, 0, 12);
        int iC = measuredHeight + (getBackground() != null ? rh4.c(4, fk4.d().getDisplayMetrics().density, j34Var.getMeasuredHeight()) : j34Var.getMeasuredHeight());
        r6c r6cVar = this.a;
        if (br7.H((je7) r6cVar.c)) {
            r6cVar.T(r6cVar.Z ? getMeasuredWidth() - r6cVar.L() : 0, tu0.G(10 * fk4.d().getDisplayMetrics().density) + iC);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float f = 10;
        int iM = wg0.m(f, fk4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        dy8 dy8Var = this.o;
        dy8Var.h();
        int measuredWidth = getDependOnOutsideView() ? iM : dy8Var.getMeasuredWidth();
        int measuredHeight = dy8Var.getMeasuredHeight() + (getBackground() == null ? tu0.G(2 * fk4.d().getDisplayMetrics().density) : 0);
        dw8 dw8Var = this.b;
        if (br7.H((je7) dw8Var.c)) {
            dw8Var.U(View.MeasureSpec.makeMeasureSpec(iM, Integer.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, dw8Var.L());
            measuredHeight = wg0.d(4, fk4.d().getDisplayMetrics().density, dw8Var.K(), measuredHeight);
        }
        r6c r6cVar = this.a;
        if (br7.H((je7) r6cVar.c)) {
            r6cVar.U(View.MeasureSpec.makeMeasureSpec(iM, Integer.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, r6cVar.L());
            measuredHeight = wg0.d(f, fk4.d().getDisplayMetrics().density, r6cVar.K(), measuredHeight);
        }
        j34 j34Var = this.s0;
        j34Var.measure(i, i2);
        setMeasuredDimension((tu0.G(f * fk4.d().getDisplayMetrics().density) * 2) + Math.max(measuredWidth, j34Var.getMeasuredWidth()), (tu0.G(8 * fk4.d().getDisplayMetrics().density) * 2) + j34Var.getMeasuredHeight() + measuredHeight);
    }

    @Override // defpackage.l7c
    public final void q(boolean z) {
        this.a.q(z);
    }

    @Override // defpackage.l7c
    public void setChipObserver(w5c w5cVar) {
        this.a.setChipObserver(w5cVar);
    }

    @Override // defpackage.k34
    public void setDateBackgroundColor(int i) {
        this.s0.setBackgroundColor(i);
    }

    @Override // defpackage.k34
    public void setDateTextColor(int i) {
        this.s0.setTextColor$message_list_release(i);
    }

    @Override // defpackage.k34
    public void setDateViewStatus(zof zofVar) {
        this.s0.setStatus$message_list_release(zofVar);
    }

    @Override // defpackage.aoa
    public void setDependOnOutsideView(boolean z) {
        this.c.a = z;
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

    @Override // defpackage.l7c
    public void setOnClickListener(m56 m56Var) {
        this.a.X = m56Var;
    }

    @Override // defpackage.jw8
    public void setReplyClickListener(a66 a66Var) {
        this.b.o = a66Var;
    }

    @Override // defpackage.l7c
    public void setStackFromEnd(boolean z) {
        this.a.Z = z;
    }

    @Override // defpackage.qpe
    public void setTextMessageColors(is0 is0Var) {
        this.o.setTextColors(is0Var);
    }

    @Override // defpackage.qpe
    public void setTextMessageLayout(by8 by8Var) {
        this.o.setLayout(by8Var);
    }

    @Override // defpackage.qpe
    public /* bridge */ /* synthetic */ void setTextMessageLinkClickListener(hk7 hk7Var) {
    }
}
