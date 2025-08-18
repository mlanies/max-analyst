package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.contacts.MissedContactsException;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class mb9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ kpa Y;
    public final /* synthetic */ xb9 Z;
    public final /* synthetic */ long[] s0;
    public final /* synthetic */ gi9 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb9(kpa kpaVar, xb9 xb9Var, long[] jArr, gi9 gi9Var, Continuation continuation) {
        super(2, continuation);
        this.Y = kpaVar;
        this.Z = xb9Var;
        this.s0 = jArr;
        this.t0 = gi9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((mb9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        mb9 mb9Var = new mb9(this.Y, this.Z, this.s0, this.t0, continuation);
        mb9Var.X = obj;
        return mb9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        bn3 bn3Var;
        od2.a0(obj);
        sx3 sx3Var = (sx3) this.X;
        e5f e5fVar = e5f.a;
        gi9 gi9Var = this.t0;
        kpa kpaVar = this.Y;
        int i = 0;
        long[] jArr = this.s0;
        xb9 xb9Var = this.Z;
        if (kpaVar != null) {
            boolean zI = xb9Var.i();
            xs xsVar = xb9Var.t0;
            if (zI && j1e.z(sx3Var)) {
                ym3 ym3Var = (ym3) kpaVar.a;
                xp3 xp3Var = (xp3) kpaVar.b;
                try {
                    bn3Var = (bn3) xb9Var.c.getValue();
                } catch (Throwable th) {
                    try {
                        es7 es7Var = xb9Var.u0;
                        ArrayList arrayList = new ArrayList();
                        int length = jArr.length;
                        while (i < length) {
                            long j = jArr[i];
                            if (((Boolean) es7Var.invoke(new Long(j))).booleanValue()) {
                                arrayList.add(new Long(j));
                            }
                            i++;
                        }
                        if (arrayList.isEmpty()) {
                            hm9.n("MissedContactsController", "request was failed but another parallel request fill contacts!");
                            xsVar.removeAll(ys.n0(jArr));
                            return e5fVar;
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            long jLongValue = ((Number) it.next()).longValue();
                            xb9Var.h().b(jLongValue);
                            gi9Var.a(jLongValue);
                        }
                        MissedContactsException missedContactsException = new MissedContactsException(th, arrayList);
                        ((ty3) ((l6a) xb9Var.X.getValue()).a.c(ty3.class)).a("ONEME-6334", missedContactsException);
                        hm9.p("MissedContactsController", "requestContacts fail! " + x53.n0(arrayList, null, null, null, null, 63), missedContactsException);
                        Throwable cause = th.getCause();
                        TamErrorException tamErrorException = cause instanceof TamErrorException ? (TamErrorException) cause : null;
                        if (tamErrorException == null) {
                            tamErrorException = th;
                        }
                        if (fme.c(tamErrorException)) {
                            throw tamErrorException;
                        }
                        if ((tamErrorException instanceof TamErrorException) && "not.found".equals(tamErrorException.a.b)) {
                            hm9.p("MissedContactsController", "requestContacts: exception, not found", null);
                        } else {
                            if (th instanceof CancellationException) {
                                throw th;
                            }
                            xb9Var.a.g(this.b, th);
                        }
                    } catch (Throwable th2) {
                        xsVar.removeAll(ys.n0(jArr));
                        throw th2;
                    }
                }
                if (ym3Var == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                bn3Var.a(ym3Var, jArr, 0L);
                if (xp3Var != null) {
                    ((w7b) xb9Var.o.getValue()).h(0L, iz7.n(xp3Var.c));
                }
                xsVar.removeAll(ys.n0(jArr));
                return e5fVar;
            }
        }
        xb9Var.t0.removeAll(ys.n0(jArr));
        int i2 = gi9Var.d;
        int length2 = jArr.length;
        while (i < length2) {
            long j2 = jArr[i];
            gi9Var.b[gi9Var.e(j2)] = j2;
            i++;
        }
        return e5fVar;
    }
}
