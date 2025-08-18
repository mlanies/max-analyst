package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class iea extends FrameLayout implements kre {
    public static final /* synthetic */ bc7[] t0 = {new oi9(iea.class, "size", "getSize()Lone/me/sdk/uikit/common/overlaybutton/OneMeOverlayButton$Size;"), rh4.g(nec.a, iea.class, "mode", "getMode()Lone/me/sdk/uikit/common/overlaybutton/OneMeOverlayButton$Mode;")};
    public final hea a;
    public final hea b;
    public final pha c;
    public final ShapeDrawable o;
    public final RippleDrawable s0;

    public iea(Context context) {
        super(context, null);
        this.a = new hea(this, 0);
        this.b = new hea(this, 1);
        pha phaVar = new pha(context, null);
        phaVar.setId(xoc.i);
        this.c = phaVar;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.o = shapeDrawable;
        int i = qp4.u0.j(this).d().a.a.d;
        this.s0 = new RippleDrawable(ColorStateList.valueOf(i), shapeDrawable, new ColorDrawable(-65536));
        addView(phaVar);
        b();
        c();
    }

    public final void a(float f, int i, String str) {
        Drawable drawableN = s36.n(getContext(), i);
        if (drawableN == null) {
            return;
        }
        pha phaVar = this.c;
        phaVar.setImageDrawable(drawableN);
        phaVar.s0 = m6d.i(str);
        phaVar.o = f;
        phaVar.invalidate();
    }

    public final void b() {
        int i;
        pq9 pq9Var = qp4.u0;
        pq9Var.j(this).getIcon();
        this.c.setImageTintList(ColorStateList.valueOf(-1));
        int iOrdinal = getMode().ordinal();
        if (iOrdinal == 0) {
            i = pq9Var.j(this).b().f;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = 0;
        }
        this.o.getPaint().setColor(i);
        pq9Var.j(this).b();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(-1728053248);
        RippleDrawable rippleDrawable = this.s0;
        rippleDrawable.setColor(colorStateListValueOf);
        setBackground(rippleDrawable);
        invalidate();
    }

    public final void c() {
        int i;
        int i2;
        int iOrdinal = getSize().ordinal();
        if (iOrdinal == 0) {
            i = 24;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = 32;
        }
        int iG = tu0.G(i * fk4.d().getDisplayMetrics().density);
        this.c.setLayoutParams(new FrameLayout.LayoutParams(iG, iG));
        int iOrdinal2 = getSize().ordinal();
        if (iOrdinal2 == 0) {
            i2 = 8;
        } else {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 10;
        }
        int iG2 = tu0.G(i2 * fk4.d().getDisplayMetrics().density);
        setPadding(iG2, iG2, iG2, iG2);
        setOutlineProvider(new ix3(iG));
        requestLayout();
        invalidate();
    }

    public final fea getMode() {
        bc7 bc7Var = t0[1];
        return (fea) this.b.b;
    }

    public final gea getSize() {
        bc7 bc7Var = t0[0];
        return (gea) this.a.b;
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        b();
    }

    public final void setMode(fea feaVar) {
        this.b.o1(this, t0[1], feaVar);
    }

    public final void setSize(gea geaVar) {
        this.a.o1(this, t0[0], geaVar);
    }
}
