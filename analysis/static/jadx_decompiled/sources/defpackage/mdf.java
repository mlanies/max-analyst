package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class mdf extends View {
    public static final /* synthetic */ bc7[] D0 = {new oi9(mdf.class, "isBackgroundEnabled", "isBackgroundEnabled()Z"), rh4.g(nec.a, mdf.class, "isCapsuleInside", "isCapsuleInside()Z"), new oi9(mdf.class, "isDrawableEnabled", "isDrawableEnabled()Z"), new oi9(mdf.class, "text", "getText()Ljava/lang/CharSequence;")};
    public static final TextPaint E0 = new TextPaint();
    public Layout A0;
    public final je7 B0;
    public final ldf C0;
    public final fe7 a;
    public final float b;
    public final int c;
    public final int o;
    public final int s0;
    public final float t0;
    public final je7 u0;
    public final int v0;
    public final ldf w0;
    public final ldf x0;
    public final ldf y0;
    public Drawable z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdf(Context context) {
        super(context);
        fe7 fe7Var = (fe7) o19.a.getAccessor().c(fe7.class);
        this.a = fe7Var;
        this.b = fk4.d().getDisplayMetrics().density * 4.0f;
        int iG = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        this.c = iG;
        this.o = tu0.G(6 * fk4.d().getDisplayMetrics().density);
        this.s0 = tu0.G(3 * fk4.d().getDisplayMetrics().density);
        this.t0 = fk4.d().getDisplayMetrics().density * 10.0f;
        this.u0 = tu0.r(3, new bse(9));
        this.v0 = qp4.u0.j(this).a().s().g.a;
        this.w0 = new ldf(this, 1);
        this.x0 = new ldf(this, 2);
        ldf ldfVar = new ldf(this, 3);
        this.y0 = ldfVar;
        this.B0 = tu0.r(3, new bse(10));
        this.C0 = new ldf(this, 0);
        setId(mda.P);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setTranslationZ(Float.MAX_VALUE);
        TextPaint textPaint = E0;
        textPaint.setAntiAlias(true);
        kqe kqeVar = os2.c;
        textPaint.setTextSize(ck4.c(kqeVar.g(du4.b), context));
        textPaint.setLetterSpacing(ck4.c(kqeVar.e, context));
        textPaint.setTypeface(Typeface.create(Typeface.create(kqeVar.f, 0), rh4.b(kqeVar.g)));
        setWillNotDraw(false);
        bc7 bc7Var = D0[2];
        if (((Boolean) ldfVar.b).booleanValue()) {
            Drawable drawableB = kt3.b(getContext(), woc.l2);
            drawableB.setBounds(0, 0, iG, iG);
            drawableB.setTint(getDrawableColor());
            this.z0 = drawableB;
        }
    }

    private final int getBackgroundColor() {
        bc7 bc7Var = D0[1];
        boolean zBooleanValue = ((Boolean) this.x0.b).booleanValue();
        pq9 pq9Var = qp4.u0;
        return zBooleanValue ? pq9Var.j(this).a().s().b.f : pq9Var.j(this).a().s().b.g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getDrawableColor() {
        qp4.u0.j(this).a().s().c.getClass();
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BoringLayout.Metrics getMetrics() {
        return (BoringLayout.Metrics) this.B0.getValue();
    }

    private final CharSequence getText() {
        bc7 bc7Var = D0[3];
        return (CharSequence) this.C0.b;
    }

    private final void setText(CharSequence charSequence) {
        this.C0.o1(this, D0[3], charSequence);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iSave;
        Layout layout = this.A0;
        if (layout == null) {
            return;
        }
        layout.getPaint().setColor(this.v0);
        float height = (getHeight() - layout.getHeight()) * 0.5f;
        bc7 bc7Var = D0[0];
        float fWidth = 0.0f;
        if (((Boolean) this.w0.b).booleanValue()) {
            fWidth = 0.0f + this.o;
            je7 je7Var = this.u0;
            ((Paint) je7Var.getValue()).setColor(getBackgroundColor());
            float width = getWidth();
            float height2 = getHeight();
            Paint paint = (Paint) je7Var.getValue();
            float f = this.t0;
            canvas.drawRoundRect(0.0f, 0.0f, width, height2, f, f, paint);
        }
        boolean zK = c54.K(this);
        float f2 = this.b;
        if (!zK) {
            Drawable drawable = this.z0;
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
            Drawable drawable2 = this.z0;
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
        int iMax;
        int iWidth;
        Layout layout = this.A0;
        if (layout != null) {
            iWidth = layout.getWidth();
            iMax = layout.getHeight();
        } else {
            iMax = 0;
            iWidth = 0;
        }
        Drawable drawable = this.z0;
        if (drawable != null) {
            iWidth += drawable.getBounds().width() + tu0.G(this.b);
            iMax = Math.max(iMax, drawable.getBounds().height());
        }
        bc7 bc7Var = D0[0];
        if (((Boolean) this.w0.b).booleanValue()) {
            iWidth += this.o * 2;
            iMax += this.s0 * 2;
        }
        setMeasuredDimension(iWidth, iMax);
    }

    public final void setBackgroundEnabled(boolean z) {
        this.w0.o1(this, D0[0], Boolean.valueOf(z));
    }

    public final void setCapsuleInside(boolean z) {
        this.x0.o1(this, D0[1], Boolean.valueOf(z));
    }

    public final void setContent(CharSequence charSequence) {
        setText(charSequence);
    }

    public final void setDrawableEnabled(boolean z) {
        this.y0.o1(this, D0[2], Boolean.valueOf(z));
    }
}
