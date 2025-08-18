package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d6c {
    public static final /* synthetic */ v25 X;
    public static final hx9 b;
    public static final d6c c;
    public static final /* synthetic */ d6c[] o;
    public final int a;

    static {
        d6c d6cVar = new d6c("EMOJI", 0, 0);
        c = d6cVar;
        d6c[] d6cVarArr = {d6cVar, new d6c("STICKER", 1, 1)};
        o = d6cVarArr;
        X = new v25(d6cVarArr);
        b = new hx9();
    }

    public d6c(String str, int i, int i2) {
        this.a = i2;
    }

    public static d6c valueOf(String str) {
        return (d6c) Enum.valueOf(d6c.class, str);
    }

    public static d6c[] values() {
        return (d6c[]) o.clone();
    }
}
