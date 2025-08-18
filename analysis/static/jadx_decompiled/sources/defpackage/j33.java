package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class j33 extends LinkMovementMethod {
    public static final String m = nec.a(j33.class).b();
    public final i33 a;
    public final RectF b = new RectF();
    public String c;
    public qz7 d;
    public Spannable e;
    public ClickableSpan f;
    public boolean g;
    public k56 h;
    public boolean i;
    public Runnable j;
    public final q00 k;
    public final GestureDetector l;

    public j33(Context context, i33 i33Var) {
        this.a = i33Var;
        q00 q00Var = new q00(5, this);
        this.k = q00Var;
        this.l = new GestureDetector(context, q00Var);
    }

    public static final ClickableSpan a(j33 j33Var, qz7 qz7Var, Spannable spannable, MotionEvent motionEvent) {
        WeakReference weakReference;
        View view;
        Layout layout;
        Object njcVar;
        j33Var.getClass();
        if (qz7Var == null || (weakReference = (WeakReference) qz7Var.b) == null || (view = (View) weakReference.get()) == null || (layout = (Layout) qz7Var.c) == null) {
            return null;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int paddingLeft = x - view.getPaddingLeft();
        int paddingTop = y - view.getPaddingTop();
        int scrollX = view.getScrollX() + paddingLeft;
        int scrollY = view.getScrollY() + paddingTop;
        int lineForVertical = layout.getLineForVertical(scrollY);
        float f = scrollX;
        try {
            int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
            RectF rectF = j33Var.b;
            rectF.left = layout.getLineLeft(lineForVertical);
            rectF.top = layout.getLineTop(lineForVertical);
            rectF.right = layout.getLineMax(lineForVertical) + rectF.left;
            rectF.bottom = layout.getLineBottom(lineForVertical);
            njcVar = rectF.contains(f, (float) scrollY) ? (ClickableSpan) ys.e0(spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class)) : null;
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        Throwable thA = pjc.a(njcVar);
        if (thA != null) {
            hm9.p(m, "findClickableSpanUnderTouch failed:", thA);
        }
        return (ClickableSpan) (njcVar instanceof njc ? null : njcVar);
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.d = new qz7(new WeakReference(textView), 12, textView.getLayout());
            this.e = spannable;
        }
        return this.l.onTouchEvent(motionEvent);
    }
}
