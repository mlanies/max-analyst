package defpackage;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class n15 {
    public final TextInputLayout a;
    public final m15 b;
    public final Context c;
    public final CheckableImageButton d;

    public n15(m15 m15Var) {
        this.a = m15Var.a;
        this.b = m15Var;
        this.c = m15Var.getContext();
        this.d = m15Var.u0;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public q64 h() {
        return null;
    }

    public boolean i(int i) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof qs4;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(l4 l4Var) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z) {
    }

    public final void q() {
        this.b.f(false);
    }

    public void r() {
    }

    public void s() {
    }
}
