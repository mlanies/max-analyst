package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final /* synthetic */ class imb implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cnb b;

    public /* synthetic */ imb(cnb cnbVar, int i) {
        this.a = i;
        this.b = cnbVar;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        yha yhaVar = (yha) obj;
        switch (this.a) {
            case 0:
                int iOrdinal = yhaVar.ordinal();
                cnb cnbVar = this.b;
                if (iOrdinal == 0 || iOrdinal == 1) {
                    j47.S(cnbVar.a, ((w9a) cnbVar.u()).b().plus(xq9.a), vx3.c, new anb(cnbVar, null));
                    cnbVar.s();
                } else if (iOrdinal == 2) {
                    cnbVar.R0 = false;
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cnbVar.R0 = false;
                } else {
                    cnbVar.A();
                }
                return e5f.a;
            case 1:
                int iOrdinal2 = yhaVar.ordinal();
                cnb cnbVar2 = this.b;
                if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                    j47.S(cnbVar2.a, ((w9a) cnbVar2.u()).b().plus(xq9.a), vx3.c, new anb(cnbVar2, null));
                } else if (iOrdinal2 == 2) {
                    cnbVar2.R0 = false;
                } else if (iOrdinal2 != 3) {
                    if (iOrdinal2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cnbVar2.R0 = false;
                } else {
                    cnbVar2.getClass();
                    pnf.o(cnbVar2.z0, new ulb(new eqe(yea.H2), new imb(cnbVar2, 1)));
                }
                return e5f.a;
            default:
                if (yhaVar == yha.X) {
                    cnb cnbVar3 = this.b;
                    j47.T(cnbVar3.a, ((w9a) cnbVar3.u()).b(), null, new bnb(cnbVar3, null), 2);
                }
                return e5f.a;
        }
    }
}
