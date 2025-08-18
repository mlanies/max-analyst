package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class knc extends ConstraintLayout {
    public static final /* synthetic */ bc7[] S0 = {new oi9(knc.class, "mode", "getMode()Lone/me/calls/ui/view/RoundButtonView$Companion$ButtonStyle;"), rh4.g(nec.a, knc.class, "shape", "getShape()Lone/me/calls/ui/view/RoundButtonView$Companion$ButtonShape;"), new oi9(knc.class, "imageSize", "getImageSize()Lone/me/calls/ui/view/RoundButtonView$Companion$IconSize;")};
    public final je7 G0;
    public final je7 H0;
    public final je7 I0;
    public final je7 J0;
    public final je7 K0;
    public hnc L0;
    public final je7 M0;
    public final je7 N0;
    public final je7 O0;
    public final jnc P0;
    public final jnc Q0;
    public final jnc R0;

    public knc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G0 = tu0.r(3, new xda(context, 21));
        this.H0 = tu0.r(3, new xda(context, 22));
        this.I0 = tu0.r(3, new xda(context, 23));
        this.J0 = tu0.r(3, new zja(context, 15, this));
        this.K0 = tu0.r(3, new xda(context, 24));
        this.M0 = tu0.r(3, new hbc(6));
        this.N0 = tu0.r(3, new lwa(21, this));
        this.O0 = tu0.r(3, new hbc(7));
        this.P0 = new jnc(this, 0);
        this.Q0 = new jnc(this, 1);
        float f = 52;
        this.R0 = new jnc(new gnc(tu0.G(fk4.c() * f), tu0.G(fk4.c() * f)), this);
        addView(getIconView(), tu0.G(fk4.c() * f), tu0.G(fk4.c() * f));
        addView(getStubCounterView());
        addView(getStubTitleView());
        tu0.K(this, 300L, new elb(1, this));
        C();
        dj3 dj3VarQ = fp3.q(this);
        int id = getIconView().getId();
        dj3VarQ.d(id, 3, 0, 3);
        float f2 = 4;
        new l2a(dj3VarQ, 3, id, 4).e(tu0.G(fk4.c() * f2));
        dj3VarQ.d(id, 7, 0, 7);
        new l2a(dj3VarQ, 7, id, 4).e(tu0.G(fk4.c() * f2));
        dj3VarQ.d(id, 6, 0, 6);
        new l2a(dj3VarQ, 6, id, 4).e(tu0.G(fk4.c() * f2));
        dj3VarQ.d(id, 4, getStubTitleView().getId(), 3);
        new l2a(dj3VarQ, 4, id, 4).e(tu0.G(fk4.c() * f2));
        int id2 = getStubCounterView().getId();
        dj3VarQ.d(id2, 3, 0, 3);
        dj3VarQ.d(id2, 7, 0, 7);
        int id3 = getStubTitleView().getId();
        dj3VarQ.d(id3, 3, getIconView().getId(), 4);
        new l2a(dj3VarQ, 3, id3, 4).e(tu0.G(fk4.c() * f2));
        dj3VarQ.d(id3, 6, 0, 6);
        dj3VarQ.d(id3, 7, 0, 7);
        dj3VarQ.a(this);
    }

    public static void B(knc kncVar, int i) {
        kncVar.y(i, qp4.u0.p(kncVar).c.getIcon().f);
    }

    private final int getContrastColor() {
        return -868664768;
    }

    private final caa getCounterView() {
        return (caa) this.J0.getValue();
    }

    private final ShapeDrawable getCurrentShape() {
        int i = inc.$EnumSwitchMapping$0[getShape().ordinal()];
        if (i == 1) {
            return getShapeOvalDrawable();
        }
        if (i == 2) {
            return getShapeRectDrawable();
        }
        throw new NoWhenBranchMatchedException();
    }

    private final float[] getIconBgRadius() {
        return (float[]) this.M0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView getIconView() {
        return (ImageView) this.I0.getValue();
    }

    private final int getInactiveColor() {
        return qp4.u0.p(this).c.d().b.a.g;
    }

    private final int getNegativeColor() {
        return qp4.u0.p(this).c.b().a.e;
    }

    private final int getNeutralColor() {
        return qp4.u0.p(this).c.b().a.g;
    }

    private final int getPositiveColor() {
        return qp4.u0.p(this).c.b().a.l;
    }

    private final int getSelectedColor() {
        return qp4.u0.p(this).c.d().a.a.c;
    }

    private final ShapeDrawable getShapeOvalDrawable() {
        return (ShapeDrawable) this.O0.getValue();
    }

    private final ShapeDrawable getShapeRectDrawable() {
        return (ShapeDrawable) this.N0.getValue();
    }

    private final ViewStub getStubCounterView() {
        return (ViewStub) this.G0.getValue();
    }

    private final ViewStub getStubTitleView() {
        return (ViewStub) this.H0.getValue();
    }

    private final int getThemedColor() {
        return qp4.u0.p(this).c.b().a.m;
    }

    private final TextView getTitleView() {
        return (TextView) this.K0.getValue();
    }

    public static ShapeDrawable w(knc kncVar) {
        return new ShapeDrawable(new RoundRectShape(kncVar.getIconBgRadius(), null, null));
    }

    public final void A(Drawable drawable, int i) {
        getIconView().setImageDrawable(drawable);
        getIconView().setImageTintList(ColorStateList.valueOf(i));
    }

    public final void C() {
        Integer numValueOf;
        RippleDrawable rippleDrawable;
        switch (getMode().ordinal()) {
            case 0:
                numValueOf = Integer.valueOf(getNeutralColor());
                break;
            case 1:
                numValueOf = Integer.valueOf(getPositiveColor());
                break;
            case 2:
                numValueOf = Integer.valueOf(getNegativeColor());
                break;
            case 3:
                numValueOf = Integer.valueOf(getSelectedColor());
                break;
            case 4:
                numValueOf = Integer.valueOf(getContrastColor());
                break;
            case 5:
                numValueOf = Integer.valueOf(getInactiveColor());
                break;
            case 6:
                numValueOf = Integer.valueOf(getThemedColor());
                break;
            case 7:
                numValueOf = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        ImageView iconView = getIconView();
        pq9 pq9Var = qp4.u0;
        if (numValueOf != null) {
            int i = pq9Var.p(this).c.d().a.a.c;
            ShapeDrawable currentShape = getCurrentShape();
            currentShape.getPaint().setColor(numValueOf.intValue());
            rippleDrawable = new RippleDrawable(ColorStateList.valueOf(i), currentShape, null);
        } else {
            int i2 = pq9Var.j(this).d().a.a.h;
            ShapeDrawable currentShape2 = getCurrentShape();
            currentShape2.getPaint().setColor(-1);
            rippleDrawable = new RippleDrawable(ColorStateList.valueOf(i2), null, currentShape2);
        }
        iconView.setBackground(rippleDrawable);
    }

    public final gnc getImageSize() {
        bc7 bc7Var = S0[2];
        return (gnc) this.R0.b;
    }

    public final fnc getMode() {
        bc7 bc7Var = S0[0];
        return (fnc) this.P0.b;
    }

    public final enc getShape() {
        bc7 bc7Var = S0[1];
        return (enc) this.Q0.b;
    }

    public final void setAccessibility(jqe jqeVar) {
        getIconView().setContentDescription(jqeVar != null ? jqeVar.b(getContext()) : null);
    }

    public final void setButtonPadding(int i) {
        ImageView iconView = getIconView();
        int iG = tu0.G(fk4.c() * i);
        iconView.setPadding(iG, iG, iG, iG);
    }

    public final void setCounter(int i) {
        if (br7.G(getStubCounterView()) || i != 0) {
            br7.F(getStubCounterView(), getCounterView(), null);
            getCounterView().g(i, false);
            getCounterView().setVisibility(i == 0 ? 8 : 0);
        }
    }

    public final void setIcon(Drawable drawable) {
        getIconView().setImageDrawable(drawable);
    }

    public final void setIconTint(int i) {
        getIconView().setImageTintList(ColorStateList.valueOf(i));
    }

    public final void setImageSize(gnc gncVar) {
        this.R0.o1(this, S0[2], gncVar);
    }

    public final void setListener(hnc hncVar) {
        this.L0 = hncVar;
    }

    public final void setMode(fnc fncVar) {
        this.P0.o1(this, S0[0], fncVar);
    }

    public final void setShape(enc encVar) {
        this.Q0.o1(this, S0[1], encVar);
    }

    public final void setTextColor(int i) {
        getCounterView().setTextColor(i);
    }

    public final void setTitle(jqe jqeVar) {
        if (br7.G(getStubTitleView()) || jqeVar != null) {
            br7.F(getStubTitleView(), getTitleView(), null);
            getTitleView().setText(jqeVar != null ? jqeVar.b(getContext()) : null);
            getTitleView().setVisibility(jqeVar != null ? 0 : 8);
        }
    }

    public final void y(int i, int i2) {
        getIconView().setImageResource(i);
        getIconView().setImageTintList(ColorStateList.valueOf(i2));
    }

    public final void setAccessibility(Integer num) {
        String string;
        ImageView iconView = getIconView();
        if (num != null) {
            string = getContext().getString(num.intValue());
        } else {
            string = null;
        }
        iconView.setContentDescription(string);
    }

    public final void setAccessibility(String str) {
        getIconView().setContentDescription(str);
    }
}
