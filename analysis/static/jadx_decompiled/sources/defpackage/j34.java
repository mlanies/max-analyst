package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* loaded from: classes2.dex */
public final class j34 extends View implements kre {
    public static final /* synthetic */ bc7[] D0 = {new oi9(j34.class, "isBackgroundEnabled", "isBackgroundEnabled$message_list_release()Z"), rh4.g(nec.a, j34.class, "text", "getText()Ljava/lang/CharSequence;")};
    public static final TextPaint E0 = new TextPaint();
    public final je7 A0;
    public final i34 B0;
    public final ai9 C0;
    public final float a;
    public final int b;
    public int c;
    public final int o;
    public final int s0;
    public final float t0;
    public final je7 u0;
    public int v0;
    public final i34 w0;
    public zof x0;
    public Drawable y0;
    public Layout z0;

    public j34(Context context) {
        super(context);
        this.a = fk4.d().getDisplayMetrics().density * 4.0f;
        this.b = tu0.G(16 * fk4.d().getDisplayMetrics().density);
        this.o = tu0.G(6 * fk4.d().getDisplayMetrics().density);
        this.s0 = tu0.G(3 * fk4.d().getDisplayMetrics().density);
        this.t0 = fk4.d().getDisplayMetrics().density * 10.0f;
        this.u0 = tu0.r(3, new zf3(12));
        this.v0 = -1;
        this.w0 = new i34(this, 1);
        this.x0 = zof.b;
        this.A0 = tu0.r(3, new zf3(13));
        this.B0 = new i34(this, 0);
        setId(mda.K);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setTranslationZ(Float.MAX_VALUE);
        TextPaint textPaint = E0;
        textPaint.setAntiAlias(true);
        kqe kqeVar = os2.c;
        textPaint.setTextSize(ck4.c(kqeVar.g(du4.b), context));
        textPaint.setLetterSpacing(ck4.c(kqeVar.e, context));
        textPaint.setTypeface(Typeface.create(Typeface.create(kqeVar.f, 0), rh4.b(kqeVar.g)));
        setWillNotDraw(false);
        this.C0 = new ai9(zof.s0.getSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BoringLayout.Metrics getMetrics() {
        return (BoringLayout.Metrics) this.A0.getValue();
    }

    private final CharSequence getText() {
        bc7 bc7Var = D0[1];
        return (CharSequence) this.B0.b;
    }

    private final int getViewStatusTintColor() {
        int i = h34.$EnumSwitchMapping$0[this.x0.ordinal()];
        pq9 pq9Var = qp4.u0;
        return i == 1 ? pq9Var.j(this).a().k().b.c : b() ? pq9Var.j(this).a().k().b.h : pq9Var.j(this).a().k().b.g;
    }

    private final void setText(CharSequence charSequence) {
        this.B0.o1(this, D0[1], charSequence);
    }

    public final boolean b() {
        bc7 bc7Var = D0[0];
        return ((Boolean) this.w0.b).booleanValue();
    }

    public final void c(CharSequence charSequence, boolean z) {
        if (z) {
            charSequence = new SpannableStringBuilder(getContext().getString(oda.R0)).append((CharSequence) " · ").append(charSequence);
        }
        setText(charSequence);
    }

    public final void d(zof zofVar) {
        Drawable drawable = this.y0;
        if (drawable != null) {
            if (zofVar != zof.Y) {
                drawable.setTint(getViewStatusTintColor());
                return;
            }
            EnhancedVectorDrawable enhancedVectorDrawable = drawable instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) drawable : null;
            if (enhancedVectorDrawable != null) {
                c54.Z(enhancedVectorDrawable, "error", getViewStatusTintColor());
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iSave;
        Layout layout = this.z0;
        if (layout == null) {
            return;
        }
        layout.getPaint().setColor(this.v0);
        float height = (getHeight() - layout.getHeight()) * 0.5f;
        float fWidth = 0.0f;
        if (b()) {
            fWidth = 0.0f + this.o;
            je7 je7Var = this.u0;
            ((Paint) je7Var.getValue()).setColor(this.c);
            float width = getWidth();
            float height2 = getHeight();
            Paint paint = (Paint) je7Var.getValue();
            float f = this.t0;
            canvas.drawRoundRect(0.0f, 0.0f, width, height2, f, f, paint);
        }
        boolean zK = c54.K(this);
        float f2 = this.a;
        if (zK) {
            Drawable drawable = this.y0;
            if (drawable != null) {
                iSave = canvas.save();
                canvas.translate(fWidth, (getHeight() - drawable.getBounds().height()) * 0.5f);
                try {
                    drawable.draw(canvas);
                    canvas.restoreToCount(iSave);
                    fWidth += drawable.getBounds().width() + f2;
                } finally {
                }
            }
            iSave = canvas.save();
            canvas.translate(fWidth, height);
            try {
                layout.draw(canvas);
                return;
            } finally {
            }
        }
        iSave = canvas.save();
        canvas.translate(fWidth, height);
        try {
            layout.draw(canvas);
            canvas.restoreToCount(iSave);
            Drawable drawable2 = this.y0;
            if (drawable2 == null) {
                return;
            }
            iSave = canvas.save();
            canvas.translate(fWidth + layout.getWidth() + f2, (getHeight() - drawable2.getBounds().height()) * 0.5f);
            try {
                drawable2.draw(canvas);
            } finally {
            }
        } finally {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iWidth;
        int iMax;
        Layout layout = this.z0;
        if (layout != null) {
            iWidth = layout.getWidth();
            iMax = layout.getHeight();
        } else {
            iWidth = 0;
            iMax = 0;
        }
        Drawable drawable = this.y0;
        if (drawable != null) {
            iWidth += drawable.getBounds().width() + tu0.G(this.a);
            iMax = Math.max(iMax, drawable.getBounds().height());
        }
        if (b()) {
            iWidth += this.o * 2;
            iMax += this.s0 * 2;
        }
        setMeasuredDimension(iWidth, iMax);
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        Drawable drawable = this.y0;
        qe qeVar = drawable instanceof qe ? (qe) drawable : null;
        if (qeVar != null) {
            qeVar.a(getViewStatusTintColor());
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (this.c == i) {
            return;
        }
        this.c = i;
        invalidate();
    }

    public final void setBackgroundEnabled$message_list_release(boolean z) {
        this.w0.o1(this, D0[0], Boolean.valueOf(z));
    }

    public final void setStatus$message_list_release(zof zofVar) {
        Drawable drawable;
        Drawable drawableB;
        this.x0 = zofVar;
        Integer num = zofVar.a;
        if (num == null) {
            drawable = null;
        } else {
            int iIntValue = num.intValue();
            ai9 ai9Var = this.C0;
            Object objC = ai9Var.c(iIntValue);
            if (objC == null) {
                int iOrdinal = this.x0.ordinal();
                if (iOrdinal == 1) {
                    qe qeVar = new qe(getContext());
                    ((EnhancedAnimatedVectorDrawable) qeVar.getDrawable()).setCallback(this);
                    qeVar.a(getViewStatusTintColor());
                    qeVar.start();
                    drawableB = qeVar;
                } else if (iOrdinal != 4) {
                    drawableB = kt3.b(getContext(), num.intValue());
                } else {
                    objC = new EnhancedVectorDrawable(getContext(), num.intValue());
                    int iA = ai9Var.a(iIntValue);
                    ai9Var.b[iA] = iIntValue;
                    ai9Var.c[iA] = objC;
                }
                objC = drawableB;
                int iA2 = ai9Var.a(iIntValue);
                ai9Var.b[iA2] = iIntValue;
                ai9Var.c[iA2] = objC;
            }
            drawable = (Drawable) objC;
        }
        boolean zF = true ^ tpa.f(this.y0, drawable);
        if (drawable != null) {
            int i = this.b;
            drawable.setBounds(0, 0, i, i);
        }
        this.y0 = drawable;
        d(zofVar);
        invalidate();
        if (zF) {
            requestLayout();
        }
    }

    public final void setTextColor$message_list_release(int i) {
        if (this.v0 == i) {
            return;
        }
        this.v0 = i;
        E0.setColor(i);
        d(this.x0);
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable instanceof Animatable) || super.verifyDrawable(drawable);
    }
}
