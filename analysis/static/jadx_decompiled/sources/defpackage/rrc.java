package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rrc extends ffe implements a66 {
    public final /* synthetic */ djb X;
    public final /* synthetic */ byte[] Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rrc(djb djbVar, byte[] bArr, Continuation continuation) {
        super(2, continuation);
        this.X = djbVar;
        this.Y = bArr;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((rrc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new rrc(this.X, this.Y, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        r14 = 0;
        r10 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071 A[EDGE_INSN: B:76:0x0071->B:32:0x0071 BREAK  A[LOOP:0: B:3:0x0020->B:9:0x0035], EDGE_INSN: B:77:0x0071->B:32:0x0071 BREAK  A[LOOP:0: B:3:0x0020->B:9:0x0035]] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rrc.o(java.lang.Object):java.lang.Object");
    }
}
