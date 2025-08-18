package defpackage;

import android.content.Context;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: classes2.dex */
public class ppe extends ViewGroup implements x5d, k34, qpe, nk6, ot8, l7c, jw8, aoa, u5d, ck7 {
    public final r6c a;
    public final dw8 b;
    public final boa c;
    public final s5d o;
    public final y5d s0;
    public final dy8 t0;
    public final j34 u0;
    public final int v0;
    public final int w0;
    public final int x0;
    public final int y0;
    public i33 z0;

    public ppe(Context context) {
        r6c r6cVar = new r6c();
        dw8 dw8Var = new dw8();
        boa boaVar = new boa();
        s5d s5dVar = new s5d();
        super(context);
        this.a = r6cVar;
        this.b = dw8Var;
        this.c = boaVar;
        this.o = s5dVar;
        this.s0 = new y5d(this);
        dy8 dy8Var = new dy8(context);
        dy8Var.setId(mda.N);
        this.t0 = dy8Var;
        j34 j34Var = new j34(context);
        this.u0 = j34Var;
        this.v0 = tu0.G(8 * fk4.d().getDisplayMetrics().density);
        this.w0 = tu0.G(10 * fk4.d().getDisplayMetrics().density);
        float f = 4;
        this.x0 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.y0 = tu0.G(f * fk4.d().getDisplayMetrics().density);
        r6cVar.b = this;
        dw8Var.b = this;
        s5dVar.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(dy8Var, new ViewGroup.LayoutParams(-2, -2));
        addView(j34Var, new ViewGroup.LayoutParams(-2, -2));
        qx7 qx7Var = vs8.y;
        fka fkaVarJ = qp4.u0.j(this);
        qx7Var.getClass();
        setBackground(qx7.e(fkaVarJ));
        setWillNotDraw(false);
        final int i = 0;
        dy8Var.setSingleClickAction(new Runnable(this) { // from class: ope
            public final /* synthetic */ ppe b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        ((View) this.b.getParent()).performClick();
                        break;
                    default:
                        ((View) this.b.getParent()).performClick();
                        break;
                }
            }
        });
        final int i2 = 1;
        dy8Var.setTryToSingleClickAction(new Runnable(this) { // from class: ope
            public final /* synthetic */ ppe b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        ((View) this.b.getParent()).performClick();
                        break;
                    default:
                        ((View) this.b.getParent()).performClick();
                        break;
                }
            }
        });
        dy8Var.setOnLongClickListener(new zl0(10, this));
        dy8Var.setLinkLongClickListener(new bqc(27, this));
    }

    @Override // defpackage.jw8
    public final void c(is0 is0Var) {
        this.b.c(is0Var);
    }

    @Override // defpackage.nk6
    public final void e(List list, a66 a66Var) {
        CharSequence text = getText();
        if (text == null) {
            return;
        }
        dy8 dy8Var = this.t0;
        if (list == null || list.isEmpty() || a66Var == null) {
            dy8.f(dy8Var);
        } else {
            dy8Var.g((List) a66Var.invoke(text.toString(), list));
        }
    }

    @Override // defpackage.l7c
    public final void f(ix8 ix8Var, boolean z) {
        this.a.f(ix8Var, z);
    }

    public void g(CharSequence charSequence, boolean z) {
        this.u0.c(charSequence, z);
    }

    public int getAliasWidthWithPaddings() {
        return this.o.h0();
    }

    public final int getContentHorizontalPadding$message_list_release() {
        return this.w0;
    }

    public final int getContentTopPadding$message_list_release() {
        return this.v0;
    }

    public final j34 getDate$message_list_release() {
        return this.u0;
    }

    public boolean getDependOnOutsideView() {
        return this.c.a;
    }

    public final dw8 getMessageLinkDelegate() {
        return this.b;
    }

    public final dy8 getMessageTextView$message_list_release() {
        return this.t0;
    }

    public i33 getOnLinkLongClickListener() {
        return this.z0;
    }

    public final r6c getReactionsDelegate() {
        return this.a;
    }

    public final s5d getSenderAliasDelegate() {
        return this.o;
    }

    public final int getSenderBottomMargin$message_list_release() {
        return this.x0;
    }

    public final y5d getSenderNameViewStub$message_list_release() {
        return this.s0;
    }

    public final int getStatusBottomMargin$message_list_release() {
        return this.y0;
    }

    public final CharSequence getText() {
        return this.t0.getText();
    }

    public boolean h(MotionEvent motionEvent) {
        return false;
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
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iD;
        y5d y5dVar = this.s0;
        boolean zH = br7.H(y5dVar.b);
        int i5 = this.w0;
        int i6 = this.v0;
        if (zH) {
            y5dVar.c(i5, i6);
            iD = wg0.d(4, fk4.d().getDisplayMetrics().density, y5dVar.a(), i6);
        } else {
            iD = i6;
        }
        s5d s5dVar = this.o;
        if (br7.H((je7) s5dVar.c) && br7.H(y5dVar.b)) {
            s5dVar.T((getMeasuredWidth() - i5) - s5dVar.L(), ((y5dVar.a() / 2) - (s5dVar.K() / 2)) + i6);
        }
        dw8 dw8Var = this.b;
        if (br7.H((je7) dw8Var.c)) {
            dw8Var.T(i5, iD);
            iD = wg0.d(4, fk4.d().getDisplayMetrics().density, dw8Var.K(), iD);
        }
        dy8 dy8Var = this.t0;
        ote.E(dy8Var, i5, iD, 0, 12);
        int measuredHeight = dy8Var.getMeasuredHeight() + iD;
        r6c r6cVar = this.a;
        if (br7.H((je7) r6cVar.c)) {
            r6cVar.T(i5, tu0.G(8 * fk4.d().getDisplayMetrics().density) + measuredHeight);
            r6cVar.K();
        }
        int measuredWidth = getMeasuredWidth();
        j34 j34Var = this.u0;
        ote.E(j34Var, (measuredWidth - j34Var.getMeasuredWidth()) - i5, rh4.q(4, fk4.d().getDisplayMetrics().density, getMeasuredHeight() - j34Var.getMeasuredHeight()), 0, 12);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        float f = 10;
        int iM = wg0.m(f, fk4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        dy8 dy8Var = this.t0;
        dy8Var.h();
        int measuredWidth = getDependOnOutsideView() ? iM : dy8Var.getMeasuredWidth();
        int measuredHeight = dy8Var.getMeasuredHeight();
        s5d s5dVar = this.o;
        boolean zH = br7.H((je7) s5dVar.c);
        y5d y5dVar = this.s0;
        if (zH && br7.H(y5dVar.b)) {
            s5dVar.U(View.MeasureSpec.makeMeasureSpec(iM, Integer.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, s5dVar.L());
        }
        if (br7.H(y5dVar.b)) {
            y5dVar.d(View.MeasureSpec.makeMeasureSpec(iM, Integer.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, y5dVar.b() + s5dVar.h0());
            measuredHeight = wg0.d(4, fk4.d().getDisplayMetrics().density, y5dVar.a(), measuredHeight);
        }
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
        j34 j34Var = this.u0;
        j34Var.measure(i, i2);
        int iC = rh4.c(f, fk4.d().getDisplayMetrics().density, j34Var.getMeasuredWidth() + rh4.c(6, fk4.d().getDisplayMetrics().density, br7.H((je7) r6cVar.c) ? r6cVar.L() : dy8Var.e(iM)));
        if (iC < iM) {
            measuredWidth = Math.max(measuredWidth, iC);
        } else {
            measuredHeight = rh4.c(12, fk4.d().getDisplayMetrics().density, measuredHeight);
        }
        setMeasuredDimension((tu0.G(fk4.d().getDisplayMetrics().density * f) * 2) + measuredWidth, wg0.d(f, fk4.d().getDisplayMetrics().density, tu0.G(8 * fk4.d().getDisplayMetrics().density), measuredHeight));
    }

    @Override // defpackage.l7c
    public final void q(boolean z) {
        this.a.q(z);
    }

    @Override // defpackage.u5d
    public void setAlias(Layout layout) {
        this.o.setAlias(layout);
    }

    @Override // defpackage.u5d
    public void setAliasColor(int i) {
        this.o.setAliasColor(i);
    }

    @Override // defpackage.l7c
    public void setChipObserver(w5c w5cVar) {
        this.a.setChipObserver(w5cVar);
    }

    public void setDateBackgroundColor(int i) {
        this.u0.setBackgroundColor(i);
    }

    public void setDateTextColor(int i) {
        this.u0.setTextColor$message_list_release(i);
    }

    public void setDateViewStatus(zof zofVar) {
        this.u0.setStatus$message_list_release(zofVar);
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

    public final void setMaxHeightForClip(int i) {
        this.t0.setMaxHeightForClip(i);
    }

    @Override // defpackage.l7c
    public void setOnClickListener(m56 m56Var) {
        this.a.X = m56Var;
    }

    @Override // defpackage.ck7
    public void setOnLinkLongClickListener(i33 i33Var) {
        this.z0 = i33Var;
    }

    @Override // defpackage.jw8
    public void setReplyClickListener(a66 a66Var) {
        this.b.o = a66Var;
    }

    public void setSenderName(Layout layout) {
        this.s0.e(layout);
    }

    public void setSenderNameColor(int i) {
        this.s0.f(i);
    }

    @Override // defpackage.l7c
    public void setStackFromEnd(boolean z) {
        this.a.Z = z;
    }

    @Override // defpackage.qpe
    public void setTextMessageColors(is0 is0Var) {
        this.t0.setTextColors(is0Var);
    }

    @Override // defpackage.qpe
    public void setTextMessageLayout(by8 by8Var) {
        this.t0.setLayout(by8Var);
    }

    @Override // defpackage.qpe
    public void setTextMessageLinkClickListener(hk7 hk7Var) {
        this.t0.setLinkListener(hk7Var);
    }
}
