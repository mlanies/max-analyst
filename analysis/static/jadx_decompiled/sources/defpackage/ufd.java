package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class ufd extends ConstraintLayout implements kre, mkc {
    public static final /* synthetic */ bc7[] a1 = {new oi9(ufd.class, "modelItem", "getModelItem()Lone/me/sdk/sections/SettingsItem;"), rh4.g(nec.a, ufd.class, "themeDepended", "getThemeDepended()Lone/me/sdk/sections/ui/recyclerview/settingsitem/SettingsItemContent$Companion$ThemeDependedType;")};
    public final je7 G0;
    public final tfd H0;
    public final je7 I0;
    public final ImageView J0;
    public final je7 K0;
    public final LinearLayout L0;
    public final LinearLayout M0;
    public final je7 N0;
    public final je7 O0;
    public final je7 P0;
    public final je7 Q0;
    public final je7 R0;
    public qfd S0;
    public final ShapeDrawable T0;
    public final RippleDrawable U0;
    public final je7 V0;
    public jfd W0;
    public final sfd X0;
    public final sfd Y0;
    public boolean Z0;

    public ufd(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        final int i = 1;
        this.G0 = tu0.r(3, new k56() { // from class: nfd
            @Override // defpackage.k56
            public final Object invoke() throws Resources.NotFoundException {
                switch (i) {
                    case 0:
                        caa caaVar = new caa(context);
                        caaVar.setId(pga.j);
                        LinearLayout linearLayout = this.M0;
                        ti3 ti3Var = new ti3(-2, -2);
                        ti3Var.setMarginEnd(tu0.G(6 * fk4.d().getDisplayMetrics().density));
                        linearLayout.addView(caaVar, ti3Var);
                        return caaVar;
                    case 1:
                        return ufd.x(context, this);
                    case 2:
                        return ufd.y(context, this);
                    case 3:
                        return ufd.A(context, this);
                    case 4:
                        return ufd.w(context, this);
                    case 5:
                        tja tjaVar = new tja(context, null);
                        tjaVar.setChecked(false);
                        tjaVar.setShowText(false);
                        this.M0.addView(tjaVar);
                        return tjaVar;
                    default:
                        ofa ofaVar = new ofa(context, null);
                        float f = 28;
                        ofaVar.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
                        ofaVar.b(ofaVar.isChecked(), qp4.u0.j(ofaVar));
                        ofaVar.setChecked(false);
                        this.M0.addView(ofaVar);
                        return ofaVar;
                }
            }
        });
        tfd tfdVar = new tfd(context, attributeSet, this);
        this.H0 = tfdVar;
        final int i2 = 2;
        this.I0 = tu0.r(3, new k56() { // from class: nfd
            @Override // defpackage.k56
            public final Object invoke() throws Resources.NotFoundException {
                switch (i2) {
                    case 0:
                        caa caaVar = new caa(context);
                        caaVar.setId(pga.j);
                        LinearLayout linearLayout = this.M0;
                        ti3 ti3Var = new ti3(-2, -2);
                        ti3Var.setMarginEnd(tu0.G(6 * fk4.d().getDisplayMetrics().density));
                        linearLayout.addView(caaVar, ti3Var);
                        return caaVar;
                    case 1:
                        return ufd.x(context, this);
                    case 2:
                        return ufd.y(context, this);
                    case 3:
                        return ufd.A(context, this);
                    case 4:
                        return ufd.w(context, this);
                    case 5:
                        tja tjaVar = new tja(context, null);
                        tjaVar.setChecked(false);
                        tjaVar.setShowText(false);
                        this.M0.addView(tjaVar);
                        return tjaVar;
                    default:
                        ofa ofaVar = new ofa(context, null);
                        float f = 28;
                        ofaVar.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
                        ofaVar.b(ofaVar.isChecked(), qp4.u0.j(ofaVar));
                        ofaVar.setChecked(false);
                        this.M0.addView(ofaVar);
                        return ofaVar;
                }
            }
        });
        ImageView imageView = new ImageView(context);
        imageView.setId(pga.f);
        float f = 36;
        imageView.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        rh4.p(6, fk4.d().getDisplayMetrics().density, imageView);
        this.J0 = imageView;
        this.K0 = tu0.r(3, new xda(context, 27));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(pga.i);
        linearLayout.setLayoutParams(new ti3(tu0.G(0 * fk4.d().getDisplayMetrics().density), -1));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(8388627);
        this.L0 = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(pga.d);
        linearLayout2.setLayoutParams(new ti3(-2, -2));
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setOnTouchListener(new q46(new GestureDetector(context, new q00(16, this)), 7));
        this.M0 = linearLayout2;
        final int i3 = 3;
        this.N0 = tu0.r(3, new k56() { // from class: nfd
            @Override // defpackage.k56
            public final Object invoke() throws Resources.NotFoundException {
                switch (i3) {
                    case 0:
                        caa caaVar = new caa(context);
                        caaVar.setId(pga.j);
                        LinearLayout linearLayout3 = this.M0;
                        ti3 ti3Var = new ti3(-2, -2);
                        ti3Var.setMarginEnd(tu0.G(6 * fk4.d().getDisplayMetrics().density));
                        linearLayout3.addView(caaVar, ti3Var);
                        return caaVar;
                    case 1:
                        return ufd.x(context, this);
                    case 2:
                        return ufd.y(context, this);
                    case 3:
                        return ufd.A(context, this);
                    case 4:
                        return ufd.w(context, this);
                    case 5:
                        tja tjaVar = new tja(context, null);
                        tjaVar.setChecked(false);
                        tjaVar.setShowText(false);
                        this.M0.addView(tjaVar);
                        return tjaVar;
                    default:
                        ofa ofaVar = new ofa(context, null);
                        float f2 = 28;
                        ofaVar.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
                        ofaVar.b(ofaVar.isChecked(), qp4.u0.j(ofaVar));
                        ofaVar.setChecked(false);
                        this.M0.addView(ofaVar);
                        return ofaVar;
                }
            }
        });
        final int i4 = 4;
        this.O0 = tu0.r(3, new k56() { // from class: nfd
            @Override // defpackage.k56
            public final Object invoke() throws Resources.NotFoundException {
                switch (i4) {
                    case 0:
                        caa caaVar = new caa(context);
                        caaVar.setId(pga.j);
                        LinearLayout linearLayout3 = this.M0;
                        ti3 ti3Var = new ti3(-2, -2);
                        ti3Var.setMarginEnd(tu0.G(6 * fk4.d().getDisplayMetrics().density));
                        linearLayout3.addView(caaVar, ti3Var);
                        return caaVar;
                    case 1:
                        return ufd.x(context, this);
                    case 2:
                        return ufd.y(context, this);
                    case 3:
                        return ufd.A(context, this);
                    case 4:
                        return ufd.w(context, this);
                    case 5:
                        tja tjaVar = new tja(context, null);
                        tjaVar.setChecked(false);
                        tjaVar.setShowText(false);
                        this.M0.addView(tjaVar);
                        return tjaVar;
                    default:
                        ofa ofaVar = new ofa(context, null);
                        float f2 = 28;
                        ofaVar.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
                        ofaVar.b(ofaVar.isChecked(), qp4.u0.j(ofaVar));
                        ofaVar.setChecked(false);
                        this.M0.addView(ofaVar);
                        return ofaVar;
                }
            }
        });
        final int i5 = 5;
        this.P0 = tu0.r(3, new k56() { // from class: nfd
            @Override // defpackage.k56
            public final Object invoke() throws Resources.NotFoundException {
                switch (i5) {
                    case 0:
                        caa caaVar = new caa(context);
                        caaVar.setId(pga.j);
                        LinearLayout linearLayout3 = this.M0;
                        ti3 ti3Var = new ti3(-2, -2);
                        ti3Var.setMarginEnd(tu0.G(6 * fk4.d().getDisplayMetrics().density));
                        linearLayout3.addView(caaVar, ti3Var);
                        return caaVar;
                    case 1:
                        return ufd.x(context, this);
                    case 2:
                        return ufd.y(context, this);
                    case 3:
                        return ufd.A(context, this);
                    case 4:
                        return ufd.w(context, this);
                    case 5:
                        tja tjaVar = new tja(context, null);
                        tjaVar.setChecked(false);
                        tjaVar.setShowText(false);
                        this.M0.addView(tjaVar);
                        return tjaVar;
                    default:
                        ofa ofaVar = new ofa(context, null);
                        float f2 = 28;
                        ofaVar.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
                        ofaVar.b(ofaVar.isChecked(), qp4.u0.j(ofaVar));
                        ofaVar.setChecked(false);
                        this.M0.addView(ofaVar);
                        return ofaVar;
                }
            }
        });
        final int i6 = 6;
        this.Q0 = tu0.r(3, new k56() { // from class: nfd
            @Override // defpackage.k56
            public final Object invoke() throws Resources.NotFoundException {
                switch (i6) {
                    case 0:
                        caa caaVar = new caa(context);
                        caaVar.setId(pga.j);
                        LinearLayout linearLayout3 = this.M0;
                        ti3 ti3Var = new ti3(-2, -2);
                        ti3Var.setMarginEnd(tu0.G(6 * fk4.d().getDisplayMetrics().density));
                        linearLayout3.addView(caaVar, ti3Var);
                        return caaVar;
                    case 1:
                        return ufd.x(context, this);
                    case 2:
                        return ufd.y(context, this);
                    case 3:
                        return ufd.A(context, this);
                    case 4:
                        return ufd.w(context, this);
                    case 5:
                        tja tjaVar = new tja(context, null);
                        tjaVar.setChecked(false);
                        tjaVar.setShowText(false);
                        this.M0.addView(tjaVar);
                        return tjaVar;
                    default:
                        ofa ofaVar = new ofa(context, null);
                        float f2 = 28;
                        ofaVar.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
                        ofaVar.b(ofaVar.isChecked(), qp4.u0.j(ofaVar));
                        ofaVar.setChecked(false);
                        this.M0.addView(ofaVar);
                        return ofaVar;
                }
            }
        });
        final int i7 = 0;
        this.R0 = tu0.r(3, new k56() { // from class: nfd
            @Override // defpackage.k56
            public final Object invoke() throws Resources.NotFoundException {
                switch (i7) {
                    case 0:
                        caa caaVar = new caa(context);
                        caaVar.setId(pga.j);
                        LinearLayout linearLayout3 = this.M0;
                        ti3 ti3Var = new ti3(-2, -2);
                        ti3Var.setMarginEnd(tu0.G(6 * fk4.d().getDisplayMetrics().density));
                        linearLayout3.addView(caaVar, ti3Var);
                        return caaVar;
                    case 1:
                        return ufd.x(context, this);
                    case 2:
                        return ufd.y(context, this);
                    case 3:
                        return ufd.A(context, this);
                    case 4:
                        return ufd.w(context, this);
                    case 5:
                        tja tjaVar = new tja(context, null);
                        tjaVar.setChecked(false);
                        tjaVar.setShowText(false);
                        this.M0.addView(tjaVar);
                        return tjaVar;
                    default:
                        ofa ofaVar = new ofa(context, null);
                        float f2 = 28;
                        ofaVar.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
                        ofaVar.b(ofaVar.isChecked(), qp4.u0.j(ofaVar));
                        ofaVar.setChecked(false);
                        this.M0.addView(ofaVar);
                        return ofaVar;
                }
            }
        });
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.T0 = shapeDrawable;
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(qp4.u0.j(this).d().a.a.h), null, shapeDrawable);
        this.U0 = rippleDrawable;
        this.V0 = tu0.r(3, new hbc(20));
        this.W0 = jfd.b;
        kfd.V.getClass();
        this.X0 = new sfd(yed.b, this);
        this.Y0 = new sfd(this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setMinHeight(tu0.G(48 * fk4.d().getDisplayMetrics().density));
        setBackground(rippleDrawable);
        addView(imageView);
        addView(linearLayout);
        addView(linearLayout2);
        linearLayout.addView(tfdVar);
        G();
    }

    public static AppCompatTextView A(Context context, ufd ufdVar) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(pga.e);
        i4f.m.b(appCompatTextView, du4.b);
        appCompatTextView.setTextColor(rfd.$EnumSwitchMapping$0[ufdVar.W0.ordinal()] == 1 ? ufdVar.getCurrentTheme().d().c.b.e : ufdVar.getCurrentTheme().getText().g);
        LinearLayout linearLayout = ufdVar.M0;
        ti3 ti3Var = new ti3(-2, -2);
        ti3Var.setMarginEnd(tu0.G(6 * fk4.d().getDisplayMetrics().density));
        linearLayout.addView(appCompatTextView, ti3Var);
        return appCompatTextView;
    }

    public static final void E(ufd ufdVar, kfd kfdVar) {
        ufdVar.getClass();
        ufdVar.setTitle(kfdVar.getTitle());
        Integer numF = kfdVar.f();
        ufdVar.setStartIcon(numF != null ? kt3.b(ufdVar.getContext(), numF.intValue()) : null);
        ufdVar.setDescription(kfdVar.b());
        ufdVar.setCounter(kfdVar.c());
        jqe jqeVarD = kfdVar.d();
        ufdVar.setUpperText(jqeVarD != null ? jqeVarD.b(ufdVar.getContext()) : null);
        ufdVar.setEndView(kfdVar.e());
        ufdVar.setStartIconPadding(kfdVar.q());
        kfdVar.getItemId();
        ufdVar.setType(ufdVar.getModelItem().getType());
        ufdVar.setAvatar(kfdVar.s());
        ufdVar.G();
        ufdVar.requestLayout();
        ufdVar.invalidate();
    }

    public static void F(LinearLayout linearLayout, je7 je7Var) {
        if (je7Var.a()) {
            if (((View) je7Var.getValue()).getVisibility() == 0) {
                br7.b(linearLayout, (View) je7Var.getValue(), -1);
            } else {
                linearLayout.removeView((View) je7Var.getValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fka getCurrentTheme() {
        int iOrdinal = getThemeDepended().ordinal();
        pq9 pq9Var = qp4.u0;
        if (iOrdinal == 0) {
            return pq9Var.j(this);
        }
        if (iOrdinal == 1) {
            return pq9Var.p(this).c;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Matrix getTitleGradientMatrix() {
        return (Matrix) this.V0.getValue();
    }

    private final void setAvatar(wed wedVar) {
        s5a s5aVar = (s5a) this.K0.getValue();
        s5aVar.setVisibility(wedVar != null ? 0 : 8);
        String str = wedVar != null ? wedVar.a : null;
        uc0 uc0Var = wedVar != null ? wedVar.b : null;
        s5aVar.setAvatarUrl(str);
        s5aVar.g(uc0Var, true);
        br7.b(this, s5aVar, null);
    }

    private final void setupCounter(bfd bfdVar) {
        boolean zF = tpa.f(bfdVar, zed.a);
        je7 je7Var = this.R0;
        if (zF) {
            caa caaVar = (caa) je7Var.getValue();
            caaVar.setVisibility(0);
            caaVar.setAppearance(x9a.o);
            caaVar.h();
            return;
        }
        if (bfdVar instanceof afd) {
            caa caaVar2 = (caa) je7Var.getValue();
            caaVar2.setVisibility(0);
            afd afdVar = (afd) bfdVar;
            caaVar2.setAppearance(afdVar.c);
            caaVar2.g(afdVar.a, afdVar.b);
            return;
        }
        if (bfdVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        if (je7Var.a()) {
            ((caa) je7Var.getValue()).setVisibility(8);
        }
    }

    private final void setupDescription(CharSequence charSequence) {
        TextView textView = (TextView) this.I0.getValue();
        textView.setVisibility(charSequence != null ? 0 : 8);
        textView.setText(charSequence);
        textView.setPadding(textView.getPaddingLeft(), tu0.G(2 * fk4.d().getDisplayMetrics().density), textView.getPaddingRight(), textView.getPaddingBottom());
        br7.b(this.L0, textView, null);
    }

    private final void setupEndText(CharSequence charSequence) {
        je7 je7Var = this.P0;
        if (je7Var.a()) {
            ((tja) je7Var.getValue()).setVisibility(8);
        }
        je7 je7Var2 = this.O0;
        if (je7Var2.a()) {
            ((AppCompatImageView) je7Var2.getValue()).setVisibility(8);
        }
        je7 je7Var3 = this.Q0;
        if (je7Var3.a()) {
            ((ofa) je7Var3.getValue()).setVisibility(8);
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.N0.getValue();
        appCompatTextView.setId(pga.n);
        appCompatTextView.setText(charSequence);
        appCompatTextView.setVisibility(0);
        appCompatTextView.setCompoundDrawablesRelative(null, null, null, null);
    }

    private final void setupUpperText(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.G0.getValue();
        appCompatTextView.setVisibility(charSequence != null ? 0 : 8);
        appCompatTextView.setText(charSequence);
        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingRight(), tu0.G(2 * fk4.d().getDisplayMetrics().density));
        br7.b(this.L0, appCompatTextView, 0);
    }

    public static AppCompatImageView w(Context context, ufd ufdVar) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setId(pga.c);
        appCompatImageView.setImageDrawable(kt3.b(appCompatImageView.getContext(), woc.G0));
        appCompatImageView.setImageTintList(ColorStateList.valueOf(ufdVar.getCurrentTheme().getIcon().j));
        ufdVar.M0.addView(appCompatImageView);
        return appCompatImageView;
    }

    public static AppCompatTextView x(Context context, ufd ufdVar) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(pga.h);
        appCompatTextView.setLayoutParams(new ti3(-2, -2));
        i4f.p.b(appCompatTextView, du4.b);
        appCompatTextView.setTextColor(ufdVar.getCurrentTheme().getText().g);
        ufdVar.L0.addView(appCompatTextView, 0);
        return appCompatTextView;
    }

    public static AppCompatTextView y(Context context, ufd ufdVar) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(pga.b);
        appCompatTextView.setLayoutParams(new ti3(-2, -2));
        i4f.n.b(appCompatTextView, du4.b);
        appCompatTextView.setMaxLines(2);
        int iOrdinal = ufdVar.W0.ordinal();
        appCompatTextView.setTextColor(iOrdinal != 0 ? iOrdinal != 3 ? ufdVar.getCurrentTheme().getText().g : ufdVar.getCurrentTheme().d().c.b.e : ufdVar.getCurrentTheme().getText().j);
        appCompatTextView.setPadding(0, tu0.G(2 * fk4.d().getDisplayMetrics().density), 0, 0);
        ufdVar.L0.addView(appCompatTextView);
        return appCompatTextView;
    }

    public final void G() {
        int id;
        dj3 dj3VarQ = fp3.q(this);
        je7 je7Var = this.K0;
        if (br7.H(je7Var)) {
            id = ((s5a) je7Var.getValue()).getId();
            sh0 sh0Var = new sh0(((s5a) je7Var.getValue()).getId(), 4, dj3VarQ);
            sh0Var.D(0).e(tu0.G(12 * fk4.d().getDisplayMetrics().density));
            sh0Var.G(0);
            sh0Var.e(0);
        } else {
            ImageView imageView = this.J0;
            id = imageView.getId();
            sh0 sh0Var2 = new sh0(imageView.getId(), 4, dj3VarQ);
            sh0Var2.D(0).e(tu0.G(12 * fk4.d().getDisplayMetrics().density));
            sh0Var2.G(0);
            sh0Var2.e(0);
        }
        sh0 sh0Var3 = new sh0(this.L0.getId(), 4, dj3VarQ);
        l2a l2aVarC = sh0Var3.C(id);
        float f = 12;
        l2aVarC.e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        float f2 = 10;
        sh0Var3.G(0).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        au1.p(f2, fk4.d().getDisplayMetrics().density, sh0Var3.e(0));
        LinearLayout linearLayout = this.M0;
        sh0Var3.p(linearLayout.getId()).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        sh0 sh0Var4 = new sh0(linearLayout.getId(), 4, dj3VarQ);
        sh0Var4.n(0).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        sh0Var4.G(0);
        sh0Var4.e(0);
        dj3VarQ.a(this);
    }

    public final kfd getModelItem() {
        bc7 bc7Var = a1[0];
        return (kfd) this.X0.b;
    }

    public final pfd getThemeDepended() {
        bc7 bc7Var = a1[1];
        return (pfd) this.Y0.b;
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        fka currentTheme = getCurrentTheme();
        this.U0.setColor(ColorStateList.valueOf(currentTheme.d().a.a.h));
        je7 je7Var = this.P0;
        if (je7Var.a()) {
            ((tja) je7Var.getValue()).onThemeChanged(currentTheme);
        }
        je7 je7Var2 = this.Q0;
        if (je7Var2.a()) {
            ((ofa) je7Var2.getValue()).onThemeChanged(currentTheme);
        }
        je7 je7Var3 = this.R0;
        if (je7Var3.a()) {
            ((caa) je7Var3.getValue()).f(currentTheme);
        }
        je7 je7Var4 = this.N0;
        if (je7Var4.a()) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) je7Var4.getValue();
            appCompatTextView.setTextColor(currentTheme.getText().g);
            nqe.f(appCompatTextView, ColorStateList.valueOf(currentTheme.getIcon().j));
        }
        je7 je7Var5 = this.O0;
        if (je7Var5.a()) {
            ((AppCompatImageView) je7Var5.getValue()).setImageTintList(ColorStateList.valueOf(currentTheme.getIcon().j));
        }
        je7 je7Var6 = this.G0;
        if (je7Var6.a()) {
            ((AppCompatTextView) je7Var6.getValue()).setTextColor(currentTheme.getText().g);
        }
        int iOrdinal = this.W0.ordinal();
        je7 je7Var7 = this.I0;
        ImageView imageView = this.J0;
        tfd tfdVar = this.H0;
        if (iOrdinal == 0) {
            tfdVar.setTextColor(currentTheme.getText().j);
            if (je7Var7.a()) {
                ((TextView) je7Var7.getValue()).setTextColor(currentTheme.getText().j);
            }
            if (this.Z0) {
                imageView.setImageTintList(null);
            } else {
                imageView.setImageTintList(ColorStateList.valueOf(currentTheme.getIcon().k));
            }
        } else if (iOrdinal == 1) {
            tfdVar.setTextColor(currentTheme.getText().e);
            if (je7Var7.a()) {
                ((TextView) je7Var7.getValue()).setTextColor(currentTheme.getText().g);
            }
            if (this.Z0) {
                imageView.setImageTintList(null);
            } else {
                imageView.setImageTintList(ColorStateList.valueOf(currentTheme.getIcon().f));
            }
        } else if (iOrdinal == 2) {
            tfdVar.setTextColor(currentTheme.getText().b);
            if (je7Var7.a()) {
                ((TextView) je7Var7.getValue()).setTextColor(currentTheme.getText().g);
            }
            if (this.Z0) {
                imageView.setImageTintList(null);
            } else {
                imageView.setImageTintList(ColorStateList.valueOf(currentTheme.getIcon().c));
            }
        } else if (iOrdinal == 3) {
            tfdVar.setTextColor(currentTheme.d().c.b.e);
            if (je7Var7.a()) {
                ((TextView) je7Var7.getValue()).setTextColor(currentTheme.d().c.b.e);
            }
            if (this.Z0) {
                imageView.setImageTintList(null);
            } else {
                imageView.setImageTintList(ColorStateList.valueOf(currentTheme.d().b.a.f));
            }
        } else if (iOrdinal == 4) {
            tfdVar.setTextColor(currentTheme.getText().e);
            if (je7Var7.a()) {
                ((TextView) je7Var7.getValue()).setTextColor(currentTheme.getText().g);
            }
            imageView.setImageTintList(null);
        } else {
            if (iOrdinal != 5) {
                throw new NoWhenBranchMatchedException();
            }
            tfdVar.setTextColor(currentTheme.getText().e);
            TextPaint paint = tfdVar.getPaint();
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.5f, 1.0f, 0.5f, currentTheme.e().f.a, (float[]) null, Shader.TileMode.CLAMP);
            linearGradient.setLocalMatrix(getTitleGradientMatrix());
            paint.setShader(linearGradient);
            if (this.Z0) {
                imageView.setImageTintList(null);
            } else {
                imageView.setImageTintList(ColorStateList.valueOf(currentTheme.getIcon().a.b.a));
            }
        }
        if (this.W0 == jfd.Y || !(tfdVar.getPaint().getShader() instanceof LinearGradient)) {
            return;
        }
        tfdVar.getPaint().setShader(null);
        tfdVar.invalidate();
    }

    public final void setCounter(bfd bfdVar) {
        setupCounter(bfdVar);
        requestLayout();
        invalidate();
    }

    public final void setDescription(jqe jqeVar) {
        setupDescription(jqeVar != null ? jqeVar.b(getContext()) : null);
        requestLayout();
        invalidate();
    }

    public final void setDisableStartIconText(boolean z) {
        this.Z0 = z;
        ImageView imageView = this.J0;
        if (z) {
            imageView.setImageTintList(null);
        } else {
            imageView.setImageTintList(ColorStateList.valueOf(getCurrentTheme().getIcon().k));
        }
        requestLayout();
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setEndView(defpackage.hfd r11) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ufd.setEndView(hfd):void");
    }

    public final void setItemId(long j) {
    }

    public final void setModelItem(kfd kfdVar) {
        this.X0.o1(this, a1[0], kfdVar);
    }

    public final void setOnSwitchCheckedListener(a66 a66Var) {
        if (a66Var != null) {
            setOnSwitchListener(new w4d(24, a66Var));
        } else {
            setOnSwitchListener(null);
        }
    }

    public final void setOnSwitchListener(final qfd qfdVar) {
        je7 je7Var = this.P0;
        if (je7Var.a()) {
            this.S0 = qfdVar;
            if (qfdVar == null) {
                ((tja) je7Var.getValue()).setOnCheckedChangeListener(null);
            } else {
                ((tja) je7Var.getValue()).setOnCheckedChangeListener(null);
                ((tja) je7Var.getValue()).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ofd
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        if (compoundButton.isPressed()) {
                            ufd ufdVar = this.a;
                            if (ufdVar.getModelItem().e() instanceof ffd) {
                                hfd hfdVarE = ufdVar.getModelItem().e();
                                ffd ffdVar = hfdVarE instanceof ffd ? (ffd) hfdVarE : null;
                                if (ffdVar == null || ffdVar.a != z) {
                                    hfd hfdVarE2 = ufdVar.getModelItem().e();
                                    ffd ffdVar2 = hfdVarE2 instanceof ffd ? (ffd) hfdVarE2 : null;
                                    if (ffdVar2 != null) {
                                        ffdVar2.a = z;
                                    }
                                }
                            }
                            qfdVar.e(ufdVar.getModelItem().getItemId(), z);
                        }
                    }
                });
            }
        }
    }

    @Override // defpackage.mkc
    public void setRippleMask(Shape shape) {
        this.T0.setShape(shape);
    }

    public final void setStartIcon(int i) {
        ImageView imageView = this.J0;
        imageView.setImageDrawable(kt3.b(getContext(), i));
        imageView.setVisibility(0);
        requestLayout();
        invalidate();
    }

    public final void setStartIconPadding(int i) {
        this.J0.setPadding(i, i, i, i);
    }

    public final void setThemeDepended(pfd pfdVar) {
        this.Y0.o1(this, a1[1], pfdVar);
    }

    public final void setTitle(jqe jqeVar) {
        this.H0.setText(jqeVar != null ? jqeVar.b(getContext()) : null);
        requestLayout();
        invalidate();
    }

    public final void setType(jfd jfdVar) {
        if (this.W0 == jfdVar) {
            return;
        }
        this.W0 = jfdVar;
        onThemeChanged(qp4.u0.j(this));
        requestLayout();
        invalidate();
    }

    public final void setUpperText(jqe jqeVar) {
        setupUpperText(jqeVar != null ? jqeVar.b(getContext()) : null);
        requestLayout();
        invalidate();
    }

    public final void setDescription(CharSequence charSequence) {
        setupDescription(charSequence);
        requestLayout();
        invalidate();
    }

    public final void setTitle(CharSequence charSequence) {
        this.H0.setText(charSequence);
        requestLayout();
        invalidate();
    }

    public final void setUpperText(CharSequence charSequence) {
        setupUpperText(charSequence);
        requestLayout();
        invalidate();
    }

    public final void setStartIcon(Drawable drawable) {
        ImageView imageView = this.J0;
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(drawable != null ? 0 : 8);
        requestLayout();
        invalidate();
    }
}
