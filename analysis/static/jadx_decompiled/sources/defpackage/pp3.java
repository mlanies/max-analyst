package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class pp3 implements Serializable {
    public final String a;
    public final String b;

    public pp3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactNameWrapper{name=");
        sb.append(this.a);
        sb.append(", lastName=");
        return zr6.l(sb, this.b, "}");
    }
}
