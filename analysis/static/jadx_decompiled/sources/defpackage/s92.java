package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class s92 extends View implements kre {
    public final int a;
    public final int b;
    public final int c;
    public final TextPaint o;
    public final Drawable s0;
    public List t0;

    public s92(Context context) {
        super(context, null);
        this.a = tu0.G(4 * fk4.d().getDisplayMetrics().density);
        float f = 12;
        this.b = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.c = tu0.G(6 * fk4.d().getDisplayMetrics().density);
        TextPaint textPaint = new TextPaint(1);
        i4f.s.a(textPaint, context.getResources().getDisplayMetrics(), du4.b);
        this.o = textPaint;
        Drawable drawableB = kt3.b(getContext(), woc.h);
        drawableB.setBounds(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        this.s0 = drawableB;
        this.t0 = nz4.a;
        onThemeChanged(qp4.u0.j(this));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String string;
        super.onDraw(canvas);
        TextPaint textPaint = this.o;
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        int i = (int) (fontMetrics.descent - fontMetrics.ascent);
        int i2 = this.a;
        int i3 = i + i2;
        int paddingTop = getPaddingTop() + i2;
        for (CharSequence charSequence : this.t0) {
            if (charSequence == null || (string = charSequence.toString()) == null) {
                string = "";
            }
            float f = fontMetrics.ascent;
            float f2 = paddingTop - f;
            float f3 = ((f + fontMetrics.descent) / 2) + f2;
            int i4 = this.b;
            int paddingLeft = getPaddingLeft();
            int paddingLeft2 = getPaddingLeft() + i4;
            Drawable drawable = this.s0;
            drawable.setBounds(paddingLeft, (int) (f3 - (i4 / 2)), paddingLeft2, (int) (f3 + (i4 / 2)));
            drawable.draw(canvas);
            canvas.drawText(string, getPaddingLeft() + i4 + this.c, f2, textPaint);
            paddingTop += i3;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Float fValueOf;
        String string;
        TextPaint textPaint = this.o;
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + ((int) (this.t0.size() * ((fontMetrics.descent - fontMetrics.ascent) + this.a)));
        List<CharSequence> list = this.t0;
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        for (CharSequence charSequence : list) {
            if (charSequence == null || (string = charSequence.toString()) == null) {
                string = "";
            }
            arrayList.add(Float.valueOf(textPaint.measureText(string)));
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        setMeasuredDimension(View.resolveSize((int) (getPaddingLeft() + this.b + this.c + (fValueOf != null ? fValueOf.floatValue() : 0.0f) + getPaddingRight()), i), View.resolveSize(paddingBottom, i2));
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.o.setColor(fkaVar.getText().h);
        this.s0.setTint(fkaVar.a().s().a.b.b);
        invalidate();
    }
}
