package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class twf implements yxf {
    public static final xxc a;
    public static final twf b;
    public static final /* synthetic */ twf[] c;
    public static final /* synthetic */ v25 o;

    static {
        twf twfVar = new twf("DOWNLOAD_FILE", 0);
        b = twfVar;
        twf[] twfVarArr = {twfVar};
        c = twfVarArr;
        o = new v25(twfVarArr);
        a = new xxc();
    }

    public static twf valueOf(String str) {
        return (twf) Enum.valueOf(twf.class, str);
    }

    public static twf[] values() {
        return (twf[]) c.clone();
    }

    @Override // defpackage.yxf
    public final Integer a() {
        return 12;
    }

    @Override // defpackage.yxf
    public final String b() {
        return "WebAppDownloadFile";
    }

    @Override // defpackage.yxf
    public final String c() {
        return "download_file";
    }
}
