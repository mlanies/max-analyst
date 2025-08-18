package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class f9c {
    public static final f9c X;
    public static final /* synthetic */ f9c[] Y;
    public static final /* synthetic */ v25 Z;
    public static final buc b;
    public static final f9c c;
    public static final f9c o;
    public final String a;

    static {
        f9c f9cVar = new f9c("UNKNOWN", 0, "UNKNOWN");
        c = f9cVar;
        f9c f9cVar2 = new f9c("EMOJI", 1, "EMOJI");
        o = f9cVar2;
        f9c f9cVar3 = new f9c("ANIMOJI", 2, "ANIMOJI");
        X = f9cVar3;
        f9c[] f9cVarArr = {f9cVar, f9cVar2, f9cVar3};
        Y = f9cVarArr;
        Z = new v25(f9cVarArr);
        b = new buc();
    }

    public f9c(String str, int i, String str2) {
        this.a = str2;
    }

    public static f9c valueOf(String str) {
        return (f9c) Enum.valueOf(f9c.class, str);
    }

    public static f9c[] values() {
        return (f9c[]) Y.clone();
    }
}
