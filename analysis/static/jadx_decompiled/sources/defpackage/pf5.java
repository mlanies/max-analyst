package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pf5 {
    public final String a = pf5.class.getName();
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final je7 j;

    public pf5(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7, je7 je7Var8, je7 je7Var9) {
        this.b = je7Var;
        this.c = je7Var2;
        this.d = je7Var3;
        this.e = je7Var4;
        this.f = je7Var5;
        this.g = je7Var6;
        this.h = je7Var7;
        this.i = je7Var8;
        this.j = je7Var9;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r14, long r16, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, kotlin.coroutines.Continuation r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pf5.a(long, long, java.lang.String, java.lang.String, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object b(long j, long j2, long j3, String str, Continuation continuation) throws Throwable {
        e5f e5fVar = e5f.a;
        tx3 tx3Var = tx3.a;
        String str2 = this.a;
        if (j3 != 0) {
            hm9.n(str2, "File attach click. Start process cancel download");
            Object objA = ((k6f) this.e.getValue()).a(j, j2, str, d20.b, continuation);
            return objA == tx3Var ? objA : e5fVar;
        }
        hm9.n(str2, "File attach click. Start process delete message");
        hu8 hu8Var = (hu8) this.f.getValue();
        hu8Var.getClass();
        Object objA2 = hu8Var.a(true, Collections.singletonList(new Long(j2)), continuation);
        if (objA2 != tx3Var) {
            objA2 = e5fVar;
        }
        return objA2 == tx3Var ? objA2 : e5fVar;
    }
}
