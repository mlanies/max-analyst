package defpackage;

import android.util.IntProperty;

/* loaded from: classes2.dex */
public final class hg extends IntProperty {
    public int a;

    public hg(String str, int i) {
        super(str);
        this.a = i;
    }

    @Override // android.util.Property
    public final Integer get(Object obj) {
        return Integer.valueOf(this.a);
    }

    @Override // android.util.IntProperty
    public final void setValue(Object obj, int i) {
        this.a = i;
    }
}
