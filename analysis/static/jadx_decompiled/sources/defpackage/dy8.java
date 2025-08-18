package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Size;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class dy8 extends View implements ay8, View.OnLongClickListener, hk7, GestureDetector.OnDoubleTapListener, hx4 {
    public static final /* synthetic */ bc7[] H0;
    public boolean A0;
    public by8 B0;
    public Drawable C0;
    public int D0;
    public int E0;
    public final Rect F0;
    public final gi G0;
    public final j33 a;
    public final je7 b;
    public View.OnLongClickListener c;
    public i33 o;
    public final kk7 s0;
    public hk7 t0;
    public final yj u0;
    public j33 v0;
    public int w0;
    public float x0;
    public float y0;
    public float z0;

    static {
        oi9 oi9Var = new oi9(dy8.class, "onDoubleClickListener", "getOnDoubleClickListener()Lkotlin/jvm/functions/Function1;");
        nec.a.getClass();
        H0 = new bc7[]{oi9Var};
    }

    public dy8(Context context) {
        super(context, null, 0);
        j33 j33Var = new j33(context, new yt8(1, this));
        this.a = j33Var;
        this.b = tu0.r(3, new j78(11));
        this.s0 = new kk7(null, new zj7(7, this), 7);
        this.u0 = new yj(14, this);
        this.v0 = j33Var;
        this.w0 = 1;
        this.A0 = true;
        Display defaultDisplay = nd7.z(context).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.E0 = new Size(point.x, point.y).getHeight();
        this.F0 = new Rect();
        this.G0 = new gi(3, this);
        super.setOnLongClickListener(this);
    }

    public static void f(dy8 dy8Var) {
        ArrayList arrayList = dy8Var.getHighlightTextHelper().a;
        if (!arrayList.isEmpty()) {
            arrayList.clear();
        }
        CharSequence text = dy8Var.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            for (Object obj : spannable.getSpans(0, spannable.length(), ozc.class)) {
                ozc ozcVar = (ozc) obj;
                ForegroundColorSpan foregroundColorSpan = ozcVar.a;
                if (foregroundColorSpan != null) {
                    spannable.removeSpan(foregroundColorSpan);
                }
                BackgroundColorSpan backgroundColorSpan = ozcVar.b;
                if (backgroundColorSpan != null) {
                    spannable.removeSpan(backgroundColorSpan);
                }
                spannable.removeSpan(ozcVar);
            }
        }
        dy8Var.invalidate();
    }

    private final ik6 getHighlightTextHelper() {
        return (ik6) this.b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setStartDrawable$lambda$6(Drawable drawable) {
        ((AnimationDrawable) drawable).start();
    }

    @Override // defpackage.hk7
    public final void a(nu8 nu8Var) {
        hk7 hk7Var = this.t0;
        if (hk7Var != null) {
            hk7Var.a(nu8Var);
        }
    }

    @Override // defpackage.hk7
    public final void b(String str, lk7 lk7Var, ClickableSpan clickableSpan) {
        hk7 hk7Var = this.t0;
        if (hk7Var != null) {
            hk7Var.b(str, lk7Var, clickableSpan);
        }
    }

    @Override // defpackage.hx4
    public final void d() {
        invalidate();
    }

    public final int e(int i) {
        Layout layout = getLayout();
        return layout == null ? i : layout.getLineCount() == 1 ? getMeasuredWidth() : layout.getLineCount() > 1 ? (int) layout.getLineRight(layout.getLineCount() - 1) : i;
    }

    public final void g(List list) {
        ik6 ik6Var;
        CharSequence charSequence;
        ik6 highlightTextHelper = getHighlightTextHelper();
        CharSequence text = getText();
        Layout layout = getLayout();
        ArrayList arrayList = highlightTextHelper.a;
        if (!arrayList.isEmpty()) {
            arrayList.clear();
        }
        if (list != null && !list.isEmpty() && text != null && !w9e.C0(text) && layout != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a0d a0dVar = (a0d) it.next();
                float height = layout.getHeight() / layout.getLineCount();
                int i = a0dVar.a;
                while (true) {
                    int lineForOffset = layout.getLineForOffset(i);
                    int lineEnd = layout.getLineEnd(lineForOffset);
                    int i2 = a0dVar.b;
                    boolean z = i2 <= lineEnd;
                    if (!z) {
                        i2 = lineEnd;
                    }
                    String string = text.subSequence(i, i2).toString();
                    ik6Var = highlightTextHelper;
                    charSequence = text;
                    highlightTextHelper.a.add(new hk6(lineForOffset, string, layout.getPrimaryHorizontal(i), layout.getLineTop(lineForOffset), layout.getLineBaseline(lineForOffset), layout.getPaint().measureText(string), height));
                    if (z) {
                        break;
                    }
                    i = lineEnd;
                    text = charSequence;
                    highlightTextHelper = ik6Var;
                }
                text = charSequence;
                highlightTextHelper = ik6Var;
            }
        }
        invalidate();
    }

    public final j33 getDefaultMovementMethod() {
        return this.a;
    }

    public final Layout getLayout() {
        by8 by8Var = this.B0;
        if (by8Var != null) {
            return by8Var.a();
        }
        return null;
    }

    public final int getLineCount() {
        Layout layoutA;
        by8 by8Var = this.B0;
        if (by8Var == null || (layoutA = by8Var.a()) == null) {
            return 0;
        }
        return layoutA.getLineCount();
    }

    public final boolean getLinksClickable() {
        return this.A0;
    }

    public final int getMaxHeightForClip() {
        return this.E0;
    }

    public final j33 getMovementMethod() {
        return this.v0;
    }

    public final m56 getOnDoubleClickListener() {
        bc7 bc7Var = H0[0];
        return (m56) this.u0.b;
    }

    public final CharSequence getText() {
        Layout layoutA;
        by8 by8Var = this.B0;
        if (by8Var == null || (layoutA = by8Var.a()) == null) {
            return null;
        }
        return layoutA.getText();
    }

    public final void h() {
        int iMax;
        by8 by8Var = this.B0;
        Layout layoutA = by8Var != null ? by8Var.a() : null;
        Drawable drawable = this.C0;
        int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() + this.D0 : 0;
        this.y0 = intrinsicWidth;
        int paddingLeft = getPaddingLeft();
        if (layoutA == null) {
            iMax = 0;
        } else {
            int lineCount = layoutA.getLineCount();
            iMax = 0;
            for (int i = 0; i < lineCount; i++) {
                iMax = Math.max(iMax, tu0.G(layoutA.getLineMax(i)));
            }
        }
        setMeasuredDimension(getPaddingRight() + paddingLeft + iMax + intrinsicWidth, layoutA != null ? layoutA.getHeight() : 0);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        by8 by8Var = this.B0;
        if (by8Var != null) {
            by8Var.d.add(this);
        }
        CharSequence text = getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            this.s0.c(spannable);
        }
        by8 by8Var2 = this.B0;
        if (by8Var2 != null) {
            od2.W(this, by8Var2.a(), this.G0);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        by8 by8Var = this.B0;
        if (by8Var != null) {
            by8Var.d.remove(this);
        }
        CharSequence text = getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            this.s0.getClass();
            kk7.a(spannable);
        }
        by8 by8Var2 = this.B0;
        if (by8Var2 != null) {
            od2.Y(by8Var2.a(), this.G0);
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        m56 onDoubleClickListener = getOnDoubleClickListener();
        return onDoubleClickListener != null && ((Boolean) onDoubleClickListener.invoke(this)).booleanValue();
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return onDoubleTap(motionEvent);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Layout layout = getLayout();
        if (layout == null) {
            return;
        }
        yb9 yb9Var = qh.a;
        Rect rect = this.F0;
        if (!rect.isEmpty()) {
            canvas.clipRect(rect);
        }
        Drawable drawable = this.C0;
        int iSave = canvas.save();
        if (drawable != null) {
            canvas.translate(this.x0, this.z0);
            drawable.draw(canvas);
        }
        canvas.translate(this.x0 + this.y0, 0.0f);
        layout.draw(canvas);
        ik6 highlightTextHelper = getHighlightTextHelper();
        fka fkaVarJ = qp4.u0.j(this);
        TextPaint textPaint = (TextPaint) highlightTextHelper.c.getValue();
        textPaint.set(layout.getPaint());
        textPaint.setColor(fkaVarJ.getText().a);
        je7 je7Var = highlightTextHelper.b;
        ((Paint) je7Var.getValue()).setColor(fkaVarJ.f().c);
        Iterator it = highlightTextHelper.a.iterator();
        while (it.hasNext()) {
            hk6 hk6Var = (hk6) it.next();
            float f = hk6Var.c;
            float f2 = f + hk6Var.f;
            float f3 = hk6Var.d;
            canvas.drawRect(f, f3, f2, f3 + hk6Var.g, (Paint) je7Var.getValue());
            canvas.drawText(hk6Var.b, hk6Var.c, hk6Var.e, textPaint);
        }
        canvas.restoreToCount(iSave);
        yb9 yb9Var2 = qh.a;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        View.OnLongClickListener onLongClickListener = this.c;
        if (onLongClickListener == null) {
            return true;
        }
        onLongClickListener.onLongClick(view);
        return true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        h();
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return performClick();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.x0 = this.w0 == -1 ? getPaddingRight() : getPaddingLeft();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        j33 j33Var = this.v0;
        if ((getText() instanceof Spannable) && this.A0 && j33Var != null) {
            Layout layout = getLayout();
            SpannableString spannableString = new SpannableString(getText());
            if (motionEvent.getAction() == 0) {
                j33Var.d = new qz7(new WeakReference(this), 12, layout);
                j33Var.e = spannableString;
            }
            if (j33Var.l.onTouchEvent(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
    }

    public final void setLayout(by8 by8Var) {
        by8 by8Var2 = this.B0;
        if (by8Var2 != null) {
            by8Var2.d.remove(this);
        }
        this.B0 = by8Var;
        by8Var.d.add(this);
        this.w0 = by8Var.a().getParagraphDirection(0);
        by8Var.a().getLineRight(0);
        CharSequence text = getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            this.s0.c(spannable);
        }
        od2.W(this, by8Var.a(), this.G0);
        this.z0 = by8Var.a().getTopPadding();
        requestLayout();
        invalidate();
        setContentDescription(getText());
    }

    public final void setLinkListener(hk7 hk7Var) {
        Layout layoutA;
        this.t0 = hk7Var;
        kk7 kk7Var = this.s0;
        kk7Var.a = hk7Var;
        by8 by8Var = this.B0;
        if (by8Var == null || (layoutA = by8Var.a()) == null) {
            return;
        }
        kk7Var.c(layoutA.getText());
    }

    public final void setLinkLongClickListener(i33 i33Var) {
        this.o = i33Var;
    }

    public final void setLinksClickable(boolean z) {
        this.A0 = z;
    }

    public final void setMaxHeightForClip(int i) {
        this.E0 = i;
    }

    public final void setMovementMethod(j33 j33Var) {
        this.v0 = j33Var;
    }

    public final void setOnDoubleClickListener(m56 m56Var) {
        this.u0.o1(this, H0[0], m56Var);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.c = onLongClickListener;
    }

    public final void setSingleClickAction(Runnable runnable) {
        if (runnable == null) {
            j33 j33Var = this.v0;
            if (j33Var != null) {
                j33Var.h = null;
                return;
            }
            return;
        }
        j33 j33Var2 = this.v0;
        if (j33Var2 != null) {
            j33Var2.h = new i55(runnable, 1);
        }
    }

    public final void setStartDrawable(Drawable drawable) {
        this.C0 = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        if (drawable instanceof AnimationDrawable) {
            post(new cy8(drawable, 0));
        }
        requestLayout();
    }

    public final void setStartDrawablePadding(int i) {
        if (this.D0 == i) {
            return;
        }
        this.D0 = i;
        requestLayout();
    }

    public final void setTextColors(is0 is0Var) {
        TextPaint paint;
        Layout layout = getLayout();
        ls0 ls0Var = is0Var.d;
        if (layout != null && (paint = layout.getPaint()) != null) {
            paint.setColor(ls0Var.e);
        }
        CharSequence text = getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned != null) {
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            if (spans != null) {
                for (Object obj : spans) {
                    if (obj instanceof qu8) {
                        ((qu8) obj).b = ls0Var.b;
                    } else if (obj instanceof ek7) {
                        ((ek7) obj).a = ls0Var.b;
                    } else if (obj instanceof gk7) {
                        ((gk7) obj).b = ls0Var.b;
                    }
                }
            }
        }
        invalidate();
    }

    public final void setTryToSingleClickAction(Runnable runnable) {
        j33 j33Var = this.v0;
        if (j33Var != null) {
            j33Var.j = runnable;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable instanceof Animatable) || super.verifyDrawable(drawable);
    }
}
