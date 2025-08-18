package defpackage;

/* loaded from: classes2.dex */
public final class a9f implements y8f {
    public final c9f a = new c9f();
    public final khe b;

    public a9f(khe kheVar) {
        this.b = new khe(new ile(7, kheVar));
    }

    @Override // defpackage.y8f
    public final pa3 a(v6f v6fVar) {
        return new sa3(0, new ypc(this, 20, v6fVar));
    }

    @Override // defpackage.y8f
    public final pa3 b(long j) {
        return new sa3(0, new lt1(this, j, 10));
    }

    @Override // defpackage.y8f
    public final pa3 c(d7f d7fVar) {
        return new sa3(0, new z8f(this, d7fVar));
    }

    @Override // defpackage.y8f
    public final pa3 clear() {
        return new sa3(0, new gte(7, this));
    }

    @Override // defpackage.y8f
    public final f28 d(d7f d7fVar) {
        return new k28(new z8f(this, d7fVar));
    }

    @Override // defpackage.y8f
    public final pa3 e(String str) {
        return new sa3(0, new ypc(this, 19, str));
    }

    @Override // defpackage.y8f
    public final f28 f() {
        q8f q8fVar = q8f.UNKNOWN;
        return new k28(new ypc(this));
    }
}
