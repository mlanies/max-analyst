package defpackage;

import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class dw8 extends dle implements jw8 {
    public m56 X;
    public cw8 Y;
    public a66 o;

    public dw8() {
        super(new g27(19));
    }

    @Override // defpackage.dle
    public final void Y(View view) {
        tu0.K((iw8) view, 300L, new xx5(17, this));
    }

    @Override // defpackage.jw8
    public final void c(is0 is0Var) {
        je7 je7Var = (je7) this.c;
        if (je7Var.a()) {
            ((iw8) je7Var.getValue()).a(is0Var);
        }
    }

    @Override // defpackage.jw8
    public final void l() {
        this.Y = null;
        je7 je7Var = (je7) this.c;
        if (je7Var.a()) {
            ((iw8) je7Var.getValue()).setVisibility(8);
        }
    }

    @Override // defpackage.jw8
    public final void setForwardClickListener(m56 m56Var) {
        this.X = m56Var;
    }

    @Override // defpackage.jw8
    public final void setLink(cw8 cw8Var) {
        this.Y = cw8Var;
        ViewGroup viewGroup = (ViewGroup) this.b;
        if (viewGroup == null) {
            viewGroup = null;
        }
        if (!viewGroup.isLaidOut() || viewGroup.isLayoutRequested()) {
            viewGroup.addOnLayoutChangeListener(new qq0(5, this));
        } else {
            ViewGroup viewGroup2 = (ViewGroup) this.b;
            if (viewGroup2 == null) {
                viewGroup2 = null;
            }
            int iQ = rh4.q(10, fk4.d().getDisplayMetrics().density, viewGroup2.getMeasuredWidth()) - L();
            if (iQ < 0) {
                iQ = 0;
            }
            ViewGroup viewGroup3 = (ViewGroup) this.b;
            f46.D(iQ, Q(), viewGroup3 != null ? viewGroup3 : null);
        }
        ((iw8) Q()).setIsFloating(cw8Var.f);
        zv8 zv8Var = cw8Var.d;
        boolean z = zv8Var != null;
        vv8 vv8Var = cw8Var.e;
        boolean z2 = vv8Var != null;
        if (!z2 || z) {
            Layout layout = cw8Var.c;
            if (z2 && (zv8Var instanceof yv8)) {
                iw8 iw8Var = (iw8) Q();
                if (layout == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                iw8Var.l(layout, ((yv8) zv8Var).a, vv8Var);
            } else if (zv8Var instanceof yv8) {
                iw8 iw8Var2 = (iw8) Q();
                if (layout == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                iw8Var2.m(layout, ((yv8) zv8Var).a);
            } else if (z2 && (zv8Var instanceof xv8)) {
                iw8 iw8Var3 = (iw8) Q();
                if (layout == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                iw8Var3.j(layout, (xv8) zv8Var, vv8Var);
            } else if (zv8Var instanceof xv8) {
                iw8 iw8Var4 = (iw8) Q();
                if (layout == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                iw8Var4.k(layout, (xv8) zv8Var);
            } else if (zv8Var instanceof wv8) {
                iw8 iw8Var5 = (iw8) Q();
                if (layout == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                iw8Var5.i(layout, (wv8) zv8Var);
            }
        } else {
            ((iw8) Q()).setSingleForward(vv8Var);
        }
        t();
    }

    @Override // defpackage.jw8
    public final void setReplyClickListener(a66 a66Var) {
        this.o = a66Var;
    }
}
