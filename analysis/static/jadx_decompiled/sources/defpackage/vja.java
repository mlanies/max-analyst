package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class vja extends LinearLayout implements kre {
    public static final /* synthetic */ bc7[] v0 = {new oi9(vja.class, "isIndicatorVisible", "isIndicatorVisible()Z"), rh4.g(nec.a, vja.class, "tabItem", "getTabItem()Lone/me/common/tablayout/model/OneMeBaseTabItemModel;")};
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final uja s0;
    public final uja t0;
    public zie u0;

    public vja(Context context) {
        super(context, null);
        this.a = tu0.r(3, new xda(context, 7));
        this.b = tu0.r(3, new xda(context, 8));
        this.c = tu0.r(3, new xda(context, 9));
        this.o = tu0.r(3, new yf3(context, 29, this));
        this.s0 = new uja(this);
        this.t0 = new uja((y5a) y5a.g.getValue(), this);
        this.u0 = br7.Y(getTabItem().c, qp4.u0.j(this));
        setOrientation(0);
        setGravity(17);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        setClipToPadding(false);
    }

    public static final void a(vja vjaVar) {
        vjaVar.setText(vjaVar.getTabItem().b);
        vjaVar.u0 = br7.Y(vjaVar.getTabItem().c, qp4.u0.j(vjaVar));
        Drawable drawable = vjaVar.getTabItem().e;
        je7 je7Var = vjaVar.b;
        if (drawable != null) {
            ImageView imageView = (ImageView) je7Var.getValue();
            imageView.setImageDrawable(drawable);
            br7.b(vjaVar, imageView, Integer.valueOf(vjaVar.b(imageView.getId())));
        }
        bc7 bc7Var = v0[0];
        boolean zBooleanValue = ((Boolean) vjaVar.s0.b).booleanValue();
        je7 je7Var2 = vjaVar.o;
        je7 je7Var3 = vjaVar.c;
        if (zBooleanValue) {
            np8 np8Var = vjaVar.getTabItem().d;
            if (np8Var instanceof v5a) {
                caa caaVar = (caa) je7Var3.getValue();
                br7.b(vjaVar, caaVar, Integer.valueOf(vjaVar.b(caaVar.getId())));
            } else {
                if (tpa.f(np8Var, w5a.p)) {
                    qaa qaaVar = (qaa) je7Var2.getValue();
                    qaaVar.setVisibility(vjaVar.u0.d ? 0 : 8);
                    br7.b(vjaVar, qaaVar, Integer.valueOf(vjaVar.b(qaaVar.getId())));
                } else {
                    if (!tpa.f(np8Var, x5a.p)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (je7Var2.a()) {
                        ((qaa) je7Var2.getValue()).setVisibility(8);
                    }
                    if (je7Var3.a()) {
                        ((caa) je7Var3.getValue()).setVisibility(8);
                    }
                }
            }
        }
        vjaVar.c();
        boolean zA = je7Var.a();
        je7 je7Var4 = vjaVar.a;
        if (zA) {
            ImageView imageView2 = (ImageView) je7Var.getValue();
            if (imageView2.getVisibility() == 0) {
                ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginEnd(tu0.G(((br7.H(je7Var4) || br7.H(je7Var2) || br7.H(je7Var3)) ? 4 : 0) * fk4.d().getDisplayMetrics().density));
                imageView2.setLayoutParams(marginLayoutParams);
            }
        }
        if (je7Var4.a()) {
            TextView textView = (TextView) je7Var4.getValue();
            if (textView.getVisibility() == 0) {
                ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.setMarginEnd(tu0.G(((br7.H(je7Var2) || br7.H(je7Var3)) ? 4 : 0) * fk4.d().getDisplayMetrics().density));
                textView.setLayoutParams(marginLayoutParams2);
            }
        }
        vjaVar.requestLayout();
        vjaVar.invalidate();
    }

    public static /* synthetic */ void getTabItem$annotations() {
    }

    private final void setText(CharSequence charSequence) {
        TextView textView = (TextView) this.a.getValue();
        textView.setText(charSequence);
        br7.b(this, textView, Integer.valueOf(b(textView.getId())));
    }

    public final int b(int i) {
        if (i == xoc.z0) {
            return 0;
        }
        if (i == xoc.B0) {
            return l6d.X(lz7.m(this)) / 2;
        }
        if (i == xoc.A0) {
            return l6d.X(lz7.m(this)) - 1;
        }
        return -1;
    }

    public final void c() {
        je7 je7Var = this.a;
        if (je7Var.a()) {
            ((TextView) je7Var.getValue()).setTextColor(this.u0.b);
        }
        je7 je7Var2 = this.b;
        if (je7Var2.a()) {
            ((ImageView) je7Var2.getValue()).setImageTintList(ColorStateList.valueOf(this.u0.a));
        }
        bc7 bc7Var = v0[0];
        if (((Boolean) this.s0.b).booleanValue()) {
            np8 np8Var = getTabItem().d;
            boolean zF = tpa.f(np8Var, w5a.p);
            je7 je7Var3 = this.o;
            if (zF) {
                if (je7Var3.a()) {
                    ((qaa) je7Var3.getValue()).setVisibility(this.u0.d ? 0 : 8);
                    return;
                }
                return;
            }
            boolean z = np8Var instanceof v5a;
            je7 je7Var4 = this.c;
            if (!z) {
                if (!tpa.f(np8Var, x5a.p)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (je7Var4.a()) {
                    ((caa) je7Var4.getValue()).setVisibility(8);
                }
                if (je7Var3.a()) {
                    ((qaa) je7Var3.getValue()).setVisibility(8);
                    return;
                }
                return;
            }
            boolean z2 = this.u0.d && ((v5a) np8Var).p != 0;
            if (je7Var4.a()) {
                caa caaVar = (caa) je7Var4.getValue();
                caaVar.setVisibility(z2 ? 0 : 8);
                int iS = au1.s(getTabItem().c);
                x9a x9aVar = x9a.a;
                if (iS != 0) {
                    if (iS == 1) {
                        x9aVar = x9a.c;
                    } else if (iS != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                caaVar.setAppearance(x9aVar);
                caaVar.g(((v5a) np8Var).p, true);
            }
        }
    }

    public final y5a getTabItem() {
        bc7 bc7Var = v0[1];
        return (y5a) this.t0.b;
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.u0 = br7.Y(getTabItem().c, fkaVar);
        c();
        qp4.d(qp4.u0.b(getContext()), this);
    }

    public final void setIndicatorVisible(boolean z) {
        this.s0.o1(this, v0[0], Boolean.valueOf(z));
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        if (z != isSelected()) {
            setTabItem(y5a.a(getTabItem(), null, z ? 1 : 2, null, 59));
        }
        super.setSelected(z);
    }

    public final void setTabItem(y5a y5aVar) {
        this.t0.o1(this, v0[1], y5aVar);
    }
}
