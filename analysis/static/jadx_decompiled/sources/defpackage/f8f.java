package defpackage;

import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final /* synthetic */ class f8f implements b66, b7b {
    public final /* synthetic */ int a;
    public final /* synthetic */ g8f b;

    public /* synthetic */ f8f(g8f g8fVar, int i) {
        this.a = i;
        this.b = g8fVar;
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case 0:
                iy8 iy8Var = (iy8) obj;
                g8f g8fVar = this.b;
                g8fVar.getClass();
                return iy8Var.d == 2 ? ((kw3) g8fVar.d.get()).a(iy8Var) : qy9.m(iy8Var);
            case 1:
                this.b.getClass();
                return g8f.b((iy8) obj);
            default:
                v6f v6fVar = (v6f) obj;
                g8f g8fVar2 = this.b;
                g8fVar2.getClass();
                if (h4f.b(v6fVar.a.c) && v6fVar.a()) {
                    return new e0a(g8fVar2.b.a(v6fVar.h.a).n(), new a7f(v6fVar, 3), 3);
                }
                return qy9.m(new ly8(v6fVar, null));
        }
    }

    @Override // defpackage.b7b
    public boolean test(Object obj) {
        Throwable th = (Throwable) obj;
        this.b.getClass();
        return (th instanceof TamErrorException) && "invalid.token".equals(((TamErrorException) th).a.b);
    }
}
