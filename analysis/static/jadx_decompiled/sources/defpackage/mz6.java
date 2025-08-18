package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class mz6 {
    public final rm4 a;
    public final rm4 b;
    public final rm4 c;
    public final rm4 d;
    public final rm4 e;
    public final rm4 f;
    public final rm4 g;
    public final rm4 h;
    public final rm4 i;
    public final rm4 j;
    public final ConcurrentHashMap k = new ConcurrentHashMap();

    public mz6(rm4 rm4Var, rm4 rm4Var2, rm4 rm4Var3, rm4 rm4Var4, rm4 rm4Var5, rm4 rm4Var6, rm4 rm4Var7, rm4 rm4Var8, rm4 rm4Var9, rm4 rm4Var10) {
        this.a = rm4Var;
        this.b = rm4Var2;
        this.c = rm4Var3;
        this.d = rm4Var4;
        this.e = rm4Var5;
        this.f = rm4Var6;
        this.g = rm4Var7;
        this.h = rm4Var8;
        this.i = rm4Var9;
        this.j = rm4Var10;
    }

    public final Map a(long j) {
        return (Map) this.k.get(Long.valueOf(j));
    }

    public final void b(long j) {
        hm9.k("mz6", "postEvent: chat.id =  " + j);
        ((av0) this.c.get()).c(new f4f(j, d(j)));
    }

    public final synchronized void c(long j, long j2) {
        try {
            hm9.n("mz6", "removeTyping: chatId = " + j + ", sender = " + j2);
            Map mapA = a(j);
            if (mapA != null) {
                mapA.remove(Long.valueOf(j2));
                if (mapA.isEmpty()) {
                    hm9.n("mz6", "removeTyping: remove chat notifs, chatId = " + j);
                    this.k.remove(Long.valueOf(j));
                }
                b(j);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String d(long r11) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mz6.d(long):java.lang.String");
    }
}
