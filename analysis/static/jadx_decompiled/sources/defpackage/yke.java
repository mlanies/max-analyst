package defpackage;

import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yke extends ffe implements a66 {
    public final /* synthetic */ Map X;
    public final /* synthetic */ zke Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yke(us usVar, zke zkeVar, long j, Continuation continuation) {
        super(2, continuation);
        this.X = usVar;
        this.Y = zkeVar;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((yke) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new yke((us) this.X, this.Y, this.Z, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:6|(2:115|8)(7:17|(2:43|(2:45|(8:111|48|(1:55)(1:52)|56|(1:60)|61|(1:63)|64))(2:67|(2:103|69)(2:73|(1:75)(1:76))))(8:21|113|22|23|26|(1:29)|30|(1:32)(6:109|33|34|107|35|42))|77|105|78|(2:83|(2:87|(4:91|(1:93)(1:96)|(1:98)|99)))|102)|16|77|105|78|(3:80|83|(3:85|87|(5:89|91|(0)(0)|(0)|99)))|102) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02d5, code lost:
    
        defpackage.hm9.l0(r14, "logDelivery: failed", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02ba, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x025f A[Catch: Exception -> 0x02ba, TryCatch #1 {Exception -> 0x02ba, blocks: (B:78:0x0257, B:80:0x025f, B:83:0x0267, B:85:0x0274, B:87:0x027a, B:89:0x0285, B:91:0x028b, B:93:0x02b5, B:98:0x02bf, B:99:0x02c2), top: B:105:0x0257 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b5 A[Catch: Exception -> 0x02ba, TryCatch #1 {Exception -> 0x02ba, blocks: (B:78:0x0257, B:80:0x025f, B:83:0x0267, B:85:0x0274, B:87:0x027a, B:89:0x0285, B:91:0x028b, B:93:0x02b5, B:98:0x02bf, B:99:0x02c2), top: B:105:0x0257 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02bf A[Catch: Exception -> 0x02ba, TryCatch #1 {Exception -> 0x02ba, blocks: (B:78:0x0257, B:80:0x025f, B:83:0x0267, B:85:0x0274, B:87:0x027a, B:89:0x0285, B:91:0x028b, B:93:0x02b5, B:98:0x02bf, B:99:0x02c2), top: B:105:0x0257 }] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yke.o(java.lang.Object):java.lang.Object");
    }
}
