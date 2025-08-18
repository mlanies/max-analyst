package defpackage;

import java.io.File;
import java.util.List;

/* loaded from: classes2.dex */
public final class pg5 {
    public final zi5 a;
    public File b;
    public File c;
    public File d;
    public File e;
    public File f;
    public File g;
    public File h;
    public File i;
    public List j;

    public pg5(zi5 zi5Var) {
        this.a = zi5Var;
    }

    public final File a(gx0 gx0Var) {
        int iOrdinal = gx0Var.ordinal();
        zi5 zi5Var = this.a;
        switch (iOrdinal) {
            case 0:
                if (this.b == null) {
                    this.b = new File(((kk5) zi5Var).b());
                }
                return this.b;
            case 1:
                if (this.d == null) {
                    this.d = ((kk5) zi5Var).m();
                }
                return this.d;
            case 2:
                if (this.e == null) {
                    kk5 kk5Var = (kk5) zi5Var;
                    kk5Var.getClass();
                    this.e = kk5.g(kk5Var.b(), "audioCache");
                }
                return this.e;
            case 3:
                if (this.g == null) {
                    kk5 kk5Var2 = (kk5) zi5Var;
                    kk5Var2.getClass();
                    this.g = kk5.g(kk5Var2.b(), "gifCache");
                }
                return this.g;
            case 4:
                if (this.f == null) {
                    kk5 kk5Var3 = (kk5) zi5Var;
                    kk5Var3.getClass();
                    this.f = kk5.g(kk5Var3.b(), "stickerCache");
                }
                return this.f;
            case 5:
                if (this.c == null) {
                    kk5 kk5Var4 = (kk5) zi5Var;
                    kk5Var4.getClass();
                    this.c = kk5.g(kk5Var4.b(), "upload");
                }
                return this.c;
            case 6:
                if (this.h == null) {
                    kk5 kk5Var5 = (kk5) zi5Var;
                    kk5Var5.getClass();
                    this.h = kk5.g(kk5Var5.b(), "exo_files_cache");
                }
                return this.h;
            case 7:
                if (this.i == null) {
                    kk5 kk5Var6 = (kk5) zi5Var;
                    kk5Var6.getClass();
                    this.i = kk5.g(kk5Var6.b(), "videoCache");
                }
                return this.i;
            default:
                return null;
        }
    }
}
