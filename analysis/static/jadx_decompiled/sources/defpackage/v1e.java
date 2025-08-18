package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class v1e {
    public static final v1e a;
    public static final v1e b;
    public static final v1e c;
    public static final /* synthetic */ v1e[] o;

    static {
        v1e v1eVar = new v1e("DEFAULT", 0);
        a = v1eVar;
        v1e v1eVar2 = new v1e("WITH_CALL_PIP", 1);
        b = v1eVar2;
        v1e v1eVar3 = new v1e("WITH_VIDEO_PIP", 2);
        c = v1eVar3;
        o = new v1e[]{v1eVar, v1eVar2, v1eVar3};
    }

    public static v1e valueOf(String str) {
        return (v1e) Enum.valueOf(v1e.class, str);
    }

    public static v1e[] values() {
        return (v1e[]) o.clone();
    }
}
