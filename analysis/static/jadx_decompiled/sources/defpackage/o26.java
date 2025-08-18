package defpackage;

/* loaded from: classes2.dex */
public abstract class o26 {
    public final hle a;
    public final o45 b;
    public int c;
    public int d;
    public fef e;

    public o26(hle hleVar, o45 o45Var) {
        this.a = hleVar;
        this.b = o45Var;
    }

    public void a(fef fefVar, int i, int i2) {
        if (fefVar.equals(this.e)) {
            return;
        }
        this.e = fefVar;
        this.c = i;
        this.d = i2;
    }
}
