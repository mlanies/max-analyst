package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class sf5 implements uf5 {
    public static final /* synthetic */ sf5[] b;
    public static final /* synthetic */ v25 c;
    public final mf5 a;

    static {
        mf5 mf5Var = mf5.Z;
        sf5 sf5Var = new sf5("PDF", 0, mf5Var);
        sf5 sf5Var2 = new sf5("PPT", 1, mf5Var);
        sf5 sf5Var3 = new sf5("PPTX", 2, mf5Var);
        sf5 sf5Var4 = new sf5("KEY", 3, mf5Var);
        mf5 mf5Var2 = mf5.s0;
        sf5 sf5Var5 = new sf5("XLS", 4, mf5Var2);
        sf5 sf5Var6 = new sf5("XLSX", 5, mf5Var2);
        sf5 sf5Var7 = new sf5("CSV", 6, mf5Var2);
        mf5 mf5Var3 = mf5.t0;
        sf5 sf5Var8 = new sf5("DOC", 7, mf5Var3);
        sf5 sf5Var9 = new sf5("DOCX", 8, mf5Var3);
        sf5 sf5Var10 = new sf5("TXT", 9, mf5Var3);
        sf5 sf5Var11 = new sf5("RTF", 10, mf5Var3);
        sf5 sf5Var12 = new sf5("ODT", 11, mf5Var3);
        mf5 mf5Var4 = mf5.u0;
        sf5 sf5Var13 = new sf5("JPG", 12, mf5Var4);
        sf5 sf5Var14 = new sf5("PNG", 13, mf5Var4);
        sf5 sf5Var15 = new sf5("GIF", 14, mf5Var4);
        sf5 sf5Var16 = new sf5("BMP", 15, mf5Var4);
        sf5 sf5Var17 = new sf5("HEIC", 16, mf5Var4);
        sf5 sf5Var18 = new sf5("WEBP", 17, mf5Var4);
        sf5 sf5Var19 = new sf5("SVG", 18, mf5Var4);
        mf5 mf5Var5 = mf5.v0;
        sf5 sf5Var20 = new sf5("MP4", 19, mf5Var5);
        sf5 sf5Var21 = new sf5("MOV", 20, mf5Var5);
        sf5 sf5Var22 = new sf5("AVI", 21, mf5Var5);
        sf5 sf5Var23 = new sf5("MKV", 22, mf5Var5);
        sf5 sf5Var24 = new sf5("WEBM", 23, mf5Var5);
        mf5 mf5Var6 = mf5.w0;
        sf5 sf5Var25 = new sf5("ZIP", 24, mf5Var6);
        sf5 sf5Var26 = new sf5("RAR", 25, mf5Var6);
        sf5 sf5Var27 = new sf5("Z7", 26, mf5Var6);
        sf5 sf5Var28 = new sf5("TAR", 27, mf5Var6);
        sf5 sf5Var29 = new sf5("GZ", 28, mf5Var6);
        mf5 mf5Var7 = mf5.x0;
        sf5 sf5Var30 = new sf5("EXE", 29, mf5Var7);
        sf5 sf5Var31 = new sf5("APK", 30, mf5Var7);
        sf5 sf5Var32 = new sf5("DMG", 31, mf5Var7);
        sf5 sf5Var33 = new sf5("BAT", 32, mf5Var7);
        sf5 sf5Var34 = new sf5("SH", 33, mf5Var7);
        mf5 mf5Var8 = mf5.y0;
        sf5[] sf5VarArr = {sf5Var, sf5Var2, sf5Var3, sf5Var4, sf5Var5, sf5Var6, sf5Var7, sf5Var8, sf5Var9, sf5Var10, sf5Var11, sf5Var12, sf5Var13, sf5Var14, sf5Var15, sf5Var16, sf5Var17, sf5Var18, sf5Var19, sf5Var20, sf5Var21, sf5Var22, sf5Var23, sf5Var24, sf5Var25, sf5Var26, sf5Var27, sf5Var28, sf5Var29, sf5Var30, sf5Var31, sf5Var32, sf5Var33, sf5Var34, new sf5("MP3", 34, mf5Var8), new sf5("WAV", 35, mf5Var8), new sf5("AAC", 36, mf5Var8), new sf5("OGG", 37, mf5Var8), new sf5("FLAC", 38, mf5Var8)};
        b = sf5VarArr;
        c = new v25(sf5VarArr);
    }

    public sf5(String str, int i, mf5 mf5Var) {
        this.a = mf5Var;
    }

    public static sf5 valueOf(String str) {
        return (sf5) Enum.valueOf(sf5.class, str);
    }

    public static sf5[] values() {
        return (sf5[]) b.clone();
    }

    @Override // defpackage.uf5
    public final String a() {
        return name();
    }

    @Override // defpackage.uf5
    public final mf5 b() {
        return this.a;
    }
}
