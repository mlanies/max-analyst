package defpackage;

/* loaded from: classes.dex */
public final class ikc extends q1 {
    public final /* synthetic */ jkc X;
    public int c;
    public int o;

    public ikc(jkc jkcVar) {
        this.X = jkcVar;
        this.c = jkcVar.getSize();
        this.o = jkcVar.c;
    }

    @Override // defpackage.q1
    public final void a() {
        int i = this.c;
        if (i == 0) {
            this.a = 2;
            return;
        }
        jkc jkcVar = this.X;
        Object[] objArr = jkcVar.a;
        int i2 = this.o;
        this.b = objArr[i2];
        this.a = 1;
        this.o = (i2 + 1) % jkcVar.b;
        this.c = i - 1;
    }
}
