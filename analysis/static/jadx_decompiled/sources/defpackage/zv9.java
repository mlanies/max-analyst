package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class zv9 implements k56 {
    public final /* synthetic */ String X;
    public final /* synthetic */ Comparable Y;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ aw9 o;

    public /* synthetic */ zv9(boolean z, String str, aw9 aw9Var, e52 e52Var, String str2) {
        this.b = z;
        this.c = str;
        this.o = aw9Var;
        this.Y = e52Var;
        this.X = str2;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                boolean z = this.b;
                String str = this.c;
                if (z) {
                    return str;
                }
                return this.o.a(((e52) this.Y).q(), this.X, str, true);
            default:
                boolean z2 = this.b;
                String str2 = this.c;
                return z2 ? str2 : this.o.a(this.X, (String) this.Y, str2, true);
        }
    }

    public /* synthetic */ zv9(boolean z, String str, aw9 aw9Var, String str2, String str3) {
        this.b = z;
        this.c = str;
        this.o = aw9Var;
        this.X = str2;
        this.Y = str3;
    }
}
