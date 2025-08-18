package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class c7f {
    public final y8f a;
    public final ime b;
    public final fme c;
    public final q33 d;
    public final pk e;
    public final ztc f;
    public final w0f g;
    public final ConcurrentHashMap h = new ConcurrentHashMap();
    public final msf i = new msf();

    public c7f(y8f y8fVar, fme fmeVar, ime imeVar, w0f w0fVar, q33 q33Var, pk pkVar, ztc ztcVar) {
        this.a = y8fVar;
        this.c = fmeVar;
        this.b = imeVar;
        this.g = w0fVar;
        this.d = q33Var;
        this.e = pkVar;
        this.f = ztcVar;
    }

    public final synchronized qy9 a(d7f d7fVar) {
        for (Map.Entry entry : this.h.entrySet()) {
            if (((d7f) entry.getKey()).equals(d7fVar)) {
                return (qy9) entry.getValue();
            }
        }
        return null;
    }

    public final void b(v6f v6fVar) {
        hm9.m("c7f", "putUploadInRepository: started, upload=%s", v6fVar);
        nd7.U(this.a.a(v6fVar).l(), ft.e, new a7f(v6fVar, 0), new e5(20, v6fVar));
    }

    public final synchronized void c(d7f d7fVar) {
        hm9.n("c7f", "removeFromUploadObsCache: data=" + d7fVar);
        this.h.remove(d7fVar);
    }

    public final void d(d7f d7fVar) {
        hm9.m("c7f", "removeUploadFromRepository: started, data=%s", d7fVar);
        nd7.U(this.a.c(d7fVar).l(), ft.e, new b7f(d7fVar, 0), new y6f(d7fVar, 1));
    }

    public final synchronized qy9 e(d7f d7fVar) {
        int i = 14;
        int i2 = 6;
        int i3 = 1;
        synchronized (this) {
            qy9 qy9VarA = a(d7fVar);
            if (qy9VarA != null) {
                hm9.n("c7f", "upload: has upload for " + d7fVar);
                return qy9VarA;
            }
            hm9.m("c7f", "upload: %s", d7fVar);
            q28 q28Var = new q28(new ib3(new o28(new q1a(1, new b7f(d7fVar, i3)), 2, new x6f(this, i2)), i3, new q1a(2, new l5(17, d7fVar))), new x6f(this, 7), 3);
            this.b.getClass();
            e0a e0aVar = new e0a(q28Var, new hme(1), 6);
            ypc ypcVar = new ypc(this, i, d7fVar);
            kj6 kj6Var = ft.e;
            r66 r66Var = ft.d;
            xy9 xy9Var = new xy9(new xy9(new oz9(e0aVar, kj6Var, ypcVar, r66Var), kj6Var, new vle(this, 5, d7fVar), 2), new x6f(this, 8), r66Var, 2);
            hm9.j0(1, "bufferSize");
            o84 o84Var = new o84(14);
            AtomicReference atomicReference = new AtomicReference();
            s1a s1aVarR = new y0a(new h1a(new e1a(atomicReference, o84Var), xy9Var, atomicReference, o84Var)).r(this.f);
            synchronized (this) {
                this.h.put(d7fVar, s1aVarR);
            }
            return s1aVarR;
        }
    }
}
