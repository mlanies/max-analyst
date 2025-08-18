package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final /* synthetic */ class hmb implements m56 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ pnf o;

    public /* synthetic */ hmb(long j, b8e b8eVar, boolean z) {
        this.b = j;
        this.o = b8eVar;
        this.c = z;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                int iOrdinal = ((yha) obj).ordinal();
                if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                    cnb cnbVar = (cnb) this.o;
                    j47.T(cnbVar.a, null, null, new xmb(cnbVar, this.b, this.c, null), 3);
                } else if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return e5f.a;
            default:
                d2e d2eVar = (d2e) obj;
                String str = d2eVar.s0;
                if (str == null) {
                    str = "";
                }
                if (str.length() == 0) {
                    str = d2eVar.o;
                }
                String str2 = str;
                String str3 = ((se5) ((qe5) ((b8e) this.o).s0.getValue())).w() ? d2eVar.z0 : null;
                long j = this.b;
                boolean z = this.c;
                long j2 = d2eVar.a;
                return new z2e(d2eVar.a, j, d2eVar.v0, str2, d2eVar.w0, str3, 0, 0, false, false, z ? Math.abs(j) - j2 : j2, 4032);
        }
    }

    public /* synthetic */ hmb(cnb cnbVar, long j, boolean z) {
        this.o = cnbVar;
        this.b = j;
        this.c = z;
    }
}
