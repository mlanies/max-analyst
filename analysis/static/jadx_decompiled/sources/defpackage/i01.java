package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class i01 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ k01 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i01(k01 k01Var, Continuation continuation) {
        super(2, continuation);
        this.Y = k01Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        i01 i01Var = (i01) n((jb) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        i01Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        i01 i01Var = new i01(this.Y, continuation);
        i01Var.X = obj;
        return i01Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        jb jbVar = (jb) this.X;
        k01 k01Var = this.Y;
        k01Var.getClass();
        uj1 uj1Var = null;
        if (jbVar instanceof xa) {
            xa xaVar = (xa) jbVar;
            if (!xaVar.a) {
                uj1Var = wj1.x;
            } else if (!xaVar.b) {
                uj1Var = wj1.w;
            }
        } else if (jbVar instanceof za) {
            za zaVar = (za) jbVar;
            if (!zaVar.a) {
                uj1Var = wj1.v;
            } else if (!zaVar.b) {
                uj1Var = wj1.u;
            }
        } else if (jbVar instanceof db) {
            db dbVar = (db) jbVar;
            if (!dbVar.a) {
                uj1Var = wj1.t;
            } else if (!dbVar.b) {
                uj1Var = wj1.s;
            }
        } else if (jbVar instanceof cb) {
            cb cbVar = (cb) jbVar;
            cbVar.getClass();
            if (!cbVar.a) {
                uj1Var = wj1.y;
            }
        } else if (jbVar instanceof hb) {
            hb hbVar = (hb) jbVar;
            hbVar.getClass();
            uj1Var = hbVar.a ? wj1.B : wj1.C;
        }
        if (uj1Var != null) {
            pnf.o(k01Var.t0, uj1Var);
        }
        return e5f.a;
    }
}
