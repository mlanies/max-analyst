package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class vxf implements yxf {
    public static final /* synthetic */ vxf[] X;
    public static final /* synthetic */ v25 Y;
    public static final yxc o;
    public final String a;
    public final String b;
    public final Integer c = null;

    static {
        vxf[] vxfVarArr = {new vxf("OPEN_LINK", 0, "WebAppOpenLink", "open_link"), new vxf("OPEN_MAX_LINK", 1, "WebAppOpenMaxLink", "open_max_link")};
        X = vxfVarArr;
        Y = new v25(vxfVarArr);
        o = new yxc(19);
    }

    public vxf(String str, int i, String str2, String str3) {
        this.a = str2;
        this.b = str3;
    }

    public static vxf valueOf(String str) {
        return (vxf) Enum.valueOf(vxf.class, str);
    }

    public static vxf[] values() {
        return (vxf[]) X.clone();
    }

    @Override // defpackage.yxf
    public final Integer a() {
        return this.c;
    }

    @Override // defpackage.yxf
    public final String b() {
        return this.a;
    }

    @Override // defpackage.yxf
    public final String c() {
        return this.b;
    }
}
