package defpackage;

/* loaded from: classes.dex */
public final class j71 extends kg6 {
    public final /* synthetic */ m71 c;

    public j71(m71 m71Var) {
        this.c = m71Var;
    }

    @Override // defpackage.kg6
    public final int c(int i) {
        m71 m71Var = this.c;
        sma smaVar = m71Var.L0;
        if (smaVar.b == 2 && i == 0) {
            return 2;
        }
        return (smaVar.a == 0 && m71Var.I0.j() <= 2) ? 2 : 1;
    }
}
