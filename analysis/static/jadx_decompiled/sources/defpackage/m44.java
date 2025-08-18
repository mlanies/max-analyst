package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class m44 extends ffe implements m56 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m44(Object obj, Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.X = i;
        this.Z = obj;
        this.s0 = obj2;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.X) {
            case 0:
                return new m44((o44) this.Z, (gi9) this.s0, continuation, 0).o(e5f.a);
            case 1:
                return new m44((on5) this.Z, (mec) this.s0, continuation, 1).o(e5f.a);
            default:
                return new m44((hmc) this.Z, (k5d) ((m56) this.s0), continuation, 2).o(e5f.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022 A[PHI: r6
      0x0022: PHI (r6v2 long) = (r6v1 long), (r6v7 long) binds: [B:10:0x001e, B:27:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0056 -> B:16:0x0059). Please report as a decompilation issue!!! */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m44.o(java.lang.Object):java.lang.Object");
    }
}
