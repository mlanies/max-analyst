package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public final class e04 implements ii9 {
    public Boolean X;
    public final ync a;
    public Boolean b;
    public Boolean c;
    public Boolean o;

    public e04(ync yncVar) {
        this.a = yncVar;
    }

    @Override // defpackage.ii9
    public final void i(ji9 ji9Var) {
        kg1 kg1Var;
        fg1 fg1Var;
        bg1 bg1Var;
        boolean z = (tpa.f(this.b, Boolean.valueOf(ji9Var.e)) && tpa.f(this.c, Boolean.valueOf(ji9Var.f)) && tpa.f(this.o, Boolean.valueOf(ji9Var.g)) && tpa.f(this.X, Boolean.valueOf(ji9Var.b))) ? false : true;
        this.b = Boolean.valueOf(ji9Var.e);
        this.c = Boolean.valueOf(ji9Var.f);
        this.o = Boolean.valueOf(ji9Var.g);
        this.X = Boolean.valueOf(ji9Var.b);
        if (!z || (bg1Var = (fg1Var = (kg1Var = (kg1) this.a.b).a).a) == null) {
            return;
        }
        kg1Var.e(kg1Var.c(bg1Var), Collections.singletonList(fg1Var));
    }
}
