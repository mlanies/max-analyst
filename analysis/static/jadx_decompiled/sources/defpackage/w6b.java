package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class w6b {
    public final CharSequence a;
    public final String[] b;

    public w6b(CharSequence charSequence, String[] strArr) {
        this.a = charSequence;
        this.b = strArr;
    }

    public static w6b a() {
        return new w6b("", new String[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6b)) {
            return false;
        }
        w6b w6bVar = (w6b) obj;
        if (this.a.equals(w6bVar.a)) {
            return Arrays.equals(this.b, w6bVar.b);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreProcessedText{text=");
        sb.append((Object) pag.x(this.a));
        sb.append(", tokens=");
        return au1.h(sb, this.b.length, '}');
    }
}
