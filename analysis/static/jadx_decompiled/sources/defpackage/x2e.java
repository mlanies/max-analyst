package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class x2e extends ViewGroup implements k34, t2e, l7c, jw8 {
    public final t2e a;
    public final r6c b;
    public final dw8 c;
    public final FrameLayout o;
    public final int s0;
    public final j34 t0;

    public x2e(Context context, t2e t2eVar) {
        r6c r6cVar = new r6c();
        dw8 dw8Var = new dw8();
        super(context);
        this.a = t2eVar;
        this.b = r6cVar;
        this.c = dw8Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.o = frameLayout;
        this.s0 = tu0.G(10 * fk4.d().getDisplayMetrics().density);
        j34 j34Var = new j34(context);
        j34Var.setBackgroundEnabled$message_list_release(true);
        this.t0 = j34Var;
        r6cVar.b = this;
        dw8Var.b = this;
        t2eVar.setParent(frameLayout);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(frameLayout, new ViewGroup.LayoutParams(-2, -2));
        addView(j34Var, new ViewGroup.LayoutParams(-2, -2));
    }

    @Override // defpackage.t2e
    public final void a(z2e z2eVar) {
        this.a.a(z2eVar);
    }

    @Override // defpackage.t2e
    public final void b(gw7 gw7Var) {
        this.a.b(gw7Var);
    }

    @Override // defpackage.jw8
    public final void c(is0 is0Var) {
        this.c.c(is0Var);
    }

    @Override // defpackage.l7c
    public final void f(ix8 ix8Var, boolean z) {
        this.b.f(ix8Var, z);
    }

    @Override // defpackage.k34
    public final void g(CharSequence charSequence, boolean z) {
        bc7[] bc7VarArr = j34.D0;
        this.t0.c(charSequence, false);
    }

    @Override // defpackage.l7c
    public final void k(is0 is0Var, boolean z) {
        this.b.k(is0Var, z);
    }

    @Override // defpackage.jw8
    public final void l() {
        this.c.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        dw8 dw8Var = this.c;
        boolean zH = br7.H((je7) dw8Var.c);
        int measuredWidth2 = this.s0;
        int iG = zH ? tu0.G(4 * fk4.d().getDisplayMetrics().density) : measuredWidth2;
        float f = 10;
        int iG2 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        je7 je7Var = (je7) dw8Var.c;
        if (br7.H(je7Var)) {
            dw8Var.T(iG2, iG);
            iG = wg0.d(4, fk4.d().getDisplayMetrics().density, dw8Var.K(), iG);
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ys8 ys8Var = layoutParams instanceof ys8 ? (ys8) layoutParams : null;
        boolean z2 = (ys8Var == null || ys8Var.a) ? false : true;
        FrameLayout frameLayout = this.o;
        if (z2 && !br7.H(je7Var)) {
            iG2 = (getMeasuredWidth() - frameLayout.getMeasuredWidth()) - measuredWidth2;
        }
        ote.E(frameLayout, iG2, iG, 0, 12);
        int iD = wg0.d(2, fk4.d().getDisplayMetrics().density, frameLayout.getMeasuredHeight(), iG);
        boolean zH2 = br7.H(je7Var);
        j34 j34Var = this.t0;
        if (zH2 || z2) {
            measuredWidth = getMeasuredWidth() - j34Var.getMeasuredWidth();
        } else {
            measuredWidth = frameLayout.getMeasuredWidth();
            measuredWidth2 = j34Var.getMeasuredWidth();
        }
        ote.E(j34Var, measuredWidth - measuredWidth2, iD, 0, 12);
        int iC = iD + (getBackground() != null ? rh4.c(4, fk4.d().getDisplayMetrics().density, j34Var.getMeasuredHeight()) : j34Var.getMeasuredHeight());
        r6c r6cVar = this.b;
        if (br7.H((je7) r6cVar.c)) {
            r6cVar.T(r6cVar.Z ? getMeasuredWidth() - r6cVar.L() : 0, tu0.G(f * fk4.d().getDisplayMetrics().density) + iC);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.s0;
        int i4 = size - (i3 * 2);
        int iG = tu0.G(8 * fk4.d().getDisplayMetrics().density);
        FrameLayout frameLayout = this.o;
        frameLayout.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i2);
        int iMax = Math.max(0, frameLayout.getMeasuredWidth());
        int measuredHeight = frameLayout.getMeasuredHeight() + iG;
        dw8 dw8Var = this.c;
        if (br7.H((je7) dw8Var.c)) {
            dw8Var.U(View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, (tu0.G(10 * fk4.d().getDisplayMetrics().density) * 2) + dw8Var.L());
            measuredHeight += (tu0.G(4 * fk4.d().getDisplayMetrics().density) * 2) + dw8Var.K();
        }
        j34 j34Var = this.t0;
        j34Var.measure(i, i2);
        int iD = wg0.d(4, fk4.d().getDisplayMetrics().density, j34Var.getMeasuredHeight() + tu0.G(2 * fk4.d().getDisplayMetrics().density), measuredHeight);
        int iMax2 = (i3 * 2) + iMax;
        r6c r6cVar = this.b;
        if (br7.H((je7) r6cVar.c)) {
            r6cVar.U(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i2);
            iMax2 = Math.max(iMax2, r6cVar.L());
            iD = wg0.d(10, fk4.d().getDisplayMetrics().density, r6cVar.K(), iD);
        }
        setMeasuredDimension(iMax2, iD);
    }

    @Override // defpackage.l7c
    public final void q(boolean z) {
        this.b.q(z);
    }

    @Override // defpackage.l7c
    public void setChipObserver(w5c w5cVar) {
        this.b.setChipObserver(w5cVar);
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

    @Override // defpackage.jw8
    public void setForwardClickListener(m56 m56Var) {
        this.c.X = m56Var;
    }

    @Override // defpackage.l7c
    public void setIsIncoming(boolean z) {
        this.b.o = z;
    }

    @Override // defpackage.jw8
    public void setLink(cw8 cw8Var) {
        this.c.setLink(cw8Var);
    }

    @Override // defpackage.l7c
    public void setOnClickListener(m56 m56Var) {
        this.b.X = m56Var;
    }

    @Override // defpackage.t2e
    public void setParent(ViewGroup viewGroup) {
        this.a.setParent(viewGroup);
    }

    @Override // defpackage.jw8
    public void setReplyClickListener(a66 a66Var) {
        this.c.o = a66Var;
    }

    @Override // defpackage.l7c
    public void setStackFromEnd(boolean z) {
        this.b.Z = z;
    }
}
