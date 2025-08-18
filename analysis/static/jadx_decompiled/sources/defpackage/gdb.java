package defpackage;

/* loaded from: classes2.dex */
public final class gdb implements b64 {
    public final /* synthetic */ int a;
    public final je7 b;
    public final i64 c;

    public gdb(int i, je7 je7Var) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = mq.b;
                this.b = je7Var;
                break;
            default:
                this.b = je7Var;
                this.c = idb.b;
                break;
        }
    }

    @Override // defpackage.b64
    public final i64 a() {
        switch (this.a) {
            case 0:
                return (idb) this.c;
            default:
                return (mq) this.c;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f6  */
    @Override // defpackage.b64
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.l64 b(java.lang.String r13, defpackage.e64 r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gdb.b(java.lang.String, e64, android.os.Bundle):l64");
    }
}
