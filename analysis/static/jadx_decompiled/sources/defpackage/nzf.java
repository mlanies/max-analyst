package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nzf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ zzf Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzf(zzf zzfVar, Continuation continuation) {
        super(2, continuation);
        this.Y = zzfVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((nzf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new nzf(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Long l;
        q42 usfVar;
        Long lValueOf;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            zzf zzfVar = this.Y;
            gc6 gc6Var = zzfVar.t0;
            long j = zzfVar.b;
            Long l2 = zzfVar.o;
            if (l2 != null) {
                e52 e52Var = (e52) ((jz2) ((iy2) zzfVar.v0.getValue())).m(l2.longValue()).a.getValue();
                Long lValueOf2 = e52Var != null ? Long.valueOf(e52Var.b.a) : null;
                if (lValueOf2 != null && lValueOf2.longValue() == 0) {
                    lValueOf2 = null;
                }
                l = lValueOf2;
            } else {
                l = null;
            }
            String str = this.Y.X;
            this.X = 1;
            obj = gc6Var.a(j, l, str, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        la9 la9Var = (la9) obj;
        e5f e5fVar = e5f.a;
        if (la9Var == null) {
            this.Y.s0.a(null, new sq9(ey8.i(this.Y.b, "Root url for ", " not found")));
            this.Y.E0.m(null, cpa.o);
            return e5fVar;
        }
        this.Y.K0 = la9Var.c;
        zzf zzfVar2 = this.Y;
        String str2 = la9Var.b;
        zzfVar2.getClass();
        pnf.o(zzfVar2.M0, new azf(str2));
        this.Y.H0.setValue(la9Var.a);
        zzf zzfVar3 = this.Y;
        long j2 = zzfVar3.b;
        String str3 = la9Var.a;
        osf osfVar = zzfVar3.c;
        if (osfVar == osf.X) {
            usfVar = new usf(5, 2L);
        } else {
            q42 psfVar = tsf.c;
            Long l3 = zzfVar3.o;
            if (l3 != null) {
                e52 e52Var2 = (e52) ((jz2) ((iy2) zzfVar3.v0.getValue())).m(l3.longValue()).a.getValue();
                if (e52Var2 != null) {
                    if (e52Var2.H()) {
                        uj3 uj3VarL = e52Var2.l();
                        lValueOf = uj3VarL != null ? Long.valueOf(uj3VarL.n()) : null;
                        if (lValueOf == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        psfVar = new rsf(lValueOf.longValue());
                    } else if (e52Var2.M()) {
                        uj3 uj3VarL2 = e52Var2.l();
                        lValueOf = uj3VarL2 != null ? Long.valueOf(uj3VarL2.n()) : null;
                        if (lValueOf == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        psfVar = new ssf(lValueOf.longValue());
                    } else {
                        boolean zI = e52Var2.I();
                        k92 k92Var = e52Var2.b;
                        psfVar = zI ? new psf(k92Var.a) : new qsf(k92Var.a);
                    }
                }
            }
            usfVar = psfVar;
        }
        wsf wsfVar = new wsf(j2, str3, osfVar, usfVar);
        ((vsf) zzfVar3.w0.getValue()).a(1, j2, str3, osfVar, usfVar, null);
        Iterator it = ((List) zzfVar3.D0.c).iterator();
        while (it.hasNext()) {
            ((ia7) it.next()).d(wsfVar);
        }
        zzfVar3.B0 = wsfVar;
        return e5fVar;
    }
}
