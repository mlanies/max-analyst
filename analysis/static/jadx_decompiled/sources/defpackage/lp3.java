package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes2.dex */
public final class lp3 extends ViewGroup implements k34, x5d, l7c, jw8, u5d {
    public final int A0;
    public boolean B0;
    public final r6c a;
    public final dw8 b;
    public final s5d c;
    public final m56 o;
    public final khe s0;
    public final y5d t0;
    public final TextView u0;
    public final TextView v0;
    public final s5a w0;
    public final je7 x0;
    public final je7 y0;
    public final j34 z0;

    public lp3(final Context context, om8 om8Var) {
        final int i = 0;
        final int i2 = 1;
        r6c r6cVar = new r6c();
        dw8 dw8Var = new dw8();
        s5d s5dVar = new s5d();
        super(context);
        this.a = r6cVar;
        this.b = dw8Var;
        this.c = s5dVar;
        this.o = om8Var;
        this.s0 = new khe(new md1(26, this));
        this.t0 = new y5d(this);
        TextView textView = new TextView(context);
        kqe kqeVar = i4f.a;
        os2.i.b(textView, du4.b);
        textView.setTextColor(getTitleColor());
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.u0 = textView;
        TextView textView2 = new TextView(context);
        os2.f.b(textView2, du4.b);
        textView2.setTextColor(getSubtitleColor());
        this.v0 = textView2;
        s5a s5aVar = new s5a(context);
        this.w0 = s5aVar;
        this.x0 = tu0.r(3, new k56() { // from class: kp3
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return lp3.a(context, this);
                    default:
                        return lp3.b(context, this);
                }
            }
        });
        this.y0 = tu0.r(3, new k56() { // from class: kp3
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return lp3.a(context, this);
                    default:
                        return lp3.b(context, this);
                }
            }
        });
        j34 j34Var = new j34(context);
        j34Var.setBackgroundEnabled$message_list_release(false);
        this.z0 = j34Var;
        this.A0 = 4;
        r6cVar.b = this;
        dw8Var.b = this;
        s5dVar.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        float f = 44;
        addView(s5aVar, new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView2, new ViewGroup.LayoutParams(-2, -2));
        addView(j34Var, new ViewGroup.LayoutParams(-2, -2));
        setClipChildren(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        qx7 qx7Var = vs8.y;
        fka fkaVarJ = qp4.u0.j(this);
        qx7Var.getClass();
        setBackground(qx7.e(fkaVarJ));
        setWillNotDraw(false);
        setTransitionGroup(true);
    }

    public static AppCompatImageView a(Context context, lp3 lp3Var) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setBackground(lp3Var.getIconBackground());
        int iG = tu0.G(4 * fk4.d().getDisplayMetrics().density);
        appCompatImageView.setPadding(iG, iG, iG, iG);
        float f = 32;
        lp3Var.addView(appCompatImageView, new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        appCompatImageView.requestLayout();
        return appCompatImageView;
    }

    public static AppCompatImageView b(Context context, lp3 lp3Var) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setBackground(lp3Var.getIconBackground());
        int iG = tu0.G(4 * fk4.d().getDisplayMetrics().density);
        appCompatImageView.setPadding(iG, iG, iG, iG);
        float f = 32;
        lp3Var.addView(appCompatImageView, new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        appCompatImageView.requestLayout();
        return appCompatImageView;
    }

    public static ShapeDrawable d(lp3 lp3Var) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(lp3Var.getIconBackgroundColor());
        return shapeDrawable;
    }

    private final is0 getColors() {
        return qp4.u0.j(this).a().d(this.B0);
    }

    private final ShapeDrawable getIconBackground() {
        return (ShapeDrawable) this.s0.getValue();
    }

    private final int getIconBackgroundColor() {
        return getColors().a.g;
    }

    private final int getIconColor() {
        return getColors().b.b;
    }

    private final int getSubtitleColor() {
        return getColors().d.f;
    }

    private final int getTitleColor() {
        return getColors().d.e;
    }

    private final void setSubtitle(CharSequence charSequence) {
        this.v0.setText(charSequence);
    }

    private final void setTitle(CharSequence charSequence) {
        this.u0.setText(charSequence);
    }

    @Override // defpackage.jw8
    public final void c(is0 is0Var) {
        this.b.c(is0Var);
    }

    public final void e() {
        this.u0.setTextColor(getTitleColor());
        this.v0.setTextColor(getSubtitleColor());
        getIconBackground().getPaint().setColor(getIconBackgroundColor());
        this.z0.setTextColor$message_list_release(getColors().d.m);
        je7 je7Var = this.y0;
        if (je7Var.a()) {
            ((AppCompatImageView) je7Var.getValue()).setImageTintList(ColorStateList.valueOf(getIconColor()));
        }
        je7 je7Var2 = this.x0;
        if (je7Var2.a()) {
            ((AppCompatImageView) je7Var2.getValue()).setImageTintList(ColorStateList.valueOf(getIconColor()));
        }
    }

    @Override // defpackage.l7c
    public final void f(ix8 ix8Var, boolean z) {
        this.a.f(ix8Var, z);
    }

    @Override // defpackage.k34
    public final void g(CharSequence charSequence, boolean z) {
        bc7[] bc7VarArr = j34.D0;
        this.z0.c(charSequence, false);
    }

    public int getAliasWidthWithPaddings() {
        return this.c.h0();
    }

    public final void h(je7 je7Var, Drawable drawable) {
        if (drawable == null) {
            if (je7Var.a()) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) je7Var.getValue();
                appCompatImageView.setImageDrawable(null);
                appCompatImageView.setVisibility(8);
                return;
            }
            return;
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) je7Var.getValue();
        int iG = tu0.G(8 * fk4.d().getDisplayMetrics().density);
        appCompatImageView2.setPadding(iG, iG, iG, iG);
        appCompatImageView2.setImageDrawable(drawable);
        appCompatImageView2.setImageTintList(ColorStateList.valueOf(getIconColor()));
        appCompatImageView2.setVisibility(0);
    }

    public final void i(final bk3 bk3Var) {
        this.B0 = bk3Var.g;
        setTitle(bk3Var.b);
        setSubtitle(bk3Var.h);
        j5a j5aVar = j5a.a;
        s5a s5aVar = this.w0;
        s5aVar.setAvatarShape(j5aVar);
        s5a.i(s5aVar, bk3Var.d, Long.valueOf(bk3Var.a), bk3Var.e);
        je7 je7Var = this.y0;
        h(je7Var, bk3Var.j);
        je7 je7Var2 = this.x0;
        h(je7Var2, bk3Var.i);
        if (je7Var.a()) {
            final int i = 0;
            tu0.K((AppCompatImageView) je7Var.getValue(), 300L, new View.OnClickListener(this) { // from class: jp3
                public final /* synthetic */ lp3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            bk3 bk3Var2 = bk3Var;
                            this.b.o.invoke(new c19(bk3Var2.k, bk3Var2));
                            break;
                        default:
                            bk3 bk3Var3 = bk3Var;
                            this.b.o.invoke(new d19(bk3Var3.k, bk3Var3));
                            break;
                    }
                }
            });
        }
        if (je7Var2.a()) {
            final int i2 = 1;
            tu0.K((AppCompatImageView) je7Var2.getValue(), 300L, new View.OnClickListener(this) { // from class: jp3
                public final /* synthetic */ lp3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            bk3 bk3Var2 = bk3Var;
                            this.b.o.invoke(new c19(bk3Var2.k, bk3Var2));
                            break;
                        default:
                            bk3 bk3Var3 = bk3Var;
                            this.b.o.invoke(new d19(bk3Var3.k, bk3Var3));
                            break;
                    }
                }
            });
        }
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
        float f;
        int measuredHeight;
        int iG;
        float f2 = 8;
        int iG2 = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        float f3 = 10;
        int iG3 = tu0.G(fk4.d().getDisplayMetrics().density * f3);
        int iG4 = tu0.G(32 * fk4.d().getDisplayMetrics().density);
        int iG5 = tu0.G(fk4.d().getDisplayMetrics().density * f3);
        y5d y5dVar = this.t0;
        if (br7.H(y5dVar.b)) {
            y5dVar.c(iG5, iG3);
            iD = wg0.d(4, fk4.d().getDisplayMetrics().density, y5dVar.a(), iG3);
        } else {
            iD = iG3;
        }
        s5d s5dVar = this.c;
        if (br7.H((je7) s5dVar.c) && br7.H(y5dVar.b)) {
            s5dVar.T((getMeasuredWidth() - iG5) - s5dVar.L(), ((y5dVar.a() / 2) - (s5dVar.K() / 2)) + iG3);
        }
        dw8 dw8Var = this.b;
        if (br7.H((je7) dw8Var.c)) {
            dw8Var.T(iG5, iD);
            iD = wg0.d(4, fk4.d().getDisplayMetrics().density, dw8Var.K(), iD);
        }
        s5a s5aVar = this.w0;
        int measuredWidth = s5aVar.getMeasuredWidth() + iG2 + iG5;
        TextView textView = this.u0;
        int measuredHeight2 = textView.getMeasuredHeight();
        TextView textView2 = this.v0;
        if (textView2.getMeasuredHeight() + measuredHeight2 > s5aVar.getMeasuredHeight()) {
            ote.E(textView, measuredWidth, iD, 0, 12);
            ote.E(textView2, measuredWidth, textView.getBottom(), 0, 12);
            iG = tu0.G(((textView2.getMeasuredHeight() + textView.getMeasuredHeight()) / 2.0f) + textView.getTop());
            ote.E(s5aVar, iG5, iG - (s5aVar.getMeasuredHeight() / 2), 0, 12);
            measuredHeight = textView2.getMeasuredHeight() + textView.getMeasuredHeight() + iD;
            f = f3;
        } else {
            ote.E(s5aVar, iG5, iD, 0, 12);
            int measuredHeight3 = (s5aVar.getMeasuredHeight() / 2) + iD;
            f = f3;
            ote.D(textView, measuredWidth, measuredHeight3 - textView.getMeasuredHeight(), textView.getMeasuredWidth() + measuredWidth, textView.getMeasuredHeight() + measuredHeight3);
            ote.E(textView2, measuredWidth, measuredHeight3, 0, 12);
            measuredHeight = s5aVar.getMeasuredHeight() + iD;
            iG = measuredHeight3;
        }
        int i5 = iG - (iG4 / 2);
        int measuredWidth2 = getMeasuredWidth() - iG3;
        je7 je7Var = this.y0;
        if (br7.H(je7Var)) {
            int i6 = measuredWidth2 - iG4;
            ote.D((AppCompatImageView) je7Var.getValue(), i6, i5, measuredWidth2, i5 + iG4);
            measuredWidth2 = i6 - iG2;
        }
        je7 je7Var2 = this.x0;
        if (br7.H(je7Var2)) {
            ote.D((AppCompatImageView) je7Var2.getValue(), measuredWidth2 - iG4, i5, measuredWidth2, iG4 + i5);
        }
        r6c r6cVar = this.a;
        if (br7.H((je7) r6cVar.c)) {
            r6cVar.T(tu0.G(fk4.d().getDisplayMetrics().density * f), rh4.c(f2, fk4.d().getDisplayMetrics().density, measuredHeight));
            r6cVar.K();
        }
        int measuredWidth3 = getMeasuredWidth();
        j34 j34Var = this.z0;
        int measuredWidth4 = (measuredWidth3 - j34Var.getMeasuredWidth()) - iG2;
        int iQ = rh4.q(6, fk4.d().getDisplayMetrics().density, getMeasuredHeight() - j34Var.getMeasuredHeight());
        int measuredWidth5 = j34Var.getMeasuredWidth() + measuredWidth4;
        int measuredHeight4 = j34Var.getMeasuredHeight() + iQ;
        View view = (View) j34Var.getParent();
        if (c54.K(j34Var)) {
            j34Var.layout(view.getMeasuredWidth() - measuredWidth5, iQ, view.getMeasuredWidth() - measuredWidth4, measuredHeight4);
        } else {
            j34Var.layout(measuredWidth4, iQ, measuredWidth5, measuredHeight4);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iG;
        int iD;
        int size = View.MeasureSpec.getSize(i);
        float f = 10;
        int iM = wg0.m(f, fk4.d().getDisplayMetrics().density, 2, size);
        int iG2 = tu0.G(32 * fk4.d().getDisplayMetrics().density);
        int iG3 = tu0.G(44 * fk4.d().getDisplayMetrics().density);
        float f2 = 8;
        int iG4 = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        int iG5 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        je7 je7Var = this.y0;
        int i3 = iG2 + iG4;
        Integer numValueOf = Integer.valueOf(i3);
        if (!br7.H(je7Var)) {
            numValueOf = 0;
        }
        int iIntValue = iM - numValueOf.intValue();
        je7 je7Var2 = this.x0;
        Integer numValueOf2 = Integer.valueOf(i3);
        if (!br7.H(je7Var2)) {
            numValueOf2 = 0;
        }
        int iIntValue2 = (((iIntValue - numValueOf2.intValue()) - (iG3 + iG4)) - iG5) - iG5;
        s5d s5dVar = this.c;
        boolean zH = br7.H((je7) s5dVar.c);
        y5d y5dVar = this.t0;
        if (zH && br7.H(y5dVar.b)) {
            s5dVar.U(View.MeasureSpec.makeMeasureSpec(iM, Integer.MIN_VALUE), i2);
        }
        if (br7.H(y5dVar.b)) {
            y5dVar.d(View.MeasureSpec.makeMeasureSpec(iM, Integer.MIN_VALUE), i2);
            iG = rh4.c(this.A0, fk4.d().getDisplayMetrics().density, y5dVar.a() + iG4);
        } else {
            iG = tu0.G(fk4.d().getDisplayMetrics().density * f);
        }
        dw8 dw8Var = this.b;
        if (br7.H((je7) dw8Var.c)) {
            dw8Var.U(View.MeasureSpec.makeMeasureSpec(iM, Integer.MIN_VALUE), i2);
            iG += dw8Var.K();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iG3, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iG3, 1073741824);
        s5a s5aVar = this.w0;
        s5aVar.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        TextView textView = this.u0;
        textView.measure(View.MeasureSpec.makeMeasureSpec(iIntValue2, 1073741824), i2);
        TextView textView2 = this.v0;
        textView2.measure(View.MeasureSpec.makeMeasureSpec(iIntValue2, Integer.MIN_VALUE), i2);
        if (br7.H(je7Var)) {
            ((AppCompatImageView) je7Var.getValue()).measure(View.MeasureSpec.makeMeasureSpec(iG2, 1073741824), i2);
        }
        if (br7.H(je7Var2)) {
            ((AppCompatImageView) je7Var2.getValue()).measure(View.MeasureSpec.makeMeasureSpec(iG2, 1073741824), i2);
        }
        int iMax = Math.max(s5aVar.getMeasuredHeight(), textView2.getMeasuredHeight() + textView.getMeasuredHeight()) + iG;
        r6c r6cVar = this.a;
        if (br7.H((je7) r6cVar.c)) {
            r6cVar.U(View.MeasureSpec.makeMeasureSpec(iM, Integer.MIN_VALUE), i2);
            iMax = wg0.d(f2, fk4.d().getDisplayMetrics().density, r6cVar.K(), iMax);
        }
        j34 j34Var = this.z0;
        j34Var.measure(i, i2);
        float f3 = 6;
        int iC = rh4.c(f, fk4.d().getDisplayMetrics().density, j34Var.getMeasuredWidth() + rh4.c(f3, fk4.d().getDisplayMetrics().density, r6cVar.L()));
        if (!br7.H((je7) r6cVar.c) || iC >= iM) {
            iD = wg0.d(f3, fk4.d().getDisplayMetrics().density, j34Var.getMeasuredHeight(), iMax);
        } else {
            iD = rh4.c(f, fk4.d().getDisplayMetrics().density, iMax);
        }
        setMeasuredDimension(size, iD);
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
        this.z0.setTextColor$message_list_release(i);
    }

    @Override // defpackage.k34
    public void setDateViewStatus(zof zofVar) {
        this.z0.setStatus$message_list_release(zofVar);
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
