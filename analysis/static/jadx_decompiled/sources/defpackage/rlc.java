package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rlc extends ffe implements a66 {
    public vlc X;
    public Collection Y;
    public Iterator Z;
    public Collection s0;
    public int t0;
    public final /* synthetic */ vlc u0;
    public final /* synthetic */ Collection v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rlc(vlc vlcVar, Collection collection, Continuation continuation) {
        super(2, continuation);
        this.u0 = vlcVar;
        this.v0 = collection;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((rlc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new rlc(this.u0, this.v0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b6 -> B:28:0x00b8). Please report as a decompilation issue!!! */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r8.t0
            r2 = 1
            vlc r3 = r8.u0
            r4 = 2
            if (r1 == 0) goto L27
            if (r1 == r2) goto L23
            if (r1 != r4) goto L1b
            java.util.Collection r1 = r8.s0
            java.util.Iterator r2 = r8.Z
            java.util.Collection r3 = r8.Y
            vlc r5 = r8.X
            defpackage.od2.a0(r9)
            goto Lb8
        L1b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L23:
            defpackage.od2.a0(r9)
            goto L87
        L27:
            defpackage.od2.a0(r9)
            t19 r9 = r3.d()
            r8.t0 = r2
            r9.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "SELECT * FROM messages WHERE id IN ("
            r1.append(r5)
            java.util.Collection r5 = r8.v0
            int r6 = r5.size()
            defpackage.a14.c(r1, r6)
            java.lang.String r7 = ")"
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            xlc r1 = defpackage.xlc.a(r6, r1)
            java.util.Iterator r5 = r5.iterator()
        L57:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L73
            java.lang.Object r6 = r5.next()
            java.lang.Long r6 = (java.lang.Long) r6
            if (r6 != 0) goto L69
            r1.W(r2)
            goto L70
        L69:
            long r6 = r6.longValue()
            r1.j(r2, r6)
        L70:
            int r2 = r2 + 1
            goto L57
        L73:
            android.os.CancellationSignal r2 = new android.os.CancellationSignal
            r2.<init>()
            r19 r5 = new r19
            r6 = 1
            r5.<init>(r9, r1, r6)
            ilc r9 = r9.a
            java.lang.Object r9 = defpackage.ote.i(r9, r2, r5, r8)
            if (r9 != r0) goto L87
            return r0
        L87:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.z53.S(r9, r2)
            r1.<init>(r2)
            java.util.Iterator r9 = r9.iterator()
            r2 = r9
        L99:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto Lc0
            java.lang.Object r9 = r2.next()
            ru8 r9 = (defpackage.ru8) r9
            r8.X = r3
            r8.Y = r1
            r8.Z = r2
            r8.s0 = r1
            r8.t0 = r4
            java.lang.Object r9 = r3.h(r9, r8)
            if (r9 != r0) goto Lb6
            return r0
        Lb6:
            r5 = r3
            r3 = r1
        Lb8:
            cu8 r9 = (defpackage.cu8) r9
            r1.add(r9)
            r1 = r3
            r3 = r5
            goto L99
        Lc0:
            java.util.List r1 = (java.util.List) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rlc.o(java.lang.Object):java.lang.Object");
    }
}
