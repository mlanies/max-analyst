package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class nx8 implements Serializable {
    public final long a;
    public final fs8 b;
    public final String c;
    public final List o;

    public nx8(String str, ArrayList arrayList, long j, fs8 fs8Var) {
        this.c = str;
        this.o = arrayList;
        this.a = j;
        this.b = fs8Var;
    }

    public final String toString() {
        return "{, feedback='" + oag.x(this.c) + "', highlights=" + s5c.o(this.o) + ", chatId='" + this.a + "', message=" + this.b + "}";
    }
}
