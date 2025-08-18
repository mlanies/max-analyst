package defpackage;

import android.graphics.Rect;
import android.text.Spannable;
import android.text.method.TransformationMethod;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes2.dex */
public final class kk7 implements TransformationMethod {
    public hk7 a;
    public final boolean b;
    public final boolean c;
    public final k56 d;
    public final l7 e;

    public kk7(hk7 hk7Var, k56 k56Var, int i) {
        hk7Var = (i & 1) != 0 ? null : hk7Var;
        boolean z = (i & 2) != 0;
        this.a = hk7Var;
        this.b = z;
        this.c = false;
        this.d = k56Var;
        this.e = new l7(0);
    }

    public static void a(CharSequence charSequence) {
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable != null) {
            Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
            if (spans != null) {
                for (Object obj : spans) {
                    if (obj instanceof gk7) {
                        ((gk7) obj).a = null;
                    } else if (obj instanceof cmb) {
                        ((cmb) obj).o = null;
                    } else if (obj instanceof ti6) {
                        ((ti6) obj).c = null;
                    } else if (obj instanceof cq0) {
                        ((cq0) obj).c = null;
                    } else if (obj instanceof qu8) {
                        ((qu8) obj).c = null;
                    } else if (obj instanceof ek7) {
                        ((ek7) obj).c = null;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view, String str, lk7 lk7Var, ClickableSpan clickableSpan) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        l7 l7Var = this.e;
        if (jCurrentTimeMillis - l7Var.c > l7Var.b) {
            l7Var.c = jCurrentTimeMillis;
            hk7 hk7Var = this.a;
            if (hk7Var == null) {
                hk7Var = view instanceof hk7 ? (hk7) view : null;
            }
            if (hk7Var != null) {
                hk7Var.b(str, lk7Var, clickableSpan);
            }
        }
    }

    public final void c(CharSequence charSequence) {
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable != null) {
            Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
            if (spans != null) {
                for (Object obj : spans) {
                    d(obj);
                }
            }
        }
    }

    public final void d(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof gk7) {
            ((gk7) obj).a = this.a;
            return;
        }
        if (obj instanceof cmb) {
            ((cmb) obj).o = new ik7(this);
            return;
        }
        if (obj instanceof ti6) {
            ((ti6) obj).c = new fk7(this, obj);
            return;
        }
        if (obj instanceof cq0) {
            ((cq0) obj).c = new fk7(this, obj);
        } else if (obj instanceof qu8) {
            ((qu8) obj).c = new jk7(this);
        } else if (obj instanceof ek7) {
            ((ek7) obj).c = new fk7(this, obj);
        }
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        Spannable spannableK = qx7.k(charSequence, ((Number) this.d.invoke()).intValue(), this.b, this.c, new jy2(26, this));
        return spannableK == null ? charSequence : spannableK;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
