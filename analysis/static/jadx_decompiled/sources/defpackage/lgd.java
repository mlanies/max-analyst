package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class lgd extends ppd {
    public final fd7 X;

    public lgd(fd7 fd7Var, ExecutorService executorService) {
        super(executorService);
        this.X = fd7Var;
    }

    @Override // defpackage.ppd, defpackage.hdc
    /* renamed from: H */
    public final void r(hqd hqdVar, int i) {
        if (!(hqdVar instanceof kgd)) {
            hqdVar.A((ol7) C(i));
            return;
        }
        kgd kgdVar = (kgd) hqdVar;
        ol7 ol7Var = (ol7) C(i);
        if (ol7Var instanceof c1d) {
            kgdVar.A(ol7Var);
            ufd ufdVar = (ufd) kgdVar.a;
            boolean z = ((c1d) ol7Var).Z instanceof ffd;
            fd7 fd7Var = this.X;
            if (z) {
                ufdVar.setOnSwitchCheckedListener(new bk(17, fd7Var));
            } else {
                ufdVar.setOnSwitchListener(null);
            }
            tu0.K(ufdVar, 300L, new v7d(fd7Var, 3, (c1d) ol7Var));
        }
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        if (i == fha.D) {
            return new kgd(new ufd(viewGroup.getContext(), null));
        }
        if (i != fha.C) {
            String name = lgd.class.getName();
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.Z, name, zr6.h(i, "unknown item viewType: "), null);
            }
            return new az0(new View(viewGroup.getContext()), 13);
        }
        TextView textView = new TextView(viewGroup.getContext());
        float f = 16;
        textView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), textView.getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), textView.getPaddingBottom());
        i4f.u.b(textView, du4.b);
        v3c.y(new v9(3, null, 22), textView);
        return new az0(textView, 12);
    }
}
