package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class e47 implements sff {
    public long X;
    public Object Y;
    public long a;
    public long b;
    public String c;
    public String o;

    public void a(Object obj, String str) {
        if (((us) this.Y) == null) {
            this.Y = new us(1);
        }
        ((us) this.Y).put(str, obj);
    }

    public void b(Map map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        if (((us) this.Y) == null) {
            this.Y = new us(map.size());
        }
        ((us) this.Y).putAll(map);
    }

    public ms7 c() {
        if (oag.t(this.c) || oag.t(this.o)) {
            throw new IllegalArgumentException("type or event can't be empty");
        }
        us usVar = (us) this.Y;
        if (usVar != null && usVar.c > 10) {
            throw new IllegalArgumentException("params can't be greater than limit = 10");
        }
        if (this.a == 0) {
            this.a = System.currentTimeMillis();
        }
        return new ms7(this.a, this.b, this.X, this.c, this.o, (us) this.Y);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.sff
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(kotlin.coroutines.Continuation r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e47.e(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
