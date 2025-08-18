package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class v07 implements je7, Serializable {
    public final Object a;

    public v07(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.je7
    public final boolean a() {
        return true;
    }

    @Override // defpackage.je7
    public final Object getValue() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
