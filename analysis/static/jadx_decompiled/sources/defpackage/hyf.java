package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hyf implements yxf {
    public static final hyf b;
    public static final /* synthetic */ hyf[] c;
    public static final /* synthetic */ v25 o;
    public final Integer a = null;

    static {
        hyf hyfVar = new hyf();
        b = hyfVar;
        hyf[] hyfVarArr = {hyfVar};
        c = hyfVarArr;
        o = new v25(hyfVarArr);
    }

    public static hyf valueOf(String str) {
        return (hyf) Enum.valueOf(hyf.class, str);
    }

    public static hyf[] values() {
        return (hyf[]) c.clone();
    }

    @Override // defpackage.yxf
    public final Integer a() {
        return this.a;
    }

    @Override // defpackage.yxf
    public final String b() {
        return "WebAppRequestPhone";
    }

    @Override // defpackage.yxf
    public final String c() {
        return "request_phone";
    }
}
