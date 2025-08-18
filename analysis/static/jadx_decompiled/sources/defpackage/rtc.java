package defpackage;

/* loaded from: classes2.dex */
public final class rtc extends rd7 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ je7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rtc(int i, je7 je7Var) {
        super(0);
        this.a = i;
        this.b = je7Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((ynf) this.b.getValue()).w();
            default:
                ynf ynfVar = (ynf) this.b.getValue();
                pi6 pi6Var = ynfVar instanceof pi6 ? (pi6) ynfVar : null;
                return pi6Var != null ? pi6Var.p() : jz3.b;
        }
    }
}
