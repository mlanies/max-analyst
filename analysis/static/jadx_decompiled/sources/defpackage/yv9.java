package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class yv9 implements k56 {
    public final /* synthetic */ aw9 X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ Comparable Z;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String o;

    public /* synthetic */ yv9(boolean z, String str, String str2, aw9 aw9Var, e52 e52Var, String str3) {
        this.b = z;
        this.c = str;
        this.o = str2;
        this.X = aw9Var;
        this.Z = e52Var;
        this.Y = str3;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                boolean z = this.b;
                String str = this.o;
                if (!z) {
                    return this.X.a(((e52) this.Z).q(), this.Y, str, false);
                }
                return this.c + ": " + str;
            default:
                boolean z2 = this.b;
                String str2 = this.o;
                if (!z2) {
                    return this.X.a(this.Y, (String) this.Z, str2, false);
                }
                return this.c + ": " + str2;
        }
    }

    public /* synthetic */ yv9(boolean z, String str, String str2, aw9 aw9Var, String str3, String str4) {
        this.b = z;
        this.c = str;
        this.o = str2;
        this.X = aw9Var;
        this.Y = str3;
        this.Z = str4;
    }
}
