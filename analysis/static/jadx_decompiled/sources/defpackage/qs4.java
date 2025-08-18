package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class qs4 extends n15 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final c5 i;
    public final e33 j;
    public final q64 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    public qs4(m15 m15Var) {
        super(m15Var);
        this.i = new c5(26, this);
        this.j = new e33(1, this);
        this.k = new q64(8, this);
        this.o = Long.MAX_VALUE;
        this.f = z7.P(tsb.motionDurationShort3, 67, m15Var.getContext());
        this.e = z7.P(tsb.motionDurationShort3, 50, m15Var.getContext());
        this.g = z7.Q(m15Var.getContext(), tsb.motionEasingLinearInterpolator, og.a);
    }

    @Override // defpackage.n15
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && ft.n(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new dd4(7, this));
    }

    @Override // defpackage.n15
    public final int c() {
        return wzb.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.n15
    public final int d() {
        return yub.mtrl_dropdown_arrow;
    }

    @Override // defpackage.n15
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // defpackage.n15
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // defpackage.n15
    public final q64 h() {
        return this.k;
    }

    @Override // defpackage.n15
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // defpackage.n15
    public final boolean j() {
        return this.l;
    }

    @Override // defpackage.n15
    public final boolean l() {
        return this.n;
    }

    @Override // defpackage.n15
    public final void m(EditText editText) {
        int i = 2;
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new ei1(i, this));
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: ps4
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                qs4 qs4Var = this.a;
                qs4Var.m = true;
                qs4Var.o = System.currentTimeMillis();
                qs4Var.t(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!ft.n(editText) && this.p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = zmf.a;
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // defpackage.n15
    public final void n(l4 l4Var) {
        if (!ft.n(this.h)) {
            l4Var.h(Spinner.class.getName());
        }
        AccessibilityNodeInfo accessibilityNodeInfo = l4Var.a;
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // defpackage.n15
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.p.isEnabled() || ft.n(this.h)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            u();
            this.m = true;
            this.o = System.currentTimeMillis();
        }
    }

    @Override // defpackage.n15
    public final void r() {
        int i = 7;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f);
        valueAnimatorOfFloat.addUpdateListener(new z00(i, this));
        this.r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.e);
        valueAnimatorOfFloat2.addUpdateListener(new z00(i, this));
        this.q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new h6(4, this));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // defpackage.n15
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        t(!this.n);
        if (!this.n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
