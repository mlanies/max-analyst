package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public final class c9f implements y8f {
    public final /* synthetic */ int a;
    public final Object b;

    public c9f() {
        this.a = 0;
        this.b = Collections.synchronizedMap(new i56(1000));
    }

    @Override // defpackage.y8f
    public final pa3 a(v6f v6fVar) {
        switch (this.a) {
            case 0:
                return new sa3(0, new ypc(this, 21, v6fVar));
            default:
                return new qa3(g(), 2, new a7f(v6fVar, 4));
        }
    }

    @Override // defpackage.y8f
    public final pa3 b(long j) {
        switch (this.a) {
            case 0:
                return new sa3(0, new ypc(this, 22, new c10(j, 28)));
            default:
                return new qa3(g(), 2, new c10(j, 29));
        }
    }

    @Override // defpackage.y8f
    public final pa3 c(d7f d7fVar) {
        switch (this.a) {
            case 0:
                return new sa3(0, new b9f(this, d7fVar));
            default:
                return new qa3(g(), 2, new b7f(d7fVar, 3));
        }
    }

    @Override // defpackage.y8f
    public final pa3 clear() {
        switch (this.a) {
            case 0:
                return new sa3(0, new gte(9, this));
            default:
                return new qa3(g(), 2, new n2f(12));
        }
    }

    @Override // defpackage.y8f
    public final f28 d(d7f d7fVar) {
        switch (this.a) {
            case 0:
                return new k28(new b9f(this, d7fVar));
            default:
                return new s28(new o28(g(), 2, new b7f(d7fVar, 2)), new n2f(13), 1);
        }
    }

    @Override // defpackage.y8f
    public final pa3 e(String str) {
        switch (this.a) {
            case 0:
                return new sa3(0, new ypc(this, 22, new m82(str, 9)));
            default:
                return new qa3(g(), 2, new m82(str, 10));
        }
    }

    @Override // defpackage.y8f
    public final f28 f() {
        int i = 2;
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                q8f q8fVar = q8f.UNKNOWN;
                return new o28(new e0a(new q28(new o28(g(), 2, new gte()), new jj9(i), 0), new n2f(13), 3).v(), 2, new n2f(14));
        }
    }

    public uqd g() {
        return ((jlc) this.b).n().h(new n2f(15));
    }

    public c9f(jlc jlcVar) {
        this.a = 1;
        this.b = jlcVar;
    }
}
