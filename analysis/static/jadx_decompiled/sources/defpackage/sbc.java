package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final class sbc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ lsf Y;
    public final /* synthetic */ RecordControlsWidget Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbc(Continuation continuation, lsf lsfVar, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.Y = lsfVar;
        this.Z = recordControlsWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        sbc sbcVar = (sbc) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        sbcVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        sbc sbcVar = new sbc(continuation, this.Y, this.Z);
        sbcVar.X = obj;
        return sbcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbc.o(java.lang.Object):java.lang.Object");
    }
}
