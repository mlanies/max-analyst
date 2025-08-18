package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public final class gj5 extends fj5 {
    public boolean b;
    public File[] c;
    public int d;
    public boolean e;
    public final /* synthetic */ jj5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj5(jj5 jj5Var, File file) {
        super(file);
        this.f = jj5Var;
    }

    @Override // defpackage.kj5
    public final File a() {
        int i;
        boolean z = this.e;
        jj5 jj5Var = this.f;
        File file = this.a;
        if (!z && this.c == null) {
            ((lj5) jj5Var.X).getClass();
            File[] fileArrListFiles = file.listFiles();
            this.c = fileArrListFiles;
            if (fileArrListFiles == null) {
                ((lj5) jj5Var.X).getClass();
                this.e = true;
            }
        }
        File[] fileArr = this.c;
        if (fileArr != null && (i = this.d) < fileArr.length) {
            this.d = i + 1;
            return fileArr[i];
        }
        if (this.b) {
            ((lj5) jj5Var.X).getClass();
            return null;
        }
        this.b = true;
        return file;
    }
}
