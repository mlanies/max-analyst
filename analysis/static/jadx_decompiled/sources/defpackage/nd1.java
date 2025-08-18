package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
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
public final class nd1 extends ViewGroup implements k34, x5d, l7c, u5d {
    public final r6c a;
    public final s5d b;
    public final khe c;
    public final y5d o;
    public final TextView s0;
    public final TextView t0;
    public final AppCompatImageView u0;
    public final j34 v0;
    public final int w0;
    public final int x0;
    public boolean y0;
    public boolean z0;

    public nd1(Context context) {
        r6c r6cVar = new r6c();
        s5d s5dVar = new s5d();
        super(context);
        this.a = r6cVar;
        this.b = s5dVar;
        this.c = new khe(new md1(0, this));
        this.o = new y5d(this);
        TextView textView = new TextView(context);
        kqe kqeVar = i4f.a;
        os2.i.b(textView, du4.b);
        textView.setTextColor(getTitleColor());
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.s0 = textView;
        TextView textView2 = new TextView(context);
        os2.f.b(textView2, du4.b);
        textView2.setTextColor(getSubtitleColor());
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        this.t0 = textView2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setBackground(getIconBackground());
        int iG = tu0.G(6 * fk4.d().getDisplayMetrics().density);
        appCompatImageView.setPadding(iG, iG, iG, iG);
        this.u0 = appCompatImageView;
        j34 j34Var = new j34(context);
        j34Var.setBackgroundEnabled$message_list_release(false);
        this.v0 = j34Var;
        this.w0 = tu0.G(10 * fk4.d().getDisplayMetrics().density);
        int iG2 = tu0.G(40 * fk4.d().getDisplayMetrics().density);
        this.x0 = iG2;
        r6cVar.b = this;
        s5dVar.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(appCompatImageView, new ViewGroup.LayoutParams(iG2, iG2));
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

    public static ShapeDrawable a(nd1 nd1Var) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{fk4.d().getDisplayMetrics().density * 12.0f, fk4.d().getDisplayMetrics().density * 12.0f, fk4.d().getDisplayMetrics().density * 12.0f, fk4.d().getDisplayMetrics().density * 12.0f, fk4.d().getDisplayMetrics().density * 12.0f, fk4.d().getDisplayMetrics().density * 12.0f, fk4.d().getDisplayMetrics().density * 12.0f, fk4.d().getDisplayMetrics().density * 12.0f}, null, null));
        shapeDrawable.getPaint().setColor(nd1Var.getIconBackgroundColor());
        return shapeDrawable;
    }

    private final is0 getColors() {
        return qp4.u0.j(this).a().d(this.z0);
    }

    private final ShapeDrawable getIconBackground() {
        return (ShapeDrawable) this.c.getValue();
    }

    private final int getIconBackgroundColor() {
        return getColors().a.i;
    }

    private final int getIconColor() {
        boolean z = this.z0;
        pq9 pq9Var = qp4.u0;
        return (z && this.y0) ? pq9Var.j(this).getIcon().c : z ? pq9Var.j(this).getIcon().f : getColors().b.f;
    }

    private final int getSubtitleColor() {
        return getColors().d.f;
    }

    private final int getTitleColor() {
        return getColors().d.e;
    }

    private final void setIcon(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.u0;
        appCompatImageView.setImageDrawable(drawable);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(getIconColor()));
    }

    private final void setSubtitle(CharSequence charSequence) {
        this.t0.setText(charSequence);
    }

    private final void setTitle(CharSequence charSequence) {
        this.s0.setText(charSequence);
    }

    public final void b() {
        this.s0.setTextColor(getTitleColor());
        this.t0.setTextColor(getSubtitleColor());
        this.u0.setImageTintList(ColorStateList.valueOf(getIconColor()));
        getIconBackground().getPaint().setColor(getIconBackgroundColor());
        this.v0.setTextColor$message_list_release(getColors().d.m);
    }

    public final void c(y01 y01Var) {
        this.z0 = y01Var.f;
        this.y0 = y01Var.c;
        setTitle(y01Var.a);
        setSubtitle(y01Var.b);
        setIcon(y01Var.d);
    }

    @Override // defpackage.l7c
    public final void f(ix8 ix8Var, boolean z) {
        this.a.f(ix8Var, z);
    }

    @Override // defpackage.k34
    public final void g(CharSequence charSequence, boolean z) {
        bc7[] bc7VarArr = j34.D0;
        this.v0.c(charSequence, false);
    }

    public int getAliasWidthWithPaddings() {
        return this.b.h0();
    }

    @Override // defpackage.l7c
    public final void k(is0 is0Var, boolean z) {
        this.a.k(is0Var, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iD;
        y5d y5dVar = this.o;
        boolean zH = br7.H(y5dVar.b);
        int i5 = this.w0;
        if (zH) {
            y5dVar.c(i5, i5);
            iD = wg0.d(4, fk4.d().getDisplayMetrics().density, y5dVar.a(), i5);
        } else {
            iD = i5;
        }
        s5d s5dVar = this.b;
        if (br7.H((je7) s5dVar.c) && br7.H(y5dVar.b)) {
            s5dVar.T((getMeasuredWidth() - i5) - s5dVar.L(), ((y5dVar.a() / 2) - (s5dVar.K() / 2)) + i5);
        }
        AppCompatImageView appCompatImageView = this.u0;
        int i6 = this.x0;
        int i7 = i5 + i6;
        ote.D(appCompatImageView, i5, iD, i7, i6 + iD);
        int i8 = i7 + i5;
        TextView textView = this.s0;
        ote.E(textView, i8, iD, 0, 12);
        int measuredHeight = textView.getMeasuredHeight() + iD;
        TextView textView2 = this.t0;
        ote.E(textView2, i8, measuredHeight, 0, 12);
        int measuredHeight2 = textView2.getMeasuredHeight() + measuredHeight;
        r6c r6cVar = this.a;
        if (br7.H((je7) r6cVar.c)) {
            float f = 10;
            r6cVar.T(tu0.G(f * fk4.d().getDisplayMetrics().density), rh4.c(f, fk4.d().getDisplayMetrics().density, measuredHeight2));
        }
        int measuredWidth = getMeasuredWidth();
        j34 j34Var = this.v0;
        ote.E(j34Var, (measuredWidth - j34Var.getMeasuredWidth()) - i5, rh4.q(4, fk4.d().getDisplayMetrics().density, getMeasuredHeight() - j34Var.getMeasuredHeight()), 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iH0;
        float f = 10;
        int iM = wg0.m(f, fk4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        int iG = tu0.G(8 * fk4.d().getDisplayMetrics().density) * 2;
        s5d s5dVar = this.b;
        boolean zH = br7.H((je7) s5dVar.c);
        y5d y5dVar = this.o;
        if (zH && br7.H(y5dVar.b)) {
            s5dVar.U(View.MeasureSpec.makeMeasureSpec(iM, Integer.MIN_VALUE), i2);
        }
        if (br7.H(y5dVar.b)) {
            y5dVar.d(View.MeasureSpec.makeMeasureSpec(iM, Integer.MIN_VALUE), i2);
            iH0 = s5dVar.h0() + y5dVar.b();
            iG = wg0.d(4, fk4.d().getDisplayMetrics().density, y5dVar.a(), iG);
        } else {
            iH0 = 0;
        }
        j34 j34Var = this.v0;
        j34Var.measure(i, i2);
        this.u0.measure(View.MeasureSpec.makeMeasureSpec(iM, 1073741824), i2);
        int i3 = this.x0;
        int i4 = this.w0;
        int i5 = iM - (i3 + i4);
        TextView textView = this.s0;
        textView.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), i2);
        TextView textView2 = this.t0;
        textView2.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), i2);
        int iMin = (i4 * 2) + Math.min(iM, j34Var.getMeasuredWidth() + Math.max(textView.getMeasuredWidth(), Math.max(textView2.getMeasuredWidth(), iH0)) + i3);
        int measuredHeight = j34Var.getMeasuredHeight() + textView.getMeasuredHeight() + textView2.getMeasuredHeight() + iG;
        r6c r6cVar = this.a;
        if (br7.H((je7) r6cVar.c)) {
            r6cVar.U(View.MeasureSpec.makeMeasureSpec(iM, Integer.MIN_VALUE), i2);
            iMin = Math.max(iMin, r6cVar.L());
            measuredHeight = wg0.d(f, fk4.d().getDisplayMetrics().density, r6cVar.K(), measuredHeight);
        }
        setMeasuredDimension(iMin, measuredHeight);
    }

    @Override // defpackage.l7c
    public final void q(boolean z) {
        this.a.q(z);
    }

    @Override // defpackage.u5d
    public void setAlias(Layout layout) {
        this.b.setAlias(layout);
    }

    @Override // defpackage.u5d
    public void setAliasColor(int i) {
        this.b.setAliasColor(i);
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
        this.v0.setTextColor$message_list_release(i);
    }

    @Override // defpackage.k34
    public void setDateViewStatus(zof zofVar) {
        this.v0.setStatus$message_list_release(zofVar);
    }

    @Override // defpackage.l7c
    public void setIsIncoming(boolean z) {
        this.a.o = z;
    }

    @Override // defpackage.l7c
    public void setOnClickListener(m56 m56Var) {
        this.a.X = m56Var;
    }

    @Override // defpackage.x5d
    public void setSenderName(Layout layout) {
        this.o.e(layout);
    }

    @Override // defpackage.x5d
    public void setSenderNameColor(int i) {
        this.o.f(i);
    }

    @Override // defpackage.l7c
    public void setStackFromEnd(boolean z) {
        this.a.Z = z;
    }
}
