package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class qd0 extends Drawable {
    public static final int[] f = {-2096531, -2007990, -164330, -616921, -2019997, -2206338, -2011174, -4377970, -13333023, -6993695, -13219103, -10719519, -16733746, -11226714, -13526051, -13462339};
    public final TextPaint a;
    public final pd0 b;
    public final CharSequence c;
    public final int d;
    public final boolean e;

    public qd0(pd0 pd0Var, uj3 uj3Var, boolean z) {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        this.b = pd0Var;
        this.c = uj3Var.m();
        int iA = a(uj3Var.n());
        this.d = iA;
        this.e = z;
        textPaint.setColor(iA);
    }

    public static int a(long j) {
        return f[(int) ((Math.abs(j) >> 8) % 16)];
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        StaticLayout staticLayoutBuild;
        Rect bounds = getBounds();
        int iSave = canvas.save();
        canvas.translate(bounds.left, bounds.top);
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        float fMin = this.e ? Math.min(iWidth, iHeight) / 2.0f : Math.min(iWidth, iHeight) / 2.5f;
        float f2 = iWidth / 2.0f;
        canvas.drawCircle(f2, f2, f2, this.a);
        CharSequence charSequence = this.c;
        if (!TextUtils.isEmpty(charSequence)) {
            pd0 pd0Var = this.b;
            TextPaint textPaint = pd0Var.a;
            TextPaint textPaint2 = pd0Var.a;
            textPaint.setTextSize(fMin);
            if (charSequence instanceof Spannable) {
                Integer numValueOf = Integer.valueOf(charSequence.hashCode() + (iWidth * 31));
                i56 i56Var = pd0Var.b;
                Object obj = i56Var.get(numValueOf);
                if (obj == null) {
                    try {
                        staticLayoutBuild = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint2, iWidth).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
                    } catch (Throwable unused) {
                        String string = charSequence.toString();
                        staticLayoutBuild = StaticLayout.Builder.obtain(string, 0, string.length(), textPaint2, iWidth).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
                    }
                    obj = staticLayoutBuild;
                    i56Var.put(numValueOf, obj);
                }
                canvas.translate(r6.getWidth() / 2.0f, (iHeight / 2.0f) - (r6.getHeight() / 2.0f));
                ((StaticLayout) obj).draw(canvas);
            } else {
                canvas.drawText(charSequence, 0, charSequence.length(), f2, (iHeight / 2.0f) - ((textPaint.ascent() + textPaint.descent()) / 2.0f), textPaint);
            }
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        return new qd0(this.b, this.c, this.d, this.e);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public qd0(pd0 pd0Var, e52 e52Var, ida idaVar) {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        this.b = pd0Var;
        e52Var.l0();
        this.c = e52Var.x0;
        e52Var.l0();
        int iA = idaVar.j.a(0, e52Var.x0) ? -1250068 : a(e52Var.b.a);
        this.d = iA;
        this.e = false;
        textPaint.setColor(iA);
    }

    public qd0(pd0 pd0Var, ida idaVar, CharSequence charSequence) {
        int i;
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        this.b = pd0Var;
        this.c = idaVar.j.e(bre.a(charSequence, idaVar));
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        int[] iArr = f;
        if (zIsEmpty) {
            i = iArr[0];
        } else {
            i = iArr[(Math.abs(charSequence.hashCode()) >> 8) % 16];
        }
        this.d = i;
        this.e = false;
        textPaint.setColor(i);
    }

    public qd0(pd0 pd0Var, ida idaVar, CharSequence charSequence, long j, boolean z) {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        this.b = pd0Var;
        this.c = idaVar.j.e(bre.a(charSequence, idaVar));
        int iA = a(j);
        this.d = iA;
        this.e = z;
        textPaint.setColor(iA);
    }

    public qd0(pd0 pd0Var, CharSequence charSequence, int i, boolean z) {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        this.b = pd0Var;
        this.c = charSequence;
        this.d = i;
        this.e = z;
        textPaint.setColor(i);
    }
}
