package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vrc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ wrc Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ String t0;
    public final /* synthetic */ long u0;
    public final /* synthetic */ boolean v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vrc(wrc wrcVar, long j, long j2, String str, long j3, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = wrcVar;
        this.Z = j;
        this.s0 = j2;
        this.t0 = str;
        this.u0 = j3;
        this.v0 = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((vrc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new vrc(this.Y, this.Z, this.s0, this.t0, this.u0, this.v0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            String str = this.Y.a;
            long j = this.s0;
            String str2 = this.t0;
            long j2 = this.u0;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                us7 us7Var = us7.X;
                StringBuilder sbJ = z7b.j("Save new position:", j, " for video:", str2);
                sbJ.append(" in msg:");
                sbJ.append(j2);
                ir6Var.d(us7Var, str, sbJ.toString(), null);
            }
            long j3 = this.Z;
            long j4 = 0;
            if (j3 == 0) {
                return e5fVar;
            }
            long j5 = this.s0;
            if (j5 >= j3) {
                String str3 = this.Y.a;
                ir6 ir6Var2 = hm9.m;
                if (ir6Var2 != null && ir6Var2.c()) {
                    ir6Var2.d(us7.X, str3, zr6.k(au1.k(j5, "Can't save this startTime:", " because it's more or equals with duration:"), j3, ". Reset initPos."), null);
                }
            } else {
                j4 = j5;
            }
            ief iefVar = (ief) this.Y.c.getValue();
            String str4 = this.t0;
            iefVar.getClass();
            gef gefVarA = ief.a(str4);
            if (gefVarA != null) {
                hm9.n(this.Y.a, "Save new position. VideoContent in cache exist");
                ief iefVar2 = (ief) this.Y.c.getValue();
                String str5 = this.t0;
                gef gefVarA2 = gefVarA.a(j4);
                iefVar2.getClass();
                ief.a.put(str5, new hef(gefVarA2, System.currentTimeMillis()));
            }
            r79 r79Var = (r79) this.Y.b.getValue();
            long j6 = this.u0;
            String str6 = this.t0;
            final long j7 = this.Z;
            final boolean z = this.v0;
            final long j8 = j4;
            m56 m56Var = new m56() { // from class: urc
                @Override // defpackage.m56
                public final Object invoke(Object obj2) {
                    tpa.I((j10) obj2, j8, j7, z);
                    return e5f.a;
                }
            };
            this.X = 1;
            r79Var.getClass();
            r79Var.a.n(j6, new y98(str6, 13, m56Var));
            if (e5fVar == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
