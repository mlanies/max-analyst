package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public final class v8d extends g9d {
    public final long A0;
    public final /* synthetic */ int z0 = 0;

    public v8d(long j, long j2) {
        super(new u8d(j, j2, 0));
        this.A0 = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013d  */
    @Override // defpackage.g9d, defpackage.d8d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x() {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v8d.x():void");
    }

    @Override // defpackage.g9d
    public final bu8 y() {
        switch (this.z0) {
            case 0:
                return null;
            default:
                e8d e8dVar = this.a;
                if (e8dVar == null) {
                    e8dVar = null;
                }
                f20 f20VarS = iz7.s((d2e) ((o2e) e8dVar.j.getValue()).a.get(Long.valueOf(this.A0)));
                j10 j10Var = new j10();
                j10Var.f = f20VarS;
                j10Var.a = g20.Y;
                l20 l20VarA = j10Var.a();
                m20 m20Var = new m20();
                m20Var.a = Collections.singletonList(l20VarA);
                k8g k8gVarC = m20Var.c();
                bu8 bu8Var = new bu8();
                bu8Var.n = k8gVarC;
                return bu8Var;
        }
    }

    public v8d(u8d u8dVar) {
        super(u8dVar);
        this.A0 = u8dVar.m;
    }
}
