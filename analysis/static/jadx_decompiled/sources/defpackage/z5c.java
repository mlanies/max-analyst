package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.TextView;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

/* loaded from: classes2.dex */
public final class z5c extends ViewGroup implements kre {
    public final y5c A0;
    public boolean a;
    public ValueAnimator b;
    public final Paint c;
    public float o;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public final TextView w0;
    public final caa x0;
    public final y5c y0;
    public final y5c z0;
    public static final /* synthetic */ bc7[] C0 = {new oi9(z5c.class, "isOwn", "isOwn()Z"), rh4.g(nec.a, z5c.class, "reaction", "getReaction()Lru/ok/tamtam/models/message/reactions/Reaction;"), new oi9(z5c.class, NewHtcHomeBadger.COUNT, "getCount()I")};
    public static final rq9 B0 = new rq9();
    public static final khe D0 = new khe(new lab(24));

    public z5c(Context context) {
        super(context);
        this.c = new Paint(1);
        this.o = -1.0f;
        TextView textView = new TextView(context);
        kqe kqeVar = i4f.a;
        os2.a.b(textView, du4.b);
        textView.setIncludeFontPadding(false);
        textView.setGravity(17);
        textView.setTextColor(-1);
        this.w0 = textView;
        caa caaVar = new caa(context);
        caaVar.setHasBackground(false);
        B0.getClass();
        caaVar.setReplaceInterpolator((PathInterpolator) D0.getValue());
        caaVar.setTypography(os2.h);
        this.x0 = caaVar;
        this.y0 = new y5c(this, 0);
        this.z0 = new y5c(new v5c(""), this);
        this.A0 = new y5c(this, 2);
        setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 48.0f));
        addView(textView);
        addView(caaVar);
    }

    private final float getEmojiCenterX() {
        TextView textView = this.w0;
        return (textView.getWidth() / 2.0f) + textView.getLeft();
    }

    public final void a(boolean z) {
        float f;
        long j;
        int i = 0;
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            ju0.i(valueAnimator);
        }
        float measuredWidth = getMeasuredWidth() - getEmojiCenterX();
        if (this.o == -1.0f) {
            this.o = z ? measuredWidth : 0.0f;
        }
        float f2 = this.o;
        Float fValueOf = Float.valueOf(f2);
        if (!(!(f2 == 0.0f))) {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : measuredWidth;
        if (!z) {
            fFloatValue = this.o;
        }
        float f3 = z ? 0.0f : measuredWidth;
        Float fValueOf2 = Float.valueOf(fFloatValue);
        Float fValueOf3 = Float.valueOf(f3);
        float fFloatValue2 = fValueOf2.floatValue();
        float fFloatValue3 = fValueOf3.floatValue();
        if (z) {
            f = this.o / measuredWidth;
            j = 350;
        } else {
            f = 1 - (this.o / measuredWidth);
            j = 500;
        }
        long j2 = (long) (f * j);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue2, fFloatValue3);
        valueAnimatorOfFloat.setDuration(j2);
        this.x0.setReplaceDuration(j2);
        B0.getClass();
        valueAnimatorOfFloat.setInterpolator((PathInterpolator) D0.getValue());
        valueAnimatorOfFloat.addUpdateListener(new z00(14, this));
        valueAnimatorOfFloat.addListener(new x5c(this, fFloatValue2, i));
        valueAnimatorOfFloat.addListener(new mf(7, this));
        valueAnimatorOfFloat.start();
        this.b = valueAnimatorOfFloat;
    }

    public final boolean b() {
        bc7 bc7Var = C0[0];
        return ((Boolean) this.y0.b).booleanValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z = this.a;
        Paint paint = this.c;
        caa caaVar = this.x0;
        if (z) {
            paint.setColor(this.t0);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            float emojiCenterX = getEmojiCenterX();
            if (((int) this.o) + emojiCenterX > caaVar.getRight()) {
                caaVar.setTextColor(this.u0);
            } else {
                caaVar.setTextColor(this.v0);
            }
            paint.setColor(this.s0);
            TextView textView = this.w0;
            canvas.drawCircle(emojiCenterX, (textView.getHeight() / 2.0f) + textView.getTop(), this.o, paint);
        } else {
            paint.setColor(b() ? this.s0 : this.t0);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            caaVar.setTextColor(b() ? this.u0 : this.v0);
        }
        super.dispatchDraw(canvas);
    }

    public final int getCount() {
        bc7 bc7Var = C0[2];
        return ((Number) this.A0.b).intValue();
    }

    public final v5c getReaction() {
        bc7 bc7Var = C0[1];
        return (v5c) this.z0.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iG = tu0.G(10 * fk4.d().getDisplayMetrics().density);
        TextView textView = this.w0;
        ote.E(textView, iG, (getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2), 0, 12);
        int iD = wg0.d(4, fk4.d().getDisplayMetrics().density, textView.getMeasuredWidth(), iG);
        int measuredHeight = getMeasuredHeight() / 2;
        caa caaVar = this.x0;
        ote.E(caaVar, iD, measuredHeight - (caaVar.getMeasuredHeight() / 2), 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iG = tu0.G(10 * fk4.d().getDisplayMetrics().density) * 2;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(tu0.G(20 * fk4.d().getDisplayMetrics().density), 1073741824);
        TextView textView = this.w0;
        textView.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int iD = wg0.d(4, fk4.d().getDisplayMetrics().density, textView.getMeasuredWidth(), iG);
        caa caaVar = this.x0;
        caaVar.measure(0, 0);
        setMeasuredDimension(caaVar.getMeasuredWidth() + iD, Math.max(tu0.G(28 * fk4.d().getDisplayMetrics().density), caaVar.getMeasuredHeight()));
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
    }

    public final void setCount(int i) {
        this.A0.o1(this, C0[2], Integer.valueOf(i));
    }

    public final void setOnChipClickListener(m56 m56Var) {
        tu0.K(this, 300L, new vu5(this, 25, m56Var));
    }

    public final void setOwn(boolean z) {
        this.y0.o1(this, C0[0], Boolean.valueOf(z));
    }

    public final void setReaction(v5c v5cVar) {
        this.z0.o1(this, C0[1], v5cVar);
    }
}
