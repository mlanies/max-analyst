package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.Locale;

/* loaded from: classes2.dex */
public final /* synthetic */ class w00 implements qj3, d38 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y00 b;
    public final /* synthetic */ l20 c;

    public /* synthetic */ w00(y00 y00Var, l20 l20Var, int i) {
        this.a = i;
        this.b = y00Var;
        this.c = l20Var;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.a) {
            case 0:
                this.b.d.put(this.c.r, uri);
                break;
            default:
                this.b.d.put(this.c.r, uri);
                break;
        }
    }

    @Override // defpackage.d38
    public void d(j28 j28Var) {
        File[] fileArrListFiles;
        y00 y00Var = this.b;
        y00Var.getClass();
        Locale locale = Locale.ENGLISH;
        String strI = zr6.i("preview_", this.c.r, "_.png");
        kk5 kk5Var = (kk5) y00Var.c;
        kk5Var.getClass();
        File fileG = kk5.g(kk5Var.b(), "previewVideoCache");
        File file = null;
        if (pag.k(fileG) && (fileArrListFiles = fileG.listFiles()) != null && fileArrListFiles.length != 0) {
            int length = fileArrListFiles.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                File file2 = fileArrListFiles[i];
                if (oag.d(file2.getName(), strI)) {
                    file = file2;
                    break;
                }
                i++;
            }
        }
        if (j28Var.h()) {
            return;
        }
        if (file == null) {
            j28Var.b();
        } else {
            j28Var.a(file);
        }
    }
}
