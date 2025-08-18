package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class t7b extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ u7b Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7b(u7b u7bVar, Continuation continuation) {
        super(2, continuation);
        this.Z = u7bVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((t7b) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        t7b t7bVar = new t7b(this.Z, continuation);
        t7bVar.Y = obj;
        return t7bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a1 -> B:28:0x00a4). Please report as a decompilation issue!!! */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r9.X
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            java.lang.Object r1 = r9.Y
            sx3 r1 = (defpackage.sx3) r1
            defpackage.od2.a0(r10)
            goto La4
        L12:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L1a:
            defpackage.od2.a0(r10)
            java.lang.Object r10 = r9.Y
            sx3 r10 = (defpackage.sx3) r10
            r1 = r10
        L22:
            boolean r10 = defpackage.j1e.z(r1)
            if (r10 == 0) goto Lf3
            java.util.TimeZone r10 = java.util.TimeZone.getDefault()
            java.util.Calendar r10 = java.util.Calendar.getInstance(r10)
            r3 = 13
            int r10 = r10.get(r3)
            int r3 = defpackage.ft4.o
            kt4 r3 = defpackage.kt4.MINUTES
            long r4 = defpackage.z7.R(r2, r3)
            kt4 r6 = defpackage.kt4.SECONDS
            long r6 = defpackage.z7.R(r10, r6)
            long r4 = defpackage.ft4.g(r4, r6)
            ft4 r10 = new ft4
            r10.<init>(r4)
            ft4 r4 = new ft4
            r5 = 0
            r4.<init>(r5)
            long r5 = defpackage.z7.R(r2, r3)
            ft4 r3 = new ft4
            r3.<init>(r5)
            int r5 = r4.compareTo(r3)
            if (r5 > 0) goto Ld2
            int r5 = r10.compareTo(r4)
            if (r5 >= 0) goto L6b
            r10 = r4
            goto L72
        L6b:
            int r4 = r10.compareTo(r3)
            if (r4 <= 0) goto L72
            r10 = r3
        L72:
            long r3 = r10.a
            u7b r10 = r9.Z
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getName()
            ir6 r5 = defpackage.hm9.m
            if (r5 != 0) goto L83
            goto L99
        L83:
            boolean r6 = r5.c()
            if (r6 == 0) goto L99
            us7 r6 = defpackage.us7.X
            java.lang.String r7 = defpackage.ft4.j(r3)
            java.lang.String r8 = "delay = "
            java.lang.String r7 = r8.concat(r7)
            r8 = 0
            r5.d(r6, r10, r7, r8)
        L99:
            r9.Y = r1
            r9.X = r2
            java.lang.Object r10 = defpackage.j47.y(r3, r9)
            if (r10 != r0) goto La4
            return r0
        La4:
            u7b r10 = r9.Z
            java.util.concurrent.ConcurrentHashMap r10 = r10.o
            java.util.Collection r10 = r10.values()
            java.util.Iterator r10 = r10.iterator()
        Lb0:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L22
            java.lang.Object r3 = r10.next()
            ti9 r3 = (defpackage.ti9) r3
            java.lang.Object r4 = r3.getValue()
            r7b r4 = (defpackage.r7b) r4
            if (r4 != 0) goto Lc5
            goto Lb0
        Lc5:
            r7b r5 = new r7b
            int r6 = r4.a
            int r4 = r4.b
            r5.<init>(r6, r4)
            r3.setValue(r5)
            goto Lb0
        Ld2:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot coerce value to an empty range: maximum "
            r10.<init>(r0)
            r10.append(r3)
            java.lang.String r0 = " is less than minimum "
            r10.append(r0)
            r10.append(r4)
            r0 = 46
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        Lf3:
            e5f r9 = defpackage.e5f.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t7b.o(java.lang.Object):java.lang.Object");
    }
}
