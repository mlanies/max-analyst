package defpackage;

import android.util.FloatProperty;

/* loaded from: classes2.dex */
public final class eob extends FloatProperty {
    public float a;

    public /* synthetic */ eob(String str) {
        this(str, 0.0f);
    }

    @Override // android.util.Property
    public final Float get(Object obj) {
        return Float.valueOf(this.a);
    }

    @Override // android.util.FloatProperty
    public final void setValue(Object obj, float f) {
        this.a = f;
    }

    public eob(String str, float f) {
        super(str);
        this.a = f;
    }
}
