package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes2.dex */
public final class wia extends ConstraintLayout implements kre {
    public static final /* synthetic */ bc7[] N0 = {new oi9(wia.class, "leftElement", "getLeftElement()Lone/me/sdk/snackbar/OneMeSnackbarModel$Left;"), rh4.g(nec.a, wia.class, "rightElement", "getRightElement()Lone/me/sdk/snackbar/OneMeSnackbarModel$Right;")};
    public final via G0;
    public final via H0;
    public final je7 I0;
    public final je7 J0;
    public final je7 K0;
    public final AppCompatTextView L0;
    public final je7 M0;

    public wia(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G0 = new via(this, 0);
        this.H0 = new via(this, 1);
        this.I0 = tu0.r(3, new xda(context, 2));
        this.J0 = tu0.r(3, new xda(context, 3));
        this.K0 = tu0.r(3, new xda(context, 4));
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(qga.e);
        appCompatTextView.setLayoutParams(new ti3(tu0.G(0 * fk4.d().getDisplayMetrics().density), -2));
        i4f.l.b(appCompatTextView, du4.b);
        pq9 pq9Var = qp4.u0;
        pq9Var.j(appCompatTextView).getText();
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setMaxLines(2);
        this.L0 = appCompatTextView;
        this.M0 = tu0.r(3, new xda(context, 5));
        setId(qga.b);
        setLayoutParams(new ti3(-1, -2));
        setMinimumHeight(tu0.G(56 * fk4.d().getDisplayMetrics().density));
        int iG = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        setPadding(iG, iG, iG, iG);
        setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 16.0f));
        setBackgroundColor(pq9Var.j(this).b().d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLeft(oia oiaVar) {
        if (oiaVar instanceof kia) {
            setupLeftContrastIcon(((kia) oiaVar).a);
            return;
        }
        if (oiaVar instanceof mia) {
            setupLeftNegativeIcon(((mia) oiaVar).a);
            return;
        }
        boolean z = oiaVar instanceof jia;
        je7 je7Var = this.I0;
        if (z) {
            jia jiaVar = (jia) oiaVar;
            int i = jiaVar.a;
            AppCompatImageView appCompatImageView = (AppCompatImageView) je7Var.getValue();
            appCompatImageView.setId(qga.c);
            appCompatImageView.setImageDrawable(kt3.b(appCompatImageView.getContext(), i));
            appCompatImageView.setImageTintList(ColorStateList.valueOf(jiaVar.b));
            ay7.b(this, appCompatImageView, null);
            return;
        }
        if (!(oiaVar instanceof nia)) {
            if (!(oiaVar instanceof lia)) {
                throw new NoWhenBranchMatchedException();
            }
            if (je7Var.a()) {
                ((AppCompatImageView) je7Var.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        gy3 gy3Var = (gy3) this.J0.getValue();
        gy3Var.setId(qga.c);
        float f = 28;
        gy3Var.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        gy3Var.setMaxValue(MultiFileUploader.UPLOAD_NEXT_INTERVAL);
        ay7.b(this, gy3Var, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRight(tia tiaVar) {
        boolean zF = tpa.f(tiaVar, pia.a);
        je7 je7Var = this.K0;
        if (zF) {
            OneMeButton oneMeButton = (OneMeButton) je7Var.getValue();
            oneMeButton.setId(qga.d);
            oneMeButton.setText(rga.a);
            oneMeButton.setMode(b7a.o);
            ay7.b(this, oneMeButton, null);
            return;
        }
        if (tpa.f(tiaVar, qia.a)) {
            OneMeButton oneMeButton2 = (OneMeButton) je7Var.getValue();
            oneMeButton2.setId(qga.d);
            oneMeButton2.d(Integer.valueOf(woc.G0), true);
            oneMeButton2.setMode(b7a.c);
            ay7.b(this, oneMeButton2, null);
            return;
        }
        if (tpa.f(tiaVar, ria.a)) {
            if (je7Var.a()) {
                ((OneMeButton) je7Var.getValue()).setVisibility(8);
            }
        } else {
            if (!(tiaVar instanceof sia)) {
                throw new NoWhenBranchMatchedException();
            }
            setupRightTextButton(((sia) tiaVar).a);
        }
    }

    private final void setupLeftContrastIcon(int i) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.I0.getValue();
        appCompatImageView.setId(qga.c);
        appCompatImageView.setImageDrawable(kt3.b(appCompatImageView.getContext(), i));
        qp4.u0.j(appCompatImageView).getIcon();
        appCompatImageView.setImageTintList(ColorStateList.valueOf(-1));
        ay7.b(this, appCompatImageView, null);
    }

    private final void setupLeftNegativeIcon(int i) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.I0.getValue();
        appCompatImageView.setId(qga.c);
        appCompatImageView.setImageDrawable(kt3.b(appCompatImageView.getContext(), i));
        appCompatImageView.setImageTintList(ColorStateList.valueOf(qp4.u0.j(appCompatImageView).getIcon().c));
        ay7.b(this, appCompatImageView, null);
    }

    private final void setupRightTextButton(jqe jqeVar) {
        OneMeButton oneMeButton = (OneMeButton) this.K0.getValue();
        oneMeButton.setId(qga.d);
        oneMeButton.setText(jqeVar.b(oneMeButton.getContext()));
        oneMeButton.setMode(b7a.o);
        ay7.b(this, oneMeButton, null);
    }

    public final oia getLeftElement() {
        bc7 bc7Var = N0[0];
        return (oia) this.G0.b;
    }

    public final tia getRightElement() {
        bc7 bc7Var = N0[1];
        return (tia) this.H0.b;
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        setBackgroundColor(fkaVar.b().d);
        Integer numValueOf = -1;
        this.L0.setTextColor(-1);
        je7 je7Var = this.I0;
        if (je7Var.a()) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) je7Var.getValue();
            oia leftElement = getLeftElement();
            if (!(leftElement instanceof kia)) {
                if (leftElement instanceof mia) {
                    numValueOf = Integer.valueOf(fkaVar.getIcon().c);
                } else if (!(leftElement instanceof nia)) {
                    if (leftElement instanceof jia) {
                        numValueOf = Integer.valueOf(((jia) leftElement).b);
                    } else {
                        if (!tpa.f(leftElement, lia.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        numValueOf = null;
                    }
                }
            }
            if (numValueOf != null) {
                appCompatImageView.setImageTintList(ColorStateList.valueOf(numValueOf.intValue()));
            }
        }
    }

    public final void setCaption(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.M0.getValue();
        appCompatTextView.setId(qga.a);
        appCompatTextView.setText(charSequence);
        appCompatTextView.setVisibility(charSequence == null ? 8 : 0);
        ay7.b(this, appCompatTextView, null);
        y();
    }

    public final void setLeftElement(oia oiaVar) {
        this.G0.o1(this, N0[0], oiaVar);
    }

    public final void setRightBtnAction$snackbar_release(View.OnClickListener onClickListener) {
        je7 je7Var = this.K0;
        if (je7Var.a()) {
            OneMeButton oneMeButton = (OneMeButton) je7Var.getValue();
            if (onClickListener == null) {
                oneMeButton.setOnClickListener(null);
            } else {
                tu0.K(oneMeButton, 300L, onClickListener);
            }
        }
    }

    public final void setRightElement(tia tiaVar) {
        this.H0.o1(this, N0[1], tiaVar);
    }

    public final void setTitle(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = this.L0;
        appCompatTextView.setText(charSequence);
        ay7.b(this, appCompatTextView, null);
        y();
    }

    public final void y() {
        boolean z = br7.H(this.I0) || br7.H(this.J0);
        je7 je7Var = this.K0;
        boolean zH = br7.H(je7Var);
        je7 je7Var2 = this.M0;
        boolean zH2 = br7.H(je7Var2);
        dj3 dj3VarQ = fp3.q(this);
        AppCompatTextView appCompatTextView = this.L0;
        sh0 sh0Var = new sh0(appCompatTextView.getId(), 4, dj3VarQ);
        if (z) {
            au1.p(12, fk4.d().getDisplayMetrics().density, sh0Var.C(qga.c));
        } else {
            sh0Var.D(0);
        }
        sh0Var.G(0);
        if (zH) {
            au1.p(12, fk4.d().getDisplayMetrics().density, sh0Var.p(((OneMeButton) je7Var.getValue()).getId()));
        } else {
            sh0Var.n(0);
        }
        if (zH2) {
            sh0Var.f(((AppCompatTextView) je7Var2.getValue()).getId());
        } else {
            sh0Var.e(0);
        }
        if (z) {
            sh0 sh0Var2 = new sh0(qga.c, 4, dj3VarQ);
            sh0Var2.D(0);
            sh0Var2.G(0);
            sh0Var2.e(0);
        }
        if (zH2) {
            sh0 sh0Var3 = new sh0(((AppCompatTextView) je7Var2.getValue()).getId(), 4, dj3VarQ);
            if (z) {
                au1.p(12, fk4.d().getDisplayMetrics().density, sh0Var3.C(qga.c));
            } else {
                sh0Var3.D(0);
            }
            if (zH) {
                au1.p(12, fk4.d().getDisplayMetrics().density, sh0Var3.p(((OneMeButton) je7Var.getValue()).getId()));
            } else {
                sh0Var3.n(0);
            }
            au1.p(2, fk4.d().getDisplayMetrics().density, sh0Var3.E(appCompatTextView.getId()));
        }
        if (zH) {
            sh0 sh0Var4 = new sh0(((OneMeButton) je7Var.getValue()).getId(), 4, dj3VarQ);
            sh0Var4.G(0);
            sh0Var4.n(0);
            sh0Var4.e(0);
        }
        dj3VarQ.a(this);
    }

    public final void setTitle(int i) {
        setTitle(z7.B(getContext(), i));
    }

    public final void setCaption(int i) {
        setCaption(z7.B(getContext(), i));
    }
}
