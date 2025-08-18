package defpackage;

/* loaded from: classes.dex */
public final class r93 extends t93 {
    public final /* synthetic */ int X;
    public final /* synthetic */ v93 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r93(v93 v93Var, int i) {
        super(v93Var);
        this.X = i;
        this.Y = v93Var;
    }

    @Override // defpackage.t93
    public final Object a(int i) {
        switch (this.X) {
            case 0:
                return this.Y.i()[i];
            case 1:
                return new u93(this.Y, i);
            default:
                return this.Y.j()[i];
        }
    }
}
