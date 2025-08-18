package defpackage;

/* loaded from: classes2.dex */
public final class quc extends rd7 implements k56 {
    public final /* synthetic */ ruc a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public quc(ruc rucVar, Class cls, boolean z) {
        super(0);
        this.a = rucVar;
        this.b = cls;
        this.c = z;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        return this.a.d(this.b, this.c);
    }
}
