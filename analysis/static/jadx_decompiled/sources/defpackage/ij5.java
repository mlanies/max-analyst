package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public final class ij5 extends fj5 {
    public boolean b;
    public File[] c;
    public int d;
    public final /* synthetic */ jj5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij5(jj5 jj5Var, File file) {
        super(file);
        this.e = jj5Var;
    }

    @Override // defpackage.kj5
    public final File a() {
        boolean z = this.b;
        jj5 jj5Var = this.e;
        File file = this.a;
        if (!z) {
            ((lj5) jj5Var.X).getClass();
            this.b = true;
            return file;
        }
        File[] fileArr = this.c;
        if (fileArr != null && this.d >= fileArr.length) {
            ((lj5) jj5Var.X).getClass();
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.c = fileArrListFiles;
            if (fileArrListFiles == null) {
                ((lj5) jj5Var.X).getClass();
            }
            File[] fileArr2 = this.c;
            if (fileArr2 == null || fileArr2.length == 0) {
                ((lj5) jj5Var.X).getClass();
                return null;
            }
        }
        File[] fileArr3 = this.c;
        int i = this.d;
        this.d = i + 1;
        return fileArr3[i];
    }
}
