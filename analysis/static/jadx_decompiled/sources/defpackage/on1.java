package defpackage;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class on1 extends FrameLayout {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public on1(final Context context) {
        super(context, null);
        this.a = tu0.r(3, new dk1(12));
        final int i = 0;
        this.b = tu0.r(3, new k56() { // from class: nn1
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        mn1 mn1Var = new mn1(context, null);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, tu0.G(68 * fk4.d().getDisplayMetrics().density));
                        on1 on1Var = this;
                        on1Var.setLayoutParams(layoutParams);
                        float f = 8;
                        on1Var.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(6 * fk4.d().getDisplayMetrics().density));
                        on1Var.removeAllViews();
                        on1Var.addView(mn1Var);
                        return mn1Var;
                    default:
                        in1 in1Var = new in1(context, null);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, tu0.G(54 * fk4.d().getDisplayMetrics().density));
                        on1 on1Var2 = this;
                        on1Var2.setLayoutParams(layoutParams2);
                        float f2 = 12;
                        float f3 = 6;
                        on1Var2.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
                        on1Var2.removeAllViews();
                        on1Var2.addView(in1Var);
                        return in1Var;
                }
            }
        });
        final int i2 = 1;
        this.c = tu0.r(3, new k56() { // from class: nn1
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        mn1 mn1Var = new mn1(context, null);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, tu0.G(68 * fk4.d().getDisplayMetrics().density));
                        on1 on1Var = this;
                        on1Var.setLayoutParams(layoutParams);
                        float f = 8;
                        on1Var.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(6 * fk4.d().getDisplayMetrics().density));
                        on1Var.removeAllViews();
                        on1Var.addView(mn1Var);
                        return mn1Var;
                    default:
                        in1 in1Var = new in1(context, null);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, tu0.G(54 * fk4.d().getDisplayMetrics().density));
                        on1 on1Var2 = this;
                        on1Var2.setLayoutParams(layoutParams2);
                        float f2 = 12;
                        float f3 = 6;
                        on1Var2.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
                        on1Var2.removeAllViews();
                        on1Var2.addView(in1Var);
                        return in1Var;
                }
            }
        });
    }

    private final mn1 getNewCallTopPanel() {
        return (mn1) this.b.getValue();
    }

    private final in1 getOldCallTopPanel() {
        return (in1) this.c.getValue();
    }

    public final void a() {
        mn1 newCallTopPanel = getNewCallTopPanel();
        newCallTopPanel.L0.removeCallbacks(newCallTopPanel.M0);
        ywe yweVar = newCallTopPanel.J0;
        if (yweVar != null) {
            yweVar.a();
        }
    }

    public final boolean b() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    public final void c(boolean z) {
        if (b()) {
            mn1 newCallTopPanel = getNewCallTopPanel();
            if (tpa.f(newCallTopPanel.H0, Boolean.valueOf(z))) {
                return;
            }
            newCallTopPanel.H0 = Boolean.valueOf(z);
            pq9 pq9Var = qp4.u0;
            newCallTopPanel.Q0.setIconTint(z ? pq9Var.p(newCallTopPanel).c.getIcon().f : pq9Var.p(newCallTopPanel).c.d().b.a.f);
        }
    }

    public final void d(boolean z, vwe vweVar) {
        if (b()) {
            getNewCallTopPanel().y(z, vweVar);
        }
    }

    public final void e(boolean z) {
        if (b()) {
            mn1 newCallTopPanel = getNewCallTopPanel();
            ft.g(newCallTopPanel.O0, z, 0L, null, 6);
            ft.g(newCallTopPanel.P0, z, 0L, null, 6);
        }
    }

    public final void setAddUserCount(int i) {
        if (b()) {
            getNewCallTopPanel().setAddUserCount(i);
        }
    }

    public final void setAddUserState(boolean z) {
        if (b()) {
            getNewCallTopPanel().setAddUserState(z);
        }
    }

    public final void setClickListener(ln1 ln1Var) {
        if (b()) {
            getNewCallTopPanel().setClickListener(ln1Var);
        } else {
            getOldCallTopPanel().setClickListener(ln1Var);
        }
    }

    public final void setMode(nnf nnfVar) {
        if (b()) {
            return;
        }
        getOldCallTopPanel().setMode(nnfVar);
    }

    public final void setMoreState(boolean z) {
        if (b()) {
            getNewCallTopPanel().setMoreButtonVisible(z);
        }
    }

    public final void setStatus(CharSequence charSequence) {
        if (b()) {
            getNewCallTopPanel().setStatus(charSequence);
        } else {
            getOldCallTopPanel().setCallTime(charSequence);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        if (b()) {
            getNewCallTopPanel().setTitle(charSequence);
        } else {
            getOldCallTopPanel().setTitle(charSequence);
        }
    }
}
