package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class d12 extends ViewGroup implements kre {
    public final s5a a;
    public final TextView b;
    public final ImageView c;

    public d12(Context context) {
        super(context);
        s5a s5aVar = new s5a(context);
        this.a = s5aVar;
        TextView textView = new TextView(context);
        i4f.l.b(textView, du4.b);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.b = textView;
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        addView(s5aVar);
        addView(textView);
        addView(imageView);
        s5aVar.setAvatarShape(j5a.a);
        float f = 12;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), getPaddingBottom());
        onThemeChanged(qp4.u0.j(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int measuredHeight = getMeasuredHeight();
        s5a s5aVar = this.a;
        ote.E(s5aVar, paddingLeft, (measuredHeight - s5aVar.getMeasuredHeight()) / 2, 0, 12);
        TextView textView = this.b;
        ote.E(textView, rh4.c(12, fk4.d().getDisplayMetrics().density, s5aVar.getRight()), (getMeasuredHeight() - textView.getMeasuredHeight()) / 2, 0, 12);
        ImageView imageView = this.c;
        ote.E(imageView, (getMeasuredWidth() - getPaddingRight()) - imageView.getMeasuredWidth(), (getMeasuredHeight() - imageView.getMeasuredHeight()) / 2, 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        TextView textView = this.b;
        if (qqe.c(textView)) {
            setVerified(true);
        }
        float f = 40;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(tu0.G(fk4.d().getDisplayMetrics().density * f), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(tu0.G(f * fk4.d().getDisplayMetrics().density), 1073741824);
        s5a s5aVar = this.a;
        s5aVar.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int mode = View.MeasureSpec.getMode(i);
        int size = (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.getSize(i) : Integer.MAX_VALUE;
        ImageView imageView = this.c;
        float f2 = 20;
        imageView.measure(View.MeasureSpec.makeMeasureSpec(tu0.G(fk4.d().getDisplayMetrics().density * f2), 1073741824), View.MeasureSpec.makeMeasureSpec(tu0.G(f2 * fk4.d().getDisplayMetrics().density), 1073741824));
        int paddingLeft = (size - getPaddingLeft()) - s5aVar.getMeasuredWidth();
        float f3 = 12;
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec((rh4.q(f3, fk4.d().getDisplayMetrics().density, rh4.q(f3, fk4.d().getDisplayMetrics().density, paddingLeft)) - imageView.getMeasuredWidth()) - getPaddingRight(), Integer.MIN_VALUE);
        float f4 = 56;
        textView.measure(iMakeMeasureSpec3, View.MeasureSpec.makeMeasureSpec(tu0.G(fk4.d().getDisplayMetrics().density * f4), Integer.MIN_VALUE));
        setMeasuredDimension(size, tu0.G(f4 * fk4.d().getDisplayMetrics().density));
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.b.setTextColor(fkaVar.getText().e);
        this.c.setImageTintList(ColorStateList.valueOf(fkaVar.getIcon().i));
    }

    public final void setOnTrailClick(View.OnClickListener onClickListener) {
        tu0.K(this.c, 300L, new tb(onClickListener, 7, this));
    }

    public final void setTitle(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void setTrail(int i) {
        this.c.setImageResource(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setVerified(boolean r5) {
        /*
            r4 = this;
            android.widget.TextView r0 = r4.b
            float r1 = defpackage.qqe.e(r0)
            int r1 = defpackage.i24.I(r1)
            r2 = 0
            if (r5 == 0) goto L1a
            ecf r3 = defpackage.qqe.a(r0)
            if (r3 == 0) goto L16
            int r3 = r3.a
            goto L17
        L16:
            r3 = r2
        L17:
            if (r3 != r1) goto L1a
            return
        L1a:
            if (r5 == 0) goto L36
            ecf r5 = defpackage.qqe.a(r0)
            if (r5 == 0) goto L24
            int r2 = r5.a
        L24:
            if (r2 == r1) goto L36
            ecf r5 = new ecf
            android.content.Context r4 = r4.getContext()
            we1 r2 = new we1
            r3 = 5
            r2.<init>(r3)
            r5.<init>(r4, r1, r2)
            goto L37
        L36:
            r5 = 0
        L37:
            defpackage.qqe.d(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d12.setVerified(boolean):void");
    }
}
