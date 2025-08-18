package defpackage;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class a20 {
    public final /* synthetic */ int a;
    public float b;
    public float c;
    public float d;
    public float e;

    public HashMap a() {
        HashMap map = new HashMap();
        map.put("x1", Float.valueOf(this.b));
        map.put("y1", Float.valueOf(this.c));
        map.put("x2", Float.valueOf(this.d));
        map.put("y2", Float.valueOf(this.e));
        return map;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "{x1=" + this.b + ", y1=" + this.c + ", x2=" + this.d + ", y2=" + this.e + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a20(float f, float f2, float f3, float f4, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }
}
