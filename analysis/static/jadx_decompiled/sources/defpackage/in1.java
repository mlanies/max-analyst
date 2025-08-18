package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;

/* loaded from: classes.dex */
public final class in1 extends ConstraintLayout {
    public final khe G0;
    public final knc H0;
    public final knc I0;
    public final AppCompatTextView J0;
    public final AppCompatTextView K0;
    public ln1 L0;
    public nnf M0;
    public Integer N0;

    public in1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G0 = new khe(new dk1(10));
        setLayoutParams(new ti3(-1, -2));
        knc kncVar = new knc(context, null);
        kncVar.setId(rvb.call_collapsing);
        knc.B(kncVar, ztb.ic_chevron_down_24);
        kncVar.setAccessibility(Integer.valueOf(f0c.call_collapsing_accessibility));
        fnc fncVar = fnc.a;
        kncVar.setMode(fncVar);
        final int i = 0;
        kncVar.setListener(new hnc(this) { // from class: gn1
            public final /* synthetic */ in1 b;

            {
                this.b = this;
            }

            @Override // defpackage.hnc
            public final void b() {
                in1 in1Var = this.b;
                switch (i) {
                    case 0:
                        ln1 ln1Var = in1Var.L0;
                        if (ln1Var != null) {
                            bc7[] bc7VarArr = CallTopPanelWidget.o;
                            pnf.o(((CallTopPanelWidget) ((o9g) ln1Var).b).n0().b.M0, cj1.D);
                            break;
                        }
                        break;
                    case 1:
                        in1.w(in1Var);
                        break;
                    default:
                        ln1 ln1Var2 = in1Var.L0;
                        if (ln1Var2 != null) {
                            bc7[] bc7VarArr2 = CallTopPanelWidget.o;
                            pnf.o(((CallTopPanelWidget) ((o9g) ln1Var2).b).n0().b.M0, sj1.D);
                            break;
                        }
                        break;
                }
            }
        });
        float f = 40;
        kncVar.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f)));
        float f2 = 3;
        kncVar.setButtonPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        kncVar.setLayoutParams(new ti3(-2, -2));
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(rvb.call_name);
        appCompatTextView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setMaxLines(1);
        kqe kqeVar = i4f.o;
        kqeVar.b(appCompatTextView, du4.b);
        pq9 pq9Var = qp4.u0;
        pq9Var.p(appCompatTextView).c.getClass();
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setVisibility(8);
        this.J0 = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
        appCompatTextView2.setId(rvb.call_status);
        appCompatTextView2.setEllipsize(truncateAt);
        appCompatTextView2.setMaxLines(1);
        appCompatTextView2.setGravity(17);
        kqeVar.b(appCompatTextView2, du4.b);
        pq9Var.p(appCompatTextView2).c.getClass();
        appCompatTextView2.setTextColor(-1);
        appCompatTextView2.setVisibility(8);
        this.K0 = appCompatTextView2;
        knc kncVar2 = new knc(context, null);
        kncVar2.setId(rvb.call_mode);
        knc.B(kncVar2, ztb.ic_call_mode_default_18);
        kncVar2.setMode(fncVar);
        float f3 = 4;
        kncVar2.setButtonPadding(tu0.G(fk4.d().getDisplayMetrics().density * f3));
        kncVar2.setAccessibility(Integer.valueOf(f0c.call_video_mode_accessibility));
        final int i2 = 1;
        kncVar2.setListener(new hnc(this) { // from class: gn1
            public final /* synthetic */ in1 b;

            {
                this.b = this;
            }

            @Override // defpackage.hnc
            public final void b() {
                in1 in1Var = this.b;
                switch (i2) {
                    case 0:
                        ln1 ln1Var = in1Var.L0;
                        if (ln1Var != null) {
                            bc7[] bc7VarArr = CallTopPanelWidget.o;
                            pnf.o(((CallTopPanelWidget) ((o9g) ln1Var).b).n0().b.M0, cj1.D);
                            break;
                        }
                        break;
                    case 1:
                        in1.w(in1Var);
                        break;
                    default:
                        ln1 ln1Var2 = in1Var.L0;
                        if (ln1Var2 != null) {
                            bc7[] bc7VarArr2 = CallTopPanelWidget.o;
                            pnf.o(((CallTopPanelWidget) ((o9g) ln1Var2).b).n0().b.M0, sj1.D);
                            break;
                        }
                        break;
                }
            }
        });
        kncVar2.setVisibility(4);
        kncVar2.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f)));
        kncVar2.setButtonPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        kncVar2.setLayoutParams(new ti3(-2, -2));
        this.I0 = kncVar2;
        knc kncVar3 = new knc(context, null);
        kncVar3.setId(rvb.call_add_member);
        knc.B(kncVar3, ztb.ic_add_user_18);
        kncVar3.setButtonPadding(tu0.G(fk4.d().getDisplayMetrics().density * f3));
        kncVar3.setAccessibility(Integer.valueOf(f0c.call_member_add_accessibility));
        pq9Var.p(kncVar3).c.getClass();
        kncVar3.setTextColor(-1);
        kncVar3.setMode(fncVar);
        final int i3 = 2;
        kncVar3.setListener(new hnc(this) { // from class: gn1
            public final /* synthetic */ in1 b;

            {
                this.b = this;
            }

            @Override // defpackage.hnc
            public final void b() {
                in1 in1Var = this.b;
                switch (i3) {
                    case 0:
                        ln1 ln1Var = in1Var.L0;
                        if (ln1Var != null) {
                            bc7[] bc7VarArr = CallTopPanelWidget.o;
                            pnf.o(((CallTopPanelWidget) ((o9g) ln1Var).b).n0().b.M0, cj1.D);
                            break;
                        }
                        break;
                    case 1:
                        in1.w(in1Var);
                        break;
                    default:
                        ln1 ln1Var2 = in1Var.L0;
                        if (ln1Var2 != null) {
                            bc7[] bc7VarArr2 = CallTopPanelWidget.o;
                            pnf.o(((CallTopPanelWidget) ((o9g) ln1Var2).b).n0().b.M0, sj1.D);
                            break;
                        }
                        break;
                }
            }
        });
        kncVar3.setMinWidth(tu0.G(fk4.d().getDisplayMetrics().density * f));
        kncVar3.setShape(enc.b);
        kncVar3.setVisibility(4);
        kncVar3.setButtonPadding(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        kncVar3.setImageSize(new gnc(-2, tu0.G(fk4.d().getDisplayMetrics().density * f)));
        kncVar3.setLayoutParams(new ti3(-2, -2));
        this.H0 = kncVar3;
        addView(kncVar);
        addView(appCompatTextView, 0, -2);
        addView(appCompatTextView2, -2, -2);
        addView(kncVar2);
        addView(kncVar3);
        dj3 dj3VarQ = fp3.q(this);
        int id = kncVar.getId();
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 3, 0, 3);
        int id2 = appCompatTextView.getId();
        dj3VarQ.d(id2, 7, kncVar2.getId(), 6);
        new l2a(dj3VarQ, 7, id2, 4).e(tu0.G(8 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.d(id2, 6, kncVar.getId(), 7);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, id2, 4));
        dj3VarQ.d(id2, 3, 0, 3);
        dj3VarQ.g(id2).d.l0 = true;
        int id3 = appCompatTextView2.getId();
        dj3VarQ.d(id3, 7, appCompatTextView.getId(), 7);
        dj3VarQ.d(id3, 6, appCompatTextView.getId(), 6);
        dj3VarQ.d(id3, 3, appCompatTextView.getId(), 4);
        new l2a(dj3VarQ, 3, id3, 4).e(tu0.G(2 * fk4.d().getDisplayMetrics().density));
        int id4 = kncVar2.getId();
        dj3VarQ.d(id4, 7, kncVar3.getId(), 6);
        new l2a(dj3VarQ, 7, id4, 4).e(tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.d(id4, 6, appCompatTextView.getId(), 7);
        dj3VarQ.d(id4, 3, 0, 3);
        int id5 = kncVar3.getId();
        dj3VarQ.d(id5, 7, 0, 7);
        dj3VarQ.d(id5, 3, 0, 3);
        dj3VarQ.a(this);
    }

    private final int getContextHeight() {
        int measuredHeight = getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = measuredHeight + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        return i + (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0);
    }

    private final u31 getContextMenuDelegate() {
        return (u31) this.G0.getValue();
    }

    public static void w(in1 in1Var) {
        u31 contextMenuDelegate = in1Var.getContextMenuDelegate();
        cu3 cu3VarA = contextMenuDelegate.a(in1Var.getContext(), v6.a, new f9(contextMenuDelegate, 10, in1Var));
        cu3VarA.showAtLocation(in1Var, 49, 0, in1Var.getContextHeight());
        cu3VarA.setOnDismissListener(new m11(1, in1Var));
        pq9 pq9Var = qp4.u0;
        knc kncVar = in1Var.I0;
        kncVar.setIconTint(pq9Var.p(kncVar).c.getIcon().g);
        kncVar.setMode(fnc.o);
    }

    public final void setCallTime(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = this.K0;
        appCompatTextView.setText(charSequence);
        ft.g(appCompatTextView, !(charSequence == null || w9e.C0(charSequence)), 0L, null, 6);
    }

    public final void setClickListener(ln1 ln1Var) {
        this.L0 = ln1Var;
    }

    public final void setMembers(Integer num) {
        if (tpa.f(this.N0, num)) {
            return;
        }
        this.N0 = num;
        int i = num != null ? 0 : 4;
        knc kncVar = this.H0;
        kncVar.setVisibility(i);
        if (num == null) {
            return;
        }
        boolean z = num.intValue() <= 1;
        knc.B(kncVar, z ? ztb.ic_add_user_18 : ztb.ic_add_more_users_22);
        kncVar.setCounter(num.intValue());
        kncVar.setAccessibility(z ? getContext().getString(f0c.call_member_add_accessibility) : String.format(getContext().getString(f0c.call_member_add_more_accessibility), Arrays.copyOf(new Object[]{num.toString()}, 1)));
    }

    public final void setMode(nnf nnfVar) {
        if (this.M0 == nnfVar) {
            return;
        }
        this.M0 = nnfVar;
        int i = nnfVar == null ? -1 : hn1.$EnumSwitchMapping$0[nnfVar.ordinal()];
        Integer numValueOf = null;
        if (i != -1) {
            if (i == 1) {
                numValueOf = Integer.valueOf(ztb.ic_call_mode_default_18);
            } else if (i == 2) {
                numValueOf = Integer.valueOf(ztb.ic_call_mode_grid_24);
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        knc kncVar = this.I0;
        if (numValueOf == null) {
            kncVar.setVisibility(4);
        } else {
            kncVar.setVisibility(0);
        }
        if (numValueOf != null) {
            knc.B(kncVar, numValueOf.intValue());
        }
    }

    public final void setTitle(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = this.J0;
        if (tpa.f(appCompatTextView.getText(), charSequence)) {
            return;
        }
        appCompatTextView.setText(charSequence);
        ft.g(appCompatTextView, !(charSequence == null || w9e.C0(charSequence)), 0L, null, 6);
    }
}
