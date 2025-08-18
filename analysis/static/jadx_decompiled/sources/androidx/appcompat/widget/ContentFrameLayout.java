package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import defpackage.b7;
import defpackage.dn;
import defpackage.e7;
import defpackage.rwe;
import defpackage.u54;
import defpackage.vof;
import defpackage.wq8;
import defpackage.ws3;
import defpackage.y8;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue a;
    public TypedValue b;
    public TypedValue c;
    public TypedValue o;
    public TypedValue s0;
    public TypedValue t0;
    public final Rect u0;
    public ws3 v0;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.u0 = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.s0 == null) {
            this.s0 = new TypedValue();
        }
        return this.s0;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.t0 == null) {
            this.t0 = new TypedValue();
        }
        return this.t0;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.c == null) {
            this.c = new TypedValue();
        }
        return this.c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.o == null) {
            this.o = new TypedValue();
        }
        return this.o;
    }

    public TypedValue getMinWidthMajor() {
        if (this.a == null) {
            this.a = new TypedValue();
        }
        return this.a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.b == null) {
            this.b = new TypedValue();
        }
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ws3 ws3Var = this.v0;
        if (ws3Var != null) {
            ws3Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        e7 e7Var;
        super.onDetachedFromWindow();
        ws3 ws3Var = this.v0;
        if (ws3Var != null) {
            dn dnVar = (dn) ((y8) ws3Var).a;
            u54 u54Var = dnVar.C0;
            if (u54Var != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) u54Var;
                actionBarOverlayLayout.e();
                ActionMenuView actionMenuView = ((rwe) actionBarOverlayLayout.s0).a.a;
                if (actionMenuView != null && (e7Var = actionMenuView.s0) != null) {
                    e7Var.f();
                    b7 b7Var = e7Var.E0;
                    if (b7Var != null && b7Var.b()) {
                        b7Var.j.dismiss();
                    }
                }
            }
            if (dnVar.H0 != null) {
                dnVar.w0.getDecorView().removeCallbacks(dnVar.I0);
                if (dnVar.H0.isShowing()) {
                    try {
                        dnVar.H0.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                dnVar.H0 = null;
            }
            vof vofVar = dnVar.J0;
            if (vofVar != null) {
                vofVar.b();
            }
            wq8 wq8Var = dnVar.w(0).h;
            if (wq8Var != null) {
                wq8Var.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(ws3 ws3Var) {
        this.v0 = ws3Var;
    }
}
