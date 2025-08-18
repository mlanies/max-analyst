package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes2.dex */
public final class pa6 extends ViewGroup implements k34, x5d, l7c, jw8, u5d {
    public final int A0;
    public final int B0;
    public final int C0;
    public final r6c a;
    public final dw8 b;
    public final s5d c;
    public is0 o;
    public final khe s0;
    public final y5d t0;
    public final TextView u0;
    public final TextView v0;
    public final AppCompatImageView w0;
    public final j34 x0;
    public final int y0;
    public final int z0;

    public pa6(Context context) {
        r6c r6cVar = new r6c();
        dw8 dw8Var = new dw8();
        s5d s5dVar = new s5d();
        super(context);
        this.a = r6cVar;
        this.b = dw8Var;
        this.c = s5dVar;
        pq9 pq9Var = qp4.u0;
        this.o = pq9Var.j(this).a().g();
        this.s0 = new khe(new es3(22, this));
        this.t0 = new y5d(this);
        TextView textView = new TextView(context);
        kqe kqeVar = i4f.a;
        os2.i.b(textView, du4.b);
        textView.setTextColor(getTitleColor());
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.u0 = textView;
        TextView textView2 = new TextView(context);
        os2.f.b(textView2, du4.b);
        textView2.setTextColor(getSubtitleColor());
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        this.v0 = textView2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setBackground(getIconBackground());
        int iG = tu0.G(6 * fk4.d().getDisplayMetrics().density);
        appCompatImageView.setPadding(iG, iG, iG, iG);
        this.w0 = appCompatImageView;
        j34 j34Var = new j34(context);
        j34Var.setBackgroundEnabled$message_list_release(false);
        this.x0 = j34Var;
        this.y0 = tu0.G(10 * fk4.d().getDisplayMetrics().density);
        float f = 4;
        this.z0 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.A0 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.B0 = tu0.G(f * fk4.d().getDisplayMetrics().density);
        int iG2 = tu0.G(40 * fk4.d().getDisplayMetrics().density);
        this.C0 = iG2;
        dw8Var.b = this;
        r6cVar.b = this;
        s5dVar.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(appCompatImageView, new ViewGroup.LayoutParams(iG2, iG2));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView2, new ViewGroup.LayoutParams(-2, -2));
        addView(j34Var, new ViewGroup.LayoutParams(-2, -2));
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        qx7 qx7Var = vs8.y;
        fka fkaVarJ = pq9Var.j(this);
        qx7Var.getClass();
        setBackground(qx7.e(fkaVarJ));
    }

    public static ShapeDrawable a(pa6 pa6Var) {
        float f = fk4.d().getDisplayMetrics().density * 12.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(pa6Var.getIconBackgroundColor());
        return shapeDrawable;
    }

    private final ShapeDrawable getIconBackground() {
        return (ShapeDrawable) this.s0.getValue();
    }

    private final int getIconBackgroundColor() {
        return this.o.a.i;
    }

    private final int getIconColor() {
        return this.o.b.f;
    }

    private final int getSubtitleColor() {
        return this.o.d.f;
    }

    private final int getTitleColor() {
        return this.o.d.e;
    }

    public final void b(oa6 oa6Var, boolean z) {
        this.o = qp4.u0.j(this).a().d(z);
        TextView textView = this.u0;
        textView.setText(oa6Var.b);
        textView.setTextColor(getTitleColor());
        TextView textView2 = this.v0;
        textView2.setText(oa6Var.c);
        textView2.setTextColor(getSubtitleColor());
        AppCompatImageView appCompatImageView = this.w0;
        appCompatImageView.setImageResource(woc.P);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(getIconColor()));
    }

    @Override // defpackage.jw8
    public final void c(is0 is0Var) {
        this.b.c(is0Var);
    }

    public final void d(is0 is0Var) {
        this.o = is0Var;
        this.u0.setTextColor(getTitleColor());
        this.v0.setTextColor(getSubtitleColor());
        this.w0.setImageTintList(ColorStateList.valueOf(getIconColor()));
        getIconBackground().getPaint().setColor(getIconBackgroundColor());
        this.x0.setTextColor$message_list_release(this.o.d.m);
    }

    @Override // defpackage.l7c
    public final void f(ix8 ix8Var, boolean z) {
        this.a.f(ix8Var, z);
    }

    @Override // defpackage.k34
    public final void g(CharSequence charSequence, boolean z) {
        bc7[] bc7VarArr = j34.D0;
        this.x0.c(charSequence, false);
    }

    public int getAliasWidthWithPaddings() {
        return this.c.h0();
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
        y5d y5dVar = this.t0;
        boolean zH = br7.H(y5dVar.b);
        int i5 = this.y0;
        if (zH) {
            y5dVar.c(i5, i5);
            iK = y5dVar.a() + this.z0 + i5;
        } else {
            iK = i5;
        }
        s5d s5dVar = this.c;
        boolean zH2 = br7.H((je7) s5dVar.c);
        int i6 = this.y0;
        if (zH2 && br7.H(y5dVar.b)) {
            s5dVar.T((getMeasuredWidth() - i6) - s5dVar.L(), ((y5dVar.a() / 2) - (s5dVar.K() / 2)) + i6);
        }
        dw8 dw8Var = this.b;
        if (br7.H((je7) dw8Var.c)) {
            dw8Var.T(i5, iK);
            iK += dw8Var.K() + this.B0;
        }
        AppCompatImageView appCompatImageView = this.w0;
        int i7 = this.C0;
        int i8 = iK;
        c54.L(i5, i8, i5 + i7, iK + i7, appCompatImageView, this);
        int i9 = i5 + i7 + i6;
        TextView textView = this.u0;
        c54.L(i9, i8, textView.getMeasuredWidth() + i9, textView.getMeasuredHeight() + iK, textView, this);
        int measuredHeight = textView.getMeasuredHeight() + iK;
        TextView textView2 = this.v0;
        c54.L(i9, measuredHeight, textView2.getMeasuredWidth() + i9, textView2.getMeasuredHeight() + measuredHeight, textView2, this);
        int bottom = appCompatImageView.getBottom();
        r6c r6cVar = this.a;
        if (br7.H((je7) r6cVar.c)) {
            float f = 10;
            r6cVar.T(tu0.G(f * fk4.d().getDisplayMetrics().density), rh4.c(f, fk4.d().getDisplayMetrics().density, bottom));
            r6cVar.K();
        }
        int measuredWidth = getMeasuredWidth();
        j34 j34Var = this.x0;
        int measuredWidth2 = (measuredWidth - j34Var.getMeasuredWidth()) - i6;
        int measuredHeight2 = (getMeasuredHeight() - j34Var.getMeasuredHeight()) - this.A0;
        j34 j34Var2 = this.x0;
        c54.L(measuredWidth2, measuredHeight2, j34Var2.getMeasuredWidth() + measuredWidth2, j34Var.getMeasuredHeight() + measuredHeight2, j34Var2, this);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iK;
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.y0;
        int i4 = size - (i3 * 2);
        s5d s5dVar = this.c;
        boolean zH = br7.H((je7) s5dVar.c);
        y5d y5dVar = this.t0;
        int iMax = 0;
        if (zH && br7.H(y5dVar.b)) {
            s5dVar.U(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i2);
            iMax = Math.max(0, s5dVar.L());
        }
        if (br7.H(y5dVar.b)) {
            y5dVar.d(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, (i3 * 2) + y5dVar.b() + s5dVar.h0());
            iK = y5dVar.a() + this.z0 + i3;
        } else {
            iK = i3;
        }
        dw8 dw8Var = this.b;
        if (br7.H((je7) dw8Var.c)) {
            dw8Var.U(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, (i3 * 2) + dw8Var.L());
            iK += dw8Var.K() + this.B0;
        }
        j34 j34Var = this.x0;
        j34Var.measure(i, i2);
        this.w0.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i2);
        int i5 = this.C0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((i4 - i5) - (i3 * 2), Integer.MIN_VALUE);
        TextView textView = this.u0;
        textView.measure(iMakeMeasureSpec, i2);
        TextView textView2 = this.v0;
        textView2.measure(iMakeMeasureSpec, i2);
        int iMax2 = Math.max(Math.min(i4, j34Var.getMeasuredWidth() + Math.max(textView.getMeasuredWidth(), textView2.getMeasuredWidth()) + i5) + i3, iMax);
        int measuredHeight = j34Var.getMeasuredHeight() + rh4.c(2, fk4.d().getDisplayMetrics().density, textView.getMeasuredHeight() + textView2.getMeasuredHeight()) + this.A0 + iK;
        r6c r6cVar = this.a;
        if (br7.H((je7) r6cVar.c)) {
            r6cVar.U(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i2);
            float f = 10;
            iMax2 = Math.max(iMax2, (tu0.G(fk4.d().getDisplayMetrics().density * f) * 2) + r6cVar.L());
            measuredHeight = wg0.d(f, fk4.d().getDisplayMetrics().density, r6cVar.K(), measuredHeight);
        }
        setMeasuredDimension(iMax2, measuredHeight);
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
    }

    @Override // defpackage.k34
    public void setDateTextColor(int i) {
        this.x0.setTextColor$message_list_release(i);
    }

    @Override // defpackage.k34
    public void setDateViewStatus(zof zofVar) {
        this.x0.setStatus$message_list_release(zofVar);
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

    @Override // defpackage.x5d
    public void setSenderName(Layout layout) {
        this.t0.e(layout);
    }

    @Override // defpackage.x5d
    public void setSenderNameColor(int i) {
        this.t0.f(i);
    }

    @Override // defpackage.l7c
    public void setStackFromEnd(boolean z) {
        this.a.Z = z;
    }
}
