package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class ap1 extends ConstraintLayout implements kre, em1 {
    public static final /* synthetic */ bc7[] l1 = {new oi9(ap1.class, "mode", "getMode()Lone/me/calls/ui/view/CallUserView$Mode;"), rh4.g(nec.a, ap1.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;")};
    public final je7 G0;
    public final je7 H0;
    public final je7 I0;
    public final je7 J0;
    public final je7 K0;
    public final GestureDetector L0;
    public final s5a M0;
    public final TextView N0;
    public final knc O0;
    public k56 P0;
    public k56 Q0;
    public final je7 R0;
    public final je7 S0;
    public final je7 T0;
    public final je7 U0;
    public final ViewStub V0;
    public final ViewStub W0;
    public final ViewStub X0;
    public final ViewStub Y0;
    public final khe Z0;
    public final je7 a1;
    public xo1 b1;
    public Boolean c1;
    public Boolean d1;
    public Boolean e1;
    public CharSequence f1;
    public iaf g1;
    public gg1 h1;
    public haf i1;
    public final zo1 j1;
    public final zo1 k1;

    public ap1(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G0 = tu0.r(3, new dk1(14));
        final int i = 0;
        this.H0 = tu0.r(3, new k56() { // from class: wo1
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ap1.y(context, this);
                    case 1:
                        return ap1.A(context, this);
                    case 2:
                        return ap1.B(context, this);
                    default:
                        ip1 ip1Var = new ip1(context);
                        ip1Var.setLayoutParams(new ti3(-1, -1));
                        dy7.M(ip1Var, false);
                        ap1 ap1Var = this;
                        ip1Var.setListener(new ync(19, ap1Var));
                        ip1Var.setVideoLayoutUpdatesControllerProvider(new uo1(ap1Var, 1));
                        return ip1Var;
                }
            }
        });
        this.I0 = tu0.r(3, new a5(context, 21));
        this.J0 = tu0.r(3, new a5(context, 22));
        this.K0 = tu0.r(3, new a5(context, 23));
        final int i2 = 1;
        this.R0 = tu0.r(3, new k56() { // from class: wo1
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ap1.y(context, this);
                    case 1:
                        return ap1.A(context, this);
                    case 2:
                        return ap1.B(context, this);
                    default:
                        ip1 ip1Var = new ip1(context);
                        ip1Var.setLayoutParams(new ti3(-1, -1));
                        dy7.M(ip1Var, false);
                        ap1 ap1Var = this;
                        ip1Var.setListener(new ync(19, ap1Var));
                        ip1Var.setVideoLayoutUpdatesControllerProvider(new uo1(ap1Var, 1));
                        return ip1Var;
                }
            }
        });
        final int i3 = 2;
        this.S0 = tu0.r(3, new k56() { // from class: wo1
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return ap1.y(context, this);
                    case 1:
                        return ap1.A(context, this);
                    case 2:
                        return ap1.B(context, this);
                    default:
                        ip1 ip1Var = new ip1(context);
                        ip1Var.setLayoutParams(new ti3(-1, -1));
                        dy7.M(ip1Var, false);
                        ap1 ap1Var = this;
                        ip1Var.setListener(new ync(19, ap1Var));
                        ip1Var.setVideoLayoutUpdatesControllerProvider(new uo1(ap1Var, 1));
                        return ip1Var;
                }
            }
        });
        final int i4 = 3;
        this.T0 = tu0.r(3, new k56() { // from class: wo1
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return ap1.y(context, this);
                    case 1:
                        return ap1.A(context, this);
                    case 2:
                        return ap1.B(context, this);
                    default:
                        ip1 ip1Var = new ip1(context);
                        ip1Var.setLayoutParams(new ti3(-1, -1));
                        dy7.M(ip1Var, false);
                        ap1 ap1Var = this;
                        ip1Var.setListener(new ync(19, ap1Var));
                        ip1Var.setVideoLayoutUpdatesControllerProvider(new uo1(ap1Var, 1));
                        return ip1Var;
                }
            }
        });
        this.U0 = tu0.r(3, new a5(context, 24));
        this.Z0 = new khe(new uo1(this, 0));
        this.a1 = tu0.r(3, new uo1(this, 2));
        this.h1 = gg1.c;
        this.j1 = new zo1(this, 0);
        this.k1 = new zo1(this, 1);
        setLayoutParams(new ti3(-1, -1));
        setElevation(fk4.d().getDisplayMetrics().density * 2.0f);
        dy7.H(this, fk4.d().getDisplayMetrics().density * 20.0f);
        setBackgroundColor(getBackgroundColor());
        this.L0 = new GestureDetector(context, new q00(4, this));
        s5a s5aVar = new s5a(context);
        s5aVar.setId(y7a.H1);
        s5aVar.setAvatarShape(j5a.a);
        this.M0 = s5aVar;
        TextView textView = new TextView(context);
        textView.setId(y7a.F1);
        textView.setMaxLines(1);
        textView.setTextColor(qp4.u0.p(textView).c.getText().e);
        i4f.p.b(textView, du4.b);
        int iG = tu0.G(6 * fk4.d().getDisplayMetrics().density);
        textView.setPadding(iG, iG, iG, iG);
        np8.n(textView);
        this.N0 = textView;
        knc kncVar = new knc(context, null);
        kncVar.setId(y7a.i0);
        kncVar.setMode(fnc.a);
        kncVar.setVisibility(8);
        kncVar.setImageSize(new gnc(getActionButtonSize(), getActionButtonSize()));
        this.O0 = kncVar;
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(y7a.r0);
        this.W0 = viewStub;
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(y7a.p0);
        this.X0 = viewStub2;
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(y7a.t0);
        this.V0 = viewStub3;
        ViewStub viewStub4 = new ViewStub(context);
        viewStub4.setId(y7a.g0);
        this.Y0 = viewStub4;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(y7a.n0);
        frameLayout.addView(textView, -2, -2);
        addView(s5aVar, getAvatarSize(), getAvatarSize());
        addView(viewStub);
        addView(viewStub2);
        addView(viewStub4);
        addView(frameLayout, -1, -2);
        addView(kncVar);
        addView(viewStub3);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new qq0(2, this));
        } else {
            K(this.f1);
        }
        dj3 dj3VarQ = fp3.q(this);
        int id = s5aVar.getId();
        dj3VarQ.d(id, 4, 0, 4);
        au1.p(5, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 4, id, 4));
        dj3VarQ.d(id, 3, 0, 3);
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 7, 0, 7);
        int id2 = viewStub.getId();
        dj3VarQ.d(id2, 4, 0, 4);
        dj3VarQ.d(id2, 3, 0, 3);
        dj3VarQ.d(id2, 6, 0, 6);
        dj3VarQ.d(id2, 7, 0, 7);
        int id3 = viewStub4.getId();
        dj3VarQ.d(id3, 4, 0, 4);
        dj3VarQ.d(id3, 3, 0, 3);
        dj3VarQ.d(id3, 6, 0, 6);
        dj3VarQ.d(id3, 7, 0, 7);
        int id4 = viewStub2.getId();
        dj3VarQ.d(id4, 4, 0, 4);
        dj3VarQ.d(id4, 3, 0, 3);
        dj3VarQ.d(id4, 6, 0, 6);
        dj3VarQ.d(id4, 7, 0, 7);
        int id5 = frameLayout.getId();
        dj3VarQ.d(id5, 6, 0, 6);
        float f = 8;
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, id5, 4));
        dj3VarQ.d(id5, 4, 0, 4);
        new l2a(dj3VarQ, 4, id5, 4).e(getNameVerticalMargin());
        dj3VarQ.d(id5, 7, 0, 7);
        new l2a(dj3VarQ, 7, id5, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        int id6 = kncVar.getId();
        dj3VarQ.d(id6, 3, 0, 3);
        new l2a(dj3VarQ, 3, id6, 4).e(getActionButtonPadding());
        dj3VarQ.d(id6, 7, 0, 7);
        new l2a(dj3VarQ, 7, id6, 4).e(getActionButtonPadding());
        int id7 = viewStub3.getId();
        dj3VarQ.d(id7, 3, 0, 3);
        new l2a(dj3VarQ, 3, id7, 4).e(getActionButtonPadding());
        dj3VarQ.d(id7, 6, 0, 6);
        new l2a(dj3VarQ, 6, id7, 4).e(getActionButtonPadding());
        dj3VarQ.a(this);
    }

    public static ImageView A(Context context, ap1 ap1Var) {
        ImageView imageView = new ImageView(context);
        imageView.setId(y7a.t0);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(ap1Var.getActionButtonSize(), ap1Var.getActionButtonSize()));
        imageView.setImageDrawable(ap1Var.getRaiseHandIcon());
        tu0.K(imageView, 300L, new vo1(ap1Var, 3));
        return imageView;
    }

    public static View B(Context context, ap1 ap1Var) {
        View view = new View(context);
        view.setId(y7a.g0);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setBackground(ap1Var.getLoadingDrawable());
        view.setVisibility(8);
        return view;
    }

    public static ShapeDrawable C(ap1 ap1Var) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(ap1Var.getMainRoundRectShape());
        shapeDrawable.getPaint().setColor(qp4.u0.p(ap1Var).c.b().e);
        shapeDrawable.getPaint().setAntiAlias(true);
        return shapeDrawable;
    }

    public static final void E(ap1 ap1Var) {
        s5a s5aVar = ap1Var.M0;
        ViewGroup.LayoutParams layoutParams = s5aVar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = ap1Var.getAvatarSize();
        layoutParams.width = ap1Var.getAvatarSize();
        s5aVar.setLayoutParams(layoutParams);
        TextView textView = ap1Var.N0;
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.bottomMargin = ap1Var.getNameVerticalMargin();
        textView.setLayoutParams(marginLayoutParams);
        knc kncVar = ap1Var.O0;
        ViewGroup.LayoutParams layoutParams3 = kncVar.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams2.topMargin = ap1Var.getActionButtonPadding();
        marginLayoutParams2.setMarginEnd(ap1Var.getActionButtonPadding());
        kncVar.setLayoutParams(marginLayoutParams2);
        if (br7.G(ap1Var.V0)) {
            ImageView raiseHandView = ap1Var.getRaiseHandView();
            ViewGroup.LayoutParams layoutParams4 = raiseHandView.getLayoutParams();
            if (layoutParams4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
            marginLayoutParams3.height = ap1Var.getActionButtonSize();
            marginLayoutParams3.width = ap1Var.getActionButtonSize();
            raiseHandView.setLayoutParams(marginLayoutParams3);
            ap1Var.getRaiseHandIcon().setBounds(0, 0, ap1Var.getActionButtonSize(), ap1Var.getActionButtonSize());
        }
        kncVar.setImageSize(new gnc(ap1Var.getActionButtonSize(), ap1Var.getActionButtonSize()));
    }

    private final int getActionButtonPadding() {
        int iOrdinal = getMode().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2) {
                return tu0.G(4 * fk4.d().getDisplayMetrics().density);
            }
            if (iOrdinal == 3) {
                return tu0.G(6 * fk4.d().getDisplayMetrics().density);
            }
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return tu0.G(6 * fk4.d().getDisplayMetrics().density);
    }

    private final int getActionButtonSize() {
        int iOrdinal = getMode().ordinal();
        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
            if (iOrdinal == 3) {
                return tu0.G(40 * fk4.d().getDisplayMetrics().density);
            }
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return tu0.G(26 * fk4.d().getDisplayMetrics().density);
    }

    private final int getAvatarSize() {
        int iOrdinal = getMode().ordinal();
        if (iOrdinal == 0) {
            return tu0.G(72 * fk4.d().getDisplayMetrics().density);
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return tu0.G(40 * fk4.d().getDisplayMetrics().density);
        }
        if (iOrdinal != 3 && iOrdinal != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return tu0.G(216 * fk4.d().getDisplayMetrics().density);
    }

    private final int getBackgroundColor() {
        return getCurrentTheme().b().l;
    }

    private final ShapeDrawable getBackgroundItemView() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(getItemRoundRectShape());
        shapeDrawable.getPaint().setColor(Color.parseColor("#CC393A40"));
        return shapeDrawable;
    }

    private final t21 getCameraPreviewView() {
        return (t21) this.U0.getValue();
    }

    private final fka getCurrentTheme() {
        fka customTheme = getCustomTheme();
        return customTheme == null ? qp4.u0.j(this) : customTheme;
    }

    private final RoundRectShape getItemRoundRectShape() {
        return new RoundRectShape(getMAIN_BG_RADIUS(), null, null);
    }

    private final ShapeDrawable getLoadingDrawable() {
        return (ShapeDrawable) this.a1.getValue();
    }

    private final View getLoadingView() {
        return (View) this.S0.getValue();
    }

    private final float[] getMAIN_BG_RADIUS() {
        return (float[]) this.G0.getValue();
    }

    private final RoundRectShape getMainRoundRectShape() {
        return new RoundRectShape(getMAIN_BG_RADIUS(), null, null);
    }

    private final Drawable getMoreIcon() {
        return (Drawable) this.K0.getValue();
    }

    private final int getNameVerticalMargin() {
        int iOrdinal = getMode().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2) {
                return tu0.G(4 * fk4.d().getDisplayMetrics().density);
            }
            if (iOrdinal == 3) {
                return tu0.G(6 * fk4.d().getDisplayMetrics().density);
            }
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return tu0.G(6 * fk4.d().getDisplayMetrics().density);
    }

    private final Drawable getPinnedIcon() {
        return (Drawable) this.I0.getValue();
    }

    private final k4c getRaiseHandIcon() {
        return (k4c) this.H0.getValue();
    }

    private final ImageView getRaiseHandView() {
        return (ImageView) this.R0.getValue();
    }

    private final ip1 getRender() {
        return (ip1) this.T0.getValue();
    }

    private final Drawable getRotateIcon() {
        return (Drawable) this.J0.getValue();
    }

    private final ShapeDrawable getTalkingDrawable() {
        return (ShapeDrawable) this.Z0.getValue();
    }

    private final int getViewPadding() {
        int iOrdinal = getMode().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1 && iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return tu0.G(0 * fk4.d().getDisplayMetrics().density);
                }
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return tu0.G(4 * fk4.d().getDisplayMetrics().density);
        }
        return tu0.G(2 * fk4.d().getDisplayMetrics().density);
    }

    public static void w(ap1 ap1Var, boolean z) {
        dy7.M(ap1Var.getRender(), z);
        s5a s5aVar = ap1Var.M0;
        boolean z2 = !z;
        if ((s5aVar.getVisibility() == 0) != z2) {
            s5aVar.setVisibility(z2 ? 0 : 8);
        }
        ShapeDrawable backgroundItemView = ap1Var.getBackgroundItemView();
        if (!z) {
            backgroundItemView = null;
        }
        ap1Var.N0.setBackground(backgroundItemView);
    }

    public static ShapeDrawable x(ap1 ap1Var) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(ap1Var.getMainRoundRectShape());
        shapeDrawable.getPaint().setColor(qp4.u0.p(ap1Var).c.b().a.l);
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable.getPaint().setStrokeWidth(fk4.d().getDisplayMetrics().density * 4.0f);
        shapeDrawable.getPaint().setAntiAlias(true);
        return shapeDrawable;
    }

    public static k4c y(Context context, ap1 ap1Var) {
        k4c k4cVar = new k4c(context);
        k4cVar.setBounds(0, 0, ap1Var.getActionButtonSize(), ap1Var.getActionButtonSize());
        return k4cVar;
    }

    public final void F(boolean z) {
        ViewStub viewStub = this.Y0;
        if ((br7.G(viewStub) || z) && !tpa.f(this.d1, Boolean.valueOf(z))) {
            br7.F(viewStub, getLoadingView(), null);
            this.d1 = Boolean.valueOf(z);
            getLoadingView().setVisibility(z ? 0 : 8);
        }
    }

    public final void G(boolean z) {
        if (tpa.f(this.c1, Boolean.valueOf(z))) {
            return;
        }
        this.c1 = Boolean.valueOf(z);
        ShapeDrawable talkingDrawable = getTalkingDrawable();
        if (!z) {
            talkingDrawable = null;
        }
        setForeground(talkingDrawable);
    }

    public final void I(boolean z, boolean z2) {
        br7.F(this.X0, getCameraPreviewView(), null);
        getCameraPreviewView().setVisibility(z ? 0 : 8);
        getCameraPreviewView().a(z, z2);
    }

    public final void J(String str, CharSequence charSequence) {
        if (tpa.f(this.f1, charSequence)) {
            return;
        }
        this.f1 = charSequence;
        K(charSequence);
        this.N0.setContentDescription(str);
    }

    public final void K(CharSequence charSequence) {
        int iM = wg0.m(6, fk4.d().getDisplayMetrics().density, 2, wg0.m(8, fk4.d().getDisplayMetrics().density, 2, getMeasuredWidth())) - (getViewPadding() * 2);
        TextView textView = this.N0;
        CharSequence charSequenceF = dy7.f(charSequence, textView, iM);
        textView.setText(charSequenceF);
        textView.setVisibility((charSequenceF == null || w9e.C0(charSequenceF)) ^ true ? 0 : 8);
    }

    public final fka getCustomTheme() {
        bc7 bc7Var = l1[1];
        return (fka) this.k1.b;
    }

    public final yo1 getMode() {
        bc7 bc7Var = l1[0];
        return (yo1) this.j1.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        fm1 fm1Var;
        super.onAttachedToWindow();
        k56 k56Var = this.P0;
        if (k56Var != null && (fm1Var = (fm1) k56Var.invoke()) != null) {
            ((gm1) fm1Var).a.add(this);
        }
        if (br7.G(this.V0) && tpa.f(this.e1, Boolean.TRUE)) {
            getRaiseHandIcon().start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        fm1 fm1Var;
        super.onDetachedFromWindow();
        k56 k56Var = this.P0;
        if (k56Var != null && (fm1Var = (fm1) k56Var.invoke()) != null) {
            ((gm1) fm1Var).a.remove(this);
        }
        if (br7.G(this.V0)) {
            getRaiseHandIcon().stop();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        K(this.f1);
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        setBackgroundColor(getBackgroundColor());
        TextView textView = this.N0;
        ShapeDrawable backgroundItemView = getBackgroundItemView();
        if (getRender().getVisibility() != 0) {
            backgroundItemView = null;
        }
        textView.setBackground(backgroundItemView);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.L0.onTouchEvent(motionEvent);
    }

    @Override // defpackage.em1
    public final void p() {
        setOpponentVideo(this.i1);
    }

    public final void setAvatar(md0 md0Var) {
        s5a.h(this.M0, md0Var != null ? md0Var.b : null, md0Var != null ? md0Var.a : null);
    }

    public final void setBackgroundCorners(float f) {
        dy7.H(this, f);
    }

    public final void setButtonAction(iaf iafVar) {
        if (this.g1 == iafVar) {
            return;
        }
        this.g1 = iafVar;
        int iOrdinal = iafVar.ordinal();
        pq9 pq9Var = qp4.u0;
        fnc fncVar = fnc.s0;
        knc kncVar = this.O0;
        if (iOrdinal == 0) {
            kncVar.setVisibility(0);
            kncVar.A(getMoreIcon(), pq9Var.p(kncVar).c.getIcon().f);
            kncVar.setMode(fncVar);
            kncVar.setContentDescription(kncVar.getContext().getString(f0c.call_user_item_more));
            tu0.K(kncVar, 300L, new vo1(this, 0));
            kncVar.setButtonPadding(tu0.G(1 * fk4.d().getDisplayMetrics().density));
            return;
        }
        if (iOrdinal == 1) {
            kncVar.setVisibility(0);
            kncVar.A(getRotateIcon(), pq9Var.p(kncVar).c.getIcon().f);
            kncVar.setMode(fnc.X);
            kncVar.setContentDescription(kncVar.getContext().getString(b8a.c2));
            tu0.K(kncVar, 300L, new vo1(this, 2));
            kncVar.setButtonPadding(tu0.G(2 * fk4.d().getDisplayMetrics().density));
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            kncVar.setVisibility(8);
            kncVar.setContentDescription(null);
            kncVar.setMode(fncVar);
            return;
        }
        kncVar.setVisibility(0);
        kncVar.A(getPinnedIcon(), pq9Var.p(kncVar).c.getIcon().f);
        kncVar.setMode(fncVar);
        kncVar.setContentDescription(kncVar.getContext().getString(f0c.call_user_info_pinned));
        tu0.K(kncVar, 300L, new vo1(this, 1));
        kncVar.setButtonPadding(tu0.G(1 * fk4.d().getDisplayMetrics().density));
    }

    public final void setCallSpeakerMediator(k56 k56Var) {
        this.P0 = k56Var;
    }

    public final void setCustomTheme(fka fkaVar) {
        this.k1.o1(this, l1[1], fkaVar);
    }

    public final void setMode(yo1 yo1Var) {
        this.j1.o1(this, l1[0], yo1Var);
    }

    public final void setOpponentVideo(haf hafVar) {
        fm1 fm1Var;
        haf hafVar2;
        ViewStub viewStub = this.W0;
        if (hafVar != null || br7.G(viewStub)) {
            ip1 render = getRender();
            boolean z = false;
            if (!br7.G(viewStub)) {
                ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
                int iIndexOfChild = viewGroup.indexOfChild(viewStub);
                viewGroup.removeViewInLayout(viewStub);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                layoutParams.height = render.getLayoutParams().height;
                layoutParams.width = render.getLayoutParams().width;
                render.setId(viewStub.getId());
                viewGroup.addView(render, iIndexOfChild, layoutParams);
                dy7.M(getRender(), false);
            }
            k56 k56Var = this.P0;
            if (k56Var != null && (fm1Var = (fm1) k56Var.invoke()) != null && (hafVar2 = ((gm1) fm1Var).b) != null && hafVar2.g && hafVar != null && hafVar2.a == hafVar.a) {
                z = true;
            }
            ip1 render2 = getRender();
            render2.t0 = hafVar;
            render2.u0 = z;
            getRender().d();
            this.i1 = hafVar;
        }
    }

    public final void setRaiseHand(boolean z) {
        ViewStub viewStub = this.V0;
        if (br7.G(viewStub) || z) {
            this.e1 = Boolean.valueOf(z);
            ImageView raiseHandView = getRaiseHandView();
            if (!br7.G(viewStub)) {
                ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
                int iIndexOfChild = viewGroup.indexOfChild(viewStub);
                viewGroup.removeViewInLayout(viewStub);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                layoutParams.height = raiseHandView.getLayoutParams().height;
                layoutParams.width = raiseHandView.getLayoutParams().width;
                raiseHandView.setId(viewStub.getId());
                viewGroup.addView(raiseHandView, iIndexOfChild, layoutParams);
                getRaiseHandIcon().setBounds(0, 0, getActionButtonSize(), getActionButtonSize());
            }
            ft.g(getRaiseHandView(), z, 50L, null, 4);
            k4c raiseHandIcon = getRaiseHandIcon();
            if (z) {
                raiseHandIcon.start();
            } else {
                raiseHandIcon.stop();
            }
        }
    }

    public final void setVideoLayoutUpdatesControllerProvider(k56 k56Var) {
        this.Q0 = k56Var;
    }
}
