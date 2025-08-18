package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class v6e extends ffe implements a66 {
    public final /* synthetic */ w6e X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6e(w6e w6eVar, long j, int i, Continuation continuation) {
        super(2, continuation);
        this.X = w6eVar;
        this.Y = j;
        this.Z = i;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((v6e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new v6e(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object next;
        od2.a0(obj);
        w6e w6eVar = this.X;
        Iterator it = ((Iterable) w6eVar.X.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            y0d y0dVar = (y0d) next;
            if ((y0dVar instanceof w0d) && ((w0d) y0dVar).a == this.Y) {
                break;
            }
        }
        w0d w0dVar = next instanceof w0d ? (w0d) next : null;
        e5f e5fVar = e5f.a;
        if (w0dVar == null) {
            return e5fVar;
        }
        int i = gja.k;
        s35 s35Var = w6eVar.Z;
        String str = w0dVar.X;
        int i2 = this.Z;
        if (i2 == i) {
            pnf.o(s35Var, new qed(str));
        } else if (i2 == gja.l) {
            pnf.o(s35Var, new red(str));
        } else if (i2 == gja.i) {
            tpa.o(w6eVar.b, str);
            ued uedVar = tpa.s() ? new ued(woc.t, new eqe(hja.g)) : null;
            if (uedVar != null) {
                pnf.o(s35Var, uedVar);
            }
        } else if (i2 == gja.j) {
            w6eVar.y0 = Long.valueOf(w0dVar.a);
            pnf.o(s35Var, new sed(new eqe(hja.k), new eqe(hja.j), y53.M(new mg3(gja.b, new eqe(hja.h), 1, false), new mg3(gja.a, new eqe(hja.i), 2, false))));
        }
        return e5fVar;
    }
}
