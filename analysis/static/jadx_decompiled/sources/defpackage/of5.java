package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class of5 extends ffe implements a66 {
    public yg5 X;
    public int Y;
    public final /* synthetic */ pf5 Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ long t0;
    public final /* synthetic */ long u0;
    public final /* synthetic */ String v0;
    public final /* synthetic */ String w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of5(pf5 pf5Var, long j, long j2, long j3, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.Z = pf5Var;
        this.s0 = j;
        this.t0 = j2;
        this.u0 = j3;
        this.v0 = str;
        this.w0 = str2;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((of5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new of5(this.Z, this.s0, this.t0, this.u0, this.v0, this.w0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        yg5 yg5Var;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        pf5 pf5Var = this.Z;
        if (i == 0) {
            od2.a0(obj);
            hm9.n(pf5Var.a, "File attach click. Start process download");
            pk pkVar = (pk) pf5Var.b.getValue();
            tq2 tq2Var = new tq2(this.s0, 14, (byte) 0);
            this.Y = 1;
            obj = ((k4a) pkVar).J(tq2Var, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yg5Var = this.X;
                od2.a0(obj);
                no4 no4Var = (no4) pf5Var.j.getValue();
                String str = yg5Var.c;
                no4Var.a(this.u0, this.s0, this.v0, this.w0, str);
                return ozd.a;
            }
            od2.a0(obj);
        }
        yg5 yg5Var2 = (yg5) obj;
        if (tpa.f(yg5Var2.o, Boolean.TRUE) && ((jp) ((hp) pf5Var.i.getValue())).g.getBoolean("app.privacy.unsafe.files", false)) {
            se5 se5Var = (se5) ((qe5) pf5Var.h.getValue());
            se5Var.getClass();
            if (se5Var.n(PmsKey.f125unsafefilesalert, false)) {
                return new nzd(yg5Var2.c);
            }
        }
        k6f k6fVar = (k6f) pf5Var.e.getValue();
        d20 d20Var = d20.X;
        this.X = yg5Var2;
        this.Y = 2;
        if (k6fVar.a(this.t0, this.u0, this.v0, d20Var, this) == tx3Var) {
            return tx3Var;
        }
        yg5Var = yg5Var2;
        no4 no4Var2 = (no4) pf5Var.j.getValue();
        String str2 = yg5Var.c;
        no4Var2.a(this.u0, this.s0, this.v0, this.w0, str2);
        return ozd.a;
    }
}
