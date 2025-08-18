package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class chd extends ppd {
    public final qqd X;

    public chd(qqd qqdVar, ExecutorService executorService) {
        super(executorService);
        this.X = qqdVar;
    }

    @Override // defpackage.ppd, defpackage.hdc
    /* renamed from: H */
    public final void r(hqd hqdVar, int i) {
        if (!(hqdVar instanceof bhd)) {
            hqdVar.A((ol7) C(i));
            return;
        }
        bhd bhdVar = (bhd) hqdVar;
        ol7 ol7Var = (ol7) C(i);
        if (ol7Var instanceof v0d) {
            bhdVar.A(ol7Var);
            boolean z = ((v0d) ol7Var).t0;
            View view = bhdVar.a;
            qqd qqdVar = this.X;
            if (z) {
                ((ufd) view).setEnabled(true);
                tu0.K(view, 300L, new v7d(qqdVar, 4, (v0d) ol7Var));
            } else {
                ((ufd) view).setEnabled(false);
                view.setOnClickListener(null);
            }
            ((ufd) view).setOnSwitchCheckedListener(new bk(18, qqdVar));
        }
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        if (i == iha.v) {
            return new bhd(new ufd(viewGroup.getContext(), null));
        }
        if (i != iha.u) {
            String name = chd.class.getName();
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.Z, name, zr6.h(i, "unknown item viewType: "), null);
            }
            return new az0(new View(viewGroup.getContext()), 15);
        }
        TextView textView = new TextView(viewGroup.getContext());
        float f = 16;
        textView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), textView.getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), textView.getPaddingBottom());
        i4f.u.b(textView, du4.b);
        v3c.y(new v9(3, null, 23), textView);
        return new az0(textView, 14);
    }
}
